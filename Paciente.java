package punto2tp4;



/** @author Colla Stefano-Mena Hernan */
public class Paciente extends Persona {
    private String grupoSanguineo;
    HistoriaClinica histClinica;
    TurnoPaciente turno;
    
    
    public Paciente(String nombre,String documento,String grupoS){
        super();
        histClinica=new HistoriaClinica();
        turno=new TurnoPaciente();
        this.grupoSanguineo=grupoS;
        this.setDocumento(documento);
        this.setNombre(nombre);
    }
    public void addEnfermedad(Enfermedad enfermedad){
        histClinica.addEnfermedad(enfermedad);
    }
    public void mostrarEnfermedades(){
        System.out.println("Enfermedades del Paciente= "+ this.nombre);
        histClinica.mostrarEnfermedades();
    }
    public void addMedicamento(String medicamento){
        histClinica.addMedicamento(medicamento);
    }
    public void mostrarMedicamentos(){
        System.out.println("Medicamentos del Paciente= "+ this.nombre);
        histClinica.mostrarMedicamentos();
    }
    public void ordenarEnfermedades(){
        histClinica.ordenarEnfermedades();
    }
    public void mostrarTurno(){
        System.out.println("Turno del Paciente= "+ this.nombre);
        System.out.println(this.turno);
    }
    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + nombre + ", documento=" + documento  + ", grupoSanguineo=" + grupoSanguineo + '}';
    }
    
}
