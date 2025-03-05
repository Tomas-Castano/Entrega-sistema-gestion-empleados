package co.edu.uniquindio.compania.parcial1.services;
import java.util.List;
import co.edu.uniquindio.compania.parcial1.model.Empleado;

public interface iProyectoCrud {
    boolean crearProyecto(String nombre, String codigo, List<Empleado> empleadosAsignados);
    boolean eliminarProyecto(String codigo);
    boolean actualizarProyecto(String nombre, String codigo, String codigoNuevo, List<Empleado> empleadosAsignados);
    boolean obtenerDatosProyecto(String codigo);
}
