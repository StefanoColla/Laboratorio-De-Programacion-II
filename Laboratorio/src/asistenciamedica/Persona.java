
package asistenciamedica;



/**
 *
 * @author usuario
 */
public abstract class Persona {
    private String nombre;
    private String dni;
    private int edad;
    private String domicilio;

    public Persona() {
        this.nombre = null;
        this.dni = null;
        this.edad = 0;
        this.domicilio = null;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    

    

   
    public String getNombre() {
        return nombre;
    }


    public int getEdad() {
        return edad;
    }

  

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + '}';
    }

    
   
    
    
    
    
}
