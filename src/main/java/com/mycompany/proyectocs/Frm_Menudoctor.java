/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectocs;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Frm_Menudoctor extends javax.swing.JFrame {
Paciente pac = new Paciente();
Doctor doc = new Doctor();
ArrayList <Doctor> table = new ArrayList <Doctor>();
    /**
     * Creates new form Frm_Menudoctor
     */
    public Frm_Menudoctor() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lbl_encabezadodoc = new javax.swing.JLabel();
        btn_cerrarsesion = new javax.swing.JButton();
        Doctor_lbl = new javax.swing.JLabel();
        paciente_lbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_doc = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Doctormn = new javax.swing.JMenuItem();
        pacientemn = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Doctormn2 = new javax.swing.JMenuItem();
        Pacientemn2 = new javax.swing.JMenuItem();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_encabezadodoc.setText("BIENVENIDO ESTIMADO COLABORADOR");

        btn_cerrarsesion.setText("Cerrar sesion");
        btn_cerrarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarsesionActionPerformed(evt);
            }
        });

        Doctor_lbl.setText("DOCTOR");

        paciente_lbl.setText("PACIENTE");

        tbl_doc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Disponibles"
            }
        ));
        jScrollPane2.setViewportView(tbl_doc);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(btn_cerrarsesion))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(lbl_encabezadodoc))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Doctor_lbl)
                        .addGap(187, 187, 187)
                        .addComponent(paciente_lbl))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_encabezadodoc)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Doctor_lbl)
                    .addComponent(paciente_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btn_cerrarsesion)
                .addContainerGap())
        );

        jMenu1.setText("Añadir");

        Doctormn.setText("Doctor");
        Doctormn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctormnActionPerformed(evt);
            }
        });
        jMenu1.add(Doctormn);

        pacientemn.setText("Paciente");
        pacientemn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacientemnActionPerformed(evt);
            }
        });
        jMenu1.add(pacientemn);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Mostrar");

        Doctormn2.setText("Doctor");
        Doctormn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Doctormn2ActionPerformed(evt);
            }
        });
        jMenu2.add(Doctormn2);

        Pacientemn2.setText("Paciente");
        Pacientemn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pacientemn2ActionPerformed(evt);
            }
        });
        jMenu2.add(Pacientemn2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cerrarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarsesionActionPerformed
        // TODO add your handling code here:
        this.dispose();

        frm_inicio inicio = new frm_inicio();
        inicio.setLocationRelativeTo(null);
        inicio.setVisible(true);
    }//GEN-LAST:event_btn_cerrarsesionActionPerformed

    private void DoctormnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctormnActionPerformed
        // TODO add your handling code here:
        doc.pedir_datos();
        table.add(doc);
        mostrar();
        
    }//GEN-LAST:event_DoctormnActionPerformed

    private void pacientemnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacientemnActionPerformed
        // TODO add your handling code here:
        pac.pedir_datos();
        
    }//GEN-LAST:event_pacientemnActionPerformed

    private void Pacientemn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pacientemn2ActionPerformed
        // TODO add your handling code here:
        pac.mostrar_datos();
    }//GEN-LAST:event_Pacientemn2ActionPerformed

    private void Doctormn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Doctormn2ActionPerformed
        // TODO add your handling code here:
        doc.mostrar_datos();
    }//GEN-LAST:event_Doctormn2ActionPerformed

    private void mostrar(){
        String dtrm [][] = new String[table.size()][1];
        for (int i = 0; i < table.size(); i++) {
            dtrm [i][0] = table.get(i).getNombre();
        }
     tbl_doc.setModel(new javax.swing.table.DefaultTableModel(
            dtrm,
            new String [] {
                "Disponibles"
            }
        ));   
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_Menudoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Menudoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Menudoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Menudoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Menudoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Doctor_lbl;
    private javax.swing.JMenuItem Doctormn;
    private javax.swing.JMenuItem Doctormn2;
    private javax.swing.JMenuItem Pacientemn2;
    private javax.swing.JButton btn_cerrarsesion;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_encabezadodoc;
    private javax.swing.JLabel paciente_lbl;
    private javax.swing.JMenuItem pacientemn;
    private javax.swing.JTable tbl_doc;
    // End of variables declaration//GEN-END:variables
}
