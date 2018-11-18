
package asistenciamedica;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Enfermero extends Empleado{
    
    
    public Enfermero(float sueldo, String nombre, String dni, int edad, String domicilio) {
        super();
        
        this.setDni(dni);
        this.setDomicilio(domicilio);
        this.setEdad(edad);
        this.setNombre(nombre);
        this.setSueldo(sueldo);
        
    }

   
    
    
    
}
