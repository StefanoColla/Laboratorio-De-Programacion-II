
package asistencia;

import exception.CampoVacioException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author usuario
 */
public class PagoAfiliado {
    private final int IMPORTE_POR_MES=200;
    private ArrayList pagos = new ArrayList();
    private Afiliado afi;
    
    
    public PagoAfiliado(Afiliado afi){
        this.afi=afi;
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
        int cantFam = cantFamiliares();
        try{
        if(importe==IMPORTE_POR_MES+50*cantFam){
            Cuota c = new Cuota(mes,año);
            pagos.add(c);
            JOptionPane.showMessageDialog(null,"Pago Existoso");
        }else{
            if(importe<IMPORTE_POR_MES+50*cantFam){
                throw new NullPointerException();
            }else{
                
                    throw new CampoVacioException();
                
                }
            }
        }catch(CampoVacioException ex){
            JOptionPane.showMessageDialog(null,"Importe Mayor al Solicitado","ATENCION",0);
        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null,"Importe Menor al Solicitado","ATENCION",0);
        }
    }
    public boolean compararMes(){
        Boolean resultado;
        Calendar  fecha =  Calendar.getInstance();
        Cuota c=getUltimaCuota();
        if(c.año==fecha.get(Calendar.YEAR)){
            if((fecha.get(Calendar.MONTH)-c.mes)<=2){
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
    public int cantFamiliares(){
        int i=0;
        for(Object c:afi.getListaFam()){
            i++;
        }
        return i;
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
