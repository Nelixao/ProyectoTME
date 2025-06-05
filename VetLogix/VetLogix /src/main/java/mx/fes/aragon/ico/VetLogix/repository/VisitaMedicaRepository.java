package mx.fes.aragon.ico.VetLogix.repository;
import mx.fes.aragon.ico.VetLogix.model.VisitaMedica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitaMedicaRepository extends JpaRepository<VisitaMedica, Long> {
}
