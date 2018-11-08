package punto2tp4;

/** @author Colla Stefano-Mena Hernan */
public class MedicoTemporal extends Medico {
    private Contrato contrato;
    
    public MedicoTemporal(String documento,String nombre,String especialidad,int horasTrabajadas,int horasExtras){
        super();
        contrato=new Contrato(horasTrabajadas,horasExtras);
        this.setDocumento(documento);
        this.setNombre(nombre);
        this.setEspecialidad(especialidad);
        calcSueldo();
    }

    @Override
    public void calcSueldo() {
       this.sueldo=(contrato.getHorasExtras()+contrato.getHorasTrabajadas())*this.SUELDOBASE;
    }
     public double getSueldo(){
        return this.sueldo;
    }
     public String getEspecialidad() {
        return especialidad;
    }
     
    @Override
    public int getTipo(){
        return 0;
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
        return "MedicoTemporal{" + "nombre=" + nombre + ", documento=" + documento + ", sueldo=" + sueldo + '}';
    }
    
}
