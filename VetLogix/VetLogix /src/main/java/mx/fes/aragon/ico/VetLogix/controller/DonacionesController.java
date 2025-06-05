package mx.fes.aragon.ico.VetLogix.controller;
import mx.fes.aragon.ico.VetLogix.model.Donaciones;
import mx.fes.aragon.ico.VetLogix.service.DonacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping ("/donaciones")
public class DonacionesController {
    @Autowired
    private DonacionesService donacionesService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("donaciones", donacionesService.findAll());
        return "donacion/lista";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("donacion", new Donaciones());
        return "donacion/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Donaciones donacion) {
        donacionesService.save(donacion);
        return "redirect:/donaciones";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("donacion", donacionesService.findById(id));
        return "donacion/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        donacionesService.deleteById(id);
        return "redirect:/donaciones";
    }
}
