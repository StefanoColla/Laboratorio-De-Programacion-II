
package ventana;

import asistenciamedica.Afiliado;
import asistenciamedica.Gestionar;
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
public class RegistrarAfi extends javax.swing.JFrame {
    private  Gestionar gestor;
    private Afiliado afi;
    private ValidarCampo va = new ValidarCampo();
   
    public RegistrarAfi(Gestionar gestor) {
        super("Agregar Afiliado");
        this.gestor=gestor;
        initComponents();
        va.soloLetra(nombreAfi);
        va.soloNumero(edadAfi);
        va.soloNumero(dniAfi);
        
        
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        dia = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        l = new javax.swing.JLabel();
        p = new javax.swing.JLabel();
        e = new javax.swing.JLabel();
        v = new javax.swing.JLabel();
        nombreAfi = new javax.swing.JTextField();
        dniAfi = new javax.swing.JTextField();
        edadAfi = new javax.swing.JTextField();
        domicilioAfi = new javax.swing.JTextField();
        registrarAfi = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        jTextField3.setText("jTextField1");

        dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        l.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l.setText("Nombre Y Apellido:");

        p.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p.setText("N° Documento:");

        e.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        e.setText("Edad:");

        v.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        v.setText("Domicilio:");

        nombreAfi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreAfiKeyTyped(evt);
            }
        });

        dniAfi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniAfiActionPerformed(evt);
            }
        });
        dniAfi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dniAfiKeyTyped(evt);
            }
        });

        edadAfi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edadAfiKeyTyped(evt);
            }
        });

        registrarAfi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        registrarAfi.setText("Registrar");
        registrarAfi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarAfiActionPerformed(evt);
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
                        .addComponent(registrarAfi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
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
                            .addComponent(nombreAfi, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(dniAfi)
                            .addComponent(domicilioAfi)
                            .addComponent(edadAfi, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                            .addComponent(nombreAfi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p)
                            .addComponent(dniAfi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(e)
                            .addComponent(edadAfi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(v))
                    .addComponent(domicilioAfi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrarAfi)
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
    
    private void diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaActionPerformed
        
       
    }//GEN-LAST:event_diaActionPerformed

    private void nombreAfiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreAfiKeyTyped

    }//GEN-LAST:event_nombreAfiKeyTyped

    private void dniAfiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniAfiActionPerformed

    }//GEN-LAST:event_dniAfiActionPerformed

    private void dniAfiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dniAfiKeyTyped
        if(this.dniAfi.getText().length()>=8){
            evt.consume();
        }
    }//GEN-LAST:event_dniAfiKeyTyped

    private void edadAfiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edadAfiKeyTyped
        if(this.edadAfi.getText().length()>=2){
            evt.consume();
        }
    }//GEN-LAST:event_edadAfiKeyTyped

    private void registrarAfiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarAfiActionPerformed

        try{
            String aux1 = this.nombreAfi.getText().trim();
            String aux2 = this.domicilioAfi.getText().trim();
            if(aux1.equals("") || aux2.equals("")){
                throw new CampoVacioException();
            }
            else{
                afi =new Afiliado(this.nombreAfi.getText(),this.dniAfi.getText(),Integer.parseInt(this.edadAfi.getText()),this.domicilioAfi.getText());
                this.gestor.añadir(afi);
                JOptionPane.showMessageDialog(rootPane, "Afiliado Registrado");
            
                RegistraFamiliar fami = new RegistraFamiliar(afi);
                fami.setTitle("REGISTRAR FAMILIAR");
                fami.setLocationRelativeTo(null);
                fami.setVisible(true);
            } 

        }catch(java.lang.NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane,"Error en el formato de dato","ATENCION",0);
        }catch(EmpleadoExistente e){
            JOptionPane.showMessageDialog(rootPane,"Empleado ya Registrado","ATENCION",0);
        } catch (CampoVacioException ex) {
            JOptionPane.showMessageDialog(rootPane,"Campo Vacio","ATENCION",0);
        }
         this.nombreAfi.setText(null);
            this.dniAfi.setText(null);
            this.edadAfi.setText(null);
            this.domicilioAfi.setText(null);

    }//GEN-LAST:event_registrarAfiActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cancelarActionPerformed

 
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField dia;
    private javax.swing.JTextField dniAfi;
    private javax.swing.JTextField domicilioAfi;
    private javax.swing.JLabel e;
    private javax.swing.JTextField edadAfi;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel l;
    private javax.swing.JTextField nombreAfi;
    private javax.swing.JLabel p;
    private javax.swing.JButton registrarAfi;
    private javax.swing.JLabel v;
    // End of variables declaration//GEN-END:variables

    
}
