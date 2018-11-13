
package ventana;

import asistenciamedica.Gestionar;
import ventana.BuscarEnfer;
import ventana.RegistrarAfi;
import ventana.RegistrarEnf;
import ventana.BuscarDoc;
import ventana.RegistrarDoc;
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
        solicitud = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        paciente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        salida = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

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

        jMenuBar1.add(gestionar);

        solicitud.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        solicitud.setText("Solicitud Medica");
        solicitud.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuBar1.add(solicitud);

        jMenu3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jMenu3.setText("Informacion");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        paciente.setText("AtencionPaciente");
        paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacienteActionPerformed(evt);
            }
        });
        jMenu3.add(paciente);

        jMenuBar1.add(jMenu3);

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
            .addGap(0, 669, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacienteActionPerformed
        
    }//GEN-LAST:event_pacienteActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu afiliado;
    private javax.swing.JMenuItem agregar;
    private javax.swing.JCheckBoxMenuItem buscarAdministrativo;
    private javax.swing.JMenuItem buscarAfiliado;
    private javax.swing.JCheckBoxMenuItem buscarChofer;
    private javax.swing.JMenuItem buscarDoctor;
    private javax.swing.JMenuItem emfermero;
    private javax.swing.JMenu gestionar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JCheckBoxMenuItem mostrarEnfermero;
    private javax.swing.JMenuItem paciente;
    private javax.swing.JCheckBoxMenuItem registrarAdministrativo;
    private javax.swing.JCheckBoxMenuItem registrarChofer;
    private javax.swing.JMenuItem registrarDoctor;
    private javax.swing.JCheckBoxMenuItem registrarEnfermero;
    private javax.swing.JMenuItem salida;
    private javax.swing.JMenu solicitud;
    // End of variables declaration//GEN-END:variables

    
}
