package mx.fes.aragon.ico.VetLogix.repository;

import mx.fes.aragon.ico.VetLogix.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
