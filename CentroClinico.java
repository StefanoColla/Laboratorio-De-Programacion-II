package punto2tp4;



/** @author Colla Stefano-Mena Hernan */
public class CentroClinico {

  
    public static void main(String[] args) {
       Gestor gestorClinica = new GestorClinica();
       VentanaP principal = new VentanaP(gestorClinica);
       principal.setVisible(true);
       principal.setLocationRelativeTo(null);
    }
    
}
