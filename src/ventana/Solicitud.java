
package ventana;

import asistencia.Afiliado;
import asistencia.Doctor;
import asistencia.Enfermero;
import asistencia.Gestionar;
import asistencia.Movil;
import asistencia.PagoAfiliado.Cuota;
import asistencia.Persona;
import exception.CampoVacioException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import asistencia.SolicitudMedica;

/**
 *
 * @author usuario
 */
public class Solicitud extends javax.swing.JFrame {
    private SolicitudMedica soli;
    private Gestionar gestor;
    private Afiliado per;
    private Doctor doc;
    private Enfermero enfer;
    private Movil movil;
    public Solicitud(Gestionar gestor) {
        this.gestor=gestor;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        dni = new javax.swing.JTextField();
        Solicitud = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Ingrese N° Documento:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Ingrese N° Documento:");

        Solicitud.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Solicitud.setText("Solicitar");
        Solicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolicitudActionPerformed(evt);
            }
        });

        cancelar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(Solicitud)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelar)
                .addGap(112, 112, 112))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Solicitud)
                    .addComponent(cancelar))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolicitudActionPerformed
        try{
            if(this.dni.getText().equals("")==true){
                throw new CampoVacioException();
            }else{
                per = (Afiliado)this.gestor.buscar(this.dni.getText());
                Boolean respuesta = per.getPago().compararMes();
                if(respuesta==false){
                    JOptionPane.showMessageDialog(rootPane,"Solicitud Rechazada","ATENCION",0);
                }
                else{
                    Doctor doc= gestor.buscarDoc();
                    Enfermero enfer = gestor.buscarEnf();
                    Movil movil= gestor.buscarMov();
                    soli = new SolicitudMedica(per,doc,enfer,movil);
                    JOptionPane.showMessageDialog(rootPane,"Solicitud Existosa");
                    InfoPaciente inf=new InfoPaciente(gestor,soli,"Enfermedad a tratar, para datos especificos sobre medicamentos consulta al medico.");
                    inf.setLocationRelativeTo(null);
                    inf.setVisible(true);
                }
            }
        }catch(java.lang.NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane,"Error en el formato de dato","ATENCION",0);
        
        }catch(java.lang.ClassCastException e){
            JOptionPane.showMessageDialog(rootPane,"Persona no existente","ATENCION",0);
        } catch (CampoVacioException ex) {
            JOptionPane.showMessageDialog(rootPane,"Ingrese Dni","ATENCION",0);
        }catch (NullPointerException ex){
            JOptionPane.showMessageDialog(rootPane,"Personal o Movil no Disponible.","ATENCION",0);
        }    
    }//GEN-LAST:event_SolicitudActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cancelarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Solicitud;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField dni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
