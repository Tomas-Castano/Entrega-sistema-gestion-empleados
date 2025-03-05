package co.edu.uniquindio.compania.parcial1.model.builder;

import java.util.List;
import co.edu.uniquindio.compania.parcial1.model.Empleado;
import co.edu.uniquindio.compania.parcial1.model.Proyecto;

public class ProyectoBuilder {
    protected String nombre;
    protected String codigo;
    protected List<Empleado> empleadosAsignados;

    public ProyectoBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
    public ProyectoBuilder codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }
    public ProyectoBuilder empleadosAsignados(List<Empleado> empleadosAsignados){
        this.empleadosAsignados = empleadosAsignados;
        return this;
    }
    public Proyecto build() {
    return new Proyecto(codigo,nombre,empleadosAsignados);
}
}

