package punto2tp4;

/** @author Colla Stefano-Mena Hernan */
public class Persona {
    String nombre;
    private String direccion;
    private String correo;
    private String sexo;
    private String fechaNacimiento;
    String documento;
    private String telefono;
    
    public Persona(){
        this.nombre=null;
        this.direccion=null;
        this.fechaNacimiento=null;
        this.correo=null;
        this.documento=null;
        this.sexo=null;
        this.telefono=null;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    } 
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getDocumento() {
        return documento;
    }

   
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", documento=" + documento +'}';
    }
    
}
