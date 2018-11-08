package punto2tp4;

/** @author Colla Stefano-Mena Hernan*/
public class Enfermedad implements Comparable<Enfermedad> {
    private String tipo;
    private String nombre;
    private int tipoE;
    private String tiempo;
    
    public Enfermedad(String tipo,String nombre,String tiempo){
        this.nombre=nombre;
        this.tipo=tipo;
        this.tiempo=tiempo;
        if(tipo.equals("Permanente")){
            this.tipoE=1;
        }else{
            this.tipoE=0;
        }
    }
    
   
    
    public String getTipo() {
        return tipo;
    }

    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   
    public String getNombre() {
        return nombre;
    }

   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public int getTipoE() {
        return tipoE;
    }

    @Override
    public String toString() {
        return "tipo=" + tipo + ", nombre=" + nombre + ", tiempo="+ tiempo;
    }

    @Override
    public int compareTo(Enfermedad o) {
         int lastCmp = tipo.compareTo(o.tipo);
       return (lastCmp!=0? lastCmp: -1*tiempo.compareTo(o.tiempo));
    }

    

    

  
    
}
