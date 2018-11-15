
package asistencia;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Doctor extends Empleado{
    
    private String especialidad;
    

    public Doctor(float sueldo, String especialidad, String nombre, String dni,int edad, String domicilio) {
        super();
        
        this.setNombre(nombre);
        this.setDni(dni);
        this.setEdad(edad);
        this.setDomicilio(domicilio);
        this.setSueldo(sueldo);
        this.especialidad=especialidad;
    }

   

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    

    
    
 
    
}
