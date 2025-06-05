package mx.fes.aragon.ico.VetLogix.service;

import mx.fes.aragon.ico.VetLogix.model.Habitat;
import mx.fes.aragon.ico.VetLogix.repository.HabitatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HabitatService {

    @Autowired
    private HabitatRepository habitatRepository;

    public List<Habitat> findAll() {
        return habitatRepository.findAll();
    }

    public Optional<Habitat> findById(Long id) {
        return habitatRepository.findById(id);
    }

    public Habitat save(Habitat habitat) {
        return habitatRepository.save(habitat);
    }

    public void deleteById(Long id) {
        habitatRepository.deleteById(id);
    }
}
