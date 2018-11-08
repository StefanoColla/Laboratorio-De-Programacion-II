package punto2tp4;

import java.util.ArrayList;


/** @author Colla Stefano-Mena Hernan */
public class GestorClinica implements Gestor{
    private final ArrayList personas;
    
    
    public GestorClinica(){
        personas = new ArrayList();
        
    }
    @Override
    public void addPersona(Persona p) {
        personas.add(p);
    }

    

    @Override
    public void addElemento(Object o, ArrayList lista) {
        lista.add(o);
    }

   

    @Override
    public ArrayList getLista() {
        return personas;
    }

    @Override
    public void borrarElemento(String numero) {
       Persona existe = buscar(numero);
        if (existe != null) {
            personas.remove(existe);            
            return;
        } 
    }

    @Override
    public Persona buscar(String numero) {
        Persona resultado = null;
         for (Object cuenta : personas) {
            Persona c = (Persona)cuenta;
            if (c.getDocumento().equals(numero)==true){
                resultado=c;
            }
        }
        return resultado;
    }

    
    
}
