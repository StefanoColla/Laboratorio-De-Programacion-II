
package ventana;

import asistenciamedica.Chofer;
import asistenciamedica.Gestionar;
import asistenciamedica.ValidarCampo;
import exception.CampoVacioException;
import exception.EmpleadoExistente;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class RegistrarChofer extends javax.swing.JFrame {
    private Gestionar gestor;
    private ValidarCampo campo = new ValidarCampo();
   
    public RegistrarChofer(Gestionar gestor) {
        this.gestor=gestor;
        initComponents();
        campo.soloLetra(nombreC);
        campo.soloNumero(dniC);
        campo.soloNumero(edadC);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        l = new javax.swing.JLabel();
        p = new javax.swing.JLabel();
        e = new javax.swing.JLabel();
        v = new javax.swing.JLabel();
        nombreC = new javax.swing.JTextField();
        dniC = new javax.swing.JTextField();
        edadC = new javax.swing.JTextField();
        domicilioC = new javax.swing.JTextField();
        registrarChofer = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        l.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l.setText("Nombre Y Apellido:");

        p.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p.setText("N° Documento:");

        e.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        e.setText("Edad:");

        v.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        v.setText("Domicilio:");

        nombreC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreCKeyTyped(evt);
            }
        });

        dniC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniCActionPerformed(evt);
            }
        });
        dniC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dniCKeyTyped(evt);
            }
        });

        edadC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edadCKeyTyped(evt);
            }
        });

        registrarChofer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        registrarChofer.setText("Registrar");
        registrarChofer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarChoferActionPerformed(evt);
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
                        .addComponent(registrarChofer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
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
                            .addComponent(nombreC, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(dniC)
                            .addComponent(domicilioC)
                            .addComponent(edadC, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                            .addComponent(nombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p)
                            .addComponent(dniC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(e)
                            .addComponent(edadC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(v))
                    .addComponent(domicilioC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrarChofer)
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

    private void nombreCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreCKeyTyped

    }//GEN-LAST:event_nombreCKeyTyped

    private void dniCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniCActionPerformed

    }//GEN-LAST:event_dniCActionPerformed

    private void dniCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dniCKeyTyped
        if(this.dniC.getText().length()>=8){
            evt.consume();
        }
    }//GEN-LAST:event_dniCKeyTyped

    private void edadCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edadCKeyTyped
        if(this.edadC.getText().length()>=2){
            evt.consume();
        }
    }//GEN-LAST:event_edadCKeyTyped

    private void registrarChoferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarChoferActionPerformed

        try{
             String aux1=this.nombreC.getText().trim();
            String aux2=this.domicilioC.getText().trim();
            String aux3=this.dniC.getText().trim();
            if(aux1.equals("") || aux2.equals("") || aux3.equals("")){
                throw new CampoVacioException();
                
            }
            else{

            Chofer chofer =new Chofer(23000.00f,this.nombreC.getText(),this.dniC.getText(),Integer.parseInt(this.edadC.getText()),this.domicilioC.getText());
            this.gestor.añadir(chofer);
            JOptionPane.showMessageDialog(rootPane, "Chofer Registrado");
            }

        }catch(java.lang.NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane,"Error en el formato de dato","ATENCION",0);
        }catch(EmpleadoExistente e){
            JOptionPane.showMessageDialog(rootPane,"Empleado ya Registrado","ATENCION",0);
        
        } catch (CampoVacioException ex) {
            JOptionPane.showMessageDialog(rootPane,"Campos Vacio","ATENCION",0);
        }
        this.nombreC.setText(null);
        this.dniC.setText(null);
        this.edadC.setText(null);
        this.domicilioC.setText(null);

    }//GEN-LAST:event_registrarChoferActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cancelarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField dniC;
    private javax.swing.JTextField domicilioC;
    private javax.swing.JLabel e;
    private javax.swing.JTextField edadC;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l;
    private javax.swing.JTextField nombreC;
    private javax.swing.JLabel p;
    private javax.swing.JButton registrarChofer;
    private javax.swing.JLabel v;
    // End of variables declaration//GEN-END:variables
}
