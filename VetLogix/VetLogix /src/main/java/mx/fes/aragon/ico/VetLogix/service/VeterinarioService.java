// VeterinarioService.java
package mx.fes.aragon.ico.VetLogix.service;

import mx.fes.aragon.ico.VetLogix.model.Veterinario;
import java.util.List;

public interface VeterinarioService {
    List<Veterinario> findAll();
    Veterinario findById(Long id);
    void save(Veterinario veterinario);
    void deleteById(Long id);
}
