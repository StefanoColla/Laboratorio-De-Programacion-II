
package ventana;

import asistenciamedica.Afiliado;
import asistenciamedica.Familiar;
import asistenciamedica.Persona;
import asistenciamedica.ValidarCampo;
import exception.CampoVacioException;
import exception.EmpleadoExistente;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author usuario
 */
public class RegistraFamiliar extends javax.swing.JFrame {
    private Afiliado afi;
    private ArrayList <Persona> fami;
    private ValidarCampo va = new ValidarCampo();
    
    public RegistraFamiliar(Afiliado afi) {
        this.afi=afi;
        fami=new ArrayList();
        initComponents();
        va.soloLetra(nombreF);
        va.soloNumero(dniF);
        va.soloNumero(edadF);
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        l = new javax.swing.JLabel();
        p = new javax.swing.JLabel();
        e = new javax.swing.JLabel();
        v = new javax.swing.JLabel();
        nombreF = new javax.swing.JTextField();
        dniF = new javax.swing.JTextField();
        edadF = new javax.swing.JTextField();
        domicilioF = new javax.swing.JTextField();
        registrar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        l.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l.setText("Nombre Y Apellido:");

        p.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p.setText("N° Documento:");

        e.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        e.setText("Edad:");

        v.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        v.setText("Domicilio:");

        nombreF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreFKeyTyped(evt);
            }
        });

        dniF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniFActionPerformed(evt);
            }
        });
        dniF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dniFKeyTyped(evt);
            }
        });

        edadF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edadFKeyTyped(evt);
            }
        });

        registrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        cancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(registrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(cancelar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(v)
                            .addComponent(e)
                            .addComponent(p)
                            .addComponent(l))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreF, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(dniF)
                            .addComponent(domicilioF)
                            .addComponent(edadF, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                            .addComponent(nombreF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p)
                            .addComponent(dniF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(e)
                            .addComponent(edadF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(v))
                    .addComponent(domicilioF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrar)
                    .addComponent(cancelar))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreFKeyTyped

    }//GEN-LAST:event_nombreFKeyTyped

    private void dniFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniFActionPerformed

    }//GEN-LAST:event_dniFActionPerformed

    private void dniFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dniFKeyTyped
        if(this.dniF.getText().length()>=8){
            evt.consume();
        }
    }//GEN-LAST:event_dniFKeyTyped

    private void edadFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edadFKeyTyped
        if(this.edadF.getText().length()>=2){
            evt.consume();
        }
    }//GEN-LAST:event_edadFKeyTyped

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed

        try{
            String aux1 = this.nombreF.getText().trim();
            String aux2 = this.domicilioF.getText().trim();
            if(aux1.equals("") || aux2.equals("")){
                throw new CampoVacioException();
            }
            else{
                Familiar fa =new Familiar(this.nombreF.getText(),this.dniF.getText(),Integer.parseInt(this.edadF.getText()),this.domicilioF.getText());
                this.fami.add(fa);
                afi.setFamiliar(fami);
                JOptionPane.showMessageDialog(rootPane, "Familiar Registrado");
            }
        }catch(java.lang.NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane,"Error en el formato de dato","ATENCION",0);
        }catch(EmpleadoExistente e){
            JOptionPane.showMessageDialog(rootPane,"Familiar ya Registrado","ATENCION",0);
        } catch (CampoVacioException ex) {
            JOptionPane.showMessageDialog(rootPane,"Campo Vacio","ATENCION",0);
        }
        this.nombreF.setText(null);
        this.dniF.setText(null);
        this.edadF.setText(null);
        this.domicilioF.setText(null);

    }//GEN-LAST:event_registrarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cancelarActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField dniF;
    private javax.swing.JTextField domicilioF;
    private javax.swing.JLabel e;
    private javax.swing.JTextField edadF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l;
    private javax.swing.JTextField nombreF;
    private javax.swing.JLabel p;
    private javax.swing.JButton registrar;
    private javax.swing.JLabel v;
    // End of variables declaration//GEN-END:variables
}
