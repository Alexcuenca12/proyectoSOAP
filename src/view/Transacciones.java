/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author UsuarioF
 */
public class Transacciones extends javax.swing.JFrame {

    /**
     * Creates new form Transacciones
     */
    public Transacciones() {
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
        jLabel3 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnTransaccion = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        lbl_Insuficiente = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();
        cb_Trans = new javax.swing.JComboBox<>();
        txtValor = new javax.swing.JTextField();
        lbl_Retiro = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cuenta de Usuario:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 16, -1, -1));

        lblUsuario.setBackground(new java.awt.Color(0, 0, 0));
        lblUsuario.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(51, 102, 255));
        lblUsuario.setText("Usuario");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 16, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 430, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Saldo:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 71, -1, 28));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Seleccione una opción:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Valor:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        btnTransaccion.setBackground(new java.awt.Color(0, 0, 0));
        btnTransaccion.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnTransaccion.setForeground(new java.awt.Color(255, 255, 255));
        btnTransaccion.setText("Registrar");
        btnTransaccion.setToolTipText("");
        btnTransaccion.setBorder(new javax.swing.border.MatteBorder(null));
        btnTransaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransaccionActionPerformed(evt);
            }
        });
        jPanel1.add(btnTransaccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 111, 38));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 321, 430, -1));

        lbl_Insuficiente.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        lbl_Insuficiente.setForeground(new java.awt.Color(255, 51, 51));
        lbl_Insuficiente.setText("Saldo Insuficiente");
        jPanel1.add(lbl_Insuficiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, -1));

        txtSaldo.setEditable(false);
        txtSaldo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(txtSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 71, 195, -1));

        cb_Trans.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cb_Trans.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Deposito", "Retiro" }));
        jPanel1.add(cb_Trans, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 120, 130, 30));

        txtValor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 195, -1));

        lbl_Retiro.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        lbl_Retiro.setForeground(new java.awt.Color(51, 102, 255));
        lbl_Retiro.setText("Retiro realizado con éxito");
        jPanel1.add(lbl_Retiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 49, 430, 390));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Transacciones");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        btnSalir.setBackground(new java.awt.Color(0, 0, 0));
        btnSalir.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public void setBtnSalir(JButton btnSalir) {
        this.btnSalir = btnSalir;
    }

    public JLabel getLblUsuario() {
        return lblUsuario;
    }

    public void setLblUsuario(JLabel lblUsuario) {
        this.lblUsuario = lblUsuario;
    }

    public JButton getBtnTransaccion() {
        return btnTransaccion;
    }

    public void setBtnTransaccion(JButton btnTransaccion) {
        this.btnTransaccion = btnTransaccion;
    }


    public JComboBox<String> getCb_Trans() {
        return cb_Trans;
    }

    public void setCb_Trans(JComboBox<String> cb_Trans) {
        this.cb_Trans = cb_Trans;
    }

    public JLabel getLbl_Insuficiente() {
        return lbl_Insuficiente;
    }

    public void setLbl_Insuficiente(JLabel lbl_Insuficiente) {
        this.lbl_Insuficiente = lbl_Insuficiente;
    }

    public JLabel getLbl_Retiro() {
        return lbl_Retiro;
    }

    public void setLbl_Retiro(JLabel lbl_Retiro) {
        this.lbl_Retiro = lbl_Retiro;
    }

    public JTextField getTxtSaldo() {
        return txtSaldo;
    }

    public void setTxtSaldo(JTextField txtSaldo) {
        this.txtSaldo = txtSaldo;
    }

    public JTextField getTxtValor() {
        return txtValor;
    }

    public void setTxtValor(JTextField txtValor) {
        this.txtValor = txtValor;
    }
    
    private void btnTransaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransaccionActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnTransaccionActionPerformed

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
            java.util.logging.Logger.getLogger(Transacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transacciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTransaccion;
    private javax.swing.JComboBox<String> cb_Trans;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lbl_Insuficiente;
    private javax.swing.JLabel lbl_Retiro;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
