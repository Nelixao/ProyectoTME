package mx.fes.aragon.ico.VetLogix.repository;

import mx.fes.aragon.ico.VetLogix.model.Tratamiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TratamientoRepository extends JpaRepository<Tratamiento, Long> {
}
