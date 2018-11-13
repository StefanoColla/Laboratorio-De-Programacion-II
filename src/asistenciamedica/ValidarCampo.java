
package asistenciamedica;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author usuario
 */
public class ValidarCampo {
    
    public void soloLetra(JTextField campo){
        campo.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char c = e.getKeyChar();
                if(Character.isDigit(c)){
                    e.consume();
                }
            }
        });
    }
    public void soloNumero(JTextField campo){
        campo.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char c = e.getKeyChar();
                if(!Character.isDigit(c)){
                    e.consume();
                }
            }
        });
    }
    
}
