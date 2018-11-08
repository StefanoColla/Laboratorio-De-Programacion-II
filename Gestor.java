package punto2tp4;

import java.util.ArrayList;


/** @author Colla Stefano-Mena Hernan */
public interface Gestor {
    public void addPersona(Persona p);
    public ArrayList getLista();
    public void addElemento(Object o,ArrayList lista);
    public void borrarElemento(String numero);
    public Persona buscar(String numero);
}
