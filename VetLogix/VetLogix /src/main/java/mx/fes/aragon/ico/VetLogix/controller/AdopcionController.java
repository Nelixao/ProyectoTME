package mx.fes.aragon.ico.VetLogix.controller;

import mx.fes.aragon.ico.VetLogix.model.Adopcion;
import mx.fes.aragon.ico.VetLogix.service.AdopcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/adopcion")
public class AdopcionController {

    @Autowired
    private AdopcionService adopcionService;

    @GetMapping
    public String listarAdopciones(Model model) {
        List<Adopcion> adopciones = adopcionService.obtenerTodas();
        model.addAttribute("adopciones", adopciones);
        return "adopcion/lista";
    }

    @GetMapping("/nueva")
    public String mostrarFormularioAdopcion(Model model) {
        model.addAttribute("adopcion", new Adopcion());
        return "adopcion/formulario";
    }

    @PostMapping("/guardar")
    public String guardarAdopcion(@ModelAttribute Adopcion adopcion) {
        adopcionService.guardar(adopcion);
        return "redirect:/adopcion";
    }

    @GetMapping("/editar/{id}")
    public String editarAdopcion(@PathVariable Long id, Model model) {
        Adopcion adopcion = adopcionService.buscarPorId(id);
        model.addAttribute("adopcion", adopcion);
        return "adopcion/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarAdopcion(@PathVariable Long id) {
        adopcionService.eliminar(id);
        return "redirect:/adopcion";
    }
}
