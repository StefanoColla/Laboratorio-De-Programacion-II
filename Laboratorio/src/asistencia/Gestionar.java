
package asistencia;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public interface Gestionar {
    
    
    public abstract void añadir(Object per);
    public abstract void eliminar(String per);
    public abstract Object buscar(String dni);
    public abstract void añadirMovil(Object mov);
    public abstract void eliminarMovil(String mov);
    public abstract Object buscarMovil(String patente);
    
}
