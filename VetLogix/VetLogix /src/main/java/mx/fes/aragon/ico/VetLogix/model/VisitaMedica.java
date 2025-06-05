package mx.fes.aragon.ico.VetLogix.model;

import jakarta.persistence.*;

@Entity
public class VisitaMedica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fecha;
    private String motivo;
    private String observaciones;

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }

    @Override
    public String toString() {
        return "VisitaMedica{" +
                "id=" + id +
                ", fecha='" + fecha + '\'' +
                ", motivo='" + motivo + '\'' +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }

    public String getObservaciones() { return observaciones; }
    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }
}
