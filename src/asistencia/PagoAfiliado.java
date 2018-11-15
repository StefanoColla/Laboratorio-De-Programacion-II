
package asistencia;

import java.util.ArrayList;
import java.util.Calendar;


/**
 *
 * @author usuario
 */
public class PagoAfiliado {
    private final int IMPORTE_POR_MES=200;
    private ArrayList pagos = new ArrayList();
    
    
    public PagoAfiliado(){
        
    }
    public class Cuota{
        private int mes;
        private int año;
        public Cuota(int mes,int año){
            this.año=año;
            this.mes=mes;
        }

        
    }
    public void agregarPago(int importe,int mes,int año){
        if(importe==IMPORTE_POR_MES){
            Cuota c = new Cuota(mes,año);
            pagos.add(c);
        }
    }
    public boolean compararMes(){
        Boolean resultado;
        Calendar  fecha =  Calendar.getInstance();
        Cuota c=getUltimaCuota();
        if(c.año==fecha.get(Calendar.YEAR)){
            if(c.mes<fecha.get(Calendar.MONTH)){
                resultado=true;
            }else{
                resultado=false;
            }
        }else{
            resultado=false;
        }
        return resultado;
            
    }
    public Cuota getUltimaCuota(){
        int i=1;
        Cuota c;
        c=null;
        for(Object cuota:pagos){
            if((pagos.size()-i)==0){
                c=(Cuota)cuota;
            }
            i++;
        }
        return c;
    }
    
    
    /* int i=1;
        Cuota c;
        c=null;
        for(Object cuota:pagos){
            if((pagos.size()-i)==0){
                c=(Cuota)cuota;
            }
            i++;
        }
        return c;*/
}
