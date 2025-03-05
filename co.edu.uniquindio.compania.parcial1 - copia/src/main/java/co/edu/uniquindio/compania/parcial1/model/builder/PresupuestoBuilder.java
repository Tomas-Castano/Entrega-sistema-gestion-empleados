package co.edu.uniquindio.compania.parcial1.model.builder;
import co.edu.uniquindio.compania.parcial1.model.Presupuesto;
public class PresupuestoBuilder {
    protected String idPresupuesto;
    protected int valor;
    protected String estado;
    protected String descripcion;

    public PresupuestoBuilder idPresupuesto(String idPresupuesto) {
       this.idPresupuesto = idPresupuesto;
       return this;
    }
    public PresupuestoBuilder valor(int valor) {
       this.valor = valor;
       return this;
    }
    public PresupuestoBuilder estado(String estado) {
       this.estado = estado;
       return this;
    }
    public PresupuestoBuilder descripcion(String descripcion) {
       this.descripcion = descripcion;
       return this;
    }
    public Presupuesto build(){
        return new Presupuesto(idPresupuesto, valor, estado, descripcion);
    }
    
}
