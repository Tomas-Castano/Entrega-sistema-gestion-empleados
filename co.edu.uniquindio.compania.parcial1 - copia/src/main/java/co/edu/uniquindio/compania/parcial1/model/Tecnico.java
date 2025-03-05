package co.edu.uniquindio.compania.parcial1.model;

import co.edu.uniquindio.compania.parcial1.services.ContribuyenteTecnico;

public class Tecnico extends Empleado implements ContribuyenteTecnico {

    public Tecnico(String nombre, String idEmpleado, Departamento departamento, int edad) {
        super(nombre, idEmpleado, departamento, edad);

    }
    public String realizarTareasTecnicas() {
    return (" El técnico está realizando Tareas de Tecnicas");
    }

}