
package asistencia;

/**
 *
 * @author usuario
 */
public class Administrativo extends Empleado{

    public Administrativo(float sueldo, String nombre, String dni, int edad, String domicilio) {
        super();
        this.setDni(dni);
        this.setDomicilio(domicilio);
        this.setEdad(edad);
        this.setNombre(nombre);
        this.setSueldo(sueldo);
    }

   
    
    
}
