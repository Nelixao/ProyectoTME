package mx.fes.aragon.ico.VetLogix.repository;

import mx.fes.aragon.ico.VetLogix.model.Habitat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitatRepository extends JpaRepository<Habitat, Long> {
}
