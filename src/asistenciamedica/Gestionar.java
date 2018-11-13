
package asistenciamedica;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public interface Gestionar {
    
    
    public abstract void añadir(Object per);
    public abstract void eliminar(String per);
    public abstract Object buscar(String dni);
    
}
