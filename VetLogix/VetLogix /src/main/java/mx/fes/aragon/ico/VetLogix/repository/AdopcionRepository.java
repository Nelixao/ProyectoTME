package mx.fes.aragon.ico.VetLogix.repository;

import mx.fes.aragon.ico.VetLogix.model.Adopcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdopcionRepository extends JpaRepository<Adopcion, Long> {
    // Puedes agregar métodos personalizados si los necesitas
}
