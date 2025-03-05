package co.edu.uniquindio.compania.parcial1.services;

import co.edu.uniquindio.compania.parcial1.model.Departamento;
import co.edu.uniquindio.compania.parcial1.model.Gerente;

public interface iGerenteCrud {
    boolean crearGerente(String nombre, int edad, String idEmpleado, Departamento departamento);
    boolean actualizarGerente(String nombre, int edad, String idEmpleado, String idEmpleadoNuevo, Departamento departamento);
    boolean eliminarGerente(String idEmpleado);
    boolean obtenerDatosGerente(String idEmpleado);
}
