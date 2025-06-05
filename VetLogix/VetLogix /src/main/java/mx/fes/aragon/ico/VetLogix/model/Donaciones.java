package mx.fes.aragon.ico.VetLogix.model;
import jakarta.persistence.*;

@Entity
public class Donaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreDonador;
    private Double monto;
    private String fecha;
    private String metodoPago;
}
