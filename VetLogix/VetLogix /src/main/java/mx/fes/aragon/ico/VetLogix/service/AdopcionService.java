package mx.fes.aragon.ico.VetLogix.service;

import mx.fes.aragon.ico.VetLogix.model.Adopcion;
import java.util.List;

public interface AdopcionService {
    List<Adopcion> obtenerTodas();
    void guardar(Adopcion adopcion);
    Adopcion buscarPorId(Long id);
    void eliminar(Long id);
}
