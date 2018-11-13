
package ventana;

import asistenciamedica.Enfermero;
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
public class RegistrarEnf extends javax.swing.JFrame {
    private final Gestionar gestor;
    private ValidarCampo campo = new ValidarCampo();
    public RegistrarEnf(Gestionar gestor) {
        this.gestor=gestor;
        initComponents();
        campo.soloLetra(nombreE);
        campo.soloNumero(dniE);
        campo.soloNumero(edadE);
        
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        l = new javax.swing.JLabel();
        p = new javax.swing.JLabel();
        e = new javax.swing.JLabel();
        v = new javax.swing.JLabel();
        nombreE = new javax.swing.JTextField();
        dniE = new javax.swing.JTextField();
        edadE = new javax.swing.JTextField();
        domicilioE = new javax.swing.JTextField();
        registrarE = new javax.swing.JButton();
        cancelarE = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        l.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l.setText("Nombre Y Apellido:");

        p.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p.setText("N° Documento:");

        e.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        e.setText("Edad:");

        v.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        v.setText("Domicilio:");

        nombreE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreEKeyTyped(evt);
            }
        });

        dniE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniEActionPerformed(evt);
            }
        });
        dniE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dniEKeyTyped(evt);
            }
        });

        edadE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edadEKeyTyped(evt);
            }
        });

        registrarE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        registrarE.setText("Registrar");
        registrarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarEActionPerformed(evt);
            }
        });

        cancelarE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelarE.setText("Cancelar");
        cancelarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarEActionPerformed(evt);
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
                        .addComponent(registrarE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                        .addComponent(cancelarE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(v)
                            .addComponent(e)
                            .addComponent(p)
                            .addComponent(l))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreE, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(dniE)
                            .addComponent(domicilioE)
                            .addComponent(edadE, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                            .addComponent(nombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p)
                            .addComponent(dniE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(e)
                            .addComponent(edadE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(v))
                    .addComponent(domicilioE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrarE)
                    .addComponent(cancelarE))
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

    private void nombreEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreEKeyTyped

    }//GEN-LAST:event_nombreEKeyTyped

    private void dniEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniEActionPerformed

    }//GEN-LAST:event_dniEActionPerformed

    private void dniEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dniEKeyTyped
        if(this.dniE.getText().length()>=8){
            evt.consume();
        }
    }//GEN-LAST:event_dniEKeyTyped

    private void edadEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edadEKeyTyped
        if(this.edadE.getText().length()>=2){
            evt.consume();
        }
    }//GEN-LAST:event_edadEKeyTyped

    private void registrarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarEActionPerformed

        try{
            String aux1 = this.nombreE.getText().trim();
            String aux2 = this.domicilioE.getText().trim();
            if(aux1.equals("")||aux2.equals("")){
                throw new CampoVacioException();
            }
            else{
                Enfermero enfer =new Enfermero(18000.00f,this.nombreE.getText(),this.dniE.getText(),Integer.parseInt(this.edadE.getText()),this.domicilioE.getText());
                this.gestor.añadir(enfer);
                JOptionPane.showMessageDialog(rootPane, "Enfermero Registrado");
            }
        }catch(java.lang.NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane,"Error en el formato de dato","ATENCION",0);
        }catch(EmpleadoExistente e){
            JOptionPane.showMessageDialog(rootPane,"Empleado ya Registrado","ATENCION",0);
        } catch (CampoVacioException ex) {
            JOptionPane.showMessageDialog(rootPane,"Campos Vacios","ATENCION",0);
        }
        this.nombreE.setText(null);
        this.dniE.setText(null);
        this.edadE.setText(null);
        this.domicilioE.setText(null);
        

    }//GEN-LAST:event_registrarEActionPerformed

    private void cancelarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarEActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cancelarEActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarE;
    private javax.swing.JTextField dniE;
    private javax.swing.JTextField domicilioE;
    private javax.swing.JLabel e;
    private javax.swing.JTextField edadE;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l;
    private javax.swing.JTextField nombreE;
    private javax.swing.JLabel p;
    private javax.swing.JButton registrarE;
    private javax.swing.JLabel v;
    // End of variables declaration//GEN-END:variables
}
