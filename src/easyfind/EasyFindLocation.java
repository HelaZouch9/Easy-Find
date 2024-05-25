package easyfind;
import source.*;

public class EasyFindLocation extends javax.swing.JFrame {

    public EasyFindLocation() {
        initComponents();
        txtusername.setBackground(new java.awt.Color(0,0,0,1));
        txtpassword.setBackground(new java.awt.Color(0,0,0,1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        disable = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bg-login.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 530, 320));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/slogan.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 440, 350));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 590, 580));

        jPanel2.setBackground(new java.awt.Color(0, 102, 150));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("    X");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 0, 49, 39));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Login");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 71, 524, 57));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Hello! Let's get started");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 134, 518, 32));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(199, 226, 255));
        jLabel6.setText("Username");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 282, 28));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("__________________________________________________________");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 327, 30));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_user_20px_1.png"))); // NOI18N
        jLabel8.setToolTipText("");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 31, 49));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("__________________________________________________________________");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 320, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(199, 226, 255));
        jLabel11.setText("Password");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 282, 28));

        disable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        disable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_invisible_20px_1.png"))); // NOI18N
        disable.setToolTipText("");
        disable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disableMouseClicked(evt);
            }
        });
        jPanel2.add(disable, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 31, 49));

        show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_eye_20px_1.png"))); // NOI18N
        show.setToolTipText("");
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        jPanel2.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 31, 49));

        jCheckBox1.setBackground(new java.awt.Color(0, 102, 150));
        jCheckBox1.setForeground(new java.awt.Color(199, 226, 255));
        jCheckBox1.setText("Remember Password");
        jCheckBox1.setToolTipText("");
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox1.setOpaque(true);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 151, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(199, 226, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Forget Password ?");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 165, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 150));
        jButton1.setText("LOGIN");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 414, 48));

        txtusername.setFont(txtusername.getFont().deriveFont(txtusername.getFont().getSize()+2f));
        txtusername.setForeground(new java.awt.Color(255, 255, 255));
        txtusername.setBorder(null);
        jPanel2.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 280, -1));

        txtpassword.setFont(txtpassword.getFont().deriveFont(txtpassword.getFont().getSize()+2f));
        txtpassword.setForeground(new java.awt.Color(255, 255, 255));
        txtpassword.setActionCommand("<Not Set>");
        txtpassword.setBorder(null);
        txtpassword.setCaretColor(new java.awt.Color(255, 255, 255));
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        jPanel2.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 240, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 530, 578));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String username = txtusername.getText();
        String password = new String(txtpassword.getPassword());
        System.out.println(username+"  "+ password);
        DB_Connexion db = new DB_Connexion();
        if (username.charAt(0)=='A'){
            Administrateur a=new Administrateur(username,password); 
            if(db.verifierExistence(a)){
            this.setVisible(false);
            new GestionAgent().setVisible(true);                //raaaaniiiiiaaa
        }
        else{
            txtusername.setText("");
            txtpassword.setText("");
            jCheckBox1.setSelected(false);
        }
        }
        else{
            Agent a=new Agent(username,password);
            //System.out.println(db.verifierExistence(a));
            if(db.verifierExistence(a)){
                this.setVisible(false);
                new Dashboard().setVisible(true);
            }
            else{
                txtusername.setText("");
                txtpassword.setText("");
                jCheckBox1.setSelected(false);
            }
        }
        /* si la metode verifierExistence est static on fait ca */
        //System.out.println(DB_Connection.verifierExistence(a));
        /*mais voir la classe DB_Connexion ou j'ai explique pourquoi il faut que la methode soit non static*/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void disableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disableMouseClicked
        txtpassword.setEchoChar((char)0);
        disable.setVisible(false);
        disable.setEnabled(false);
        show.setEnabled(true);
        show.setEnabled(true);
    }//GEN-LAST:event_disableMouseClicked

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        txtpassword.setEchoChar((char)8226);
        disable.setVisible(true);
        disable.setEnabled(true);
        show.setEnabled(false);
        show.setEnabled(false);
    }//GEN-LAST:event_showMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for(double i=0.0;i<=1.0;i=i+0.1){
            String val=i+ "";
            float f=Float.valueOf(val);
            this.setOpacity(f);
            try{
                Thread.sleep(50);
            }
            catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(EasyFindLocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EasyFindLocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EasyFindLocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EasyFindLocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EasyFindLocation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel disable;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel show;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
