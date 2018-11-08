package punto2tp4;

/** @author Colla Stefano-Mena Hernan */
public class Contrato {
    private int horasTrabajadas;
    private int horasExtras;
    
    public Contrato(int horasTrabajadas,int horasExtras){
        this.horasExtras=horasExtras;
        this.horasTrabajadas=horasTrabajadas;
    }

   
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

   
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

   
    public int getHorasExtras() {
        return horasExtras;
    }

   
    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }
}
