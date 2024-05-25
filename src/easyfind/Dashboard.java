package easyfind;
import source.*;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import source.DB_Connexion;
public class Dashboard extends javax.swing.JFrame {
    public Dashboard() {
        int[]t=new int[3];
        initComponents();
        this.setLocationRelativeTo(null);//center form
        DB_Connexion db = new DB_Connexion();
        t=db.displayNumbers();
        
        jLabel9.setText(Integer.toString(t[0]));
        jLabel10.setText(Integer.toString(t[1]));
        jLabel12.setText(Integer.toString(t[2]));
    }
    /*public void displayImage(int width, int height, String image_path,JLabel label){
        //get the image
        ImageIcon imageIco=new ImageIcon(getClass().getResource(image_path));
        //resize the image
        Image image=imageIco.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        //set the image into the jLabel
        label.setIcon(new ImageIcon(image));
    }*/
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel_ap = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel_customer = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel_booked = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Espace Agent");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 102, 150));
        jLabel1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 118, 211));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Espace Agent");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 899, 60));

        jPanel4.setBackground(new java.awt.Color(248, 224, 152));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(241, 194, 50));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("  Appartements");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 60));

        jLabel_ap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/apmini1.png"))); // NOI18N
        jPanel7.add(jLabel_ap, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 70, 60));

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 60));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("100");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 260, 110));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 260, 170));

        jPanel5.setBackground(new java.awt.Color(199, 223, 178));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(71, 150, 0));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("  Clients");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 110, 60));

        jLabel_customer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/usemini.png"))); // NOI18N
        jPanel8.add(jLabel_customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 120, 60));

        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 60));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("75");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 60, 260, 109));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 260, 170));

        jPanel6.setBackground(new java.awt.Color(186, 189, 226));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("86");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 60, 260, 110));

        jPanel9.setBackground(new java.awt.Color(55, 67, 117));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_booked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/calmini.png"))); // NOI18N
        jPanel9.add(jLabel_booked, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 130, 60));

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Location");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel9.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 40));

        jPanel6.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 60));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 170, 260, 170));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel21.setText("Se déconnecter");
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 160, 30));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout1.png"))); // NOI18N
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 160, 50));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 150));
        jLabel17.setText("GESTION");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 258, 75));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 150));
        jLabel2.setText("Pénalités");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 258, 75));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 150));
        jLabel3.setText("Clients");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 258, 75));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 150));
        jLabel6.setText("Appartements");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 258, 75));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 150));
        jLabel13.setText("Locations");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 258, 75));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fond1.png"))); // NOI18N
        jLabel14.setAutoscrolls(true);
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 610));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 150));
        jLabel11.setText("Pénalités");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 258, 75));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 240, 608));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 150));
        jLabel4.setText("    X");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 0, 49, 39));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/slogan.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 310, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bg.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1140, 620));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 150));
        jLabel16.setText("Appartements");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 258, 75));

        setSize(new java.awt.Dimension(1118, 575));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Gestion_clients gc =new Gestion_clients();
        gc.setVisible(true);
        //hide dashboard
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        appartementrecherche ap=new appartementrecherche();
        ap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        RechClient rc =new RechClient();
        rc.setVisible(true);
        //hide dashboard
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        appartement gc =new appartement();  //appartementt!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        gc.setVisible(true);
        //hide dashboard
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        GestionLoc gc =new GestionLoc(); //gestion location!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        gc.setVisible(true);
        //hide dashboard
        this.dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Penalite gc =new Penalite();  //penalité!!!!!!!!!!!
        gc.setVisible(true);
        //hide dashboard
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        appartementrecherche a=new appartementrecherche();
        a.setVisible(true);
        //hide dashboard
        this.dispose();
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        RechClient a =new RechClient();
        a.setVisible(true);
        //hide dashboard
        this.dispose();
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        RechLocation a = new RechLocation();
        a.setVisible(true);
        //hide dashboard
        this.dispose();
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        new EasyFindLocation().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel21MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_ap;
    private javax.swing.JLabel jLabel_booked;
    private javax.swing.JLabel jLabel_customer;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
