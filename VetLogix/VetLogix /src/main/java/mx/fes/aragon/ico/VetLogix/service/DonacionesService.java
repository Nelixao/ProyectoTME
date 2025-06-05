package mx.fes.aragon.ico.VetLogix.service;

import mx.fes.aragon.ico.VetLogix.model.Donaciones;
import java.util.List;

public interface DonacionesService {
    List<Donaciones> findAll();
    Donaciones findById(Long id);
    void save(Donaciones donacion);
    void deleteById(Long id);
}
