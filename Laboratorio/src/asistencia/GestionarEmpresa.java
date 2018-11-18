
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
    @Override
    public Doctor buscarDoc(){
        Doctor resultado = null;
        Doctor d = new Doctor(1000,"Pediatra","Pedro","3",30,"Av Falsa 123");
        for(Object c : regis){
            if(c.getClass().equals(d.getClass())){
                resultado = (Doctor) c;
                break;
            }
        }
        return resultado;
    }
    @Override
    public Enfermero buscarEnf(){
        Enfermero resultado = null;
        Enfermero d = new Enfermero(100,"Pedro","4",30,"Av Falsa 123");
        for(Object c : regis){
            if(c.getClass().equals(d.getClass())){
                resultado = (Enfermero) c;
                break;
            }
        }
        return resultado;
    }
    @Override
    public Movil buscarMov(){
        Movil resultado = null;
        Movil mov = new Movil("Fiat","600",1998,"kjg 123");
        for(Object c : moviles){
            if(c.getClass().equals(mov.getClass())){
                resultado = (Movil) c;
                break;
            }
        }
        return resultado;
    }
        
    
    
    
}
