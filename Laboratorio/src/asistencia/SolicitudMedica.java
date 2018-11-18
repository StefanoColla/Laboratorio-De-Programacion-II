
package asistencia;

/**
 *
 * @author usuario
 */
public class SolicitudMedica {
    private Afiliado paciente;
    private Doctor doc;
    private Enfermero enfer;
    private Movil movil;
    private String diagnostico;

    public SolicitudMedica(Afiliado paciente,Doctor doc,Enfermero enfer,Movil movil) {
        this.paciente=paciente;
        this.doc=doc;
        this.enfer=enfer;
        this.movil=movil;
   
    }
   
    public Afiliado getPaciente() {
        return paciente;
    }

    public void setPaciente(Afiliado paciente) {
        this.paciente = paciente;
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
