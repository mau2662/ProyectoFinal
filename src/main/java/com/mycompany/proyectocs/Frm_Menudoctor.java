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
Frm_Añadedoctor añade = new Frm_Añadedoctor();
Frm_Añadepaciente añadep = new Frm_Añadepaciente();
Paciente pac = new Paciente();
Doctor docc = new Doctor();
//ArrayList <Doctor> table = new ArrayList <Doctor>();
ArrayList <Paciente> table2 = new ArrayList <Paciente>();
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
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btn_cerrarsesion = new javax.swing.JButton();
        Doctor_lbl = new javax.swing.JLabel();
        paciente_lbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_doc = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_paciente1 = new javax.swing.JTable();
        lbl_encabezadodoc = new javax.swing.JLabel();
        btn_update = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        lbl_corazon = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Doctormn = new javax.swing.JMenuItem();
        pacientemn = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Doctormn2 = new javax.swing.JMenuItem();
        Pacientemn2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        mn_editadoctor = new javax.swing.JMenuItem();
        mn_editapac = new javax.swing.JMenuItem();
        mn_elim = new javax.swing.JMenu();
        mn_eliminadoctor = new javax.swing.JMenuItem();
        mn_eliminarpac = new javax.swing.JMenuItem();

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

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_cerrarsesion.setBackground(new java.awt.Color(255, 204, 204));
        btn_cerrarsesion.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btn_cerrarsesion.setText("Cerrar sesion");
        btn_cerrarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarsesionActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cerrarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        Doctor_lbl.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        Doctor_lbl.setText("DOCTOR");
        jPanel1.add(Doctor_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        paciente_lbl.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        paciente_lbl.setText("PACIENTE");
        jPanel1.add(paciente_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 40, -1, -1));

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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 61, 107, 192));

        tbl_paciente1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "En tratamiento"
            }
        ));
        jScrollPane4.setViewportView(tbl_paciente1);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 61, 107, 192));

        lbl_encabezadodoc.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        lbl_encabezadodoc.setText("BIENVENIDO ESTIMADO COLABORADOR");
        jPanel1.add(lbl_encabezadodoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, 20));

        btn_update.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jPanel9.setBackground(new java.awt.Color(158, 219, 240));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 310));

        jPanel10.setBackground(new java.awt.Color(158, 219, 240));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 130, 310));

        jPanel11.setBackground(new java.awt.Color(158, 219, 240));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 330, 40));

        lbl_corazon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contents/corazon.png"))); // NOI18N
        jPanel1.add(lbl_corazon, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 280, 230));

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

        jMenu3.setText("Buscar");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Editar");

        mn_editadoctor.setText("Doctor");
        mn_editadoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_editadoctorActionPerformed(evt);
            }
        });
        jMenu4.add(mn_editadoctor);

        mn_editapac.setText("Paciente");
        mn_editapac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_editapacActionPerformed(evt);
            }
        });
        jMenu4.add(mn_editapac);

        jMenuBar1.add(jMenu4);

        mn_elim.setText("Eliminar");

        mn_eliminadoctor.setText("Doctor");
        mn_eliminadoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_eliminadoctorActionPerformed(evt);
            }
        });
        mn_elim.add(mn_eliminadoctor);

        mn_eliminarpac.setText("Paciente");
        mn_eliminarpac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_eliminarpacActionPerformed(evt);
            }
        });
        mn_elim.add(mn_eliminarpac);

        jMenuBar1.add(mn_elim);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        añade.setLocationRelativeTo(null);
        añade.setVisible(true);
        mostrar();
        this.dispose();
        
    }//GEN-LAST:event_DoctormnActionPerformed

    private void pacientemnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacientemnActionPerformed
        // TODO add your handling code here:
        //Paciente pac = new Paciente();
        //pac.pedir_datos();
        //table2.add(pac);
        añadep.setLocationRelativeTo(null);
        añadep.setVisible(true);
        mostrarp();
        this.dispose();
        
    }//GEN-LAST:event_pacientemnActionPerformed

    private void Pacientemn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pacientemn2ActionPerformed
        // TODO add your handling code here:
        pac.mostrar_datos();
    }//GEN-LAST:event_Pacientemn2ActionPerformed

    private void Doctormn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Doctormn2ActionPerformed
        // TODO add your handling code here:
        
        docc.mostrar_datos();
    }//GEN-LAST:event_Doctormn2ActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
      mostrar();  
    }//GEN-LAST:event_btn_updateActionPerformed

    private void mn_eliminadoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_eliminadoctorActionPerformed

        // TODO add your handling code here:
        Frm_Validador_id val = new Frm_Validador_id();
        val.setNumerovalidador(1);
        this.dispose();
        val.setLocationRelativeTo(null);
        val.setVisible(true);
    }//GEN-LAST:event_mn_eliminadoctorActionPerformed

    private void mn_editadoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_editadoctorActionPerformed
        // TODO add your handling code here:
        Frm_Validador_id val = new Frm_Validador_id();
        val.setNumerovalidador(2);
        this.dispose();
        val.setLocationRelativeTo(null);
        val.setVisible(true);
    }//GEN-LAST:event_mn_editadoctorActionPerformed

    private void mn_editapacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_editapacActionPerformed
        // TODO add your handling code here:
        Frm_Validador_id val = new Frm_Validador_id();
        val.setNumerovalidador(4);
        this.dispose();
        val.setLocationRelativeTo(null);
        val.setVisible(true);
    }//GEN-LAST:event_mn_editapacActionPerformed

    private void mn_eliminarpacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_eliminarpacActionPerformed
        // TODO add your handling code here:
        Frm_Validador_id val = new Frm_Validador_id();
        val.setNumerovalidador(3);
        this.dispose();
        val.setLocationRelativeTo(null);
        val.setVisible(true);
    }//GEN-LAST:event_mn_eliminarpacActionPerformed

    private void mostrar(){
        String dtrm [][] = new String[añade.table.size()][1];
        for (int i = 0; i < añade.table.size(); i++) {
            dtrm [i][0] = añade.table.get(i).getNombre();
        }
     tbl_doc.setModel(new javax.swing.table.DefaultTableModel(
            dtrm,
            new String [] {
                "Disponibles"
            }
        ));   
    }
    
    private void mostrarp(){
        
          String dtrmp [][] = new String[table2.size()][1];
        for (int i = 0; i < table2.size(); i++) {
            dtrmp [i][0] = table2.get(i).getNombre();
        }
        
        tbl_paciente1.setModel(new javax.swing.table.DefaultTableModel(
           dtrmp,
            new String [] {
                "En tratamiento"
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
    private javax.swing.JButton btn_update;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lbl_corazon;
    private javax.swing.JLabel lbl_encabezadodoc;
    private javax.swing.JMenuItem mn_editadoctor;
    private javax.swing.JMenuItem mn_editapac;
    private javax.swing.JMenu mn_elim;
    private javax.swing.JMenuItem mn_eliminadoctor;
    private javax.swing.JMenuItem mn_eliminarpac;
    private javax.swing.JLabel paciente_lbl;
    private javax.swing.JMenuItem pacientemn;
    private javax.swing.JTable tbl_doc;
    private javax.swing.JTable tbl_paciente1;
    // End of variables declaration//GEN-END:variables
}
