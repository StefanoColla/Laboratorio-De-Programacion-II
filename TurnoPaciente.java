package punto2tp4;

/** @author Colla Stefano-Mena Hernan */
public class TurnoPaciente {
    private String fecha;
    private String hora;
    private Medico medico;
    private String nombreMedico;

    public TurnoPaciente(String fecha,String hora,Medico medico){
        this.fecha=fecha;
        this.hora=hora;
        this.nombreMedico=medico.getNombre();
    }
    public TurnoPaciente(){
        this.fecha=null;
        this.hora=null;
        this.nombreMedico=null;
    }
    public String getFecha() {
        return fecha;
    }

    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

   
    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

   
    public String getNombreMedico() {
        return nombreMedico;
    }

   
    public void setNombreMedico(String medico) {
        this.nombreMedico = medico;
    }

    @Override
    public String toString() {
        return "TurnoPaciente{" + "fecha=" + fecha + ", hora=" + hora + ", nombreMedico=" + nombreMedico + '}';
    }
    
}
