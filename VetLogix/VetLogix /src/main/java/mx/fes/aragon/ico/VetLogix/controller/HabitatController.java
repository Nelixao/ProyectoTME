package mx.fes.aragon.ico.VetLogix.controller;

import mx.fes.aragon.ico.VetLogix.model.Habitat;
import mx.fes.aragon.ico.VetLogix.service.HabitatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/habitats")
public class HabitatController {

    @Autowired
    private HabitatService habitatService;

    @GetMapping
    public String listarHabitats(Model model) {
        model.addAttribute("habitats", habitatService.findAll());
        return "habitat/lista";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevo(Model model) {
        model.addAttribute("habitat", new Habitat());
        return "habitat/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Habitat habitat) {
        habitatService.save(habitat);
        return "redirect:/habitats";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("habitat", habitatService.findById(id).orElse(new Habitat()));
        return "habitat/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        habitatService.deleteById(id);
        return "redirect:/habitats";
    }
}
