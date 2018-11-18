
package ventana;

import asistencia.Administrativo;
import asistencia.Gestionar;
import exception.EmpleadoExistente;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class BuscarAdmi extends javax.swing.JFrame {
    private Administrativo per;
    private Gestionar gestor;
   
    public BuscarAdmi(Gestionar gestor) {
        this.gestor=gestor;
        
        initComponents();
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dniAdmi = new javax.swing.JTextField();
        buscarAdmi = new javax.swing.JButton();
        jsalidaAdmi = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nombreAdmi = new javax.swing.JTextField();
        edadAdmi = new javax.swing.JTextField();
        domicilioAdmi = new javax.swing.JTextField();
        sueldoAdmi = new javax.swing.JTextField();
        limpiarAdmi = new javax.swing.JButton();
        editarAdministrativo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Ingrese N° Documento:");

        dniAdmi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dniAdmiKeyTyped(evt);
            }
        });

        buscarAdmi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buscarAdmi.setText("Buscar");
        buscarAdmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarAdmiActionPerformed(evt);
            }
        });

        jsalidaAdmi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jsalidaAdmi.setText("Salir");
        jsalidaAdmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsalidaAdmiActionPerformed(evt);
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

        limpiarAdmi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        limpiarAdmi.setText("Limpiar Campo");
        limpiarAdmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarAdmiActionPerformed(evt);
            }
        });

        editarAdministrativo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        editarAdministrativo.setText("Editar Info");
        editarAdministrativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarAdministrativoActionPerformed(evt);
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
                            .addComponent(domicilioAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sueldoAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editarAdministrativo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dniAdmi, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                    .addComponent(nombreAdmi)
                                    .addComponent(edadAdmi))
                                .addGap(86, 86, 86)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jsalidaAdmi)
                                    .addComponent(buscarAdmi))))))
                .addContainerGap(106, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(limpiarAdmi)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dniAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarAdmi))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpiarAdmi)
                    .addComponent(editarAdministrativo)
                    .addComponent(jsalidaAdmi))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombreAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(edadAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(domicilioAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(sueldoAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void dniAdmiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dniAdmiKeyTyped
        if(this.dniAdmi.getText().length()>=8){
            evt.consume();
        }
    }//GEN-LAST:event_dniAdmiKeyTyped

    private void buscarAdmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarAdmiActionPerformed

        try{
            per = (Administrativo)this.gestor.buscar(this.dniAdmi.getText());
            this.nombreAdmi.setText(per.getNombre());
            this.edadAdmi.setText(String.valueOf(per.getEdad()));
            this.domicilioAdmi.setText(per.getDomicilio());
            this.sueldoAdmi.setText(String.valueOf(per.getSueldo()));
            
        }catch(java.lang.NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane,"Error en el formato de dato","ATENCION",0);

        }catch(java.lang.NullPointerException e){
            JOptionPane.showMessageDialog(rootPane,"Administrativo no Registrado","ATENCION",0);
        }catch(java.lang.ClassCastException e){
            JOptionPane.showMessageDialog(rootPane,"Administrativo no existente no existente","ATENCION",0);
        }
    }//GEN-LAST:event_buscarAdmiActionPerformed

    private void jsalidaAdmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsalidaAdmiActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jsalidaAdmiActionPerformed

    private void limpiarAdmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarAdmiActionPerformed
        this.dniAdmi.setText(null);
        this.nombreAdmi.setText(null);
        this.edadAdmi.setText(null);
        this.domicilioAdmi.setText(null);
        this.sueldoAdmi.setText(null);
        
    }//GEN-LAST:event_limpiarAdmiActionPerformed

    private void editarAdministrativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarAdministrativoActionPerformed
        try{
            EditarAdmi edi = new EditarAdmi(gestor,per);
            edi.setTitle("EDITAR ADMINISTRATIVO");
            edi.setLocationRelativeTo(null);
            edi.setVisible(true);
           this.setVisible(false);
        }catch(java.lang.NullPointerException e){
            JOptionPane.showMessageDialog(rootPane,"Buscar Administrativo","ATENCION",0);
        }
    }//GEN-LAST:event_editarAdministrativoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarAdmi;
    private javax.swing.JTextField dniAdmi;
    private javax.swing.JTextField domicilioAdmi;
    private javax.swing.JTextField edadAdmi;
    private javax.swing.JButton editarAdministrativo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jsalidaAdmi;
    private javax.swing.JButton limpiarAdmi;
    private javax.swing.JTextField nombreAdmi;
    private javax.swing.JTextField sueldoAdmi;
    // End of variables declaration//GEN-END:variables
}
