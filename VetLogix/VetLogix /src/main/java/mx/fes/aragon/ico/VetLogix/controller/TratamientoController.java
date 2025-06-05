package mx.fes.aragon.ico.VetLogix.controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import mx.fes.aragon.ico.VetLogix.model.Tratamiento;
import mx.fes.aragon.ico.VetLogix.service.TratamientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // ✅ este es el correcto
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/tratamiento")
public class TratamientoController {

    @Autowired
    private TratamientoService tratamientoService;

    @GetMapping
    public String listarTratamientos(Model model) {
        List<Tratamiento> tratamientos = tratamientoService.findAll();
        model.addAttribute("tratamientos", tratamientos);
        return "tratamiento/lista"; // 🟩 debes tener una vista tratamiento/lista.html
    }
    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("tratamiento", new Tratamiento());
        return "tratamiento/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Tratamiento tratamiento) {
        tratamientoService.save(tratamiento);
        return "redirect:/tratamientos";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("tratamiento", tratamientoService.findById(id));
        return "tratamiento/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        tratamientoService.deleteById(id);
        return "redirect:/tratamientos";
    }
}
