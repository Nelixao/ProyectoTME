package mx.fes.aragon.ico.VetLogix.controller;

import mx.fes.aragon.ico.VetLogix.model.VisitaMedica;
import mx.fes.aragon.ico.VetLogix.service.VisitaMedicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/visitas")
public class VisitaMedicaController {

    @Autowired
    private VisitaMedicaService visitaService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("visitas", visitaService.findAll());
        return "visita/lista";
    }

    @GetMapping("/nueva")
    public String nueva(Model model) {
        model.addAttribute("visita", new VisitaMedica());
        return "visita/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute VisitaMedica visita) {
        visitaService.save(visita);
        return "redirect:/visitas";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("visita", visitaService.findById(id));
        return "visita/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        visitaService.deleteById(id);
        return "redirect:/visitas";
    }
}
