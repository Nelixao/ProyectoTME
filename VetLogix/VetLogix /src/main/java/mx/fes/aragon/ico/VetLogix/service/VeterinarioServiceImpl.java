package mx.fes.aragon.ico.VetLogix.service;

import mx.fes.aragon.ico.VetLogix.model.Veterinario;
import mx.fes.aragon.ico.VetLogix.repository.VeterinarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeterinarioServiceImpl implements VeterinarioService {

    @Autowired
    private VeterinarioRepository veterinarioRepository;

    @Override
    public List<Veterinario> findAll() {
        return veterinarioRepository.findAll();
    }

    @Override
    public Veterinario findById(Long id) {
        return veterinarioRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Veterinario veterinario) {
        veterinarioRepository.save(veterinario);
    }

    @Override
    public void deleteById(Long id) {
        veterinarioRepository.deleteById(id);
    }
}
