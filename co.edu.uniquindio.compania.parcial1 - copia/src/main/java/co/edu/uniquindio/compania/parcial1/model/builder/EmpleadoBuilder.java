package co.edu.uniquindio.compania.parcial1.model.builder;

import co.edu.uniquindio.compania.parcial1.model.Departamento;
import co.edu.uniquindio.compania.parcial1.model.Empleado;

public class EmpleadoBuilder {
    protected String nombre;
    protected String idEmpleado;
    protected Departamento departamento;
    protected int edad;

    public EmpleadoBuilder nombre (String nombre) {
        this.nombre = nombre;
        return this;
    }
     public EmpleadoBuilder idEmpleado (String idEmpleado) {
        this.idEmpleado = idEmpleado;
        return this;
     }
     public EmpleadoBuilder departamento (Departamento departamento) {
        this.departamento = departamento;
        return this;
     }
     public EmpleadoBuilder edad (int edad) {
        this.edad = edad;
        return this;
     }
     public Empleado build () {
        return new Empleado(nombre, idEmpleado, departamento,edad);
     }
}
