
package asistenciamedica;

import exception.EmpleadoExistente;
import exception.EmpleadoInexistente;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class GestionarEmpresa implements Gestionar{
    private final ArrayList regis = new ArrayList();
    
    @Override
    public void añadir(Object per) {
        
        Persona pe = (Persona)per;
      Persona existe = (Persona)buscar(pe.getDni());
        if (existe != null) {
            throw new EmpleadoExistente("Cuenta existente " + existe);
        }
        regis.add(pe);
    }

    @Override
    public void eliminar(String dni) {
        Object existe = buscar(dni);
        if (existe != null) {
            regis.remove(existe);            
            return;
        }        
        throw new EmpleadoInexistente("Empleado inexistente: " + dni);
    }

   

    @Override
    public Object buscar(String dni) {
        Persona resultado = null;
         for (Object cuenta : regis) {
            Persona c = (Persona)cuenta;
            if (c.getDni().equals(dni)==true){
                resultado=c;
            }
        }
        return resultado;

    }
    
    
    
}
