
package ventana;

import asistenciamedica.Gestionar;
import asistenciamedica.Movil;
import exception.CampoVacioException;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class BuscarMovil extends javax.swing.JFrame {
    private Gestionar gestor;
    private Movil movil;
    
    public BuscarMovil(Gestionar gestor) {
        this.gestor=gestor;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombre = new javax.swing.JTextField();
        edad = new javax.swing.JTextField();
        domicilio = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buscarChofer = new javax.swing.JButton();
        salidaChofer = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        limpiarChofer = new javax.swing.JButton();
        editarenfermero = new javax.swing.JButton();
        patente = new javax.swing.JTextField();
        marca = new javax.swing.JTextField();
        modelo = new javax.swing.JTextField();
        año = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Ingrese Patente:");

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
        jLabel2.setText("Marca:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Modelo:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Año:");

        limpiarChofer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        limpiarChofer.setText("Limpiar Campo");
        limpiarChofer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarChoferActionPerformed(evt);
            }
        });

        editarenfermero.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        editarenfermero.setText("Editar Info");
        editarenfermero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarenfermeroActionPerformed(evt);
            }
        });

        año.setText("jTextField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(editarenfermero)
                                    .addComponent(patente, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(marca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(modelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salidaChofer)
                            .addComponent(buscarChofer)))
                    .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(buscarChofer)
                    .addComponent(patente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpiarChofer)
                    .addComponent(editarenfermero)
                    .addComponent(salidaChofer))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
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

    private void buscarChoferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarChoferActionPerformed

        try{
            if(this.patente.getText().trim().equals("")){
                throw new CampoVacioException();
            }
            else{
                movil = (Movil)this.gestor.buscar(this.patente.getText());
                this.modelo.setText(movil.getModelo());
                this.año.setText(String.valueOf(movil.getAño()));
                this.marca.setText(movil.getMarca());
                

            }

        }catch(java.lang.NullPointerException e){
            JOptionPane.showMessageDialog(rootPane,"Enfermero no Registrado","ATENCION",0);
        }catch(java.lang.ClassCastException e){
            JOptionPane.showMessageDialog(rootPane,"Enfermero no existente","ATENCION",0);
        } catch (CampoVacioException ex) {
            JOptionPane.showMessageDialog(rootPane,"Ingrese dni","ATENCION",0);
        }
    }//GEN-LAST:event_buscarChoferActionPerformed

    private void salidaChoferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salidaChoferActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_salidaChoferActionPerformed

    private void limpiarChoferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarChoferActionPerformed
        this.dniEnfer.setText(null);
        this.nombre.setText(null);
        this.edad.setText(null);
        this.domicilio.setText(null);
        this.sueldo.setText(null);
    }//GEN-LAST:event_limpiarChoferActionPerformed

    private void editarenfermeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarenfermeroActionPerformed
        try{
            EditarEnfer edi = new EditarEnfer(gestor,per);
            edi.setTitle("EDITAR ENFERMERO");
            edi.setLocationRelativeTo(null);
            edi.setVisible(true);
            this.setVisible(false);
        }catch(java.lang.NullPointerException e){
            JOptionPane.showMessageDialog(rootPane,"Buscar ENFERMERO","ATENCION",0);
        }
    }//GEN-LAST:event_editarenfermeroActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField año;
    private javax.swing.JButton buscarChofer;
    private javax.swing.JTextField domicilio;
    private javax.swing.JTextField edad;
    private javax.swing.JButton editarenfermero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpiarChofer;
    private javax.swing.JTextField marca;
    private javax.swing.JTextField modelo;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField patente;
    private javax.swing.JButton salidaChofer;
    // End of variables declaration//GEN-END:variables
}
