package punto2tp4;

/** @author Colla Stefano-Mena Hernan */
public abstract class Medico extends Persona {
    String especialidad;
    public  final double  SUELDOBASE=50000;
    double sueldo;
    String fechaIngreso;
    String fechaBaja;
   
    public Medico(){
        super();
    }
    
    public abstract void calcSueldo();

   
    public String getEspecialidad() {
        return especialidad;
    }

   
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

   
    public String getFechaIngreso() {
        return fechaIngreso;
    }

 
    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

   
    public String getFechaBaja() {
        return fechaBaja;
    }
    
    public void setFechaBaja(String fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public abstract int getTipo();
}
