
package asistencia;

import exception.EmpleadoExistente;
import exception.EmpleadoInexistente;
import java.util.ArrayList;
import java.lang.NullPointerException;

/**
 *
 * @author usuario
 */
public class GestionarEmpresa implements Gestionar{
    private final ArrayList regis = new ArrayList();
    private final ArrayList moviles = new ArrayList();
    
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

    @Override
    public void añadirMovil(Object mov) {
        Movil movil = (Movil)mov;
        Movil existe = (Movil)buscarMovil(movil.getPatente());
        if (existe != null) {
            throw new EmpleadoExistente("movil existente " + existe);
        }
        moviles.add(movil);
    }

    @Override
    public void eliminarMovil(String mov) {
        Object existe = buscarMovil(mov);
        if (existe != null) {
            moviles.remove(existe);            
            return;
        }        
        throw new EmpleadoInexistente("Movil inexistente: " + mov);
    }

    @Override
    public Object buscarMovil(String patente) {
        Movil resultado = null;
        
            for (Object cuenta : moviles) {
                Movil c = (Movil)cuenta;
                if(c.getPatente().equals(null)){
                    
                }else{
                    if (c.getPatente().equals(patente)==true){
                        resultado=c;
                    }
                }
            }
            return resultado;
        
    }
        
    
    
    
}
