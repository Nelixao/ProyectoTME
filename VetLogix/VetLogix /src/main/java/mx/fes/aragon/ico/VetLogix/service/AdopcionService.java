package mx.fes.aragon.ico.VetLogix.service;

import mx.fes.aragon.ico.VetLogix.model.Adopcion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

public interface AdopcionService {
    List<Adopcion> obtenerTodas();
    Adopcion buscarPorId(Long id);
    void guardar(Adopcion adopcion);
    void eliminar(Long id);
}
