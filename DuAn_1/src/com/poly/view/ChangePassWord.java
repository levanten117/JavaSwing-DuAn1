/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.view;

import com.poy.database.JdbcHelper;
import com.poly.model.NhanVien;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class ChangePassWord extends javax.swing.JFrame {

    /**
     * Creates new form FogotPassWord
     */
    public ChangePassWord() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtOldPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        txtNewPassword = new javax.swing.JPasswordField();
        txtConfirmPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        btnChange = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("ĐỔI MẬT KHẨU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Mã Nhân Viên");

        jLabel3.setText("Mật Khẩu Cũ");

        jLabel4.setText("Mật Khẩu Mới");

        jLabel5.setText("Xác Nhận Mật Khẩu");

        btnChange.setText("Change");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUserName)
                            .addComponent(txtOldPassword)
                            .addComponent(txtNewPassword)
                            .addComponent(txtConfirmPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(btnChange)
                        .addGap(36, 36, 36)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChange)
                    .addComponent(btnCancel))
                .addGap(0, 25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        // TODO add your handling code here:
        Connection conn = null;
        PreparedStatement stm = null;
        String userName = txtUserName.getText();
        String oldPass = new String(txtOldPassword.getPassword());
        String newPass = new String(txtNewPassword.getPassword());
        String ConfirmPass = new String(txtConfirmPassword.getPassword());
        if (Validate() > 0) {
            try {
                if (checkOldPass(userName) > 0) {
                    if (newPass.equals(ConfirmPass)) {
                        try {
                            // TODO add your handling code here:

                            conn = JdbcHelper.getDBConnect();
                            String sSQL = "update Nhan_Vien set MatKhau =? where MaNhanVien = ?";
                            stm = conn.prepareStatement(sSQL);
                            stm.setString(1, newPass);
                            stm.setString(2, userName);
                            if (stm.executeUpdate() > 0) {
                                JOptionPane.showMessageDialog(this, "Thay đổi thành công" + "\n" + "Mật khẩu mới của bạn là: " + newPass
                                +"");
                                txtUserName.setText("");
                                txtOldPassword.setText("");
                                txtNewPassword.setText("");
                                txtConfirmPassword.setText("");
                            } else {
                                JOptionPane.showMessageDialog(this, "Thay đổi không thành công" + "\n"
                                        + "Vui lòng kiểm tra lại dũ liệu vừa nhập có đúng hay không");
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(ChangePassWord.class.getName()).log(Level.SEVERE, null, ex);
                        } finally {
                            try {
                                conn.close();
                                stm.close();
                            } catch (SQLException ex) {
                                Logger.getLogger(ChangePassWord.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        txtNewPassword.setBackground(Color.white);
                        txtConfirmPassword.setBackground(Color.white);
                    } else {
                        JOptionPane.showMessageDialog(this, "Mật khẩu không khớp");
                        txtNewPassword.setBackground(Color.yellow);
                        txtConfirmPassword.setBackground(Color.yellow);
                    }
                }
                txtUserName.setBackground(Color.white);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Tên đăng nhập không đúng");
                txtUserName.setBackground(Color.yellow);
            }
        }
    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        new DangNhapJDialog(this, true).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(ChangePassWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassWord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnChange;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JPasswordField txtOldPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
public int Validate() {
        StringBuilder sb = new StringBuilder();
        if (txtUserName.getText().length() == 0) {
            sb.append("Không được để trống Tên Đăng Nhập").append("\n");
            txtUserName.setBackground(Color.yellow);
        } else {
            txtUserName.setBackground(Color.white);
        }
        if (txtOldPassword.getText().length() == 0) {
            sb.append("Không được để trống Mật khẩu cũ").append("\n");
            txtOldPassword.setBackground(Color.yellow);
        } else {
            txtOldPassword.setBackground(Color.white);
        }
        if (txtNewPassword.getText().length() == 0) {
            sb.append("Vui lòng nhập mật khẩu mới").append("\n");
            txtNewPassword.setBackground(Color.yellow);
        } else {
            txtNewPassword.setBackground(Color.white);
        }
        if (txtConfirmPassword.getText().length() == 0) {
            sb.append("Vui lòng nhập ô xác nhận mật khẩu").append("\n");
            txtConfirmPassword.setBackground(Color.yellow);
        } else {
            txtConfirmPassword.setBackground(Color.white);
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString());
            return -1;
        }
        return 1;
    }
public int checkOldPass(String manv) {
        Connection conn = JdbcHelper.getDBConnect();
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            String sSQL = "select * from Nhan_Vien where MaNhanVien = ?";
            stm = conn.prepareStatement(sSQL);
            stm.setString(1, manv);
            rs = stm.executeQuery();
            NhanVien nv = new NhanVien();
            String oldPass = new String(txtOldPassword.getPassword());
            while (rs.next()) {
                nv.setMaNV(rs.getString(1));
                nv.setMatKhau(rs.getString(3));
                nv.setVaiTro(rs.getInt(4));
            }
            if (nv.getMatKhau().equals(oldPass)) {
                txtOldPassword.setBackground(Color.white);
                return 1;
            } else {
                txtOldPassword.setBackground(Color.yellow);
                JOptionPane.showMessageDialog(this, "Mật khẩu cũ không đúng");
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi");
            Logger.getLogger(ChangePassWord.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
                stm.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(ChangePassWord.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return -1;
    }
}
