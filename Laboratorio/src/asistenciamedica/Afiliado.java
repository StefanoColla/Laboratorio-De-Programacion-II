
package asistenciamedica;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;



/**
 *
 * @author usuario
 */
public class Afiliado extends Persona {
    private int mesesDeMora;
    private ArrayList <Persona> familiar;

    public Afiliado(String nombre,String dni,int edad,String domicilio) {
        super();
        familiar= new ArrayList();
        
        this.setNombre(nombre);
        this.setDni(dni);
        this.setEdad(edad);
        this.setDomicilio(domicilio);
    }    
    

    public int getMesesDeMora() {
        return mesesDeMora;
    }

    public void setMesesDeMora(int mesesDeMora) {
        this.mesesDeMora = mesesDeMora;
    }

  

    public ArrayList<Persona> getFamiliar() {
        return familiar;
    }

    public void setFamiliar(ArrayList<Persona> familiar) {
        this.familiar = familiar;
    }

    public void setFamiliar(DefaultListModel listaN) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
    

  

   

  
    
    
    
    
}
