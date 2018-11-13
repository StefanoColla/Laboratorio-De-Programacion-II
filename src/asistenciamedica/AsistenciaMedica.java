
package asistenciamedica;

import ventana.Principal;

/**
 *
 * @author usuario
 */
public class AsistenciaMedica {

    public static void main(String[] args) {
        Gestionar gestor = new GestionarEmpresa();
        
        Principal principal = new Principal(gestor);
        principal.setLocationRelativeTo(null);
        principal.setVisible(true);
    }
    
}
