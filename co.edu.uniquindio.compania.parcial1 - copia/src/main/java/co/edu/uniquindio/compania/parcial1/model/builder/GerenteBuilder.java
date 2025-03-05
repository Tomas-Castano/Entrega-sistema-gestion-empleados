package co.edu.uniquindio.compania.parcial1.model.builder;

import co.edu.uniquindio.compania.parcial1.model.Departamento;
import co.edu.uniquindio.compania.parcial1.model.Gerente;

public class GerenteBuilder {
    protected String nombre;
    protected String IdEmpleado;
    protected Departamento departamento;
    protected int edad;

   public GerenteBuilder nombre(String nombre) {
       this.nombre = nombre;
       return this;
    }
    public GerenteBuilder IdEmpleado(String IdEmpleado) {
       this.IdEmpleado = IdEmpleado;
       return this;
    }
    public GerenteBuilder departamento(Departamento departamento) {
       this.departamento = departamento;
       return this;
    }
    public GerenteBuilder edad(int edad) {
       this.edad = edad;
       return this;
    }
    public Gerente build() {
       return new Gerente(nombre, IdEmpleado, departamento, edad);
    }
}
