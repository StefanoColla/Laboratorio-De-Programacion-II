
package ventana;

import asistencia.Gestionar;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Principal extends javax.swing.JFrame {
    private final Gestionar gestor;
    public Principal(Gestionar gestor) {
        super("Atencion Medica");
        this.gestor=gestor;
        initComponents();
       
    }
   
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        gestionar = new javax.swing.JMenu();
        emfermero = new javax.swing.JMenuItem();
        afiliado = new javax.swing.JMenu();
        agregar = new javax.swing.JMenuItem();
        buscarAfiliado = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        registrarDoctor = new javax.swing.JMenuItem();
        buscarDoctor = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        registrarEnfermero = new javax.swing.JCheckBoxMenuItem();
        mostrarEnfermero = new javax.swing.JCheckBoxMenuItem();
        jMenu7 = new javax.swing.JMenu();
        registrarChofer = new javax.swing.JCheckBoxMenuItem();
        buscarChofer = new javax.swing.JCheckBoxMenuItem();
        jMenu8 = new javax.swing.JMenu();
        registrarAdministrativo = new javax.swing.JCheckBoxMenuItem();
        buscarAdministrativo = new javax.swing.JCheckBoxMenuItem();
        jMenu10 = new javax.swing.JMenu();
        RegistrarMovil = new javax.swing.JRadioButtonMenuItem();
        BuscarMovil = new javax.swing.JRadioButtonMenuItem();
        jMenu9 = new javax.swing.JMenu();
        pagarAbono = new javax.swing.JCheckBoxMenuItem();
        solicitud = new javax.swing.JMenu();
        solicitudMedica = new javax.swing.JRadioButtonMenuItem();
        solicitudFamiliar = new javax.swing.JRadioButtonMenuItem();
        jMenu2 = new javax.swing.JMenu();
        salida = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gestionar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        gestionar.setText("Gestionar");
        gestionar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        gestionar.add(emfermero);

        afiliado.setText("Afiliado");

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        afiliado.add(agregar);

        buscarAfiliado.setText("Buscar");
        buscarAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarAfiliadoActionPerformed(evt);
            }
        });
        afiliado.add(buscarAfiliado);

        gestionar.add(afiliado);

        jMenu1.setText("Doctor");

        registrarDoctor.setText("Registrar");
        registrarDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarDoctorActionPerformed(evt);
            }
        });
        jMenu1.add(registrarDoctor);

        buscarDoctor.setText("Buscar");
        buscarDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarDoctorActionPerformed(evt);
            }
        });
        jMenu1.add(buscarDoctor);

        gestionar.add(jMenu1);

        jMenu6.setText("Emfermero");

        registrarEnfermero.setSelected(true);
        registrarEnfermero.setText("Registrar");
        registrarEnfermero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarEnfermeroActionPerformed(evt);
            }
        });
        jMenu6.add(registrarEnfermero);

        mostrarEnfermero.setSelected(true);
        mostrarEnfermero.setText("Buscar");
        mostrarEnfermero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarEnfermeroActionPerformed(evt);
            }
        });
        jMenu6.add(mostrarEnfermero);

        gestionar.add(jMenu6);

        jMenu7.setText("Chofer");

        registrarChofer.setSelected(true);
        registrarChofer.setText("Registrar");
        registrarChofer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarChoferActionPerformed(evt);
            }
        });
        jMenu7.add(registrarChofer);

        buscarChofer.setSelected(true);
        buscarChofer.setText("Buscar");
        buscarChofer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarChoferActionPerformed(evt);
            }
        });
        jMenu7.add(buscarChofer);

        gestionar.add(jMenu7);

        jMenu8.setText("Administrativo");

        registrarAdministrativo.setSelected(true);
        registrarAdministrativo.setText("Registrar");
        registrarAdministrativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarAdministrativoActionPerformed(evt);
            }
        });
        jMenu8.add(registrarAdministrativo);

        buscarAdministrativo.setSelected(true);
        buscarAdministrativo.setText("Buscar");
        buscarAdministrativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarAdministrativoActionPerformed(evt);
            }
        });
        jMenu8.add(buscarAdministrativo);

        gestionar.add(jMenu8);

        jMenu10.setText("Movil");

        RegistrarMovil.setSelected(true);
        RegistrarMovil.setText("Registrar");
        RegistrarMovil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarMovilActionPerformed(evt);
            }
        });
        jMenu10.add(RegistrarMovil);

        BuscarMovil.setSelected(true);
        BuscarMovil.setText("Buscar");
        BuscarMovil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarMovilActionPerformed(evt);
            }
        });
        jMenu10.add(BuscarMovil);

        gestionar.add(jMenu10);

        jMenuBar1.add(gestionar);

        jMenu9.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jMenu9.setText("Pago");
        jMenu9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        pagarAbono.setSelected(true);
        pagarAbono.setText("Pagar Abono");
        pagarAbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagarAbonoActionPerformed(evt);
            }
        });
        jMenu9.add(pagarAbono);

        jMenuBar1.add(jMenu9);

        solicitud.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        solicitud.setText("Solicitud Medica");
        solicitud.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        solicitudMedica.setSelected(true);
        solicitudMedica.setText("Solicitud Titular");
        solicitudMedica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solicitudMedicaActionPerformed(evt);
            }
        });
        solicitud.add(solicitudMedica);

        solicitudFamiliar.setSelected(true);
        solicitudFamiliar.setText("Solicitud No Titular");
        solicitudFamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solicitudFamiliarActionPerformed(evt);
            }
        });
        solicitud.add(solicitudFamiliar);

        jMenuBar1.add(solicitud);

        jMenu2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jMenu2.setText("Salir");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        salida.setText("SI");
        salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salidaActionPerformed(evt);
            }
        });
        jMenu2.add(salida);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 749, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 671, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        RegistrarAfi titular = new RegistrarAfi(gestor);
        titular.setLocationRelativeTo(null);
        titular.setTitle("REGISTRAR AFILIADO");
        titular.setVisible(true);
    }//GEN-LAST:event_agregarActionPerformed

    private void salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salidaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salidaActionPerformed

    private void buscarAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarAfiliadoActionPerformed
        
        BuscarAfi info = new BuscarAfi(gestor); 
        info.setTitle("INFORMACION AFILIADO");
        info.setLocationRelativeTo(null);
        info.setVisible(true);
    }//GEN-LAST:event_buscarAfiliadoActionPerformed

    private void registrarDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarDoctorActionPerformed
        RegistrarDoc doc = new RegistrarDoc(gestor);
        doc.setTitle("REGISTRAR DOCTOR");
        doc.setLocationRelativeTo(null);
        doc.setVisible(true);
    }//GEN-LAST:event_registrarDoctorActionPerformed

    private void buscarDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarDoctorActionPerformed
        BuscarDoc doctor = new BuscarDoc(gestor);
        doctor.setTitle("INFORMACION DOCTOR");
        doctor.setLocationRelativeTo(null);
        doctor.setVisible(true);
    }//GEN-LAST:event_buscarDoctorActionPerformed

    private void registrarEnfermeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarEnfermeroActionPerformed
        RegistrarEnf enfer = new RegistrarEnf(gestor);
        enfer.setTitle("REGISTRAR ENFERMERO");
        enfer.setLocationRelativeTo(null);
        enfer.setVisible(true);
    }//GEN-LAST:event_registrarEnfermeroActionPerformed

    private void mostrarEnfermeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarEnfermeroActionPerformed
        BuscarEnfer enfer = new BuscarEnfer(gestor);
        enfer.setTitle("INFORMACION ENFERMERO");
        enfer.setLocationRelativeTo(null);
        enfer.setVisible(true);
    }//GEN-LAST:event_mostrarEnfermeroActionPerformed

    private void registrarChoferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarChoferActionPerformed
        RegistrarChofer chofer = new RegistrarChofer(gestor);
        chofer.setTitle("REGISTRAR CHOFER");
        chofer.setLocationRelativeTo(null);
        chofer.setVisible(true);
    }//GEN-LAST:event_registrarChoferActionPerformed

    private void buscarChoferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarChoferActionPerformed
        BuscarChofer fer = new BuscarChofer(gestor);
        fer.setTitle("INFORMACION CHOFER");
        fer.setLocationRelativeTo(null);
        fer.setVisible(true);
    }//GEN-LAST:event_buscarChoferActionPerformed

    private void registrarAdministrativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarAdministrativoActionPerformed
        RegistrarAdmi admi = new RegistrarAdmi(gestor);
        admi.setTitle("REGISTRAR ADMINISTRATIVO");
        admi.setLocationRelativeTo(null);
        admi.setVisible(true);
    }//GEN-LAST:event_registrarAdministrativoActionPerformed

    private void buscarAdministrativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarAdministrativoActionPerformed
        BuscarAdmi ad = new BuscarAdmi(gestor);
        ad.setTitle("INFORMACION SDMINISTRATIVO");
        ad.setLocationRelativeTo(null);
        ad.setVisible(true);
    }//GEN-LAST:event_buscarAdministrativoActionPerformed

    private void pagarAbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagarAbonoActionPerformed
        PagarAbono pagar = new PagarAbono(gestor);
        pagar.setTitle("Servicio De Pago");
        pagar.setLocationRelativeTo(null);
        pagar.setVisible(true);
    }//GEN-LAST:event_pagarAbonoActionPerformed

    private void solicitudMedicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitudMedicaActionPerformed
        Solicitud soli = new Solicitud(gestor);
        soli.setTitle("SOLICITAR ASISTENCIA");
        soli.setLocationRelativeTo(null);
        soli.setVisible(true);
    }//GEN-LAST:event_solicitudMedicaActionPerformed

    private void BuscarMovilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarMovilActionPerformed
        BuscarMovil movil = new BuscarMovil(gestor);
        movil.setTitle("INFORMACION MOVIL");
        movil.setLocationRelativeTo(null);
        movil.setVisible(true);
    }//GEN-LAST:event_BuscarMovilActionPerformed

    private void RegistrarMovilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarMovilActionPerformed
        RegistrarMovil movil= new RegistrarMovil(gestor);
        movil.setTitle("REGISTRAR MOVIL");
        movil.setLocationRelativeTo(null);
        movil.setVisible(true);
    }//GEN-LAST:event_RegistrarMovilActionPerformed

    private void solicitudFamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitudFamiliarActionPerformed
        SolicitudFamiliar fa = new SolicitudFamiliar(gestor);
        fa.setTitle("SOLICITAR ASISTENCIA");
        fa.setLocationRelativeTo(null);
        fa.setVisible(true);
    }//GEN-LAST:event_solicitudFamiliarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButtonMenuItem BuscarMovil;
    private javax.swing.JRadioButtonMenuItem RegistrarMovil;
    private javax.swing.JMenu afiliado;
    private javax.swing.JMenuItem agregar;
    private javax.swing.JCheckBoxMenuItem buscarAdministrativo;
    private javax.swing.JMenuItem buscarAfiliado;
    private javax.swing.JCheckBoxMenuItem buscarChofer;
    private javax.swing.JMenuItem buscarDoctor;
    private javax.swing.JMenuItem emfermero;
    private javax.swing.JMenu gestionar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JCheckBoxMenuItem mostrarEnfermero;
    private javax.swing.JCheckBoxMenuItem pagarAbono;
    private javax.swing.JCheckBoxMenuItem registrarAdministrativo;
    private javax.swing.JCheckBoxMenuItem registrarChofer;
    private javax.swing.JMenuItem registrarDoctor;
    private javax.swing.JCheckBoxMenuItem registrarEnfermero;
    private javax.swing.JMenuItem salida;
    private javax.swing.JMenu solicitud;
    private javax.swing.JRadioButtonMenuItem solicitudFamiliar;
    private javax.swing.JRadioButtonMenuItem solicitudMedica;
    // End of variables declaration//GEN-END:variables

    
}
