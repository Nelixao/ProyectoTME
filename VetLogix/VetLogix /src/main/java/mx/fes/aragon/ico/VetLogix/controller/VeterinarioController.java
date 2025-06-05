package mx.fes.aragon.ico.VetLogix.controller;

import mx.fes.aragon.ico.VetLogix.model.Veterinario;
import mx.fes.aragon.ico.VetLogix.service.VeterinarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/veterinarios")
public class VeterinarioController {

    @Autowired
    private VeterinarioService veterinarioService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("veterinarios", veterinarioService.findAll());
        return "veterinario/lista";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("veterinario", new Veterinario());
        return "veterinario/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Veterinario veterinario) {
        veterinarioService.save(veterinario);
        return "redirect:/veterinarios";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("veterinario", veterinarioService.findById(id));
        return "veterinario/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        veterinarioService.deleteById(id);
        return "redirect:/veterinarios";
    }
}
