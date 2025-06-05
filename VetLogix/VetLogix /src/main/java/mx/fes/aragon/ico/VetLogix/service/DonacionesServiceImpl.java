package mx.fes.aragon.ico.VetLogix.service;

import mx.fes.aragon.ico.VetLogix.model.Donaciones;
import mx.fes.aragon.ico.VetLogix.repository.DonacionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonacionesServiceImpl implements DonacionesService {

    @Autowired
    private DonacionesRepository donacionesRepository;

    @Override
    public List<Donaciones> findAll() {
        return donacionesRepository.findAll();
    }

    @Override
    public Donaciones findById(Long id) {
        return donacionesRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Donaciones donacion) {
        donacionesRepository.save(donacion);
    }

    @Override
    public void deleteById(Long id) {
        donacionesRepository.deleteById(id);
    }
}
