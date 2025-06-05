package mx.fes.aragon.ico.VetLogix.controller;

import mx.fes.aragon.ico.VetLogix.model.Animal;
import mx.fes.aragon.ico.VetLogix.model.Habitat;
import mx.fes.aragon.ico.VetLogix.service.AnimalService;
import mx.fes.aragon.ico.VetLogix.service.HabitatService;  // <-- Asegúrate de tener este servicio
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/animal")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @Autowired
    private HabitatService habitatService; // para poblar el select

    @GetMapping
    public String listarAnimales(Model model) {
        List<Animal> animales = animalService.findAll();
        model.addAttribute("animales", animales);
        return "animal/lista";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioAnimal(Model model) {
        model.addAttribute("animal", new Animal());

        // Traemos todos los hábitats para el <select>
        List<Habitat> todasHabitats = habitatService.findAll();
        model.addAttribute("habitaciones", todasHabitats);

        return "animal/formulario";
    }

    @PostMapping("/guardar")
    public String guardarAnimal(@ModelAttribute("animal") Animal animal) {
        animalService.save(animal);
        return "redirect:/animal";
    }

    @GetMapping("/editar/{id}")
    public String editarAnimal(@PathVariable Long id, Model model) {
        Animal animal = animalService.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("ID de animal inválido: " + id));
        model.addAttribute("animal", animal);

        // También inyectamos la lista de hábitats al editar
        List<Habitat> todasHabitats = habitatService.findAll();
        model.addAttribute("habitaciones", todasHabitats);

        return "animal/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarAnimal(@PathVariable Long id) {
        animalService.deleteById(id);
        return "redirect:/animal";
    }
}
