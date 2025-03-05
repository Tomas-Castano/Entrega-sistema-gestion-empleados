package co.edu.uniquindio.compania.parcial1.model.builder;
import java.util.List;
import co.edu.uniquindio.compania.parcial1.model.Departamento;
import co.edu.uniquindio.compania.parcial1.model.Empleado;

public class DepartamentoBuilder {
    protected String nombre;
    protected String codigo;
    protected List<Empleado> listaEmpleados;

    public DepartamentoBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
    public DepartamentoBuilder codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }
    public DepartamentoBuilder listaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
        return this;
    }
    public Departamento build() {
        return new Departamento(nombre,codigo,listaEmpleados);
    }
}
