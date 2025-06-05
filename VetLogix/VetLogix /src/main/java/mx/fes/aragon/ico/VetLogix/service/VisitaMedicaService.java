package mx.fes.aragon.ico.VetLogix.service;

import mx.fes.aragon.ico.VetLogix.model.VisitaMedica;
import java.util.List;

public interface VisitaMedicaService {
    List<VisitaMedica> findAll();
    VisitaMedica findById(Long id);
    void save(VisitaMedica visita);
    void deleteById(Long id);
}
