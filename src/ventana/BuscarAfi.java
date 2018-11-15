
package ventana;

import asistencia.Afiliado;
import asistencia.Gestionar;
import asistencia.Persona;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;



/**
 *
 * @author usuario
 */
public class BuscarAfi extends javax.swing.JFrame {
    private final Gestionar gestor;
    private Afiliado per ;
    DefaultListModel listaFamiliar = new DefaultListModel();
   
     
   
    public BuscarAfi(Gestionar gestor) {
        this.gestor=gestor;
        
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dniAfi = new javax.swing.JTextField();
        buscarAfi = new javax.swing.JButton();
        salidaAfi = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombreAfi = new javax.swing.JTextField();
        edadAfi = new javax.swing.JTextField();
        domicilioAfi = new javax.swing.JTextField();
        editarAfiliado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaFlia = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Ingrese N° Documento:");

        dniAfi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dniAfiKeyTyped(evt);
            }
        });

        buscarAfi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buscarAfi.setText("Buscar");
        buscarAfi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarAfiActionPerformed(evt);
            }
        });

        salidaAfi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        salidaAfi.setText("Salir");
        salidaAfi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salidaAfiActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre Y Apellido:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Edad:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Domicilio:");

        editarAfiliado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        editarAfiliado.setText("Editar Info");
        editarAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarAfiliadoActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listaFlia);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Datos De Familiares");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(196, 196, 196)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dniAfi, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                    .addComponent(nombreAfi)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(160, 160, 160))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(138, 138, 138))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(81, 81, 81))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(editarAfiliado)
                                                    .addComponent(jLabel1))
                                                .addGap(31, 31, 31)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(domicilioAfi, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(edadAfi, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(37, 37, 37)
                                                .addComponent(buscarAfi)))))
                                .addGap(58, 58, 58)
                                .addComponent(salidaAfi))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dniAfi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editarAfiliado)
                    .addComponent(salidaAfi)
                    .addComponent(buscarAfi))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombreAfi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(edadAfi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(domicilioAfi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dniAfiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dniAfiKeyTyped
        if(this.dniAfi.getText().length()>=8){
            evt.consume();
        }
    }//GEN-LAST:event_dniAfiKeyTyped

    private void buscarAfiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarAfiActionPerformed

        try{
            if(this.dniAfi.getText().trim().equals("")){
                throw CampoVacioException();
            }
            else{
                per = (Afiliado)this.gestor.buscar(this.dniAfi.getText());
                this.nombreAfi.setText(per.getNombre());
                this.edadAfi.setText(String.valueOf(per.getEdad()));
                this.domicilioAfi.setText(per.getDomicilio());
                this.listaFlia.setModel(listaFamiliar);
                nombreAfi.setEditable(false);
                domicilioAfi.setEditable(false);
                edadAfi.setEditable(false);
                for(Persona f: per.getFamiliar()){
                    listaFamiliar.addElement(f);
                }
            }
         }catch(java.lang.NumberFormatException e){
                JOptionPane.showMessageDialog(rootPane,"Error en el formato de dato","ATENCION",0);  
        }catch(java.lang.NullPointerException e){
                JOptionPane.showMessageDialog(rootPane,"Afiliado no Registrado","ATENCION",0);
        }catch(java.lang.ClassCastException e){
                JOptionPane.showMessageDialog(rootPane,"Afiliado no existente","ATENCION",0);
        } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane,"Ingrese Dni","ATENCION",0);
        } 
    }//GEN-LAST:event_buscarAfiActionPerformed

    private void salidaAfiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salidaAfiActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_salidaAfiActionPerformed

    private void editarAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarAfiliadoActionPerformed
       try{
           String aux1 = this.dniAfi.getText().trim();
           String aux2 = this.nombreAfi.getText().trim();
           String aux3 = this.domicilioAfi.getText().trim();
           if(aux1.equals("") || aux2.equals("") || aux3.equals("")){
               throw CampoVacioException();
           }
           else{
            EditarAfi edi = new EditarAfi(gestor,per);
            edi.setTitle("EDITAR AFILIADO");
            edi.setLocationRelativeTo(null);
            edi.setVisible(true);
            this.setVisible(false);
           }
       }catch(java.lang.NullPointerException e){
            JOptionPane.showMessageDialog(rootPane,"Buscar Afiliado","ATENCION",0);
                } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane,"Campo Vacio","ATENCION",0);
        }
    }//GEN-LAST:event_editarAfiliadoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarAfi;
    private javax.swing.JTextField dniAfi;
    private javax.swing.JTextField domicilioAfi;
    private javax.swing.JTextField edadAfi;
    private javax.swing.JButton editarAfiliado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaFlia;
    private javax.swing.JTextField nombreAfi;
    private javax.swing.JButton salidaAfi;
    // End of variables declaration//GEN-END:variables

    private Exception CampoVacioException() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
