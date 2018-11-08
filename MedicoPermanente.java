package punto2tp4;

/** @author Colla Stefano-Mena Hernan */
public class MedicoPermanente extends Medico{
    private TurnoTrabajo turno;
    
    
    public MedicoPermanente(String nombre,String documento,String especialidad, int horaIngreso,int horaSalida){
        super();
        turno=new TurnoTrabajo(horaIngreso,horaSalida);
        this.setDocumento(documento);
        this.setNombre(nombre);
        this.setEspecialidad(especialidad);
        calcSueldo();
        
    }
    
    @Override
    public void calcSueldo() {
       this.sueldo=(turno.getHoraSalida()-turno.getHoraIngreso())*this.SUELDOBASE*0.25;
    }
    public double getSueldo(){
        return this.sueldo;
    }
     public String getEspecialidad() {
        return especialidad;
    }
     
    @Override 
    public int getTipo(){
        return 1;
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

    @Override
    public String toString() {
        return "MedicoPermanente{" + "nombre=" + nombre + ", documento=" + documento + ", sueldo=" + sueldo + '}';
    }
   
    
}
