
package ventana;

import asistenciamedica.Chofer;
import asistenciamedica.Gestionar;
import exception.CampoVacioException;
import exception.EmpleadoExistente;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class BuscarChofer extends javax.swing.JFrame {
    private Gestionar gestor;
    private Chofer per;
    
    
    public BuscarChofer(Gestionar gestor) {
        this.gestor=gestor;
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dniChofer = new javax.swing.JTextField();
        buscarChofer = new javax.swing.JButton();
        salidaChofer = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nombreChofer = new javax.swing.JTextField();
        edadChofer = new javax.swing.JTextField();
        domicilioChofer = new javax.swing.JTextField();
        sueldoChofer = new javax.swing.JTextField();
        limpiarChofer = new javax.swing.JButton();
        editarChofer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Ingrese N° Documento:");

        dniChofer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dniChoferKeyTyped(evt);
            }
        });

        buscarChofer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buscarChofer.setText("Buscar");
        buscarChofer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarChoferActionPerformed(evt);
            }
        });

        salidaChofer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        salidaChofer.setText("Salir");
        salidaChofer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salidaChoferActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre Y Apellido:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Edad:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Domicilio:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Sueldo:");

        limpiarChofer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        limpiarChofer.setText("Limpiar Campo");
        limpiarChofer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarChoferActionPerformed(evt);
            }
        });

        editarChofer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        editarChofer.setText("Editar Info");
        editarChofer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarChoferActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(160, 160, 160))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(138, 138, 138))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(81, 81, 81))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(domicilioChofer, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sueldoChofer, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editarChofer)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dniChofer, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                    .addComponent(nombreChofer)
                                    .addComponent(edadChofer))
                                .addGap(86, 86, 86)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(salidaChofer)
                                    .addComponent(buscarChofer))))))
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(limpiarChofer)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dniChofer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarChofer))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpiarChofer)
                    .addComponent(editarChofer)
                    .addComponent(salidaChofer))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombreChofer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(edadChofer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(domicilioChofer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(sueldoChofer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dniChoferKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dniChoferKeyTyped
        if(this.dniChofer.getText().length()>=8){
            evt.consume();
        }
    }//GEN-LAST:event_dniChoferKeyTyped

    private void buscarChoferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarChoferActionPerformed

        try{
            if(this.edadChofer.getText().trim().equals("")){
                throw new CampoVacioException();
            }
            else{
                per = (Chofer)this.gestor.buscar(this.dniChofer.getText());
                this.nombreChofer.setText(per.getNombre());
                this.edadChofer.setText(String.valueOf(per.getEdad()));
                this.domicilioChofer.setText(per.getDomicilio());
                this.sueldoChofer.setText(String.valueOf(per.getSueldo()));
                
            }
        }catch(java.lang.NumberFormatException e){  //excepcion para el formato de los campos
            JOptionPane.showMessageDialog(rootPane,"Error en el formato de dato","ATENCION",0);

        }catch(java.lang.NullPointerException e){  
            JOptionPane.showMessageDialog(rootPane,"Chofer no Registrado","ATENCION",0);
        }catch(java.lang.ClassCastException e){
            JOptionPane.showMessageDialog(rootPane,"Chofer no existente","ATENCION",0);
        } catch (CampoVacioException ex) {
            JOptionPane.showMessageDialog(rootPane,"Ingrese dni","ATENCION",0);
        }  
    }//GEN-LAST:event_buscarChoferActionPerformed

    private void salidaChoferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salidaChoferActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_salidaChoferActionPerformed

    private void limpiarChoferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarChoferActionPerformed
        this.dniChofer.setText(null);
        this.nombreChofer.setText(null);
        this.edadChofer.setText(null);
        this.domicilioChofer.setText(null);
        this.sueldoChofer.setText(null);
    }//GEN-LAST:event_limpiarChoferActionPerformed

    private void editarChoferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarChoferActionPerformed
        try{
            EditarChofer edi = new EditarChofer(gestor,per);
            edi.setTitle("EDITAR CHOFER");
            edi.setLocationRelativeTo(null);
            edi.setVisible(true);
            this.setVisible(false);
        }catch(java.lang.NullPointerException e){
            JOptionPane.showMessageDialog(rootPane,"Buscar Afiliado","ATENCION",0);
        }
    }//GEN-LAST:event_editarChoferActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarChofer;
    private javax.swing.JTextField dniChofer;
    private javax.swing.JTextField domicilioChofer;
    private javax.swing.JTextField edadChofer;
    private javax.swing.JButton editarChofer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpiarChofer;
    private javax.swing.JTextField nombreChofer;
    private javax.swing.JButton salidaChofer;
    private javax.swing.JTextField sueldoChofer;
    // End of variables declaration//GEN-END:variables
}
