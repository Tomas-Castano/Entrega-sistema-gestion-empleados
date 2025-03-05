package co.edu.uniquindio.compania.parcial1;
import java.util.List;

import co.edu.uniquindio.compania.parcial1.factory.ModelFactory;
import co.edu.uniquindio.compania.parcial1.model.Departamento;
import co.edu.uniquindio.compania.parcial1.model.Empleado;

public class Main {
    public static void main(String[] args) {
        ModelFactory modelFactory = ModelFactory.getInstance();
        obtenerNumeroEmpleadoMenorEdad(modelFactory);
        obtenerEmpleadosProyecto(modelFactory);
        crudEmpleado(modelFactory);
        crudProyecto(modelFactory);
        crudGerente(modelFactory);
        mostrarFuncionesEmpleados(modelFactory);
    }

    private static void mostrarFuncionesEmpleados(ModelFactory modelFactory) {
        String idEmpleado="1133259416";
        String resultado;
        resultado= modelFactory.mostrarFuncionesEmpleados(idEmpleado);
        System.out.println(resultado);
    }

    private static void obtenerNumeroEmpleadoMenorEdad(ModelFactory modelFactory) {
        int edad= 18;
        String resultado;
        resultado=modelFactory.obtenerNumeroEmpleadoMenorEdad(edad);

    }
    private static void obtenerNumeroEmpleadoMayorEdad(ModelFactory modelFactory) {
        int edad=18;
        String resultado;
        resultado=modelFactory.obtenerNumeroEmpleadoMayorEdad(edad);
        System.out.println("\nEl Número de empleados mayores de edad es= \n" + resultado);
    }
    private static void obtenerEmpleadosProyecto(ModelFactory modelFactory) {
        String codigo="11";
        String resultado;
        resultado= modelFactory.obtenerEmpleadosProyecto(codigo);
        System.out.println("\nEmpleados del proyecto: \n"+resultado+"\n");
    }
    private static void crudEmpleado(ModelFactory modelFactory) {
        crearEmpleado(modelFactory);
        eliminarEmpleado(modelFactory);
        actualizarEmpleado(modelFactory);
        obtenerDatosEmpleado(modelFactory);
    }
    private static void crudProyecto(ModelFactory modelFactory) {
        crearProyecto(modelFactory);
        eliminarProyecto(modelFactory);
        actualizarProyecto(modelFactory);
        obtenerDatosProyecto(modelFactory);
    }
    private static void crudGerente(ModelFactory modelFactory){
        crearGerente(modelFactory);
        eliminarGerente(modelFactory);
        actualizarGerente(modelFactory);
        obtenerDatosGerente(modelFactory);
    }
    private static void obtenerDatosGerente(ModelFactory modelFactory) {
        String idEmpleado="4562897";
        boolean resultado=modelFactory.obtenerDatosGerente(idEmpleado);
        notificacion(resultado,"Gerente", "obtenido");
    }
    private static void actualizarGerente(ModelFactory modelFactory) {
        String idEmpleado="4562897";
        String idEmpleadoNuevo="857963";
        String nombre="Juanpa Londoño";
        int edad=48;
        Departamento departamento=null;
        boolean resultado=modelFactory.actualizarGerente(nombre, edad, idEmpleado, idEmpleadoNuevo, null);
        notificacion(resultado,"Gerente", "actualizado");
    }
    private static void eliminarGerente(ModelFactory modelFactory) {
        String idEmpleado="1133259416";
        boolean resultado=modelFactory.eliminarGerente(idEmpleado);
        notificacion(resultado, "Gerente", "Eliminado ");

    }
    private static void crearGerente(ModelFactory modelFactory) {
        String nombre= "Jorge Ángulo";
        String idEmpleado="123456";
        int edad= 102;
        Departamento departamento=null;
        boolean resultado= modelFactory.crearGerente(nombre,edad, idEmpleado,null);
        notificacion(resultado,"Gerente","Creado");
    }
    private static void obtenerDatosProyecto(ModelFactory modelFactory) {
        String codigo="11";
        boolean resultado1= modelFactory.obtenerDatosProyecto(codigo);
        notificacion(resultado1,"Proyecto", "obtenido ");
    }
    private static void actualizarProyecto(ModelFactory modelFactory) {
        String nombre="Campaña ModeCreative";
        String codigo="12";
        String codigoNuevo="FPT2025-46T";
        List<Empleado> empleadosAsignados=null;
        boolean resultado1= modelFactory.actualizarProyecto(nombre, codigo, codigoNuevo,null);
        notificacion(resultado1,"Proyecto", "actualizado ");
    }
    private static void eliminarProyecto(ModelFactory modelFactory) {
        String codigo="FPT2025-45Q";
        boolean resultado1=modelFactory.eliminarProyecto(codigo);
        notificacion(resultado1,"Proyecto", "eliminado ");
    }
    private static void crearProyecto(ModelFactory modelFactory) {
        String nombre="Proyecto estructural 2025 Cartagena expo";
        String codigo="FPT2025-45Q";
        List<Empleado> empleadosAsignados=null;
        boolean resultado1=modelFactory.crearProyecto(nombre,codigo, null);
        notificacion(resultado1,"Proyecto", "creado ");
    }
    private static void notificacion(boolean resultado, String mensaje1, String mensaje) {
        if(resultado)
            System.out.println("El " + mensaje1+" ha sido "+ mensaje+ " correctamente");
        else
            System.out.println("El " + mensaje1+" no ha sido " + mensaje + "correctamente");
    }
    private static void crearEmpleado(ModelFactory modelFactory) {
        String nombre= " Maria Cardona";
        String idEmpleado= " 1095208502";
        Departamento departamento = null;
        int edad=21;
        boolean resultado= modelFactory.crearEmpleado(nombre, idEmpleado, null,edad);
        notificacion(resultado, "Empleado","creado ");
    }
    private static void actualizarEmpleado(ModelFactory modelFactory) {
        String nombre= " John Doe";
        String idEmpleadoActual= "24499646";
        String idEmpleadoNuevo="109520023";
        Departamento departamento = null;
        int edad=19;
        boolean resultado= modelFactory.actualizarEmpleado(nombre,idEmpleadoActual,idEmpleadoNuevo,null,edad);
        notificacion(resultado,"Empleado", "actualizado ");
    }
    private static void eliminarEmpleado(ModelFactory modelFactory) {
        String idEmpleado= " 1095208502";
        boolean resultado= modelFactory.eliminarEmpleado(idEmpleado);
        notificacion(resultado,"Empleado", "eliminado ");
    }
    private static void obtenerDatosEmpleado(ModelFactory modelFactory) {
        String idEmpleado= "8418669";
        boolean resultado= modelFactory.obtenerDatosEmpleado(idEmpleado);
       notificacion(resultado,"Empleado", "obtenido ");
    }
    private static void consultarEmpleados(ModelFactory modelFactory) {
        String idEmpleado= "24499646";
        String resultado;
        resultado =modelFactory.consultarEmpleados(idEmpleado);
        System.out.println("\nInformación consultada:\n"+ resultado);

    }
}

