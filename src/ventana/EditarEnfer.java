
package ventana;

import asistenciamedica.Enfermero;
import asistenciamedica.Gestionar;
import asistenciamedica.ValidarCampo;
import exception.CampoVacioException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class EditarEnfer extends javax.swing.JFrame {

    private Gestionar gestor;
    private Enfermero enfer;
    private ValidarCampo campo = new ValidarCampo();
    public EditarEnfer(Gestionar gestor,Enfermero enfer) {
        this.gestor=gestor;
        this.enfer=enfer;
        initComponents();
        this.nombre.setText(enfer.getNombre());
        this.edad.setText(String.valueOf(enfer.getEdad()));
        this.domicilio.setText(enfer.getDomicilio());
        campo.soloLetra(nombre);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlimpiarD = new javax.swing.JButton();
        jsalidaD = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        edad = new javax.swing.JTextField();
        domicilio = new javax.swing.JTextField();
        modificarD = new javax.swing.JButton();
        eliminarD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jlimpiarD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlimpiarD.setText("Limpiar Campo");
        jlimpiarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlimpiarDActionPerformed(evt);
            }
        });

        jsalidaD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jsalidaD.setText("Salir");
        jsalidaD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsalidaDActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre Y Apellido:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Edad:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Domicilio:");

        edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edadKeyTyped(evt);
            }
        });

        modificarD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        modificarD.setText("Modificar");
        modificarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarDActionPerformed(evt);
            }
        });

        eliminarD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        eliminarD.setText("Eliminar");
        eliminarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(160, 160, 160))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(81, 81, 81)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(138, 138, 138)
                                .addComponent(domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jsalidaD))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(modificarD)
                        .addGap(63, 63, 63)
                        .addComponent(eliminarD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jlimpiarD)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jsalidaD)
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificarD)
                    .addComponent(eliminarD)
                    .addComponent(jlimpiarD))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jlimpiarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlimpiarDActionPerformed

        this.domicilio.setText(null);
        this.edad.setText(null);
        this.nombre.setText(null);
        

    }//GEN-LAST:event_jlimpiarDActionPerformed

    private void jsalidaDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsalidaDActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jsalidaDActionPerformed

    private void edadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edadKeyTyped
        if(this.edad.getText().length()>=2){
            evt.consume();
        }
    }//GEN-LAST:event_edadKeyTyped

    private void modificarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarDActionPerformed
        try{
            String aux1 = this.nombre.getText().trim();
            String aux2 = this.domicilio.getText().trim();
            if(aux1.equals("") || aux2.equals("")){
                throw new CampoVacioException();
            }
            else{
                enfer.setNombre(this.nombre.getText());
                enfer.setDomicilio(this.domicilio.getText());
                enfer.setEdad(Integer.parseInt(this.edad.getText()));
            }
            JOptionPane.showMessageDialog(rootPane, "Enfermero Modificado");
        }catch(java.lang.NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane,"Error en el formato de dato","ATENCION",0);
        } catch (CampoVacioException ex) {
            JOptionPane.showMessageDialog(rootPane,"Campo Vacio","ATENCION",0);
        }

    }//GEN-LAST:event_modificarDActionPerformed

    private void eliminarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarDActionPerformed
        try{
            String aux1=this.nombre.getText().trim();
            String aux2=this.domicilio.getText().trim();
            String aux3 =this.edad.getText().trim();
            
            if(aux1.equals("") || aux2.equals("") || aux3.equals("")){
                throw new CampoVacioException();

            }
            else{
                this.gestor.eliminar(enfer.getDni());
                JOptionPane.showMessageDialog(rootPane, "Enfermero Eliminado");
                this.domicilio.setText(null);
                this.edad.setText(null);
                this.nombre.setText(null);
                
            }
        
        } catch (CampoVacioException ex) {
            JOptionPane.showMessageDialog(rootPane,"Campo Vacio","ATENCION",0);
        }

    }//GEN-LAST:event_eliminarDActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField domicilio;
    private javax.swing.JTextField edad;
    private javax.swing.JButton eliminarD;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jlimpiarD;
    private javax.swing.JButton jsalidaD;
    private javax.swing.JButton modificarD;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}
