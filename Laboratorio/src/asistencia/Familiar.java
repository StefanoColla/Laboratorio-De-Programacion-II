
package asistencia;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Familiar extends Persona{
    private ArrayList fa;
    public Familiar(String nombre,String dni,int edad,String domicilio){
        super();
        this.setNombre(nombre);
        this.setDni(dni);
        this.setEdad(edad);
        this.setDomicilio(domicilio);
        fa = new ArrayList();
    }

    @Override
    public String toString() {
        return "Nombre: "+this.getNombre()+"            Dni: "+this.getDni()+"          Edad: "+this.getEdad()+"            Domicilio: "+this.getDomicilio();
    }
    
  
    
}
