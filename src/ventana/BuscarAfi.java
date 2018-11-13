
package ventana;

import asistenciamedica.Afiliado;
import asistenciamedica.Familiar;
import asistenciamedica.Gestionar;
import asistenciamedica.Persona;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.ListDataListener;



/**
 *
 * @author usuario
 */
public class BuscarAfi extends javax.swing.JFrame {
    private final Gestionar gestor;
    private Afiliado per ;
    DefaultListModel listaN = new DefaultListModel();
    DefaultListModel listaD = new DefaultListModel();
    DefaultListModel listaE = new DefaultListModel();
    DefaultListModel listaDomi = new DefaultListModel();
     private int p;
     private Familiar fa;
    
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
        limpiarAfi = new javax.swing.JButton();
        editarAfiliado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaNombre = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaDni = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaEdad = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaDomicilio = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        sacar = new javax.swing.JButton();
        texto = new javax.swing.JTextField();
        modi = new javax.swing.JButton();

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

        limpiarAfi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        limpiarAfi.setText("Limpiar Campo");
        limpiarAfi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarAfiActionPerformed(evt);
            }
        });

        editarAfiliado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        editarAfiliado.setText("Editar Info");
        editarAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarAfiliadoActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listaNombre);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Nombre y Apellido");

        jScrollPane2.setViewportView(listaDni);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("N° Documento");

        jScrollPane3.setViewportView(listaEdad);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Edad");

        jScrollPane4.setViewportView(listaDomicilio);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Domicilio");

        sacar.setText("jButton1");
        sacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sacarActionPerformed(evt);
            }
        });

        modi.setText("modi");
        modi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(limpiarAfi)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(31, 31, 31)
                                            .addComponent(sacar)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(56, 56, 56)
                                        .addComponent(jLabel7)
                                        .addGap(96, 96, 96)))
                                .addGap(35, 35, 35)
                                .addComponent(modi))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(349, 349, 349)
                                .addComponent(jLabel8))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel2)
                                .addGap(81, 81, 81))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(45, 45, 45)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editarAfiliado)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edadAfi, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(dniAfi, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                            .addComponent(nombreAfi))
                                        .addGap(86, 86, 86)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(salidaAfi)
                                            .addComponent(buscarAfi)))
                                    .addComponent(domicilioAfi, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dniAfi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarAfi))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpiarAfi)
                    .addComponent(editarAfiliado)
                    .addComponent(salidaAfi))
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
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sacar)
                    .addComponent(modi)
                    .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel5)))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane4))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            
                per = (Afiliado)this.gestor.buscar(this.dniAfi.getText());
                this.nombreAfi.setText(per.getNombre());
                this.edadAfi.setText(String.valueOf(per.getEdad()));
                this.domicilioAfi.setText(per.getDomicilio());
                this.listaDomicilio.setModel(listaDomi);
                this.listaNombre.setModel(listaN);
                this.listaDni.setModel(listaD);
                this.listaEdad.setModel(listaE);
                for(Persona f: per.getFamiliar()){
                    listaN.addElement(f.getNombre());
                    fa=(Familiar) f;
                    listaD.addElement(f.getDni());
                    listaE.addElement(f.getEdad());
                    listaDomi.addElement(f.getDomicilio());
                }
               
         }catch(java.lang.NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane,"Error en el formato de dato","ATENCION",0);  
        }catch(java.lang.NullPointerException e){
            JOptionPane.showMessageDialog(rootPane,"Afiliado no Registrado","ATENCION",0);
        }catch(java.lang.ClassCastException e){
            JOptionPane.showMessageDialog(rootPane,"Afiliado no existente","ATENCION",0);
        } 
    }//GEN-LAST:event_buscarAfiActionPerformed

    private void salidaAfiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salidaAfiActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_salidaAfiActionPerformed

    private void limpiarAfiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarAfiActionPerformed
        try{
            this.dniAfi.setText(null);
            this.nombreAfi.setText(null);
            this.edadAfi.setText(null);
            this.domicilioAfi.setText(null);
            for(Persona f: per.getFamiliar()){
                listaN.removeElement(f.getNombre());
                listaD.removeElement(f.getDni());
                listaE.removeElement(f.getEdad());
                listaDomi.removeElement(f.getDomicilio());
            }
            
            
        }catch(java.lang.NullPointerException e){
            JOptionPane.showMessageDialog(rootPane,"Campos Vacios","ATENCION",0);
        }  
           
        
    }//GEN-LAST:event_limpiarAfiActionPerformed

    private void editarAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarAfiliadoActionPerformed
       
        try{
        EditarAfi edi = new EditarAfi(gestor,per);
        edi.setTitle("EDITAR AFILIADO");
        edi.setLocationRelativeTo(null);
        edi.setVisible(true);
        this.setVisible(false);
       }catch(java.lang.NullPointerException e){
            JOptionPane.showMessageDialog(rootPane,"Buscar Afiliado","ATENCION",0);
                }
        
    }//GEN-LAST:event_editarAfiliadoActionPerformed

    private void sacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sacarActionPerformed
        p = listaNombre.getSelectedIndex();
        this.texto.setText((String)listaN.getElementAt(p));
        listaN.remove(p);
        
            
        }
    }//GEN-LAST:event_sacarActionPerformed

    private void modiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modiActionPerformed
        listaN.add(p,this.texto.getText());
        listaNombre.setModel(listaN);
        for(Persona f: per.getFamiliar()){
            for(int i=0;i<listaN.getSize();i++){
                f.setNombre(listaNombre.get);
            }
        }
        
        
    }//GEN-LAST:event_modiActionPerformed

    

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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton limpiarAfi;
    private javax.swing.JList<String> listaDni;
    private javax.swing.JList<String> listaDomicilio;
    private javax.swing.JList<String> listaEdad;
    private javax.swing.JList<String> listaNombre;
    private javax.swing.JButton modi;
    private javax.swing.JTextField nombreAfi;
    private javax.swing.JButton sacar;
    private javax.swing.JButton salidaAfi;
    private javax.swing.JTextField texto;
    // End of variables declaration//GEN-END:variables
}
