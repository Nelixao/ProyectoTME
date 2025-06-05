package mx.fes.aragon.ico.VetLogix.service;

import mx.fes.aragon.ico.VetLogix.model.Tratamiento;
import java.util.List;

public interface TratamientoService {
    List<Tratamiento> findAll();
    Tratamiento findById(Long id);
    void save(Tratamiento tratamiento);
    void deleteById(Long id);
}
