
package ventana;

import asistenciamedica.Administrativo;
import asistenciamedica.Gestionar;
import asistenciamedica.ValidarCampo;
import exception.CampoVacioException;
import exception.EmpleadoExistente;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author usuario
 */
public class RegistrarAdmi extends javax.swing.JFrame {
    private Gestionar gestor;
    private ValidarCampo va = new ValidarCampo();
   
    public RegistrarAdmi(Gestionar gestor) {
        this.gestor=gestor;
        initComponents();
        va.soloLetra(nombreAdmi);
        va.soloNumero(dniAdmi);
        va.soloNumero(edadAdmi);
        
        
    }

            

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        l = new javax.swing.JLabel();
        p = new javax.swing.JLabel();
        e = new javax.swing.JLabel();
        v = new javax.swing.JLabel();
        nombreAdmi = new javax.swing.JTextField();
        dniAdmi = new javax.swing.JTextField();
        edadAdmi = new javax.swing.JTextField();
        domicilioAdmi = new javax.swing.JTextField();
        registrarAdmi = new javax.swing.JButton();
        cancelarAdmi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        l.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l.setText("Nombre Y Apellido:");

        p.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p.setText("N° Documento:");

        e.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        e.setText("Edad:");

        v.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        v.setText("Domicilio:");

        nombreAdmi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreAdmiKeyTyped(evt);
            }
        });

        dniAdmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniAdmiActionPerformed(evt);
            }
        });
        dniAdmi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dniAdmiKeyTyped(evt);
            }
        });

        edadAdmi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edadAdmiKeyTyped(evt);
            }
        });

        registrarAdmi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        registrarAdmi.setText("Registrar");
        registrarAdmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarAdmiActionPerformed(evt);
            }
        });

        cancelarAdmi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelarAdmi.setText("Cancelar");
        cancelarAdmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarAdmiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(registrarAdmi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(cancelarAdmi))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(v)
                            .addComponent(e)
                            .addComponent(p)
                            .addComponent(l))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreAdmi, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(dniAdmi)
                            .addComponent(domicilioAdmi)
                            .addComponent(edadAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(78, 78, 78))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l)
                            .addComponent(nombreAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p)
                            .addComponent(dniAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(e)
                            .addComponent(edadAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(v))
                    .addComponent(domicilioAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrarAdmi)
                    .addComponent(cancelarAdmi))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void nombreAdmiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreAdmiKeyTyped
                

    }//GEN-LAST:event_nombreAdmiKeyTyped

    private void dniAdmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniAdmiActionPerformed

    }//GEN-LAST:event_dniAdmiActionPerformed

    private void dniAdmiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dniAdmiKeyTyped
       
        if(this.dniAdmi.getText().length()>=8){
            evt.consume();
        }
    }//GEN-LAST:event_dniAdmiKeyTyped

    private void edadAdmiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edadAdmiKeyTyped
        if(this.edadAdmi.getText().length()>=2){
            evt.consume();
        }
    }//GEN-LAST:event_edadAdmiKeyTyped

    private void registrarAdmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarAdmiActionPerformed

        try{
            String aux1=this.nombreAdmi.getText().trim();
            String aux2=this.domicilioAdmi.getText().trim();
            if(aux1.equals("") || aux2.equals("")){
                throw new CampoVacioException();
            }
            else{
                Administrativo admi =new Administrativo(20000.00f,this.nombreAdmi.getText(),this.dniAdmi.getText(),Integer.parseInt(this.edadAdmi.getText()),this.domicilioAdmi.getText());
                this.gestor.añadir(admi);
                JOptionPane.showMessageDialog(rootPane, "Administrativo Registrado");
            }

        }catch(java.lang.NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane,"Error en el formato de dato","ATENCION",0);
        }catch(EmpleadoExistente e){
            JOptionPane.showMessageDialog(rootPane,"Empleado ya Registrado","ATENCION",0);
        } catch (CampoVacioException ex) {
            JOptionPane.showMessageDialog(rootPane,"Campos Vacio","ATENCION",0);
        }
        this.nombreAdmi.setText(null);
        this.dniAdmi.setText(null);
        this.edadAdmi.setText(null);
        this.domicilioAdmi.setText(null);
    }//GEN-LAST:event_registrarAdmiActionPerformed

    private void cancelarAdmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarAdmiActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cancelarAdmiActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarAdmi;
    private javax.swing.JTextField dniAdmi;
    private javax.swing.JTextField domicilioAdmi;
    private javax.swing.JLabel e;
    private javax.swing.JTextField edadAdmi;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l;
    private javax.swing.JTextField nombreAdmi;
    private javax.swing.JLabel p;
    private javax.swing.JButton registrarAdmi;
    private javax.swing.JLabel v;
    // End of variables declaration//GEN-END:variables
}
