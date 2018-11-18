
package asistencia;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;



/**
 *
 * @author usuario
 */
public class Afiliado extends Persona {
    private ArrayList <Persona> familiar;
    private PagoAfiliado pago;

    public Afiliado(String nombre,String dni,int edad,String domicilio) {
        super();
        familiar= new ArrayList();
        pago=new PagoAfiliado(this);
        this.setNombre(nombre);
        this.setDni(dni);
        this.setEdad(edad);
        this.setDomicilio(domicilio);
    }    
    
    public ArrayList<Persona> getFamiliar() {
        return familiar;
    }

    public void setFamiliar(ArrayList<Persona> familiar) {
        this.familiar = familiar;
    }

    public PagoAfiliado getPago() {
        return pago;
    }

    public void setPago(PagoAfiliado pago) {
        this.pago = pago;
    }
     public Object buscar(String dni) {
        Persona resultado = null;
         for (Object cuenta : familiar) {
            Persona c = (Persona)cuenta;
            if (c.getDni().equals(dni)==true){
                resultado=c;
            }
        }
        return resultado;

    }
     public ArrayList getListaFam(){
         return familiar;
     }
     

    

    
    

  

   

  
    
    
    
    
}
