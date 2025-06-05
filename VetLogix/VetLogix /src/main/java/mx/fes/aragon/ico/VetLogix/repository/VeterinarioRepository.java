package mx.fes.aragon.ico.VetLogix.repository;

import mx.fes.aragon.ico.VetLogix.model.Veterinario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface VeterinarioRepository extends JpaRepository<Veterinario, Long> {
}
