package mx.fes.aragon.ico.VetLogix.repository;
import mx.fes.aragon.ico.VetLogix.model.Donaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Repository;
@Repository
public interface DonacionesRepository extends JpaRepository<Donaciones, Long> {

}