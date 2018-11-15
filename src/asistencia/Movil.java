
package asistencia;

/**
 *
 * @author usuario
 */
public class Movil {
    private String marca;
    private String modelo;
    private int año;
    private String patente;

    public Movil(String marca, String modelo, int año, String patente) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

       
    
    
    
    
}
