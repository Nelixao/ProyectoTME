package mx.fes.aragon.ico.VetLogix.service;

import mx.fes.aragon.ico.VetLogix.model.VisitaMedica;
import mx.fes.aragon.ico.VetLogix.repository.VisitaMedicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitaMedicaServiceImpl implements VisitaMedicaService {

    @Autowired
    private VisitaMedicaRepository visitaRepository;

    @Override
    public List<VisitaMedica> findAll() {
        return visitaRepository.findAll();
    }

    @Override
    public VisitaMedica findById(Long id) {
        return visitaRepository.findById(id).orElse(null);
    }

    @Override
    public void save(VisitaMedica visita) {
        visitaRepository.save(visita);
    }

    @Override
    public void deleteById(Long id) {
        visitaRepository.deleteById(id);
    }
}
