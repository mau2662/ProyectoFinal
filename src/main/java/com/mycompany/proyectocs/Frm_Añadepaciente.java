package com.mycompany.proyectocs;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Frm_Añadepaciente extends javax.swing.JFrame {

    /**
     * Creates new form Frm_Añadepaciente
     */
    public Frm_Añadepaciente() {
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

        jPanel1 = new javax.swing.JPanel();
        lbl_Titulo = new javax.swing.JLabel();
        lbl_pacientepadecimientos = new javax.swing.JLabel();
        txt_padecimientos = new javax.swing.JTextField();
        lbl_pacienteid = new javax.swing.JLabel();
        lbl_pacientenombre = new javax.swing.JLabel();
        lbl_pacienteapellido = new javax.swing.JLabel();
        lbl_pacienteedad = new javax.swing.JLabel();
        lbl_pacientecorreo = new javax.swing.JLabel();
        lbl_pacientemedicamentos = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_edad = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        txt_medicamentos = new javax.swing.JTextField();
        btn_añadir = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbl_pacientetel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        lbl_imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Titulo.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        lbl_Titulo.setText("Ingrese los datos del paciente");
        jPanel1.add(lbl_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        lbl_pacientepadecimientos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbl_pacientepadecimientos.setText("Padecimiento");
        jPanel1.add(lbl_pacientepadecimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 90, 20));
        jPanel1.add(txt_padecimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 362, -1));

        lbl_pacienteid.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbl_pacienteid.setText("ID");
        jPanel1.add(lbl_pacienteid, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 60, 20));

        lbl_pacientenombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbl_pacientenombre.setText("Nombre");
        jPanel1.add(lbl_pacientenombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 60, 20));

        lbl_pacienteapellido.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbl_pacienteapellido.setText("Apellido");
        jPanel1.add(lbl_pacienteapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 60, 20));

        lbl_pacienteedad.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbl_pacienteedad.setText("Edad");
        jPanel1.add(lbl_pacienteedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 60, 20));

        lbl_pacientecorreo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbl_pacientecorreo.setText("Correo");
        jPanel1.add(lbl_pacientecorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 60, 20));

        lbl_pacientemedicamentos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbl_pacientemedicamentos.setText("Medicamentos");
        jPanel1.add(lbl_pacientemedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 111, 20));
        jPanel1.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 362, -1));
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 362, -1));
        jPanel1.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 362, -1));
        jPanel1.add(txt_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 362, -1));
        jPanel1.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 362, -1));
        jPanel1.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 362, -1));
        jPanel1.add(txt_medicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 362, -1));

        btn_añadir.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btn_añadir.setText("Añadir");
        btn_añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_añadirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 90, 40));

        btn_volver.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btn_volver.setText("Volver");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });
        jPanel1.add(btn_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 90, 40));

        jPanel6.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 40, 90));

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        lbl_pacientetel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbl_pacientetel.setText("Telefono");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbl_pacientetel)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(234, Short.MAX_VALUE)
                .addComponent(lbl_pacientetel)
                .addGap(219, 219, 219))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 470));

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, 100));

        jPanel7.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, -1, 50));

        jPanel8.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, -20, 30, 80));

        jPanel9.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, -1));

        jPanel10.setBackground(new java.awt.Color(255, 204, 204));

        jPanel12.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 610, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 640, 20));

        jPanel11.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, -1, -1));

        jPanel13.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 10, 450));

        lbl_imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contents/doctorapunta.png"))); // NOI18N
        jPanel1.add(lbl_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_añadirActionPerformed
        // TODO add your handling code here:
        String id = txt_id.getText();
        String nombre = txt_nombre.getText();
        String apellido = txt_apellido.getText();
        String edad = txt_edad.getText();
        String telefono= txt_telefono.getText();
        String correo = txt_correo.getText();
        String Medicamentos = txt_medicamentos.getText();
        String Padecimiento = txt_padecimientos.getText();

        if((id.length()==0)||(nombre.length()==0)||(apellido.length()==0)||(edad.length()==0)||(telefono.length()==0)||(correo.length()==0)
            || (Medicamentos.length()==0)||(Padecimiento.length()==0)){
            JOptionPane.showMessageDialog(null, "Porfavor rellene todos los valores");
        }
        Paciente Pac = new Paciente();
        Pac.setCedula(id);
        Pac.setNombre(nombre);
        Pac.setApellido(apellido);
        Pac.setEdad(Integer.parseInt(edad));
        Pac.setTelefono(telefono);
        Pac.setCorreo(correo);
        Pac.setMedicamentos(Medicamentos);
        Pac.setPadecimientos(Padecimiento);
        

        manejodearchivosPACIENTE obj_paciente = new manejodearchivosPACIENTE();
        obj_paciente.setObj_paciente(Pac);
        obj_paciente.agregaPaciente();
        

        

        JOptionPane.showMessageDialog(null, "Doctor agregado correctamente");
        limpiador();

    }//GEN-LAST:event_btn_añadirActionPerformed

    public void limpiador(){
        txt_id.setText("");
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_edad.setText("");
        txt_correo.setText("");
        txt_telefono.setText("");
        txt_medicamentos.setText("");
        txt_padecimientos.setText("");
    }
        
    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        // TODO add your handling code here:
        Frm_Menudoctor doc = new Frm_Menudoctor();
        this.dispose();
        doc.setLocationRelativeTo(null);
        doc.setVisible(true);
    }//GEN-LAST:event_btn_volverActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_Añadepaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Añadepaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Añadepaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Añadepaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Añadepaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_añadir;
    private javax.swing.JButton btn_volver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbl_Titulo;
    private javax.swing.JLabel lbl_imagen;
    private javax.swing.JLabel lbl_pacienteapellido;
    private javax.swing.JLabel lbl_pacientecorreo;
    private javax.swing.JLabel lbl_pacienteedad;
    private javax.swing.JLabel lbl_pacienteid;
    private javax.swing.JLabel lbl_pacientemedicamentos;
    private javax.swing.JLabel lbl_pacientenombre;
    private javax.swing.JLabel lbl_pacientepadecimientos;
    private javax.swing.JLabel lbl_pacientetel;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_edad;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_medicamentos;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_padecimientos;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
