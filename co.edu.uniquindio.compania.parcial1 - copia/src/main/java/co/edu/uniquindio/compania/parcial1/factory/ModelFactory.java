package co.edu.uniquindio.compania.parcial1.factory;

import java.util.List;

import co.edu.uniquindio.compania.parcial1.model.Departamento;
import co.edu.uniquindio.compania.parcial1.model.Empleado;
import co.edu.uniquindio.compania.parcial1.model.Empresa;
import co.edu.uniquindio.compania.parcial1.model.Gerente;
import co.edu.uniquindio.compania.parcial1.model.Proyecto;
import co.edu.uniquindio.compania.parcial1.services.iConsultaServices;
import co.edu.uniquindio.compania.parcial1.services.iEmpleadoCrud;
import co.edu.uniquindio.compania.parcial1.services.iGerenteCrud;
import co.edu.uniquindio.compania.parcial1.services.iPresupuestoCrud;
import co.edu.uniquindio.compania.parcial1.services.iProyectoCrud;

public class ModelFactory implements iEmpleadoCrud, iConsultaServices, iProyectoCrud, iGerenteCrud, iPresupuestoCrud {
    private static ModelFactory modelFactory;
    private Empresa empresa;
    private ModelFactory() {
        inicializarDatos();
    }
    public static ModelFactory getInstance() {
        if (modelFactory == null) {
            modelFactory = new ModelFactory();
        }
            return modelFactory;
    }
    public String consultarEmpleados(String idEmpleado) {
        return empresa.consultarEmpleados(idEmpleado);

    }
    public boolean crearEmpleado(String nombre, String idEmpleado, Departamento departamento, int edad) {
        return empresa.crearEmpleado(nombre, idEmpleado, departamento,edad);
    }
    public boolean eliminarEmpleado(String idEmpleado) {
        return empresa.eliminarEmpleado(idEmpleado);
    }
    public boolean actualizarEmpleado(String nombre, String idEmpleado, String idEmpleadoNuevo, Departamento departamento, int edad) {
        return empresa.actualizarEmpleado(nombre, idEmpleado, idEmpleadoNuevo, departamento, edad);
    }
    public boolean obtenerDatosEmpleado(String idEmpleado) {
        return empresa.obtenerDatosEmpleado(idEmpleado);
    }
    public boolean crearProyecto(String nombre, String codigo, List<Empleado> empleadosAsignados) {
        return empresa.crearProyecto(nombre, codigo, empleadosAsignados);
    }
    public boolean eliminarProyecto(String codigo) {
        return empresa.eliminarProyecto(codigo);
    }
    public boolean actualizarProyecto(String nombre, String codigo, String codigoNuevo, List<Empleado> empleadosAsignados) {
        return empresa.actualizarProyecto(nombre, codigo, codigoNuevo, empleadosAsignados);
    }
    public boolean obtenerDatosProyecto(String codigo) {
        return empresa.obtenerDatosProyecto(codigo);
    }
    public String obtenerEmpleadosProyecto(String codigo) {
        return empresa.obtenerEmpleadosProyecto(codigo);
    }
    public String obtenerNumeroEmpleadoMayorEdad(int edad) {
        return empresa.obtenerNumeroEmpleadoMayorEdad(edad);
    }
    public String obtenerNumeroEmpleadoMenorEdad(int edad) {
        return empresa.obtenerNumeroEmpleadoMenorEdad(edad);
    }
    public String mostrarFuncionesEmpleados(String idEmpleado) {
        return empresa.mostrarFuncionesEmpleados(idEmpleado);
    }
    public boolean crearGerente(String nombre, int edad, String idEmpleado, Departamento departamento) {
        return empresa.crearGerente(nombre,edad,idEmpleado,departamento);
    }
    public boolean actualizarGerente(String nombre, int edad, String idEmpleado, String idEmpleadoNuevo, Departamento departamento) {
        return empresa.actualizarGerente(nombre,edad,idEmpleado,idEmpleadoNuevo,departamento);
    }
    public boolean eliminarGerente(String idEmpleado) {
        return empresa.eliminarGerente(idEmpleado);
    }
    public boolean obtenerDatosGerente(String idEmpleado) {
        return empresa.obtenerDatosGerente(idEmpleado);
    }
    public boolean crearPresupuesto(String idPresupuesto, int valor, String estado, String descripcion){
        return empresa.crearPresupuesto(idPresupuesto,valor,estado,descripcion);
    }
    public boolean actualizarPresupuesto(String idPresupuesto, int valor, String estado, String idEmpleadoNuevo, String descripcion){
        return empresa.actualizarPresupuesto(idPresupuesto,valor,estado,descripcion);
    }
    //public boolean eliminarPresupuesto(String idPresupuesto){
    //    return empresa.eliminarPresupuesto(idPresupuesto);
    //}
    //public boolean obtenerPresupuesto(String idPresupuesto){
    //    return empresa.obtenerPresupuesto(idPresupuesto);
    //}

    private void inicializarDatos() {
        empresa = new Empresa();
        empresa.setNombre("Only Fashion Club");

        Departamento departamento1 = Departamento.builder()
                .nombre("Mercadeo")
                .codigo("789546")
                .build();
        Departamento departamento2 = Departamento.builder()
                .nombre("Contabilidad")
                .codigo("56684163")
                .build();
        Departamento departamento3 = Departamento.builder()
                .nombre("Administración")
                .codigo("458963")
                .build();

        Proyecto proyecto1 = Proyecto.builder()
                .codigo("11")
                .nombre("Aruba 2024-2")
                .build();
        Proyecto proyecto2 = Proyecto.builder()
                .nombre("Campaña ModeCreative")
                .codigo("12")
                .build();

        Empleado empleado1 = Empleado.builder()
                .nombre("John Doe")
                .idEmpleado("24499646")
                .edad(19)
                .departamento(departamento2)
                .build();
        Empleado empleado2 = Empleado.builder()
                .nombre("Jacob Uribe")
                .idEmpleado("8418669")
                .edad(25)
                .departamento(departamento1)
                .build();
        Empleado empleado3 = Empleado.builder()
                .nombre(" Jesús Luligo")
                .idEmpleado("4785666")
                .edad(19)
                .departamento(departamento3)
                .build();

        Empleado gerente1= Gerente.builder()
                .nombre("Juanpa Londoño")
                .edad(48)
                .idEmpleado("4562897")
                .build();
        Empleado gerente2= Gerente.builder()
                .nombre("Carlos Seguro")
                .idEmpleado("1133259416")
                .edad(23)
                .departamento(departamento3)
                .build();

        empresa.getListaEmpleados().add(empleado1);
        empresa.getListaEmpleados().add(empleado2);
        empresa.getListaEmpleados().add(empleado3);
        empresa.getListaProyectos().add(proyecto1);
        empresa.getListaProyectos().add(proyecto2);
        empresa.getListaDepartamentos().add(departamento1);
        empresa.getListaDepartamentos().add(departamento2);
        empresa.getListaDepartamentos().add(departamento3);
        empresa.getListaEmpleados().add(gerente1);
        empresa.getListaEmpleados().add(gerente2);
        proyecto1.getEmpleadosAsignados().add(empleado1);
        proyecto1.getEmpleadosAsignados().add(empleado3);
        proyecto2.getEmpleadosAsignados().add(empleado2);

    }
    @Override
    public boolean actualizarPresupuesto(String idPresupuesto, int valor, String estado, String descripcion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarPresupuesto'");
    }

    @Override
    public boolean eliminarPresupuesto(String idPresupuesto) {
        return false;
    }
}


