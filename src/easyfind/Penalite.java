
package easyfind;

import source.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Penalite extends javax.swing.JFrame {

    public Penalite() {
        initComponents();
        DB_Connexion db=new DB_Connexion();
        ResultSet rs=db.afficher_penalite();
        try {
        DefaultTableModel model = (DefaultTableModel) jTable.getModel(); // Récupère le modèle existant de votre JTable
        model.setRowCount(0); // Efface les lignes existantes du modèle

        // Ajoute les données du ResultSet à votre modèle de table
        while (rs.next()) {
            Object[] rowData = {rs.getInt("id_location"), rs.getInt("id_app"),
                rs.getString("cin_loc"),rs.getString("nom_client"),rs.getString("prenom_client"),
                rs.getString("tel_client"),rs.getString("email_client"),
                rs.getObject("date_naissance_client"),
                    rs.getObject("datedebut"), rs.getObject("datefin"),rs.getDouble("penalite")};
            model.addRow(rowData);
        }
        if(model.getRowCount()==0){
            JOptionPane.showMessageDialog(this, "pas de penalité a traiter");
            //this.dispose();
        }
        
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("tayyyy");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 150));
        jLabel2.setText("Gestion Penalité");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 320, 70));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fleche1.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/mini_logo.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 490, 440, 560));

        jPanel2.setBackground(new java.awt.Color(0, 102, 150));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_location", "id_appartement", "cin_loc", "nom_loca", "prenom_loc", "telephone", "email", "date_naissance", "date_debut", "date_fin", "penalité"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(jTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 830, 410));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 870, 430));

        jLabel3.setBackground(new java.awt.Color(0, 102, 150));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 150));
        jLabel3.setText("    X");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 0, 49, 39));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bg.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 590));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1118, 575));

        setSize(new java.awt.Dimension(1118, 575));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked
    
    /*public void afficher(){
        DB_Connexion db=new DB_Connexion();
        ResultSet rs =db.afficher_penalite();
        try {
        DefaultTableModel model = (DefaultTableModel) jTable.getModel(); // Récupère le modèle existant de votre JTable
        model.setRowCount(0); // Efface les lignes existantes du modèle

        // Ajoute les données du ResultSet à votre modèle de table
        while (rs.next()) {
            Object[] rowData = {rs.getInt("id_location"), rs.getInt("id_app"),
                rs.getString("cin_loc"),rs.getString("nom_client"),rs.getString("prenom_client"),
                rs.getString("tel_client"),rs.getString("email_client"),
                rs.getObject("date_naissance_client"),
                    rs.getObject("datedebut"), rs.getObject("datefin"),rs.getDouble("penalite")};
            model.addRow(rowData);
        }
        if(model.getRowCount()==0)
            JOptionPane.showMessageDialog(this, "pas de penalité a gerer");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        
        
    }*/
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
            java.util.logging.Logger.getLogger(Penalite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Penalite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Penalite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Penalite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Penalite().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
