package punto2tp4;

import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

/** @author Colla Stefano-Mena Hernan */
public class HistoriaClinica {
    List <Enfermedad> enfermedades;
    List <String> medicamentos;
    
    public HistoriaClinica(){
        enfermedades=new LinkedList();
        medicamentos=new LinkedList();
    }
    
    public void addEnfermedad(Enfermedad enfermedad){
       enfermedades.add(enfermedad);
    }
    public void addMedicamento(String medicamento){
        medicamentos.add(medicamento);
    }
    public void mostrarEnfermedades(){
        for(Enfermedad elemento:enfermedades){
            System.out.println(elemento);
        }
    }
    public void mostrarMedicamentos(){
        for(String elemento:medicamentos){
            System.out.println("Medicamento:" + elemento);
        }
    }
    public void ordenarEnfermedades(){
        Collections.sort(enfermedades);
    }
}
