package mx.fes.aragon.ico.VetLogix.service;

import mx.fes.aragon.ico.VetLogix.model.Adopcion;
import mx.fes.aragon.ico.VetLogix.repository.AdopcionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdopcionServiceImpl implements AdopcionService {

    @Autowired
    private AdopcionRepository adopcionRepository;

    @Override
    public List<Adopcion> obtenerTodas() {
        return adopcionRepository.findAll();
    }

    @Override
    public Adopcion buscarPorId(Long id) {
        return adopcionRepository.findById(id).orElse(null);
    }

    @Override
    public void guardar(Adopcion adopcion) {
        adopcionRepository.save(adopcion);
    }

    @Override
    public void eliminar(Long id) {
        adopcionRepository.deleteById(id);
    }
}
