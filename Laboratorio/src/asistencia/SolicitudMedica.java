
package asistencia;

/**
 *
 * @author usuario
 */
public class SolicitudMedica {
    private Persona paciente;
    private Doctor doc;
    private Enfermero enfer;
    private Movil movil;
    private String diagnostico;

    public SolicitudMedica(Persona paciente,Doctor doc,Enfermero enfer,Movil movil) {
        this.paciente=paciente;
        this.doc=doc;
        this.enfer=enfer;
        this.movil=movil;
   
    }

    public Persona getPaciente() {
        return paciente;
    }

    public void setPaciente(Persona paciente) {
        this.paciente = paciente;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
   
    

    public Doctor getDoc() {
        return doc;
    }

    public void setDoc(Doctor doc) {
        this.doc = doc;
    }

    public Enfermero getEnfer() {
        return enfer;
    }

    public void setEnfer(Enfermero enfer) {
        this.enfer = enfer;
    }

    public Movil getMovil() {
        return movil;
    }

    public void setMovil(Movil movil) {
        this.movil = movil;
    }
    
    
}
