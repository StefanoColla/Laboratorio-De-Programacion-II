package punto2tp4;

/** @author Colla Stefano-Mena Hernan */
public class TurnoTrabajo {
    private int horaIngreso;
    private int horaSalida;
    
    public TurnoTrabajo(int hora1,int hora2){
        this.horaIngreso=hora1;
        this.horaSalida=hora2;
    }

    public int getHoraIngreso() {
        return horaIngreso;
    }
   
    public void setHoraIngreso(int horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    
    public int getHoraSalida() {
        return horaSalida;
    }

   
    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }
}
