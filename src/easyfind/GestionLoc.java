package easyfind;

import java.awt.event.KeyEvent;

//package easyfind;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import source.DB_Connexion;
import source.*;


public class GestionLoc extends javax.swing.JFrame {

    public GestionLoc() {
        initComponents();
        jLabel_err_loca.setVisible(false);
        jLabel_err_date.setVisible(false);
        jLabel_err_app.setVisible(false);
        jLabel_err_cin_prop.setVisible(false);
        jLabel_err_cin_loca.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtid_appartement = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        jLabel_err_date = new javax.swing.JLabel();
        txtCIN_proprietaire = new javax.swing.JTextField();
        txtid_location = new javax.swing.JTextField();
        txtCIN_locataire = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel_err_cin_prop = new javax.swing.JLabel();
        jLabel_err_cin_loca = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtid_appartement1 = new javax.swing.JTextField();
        jLabel_err_app = new javax.swing.JLabel();
        jLabel_err_loca = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButtonremove = new javax.swing.JButton();
        jButtonupdate = new javax.swing.JButton();
        jButtonreset = new javax.swing.JButton();
        jButtonresearch = new javax.swing.JButton();
        jButtonadd = new javax.swing.JButton();
        jButtonrefresh = new javax.swing.JButton();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fleche1.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/mini_logo.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 490, 440, 560));

        jPanel2.setBackground(new java.awt.Color(0, 102, 150));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id_location", "CIN_locataire", "id_appartement", "CIN_propietaire", "date_debut", "date_fin"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 530, 370));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 570, 420));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 150));
        jLabel2.setText("Gestion Location");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, -10, 320, 70));

        jLabel14.setBackground(new java.awt.Color(25, 17, 1));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("id_location:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 282, 28));

        jLabel7.setForeground(new java.awt.Color(0, 102, 150));
        jLabel7.setText("______________________");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 180, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("id_appartement:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 120, 20));

        txtid_appartement.setFont(txtid_appartement.getFont().deriveFont(txtid_appartement.getFont().getSize()+2f));
        txtid_appartement.setBorder(null);
        txtid_appartement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtid_appartementMouseClicked(evt);
            }
        });
        txtid_appartement.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtid_appartementKeyPressed(evt);
            }
        });
        jPanel3.add(txtid_appartement, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 120, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("CIN locataire:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 150, 20));

        jLabel9.setForeground(new java.awt.Color(0, 102, 150));
        jLabel9.setText("__________________");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 200, 30));

        jLabel11.setForeground(new java.awt.Color(0, 102, 150));
        jLabel11.setText("_______________________");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 170, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("CIN propriétaire :");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 180, 20));

        jLabel16.setBackground(new java.awt.Color(25, 17, 1));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("date_fin_location:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 282, 28));

        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        jPanel3.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 160, 30));

        jDateChooser2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser2PropertyChange(evt);
            }
        });
        jDateChooser2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDateChooser2KeyPressed(evt);
            }
        });
        jPanel3.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 160, 30));

        jLabel17.setBackground(new java.awt.Color(25, 17, 1));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("date_debut_location:");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 282, 28));

        jLabel_err_date.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_err_date.setText("La date de fin doit être après la date de début.");
        jPanel3.add(jLabel_err_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 260, 20));

        txtCIN_proprietaire.setFont(txtCIN_proprietaire.getFont().deriveFont(txtCIN_proprietaire.getFont().getSize()+2f));
        txtCIN_proprietaire.setBorder(null);
        txtCIN_proprietaire.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCIN_proprietaire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCIN_proprietaireMouseClicked(evt);
            }
        });
        txtCIN_proprietaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCIN_proprietaireActionPerformed(evt);
            }
        });
        txtCIN_proprietaire.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCIN_proprietaireKeyPressed(evt);
            }
        });
        jPanel3.add(txtCIN_proprietaire, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 180, 20));

        txtid_location.setFont(txtid_location.getFont().deriveFont(txtid_location.getFont().getSize()+2f));
        txtid_location.setBorder(null);
        txtid_location.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtid_locationMouseClicked(evt);
            }
        });
        txtid_location.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtid_locationKeyPressed(evt);
            }
        });
        jPanel3.add(txtid_location, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 120, 20));

        txtCIN_locataire.setFont(txtCIN_locataire.getFont().deriveFont(txtCIN_locataire.getFont().getSize()+2f));
        txtCIN_locataire.setBorder(null);
        txtCIN_locataire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCIN_locataireMouseClicked(evt);
            }
        });
        txtCIN_locataire.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCIN_locataireKeyPressed(evt);
            }
        });
        jPanel3.add(txtCIN_locataire, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 150, 20));

        jLabel13.setForeground(new java.awt.Color(0, 102, 150));
        jLabel13.setText("_______________________________");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 150, 30));

        jLabel_err_cin_prop.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_err_cin_prop.setText("Veuillez entrer uniquement des chiffres.");
        jPanel3.add(jLabel_err_cin_prop, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 220, 20));

        jLabel_err_cin_loca.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_err_cin_loca.setText("Veuillez entrer uniquement des chiffres.");
        jPanel3.add(jLabel_err_cin_loca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 220, 20));

        jLabel15.setBackground(new java.awt.Color(25, 17, 1));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("id_location:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 282, 28));

        jLabel18.setForeground(new java.awt.Color(0, 102, 150));
        jLabel18.setText("______________________");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 180, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("id_appartement:");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 120, 20));

        txtid_appartement1.setFont(txtid_appartement1.getFont().deriveFont(txtid_appartement1.getFont().getSize()+2f));
        txtid_appartement1.setBorder(null);
        txtid_appartement1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtid_appartement1MouseClicked(evt);
            }
        });
        txtid_appartement1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtid_appartement1KeyPressed(evt);
            }
        });
        jPanel3.add(txtid_appartement1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 120, 20));

        jLabel_err_app.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_err_app.setText("Veuillez entrer uniquement des chiffres.");
        jPanel3.add(jLabel_err_app, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 210, 20));

        jLabel_err_loca.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_err_loca.setText("Veuillez entrer uniquement des chiffres.");
        jPanel3.add(jLabel_err_loca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 210, 20));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("CIN locataire:");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 150, 20));

        jButtonremove.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButtonremove.setForeground(new java.awt.Color(0, 102, 150));
        jButtonremove.setText("remove");
        jButtonremove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonremoveActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonremove, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, -1, -1));

        jButtonupdate.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButtonupdate.setForeground(new java.awt.Color(0, 102, 150));
        jButtonupdate.setText("update");
        jButtonupdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonupdateActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, -1, -1));

        jButtonreset.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButtonreset.setForeground(new java.awt.Color(0, 102, 150));
        jButtonreset.setText("reset");
        jButtonreset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonreset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonresetMouseClicked(evt);
            }
        });
        jButtonreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonresetActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, -1, -1));

        jButtonresearch.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButtonresearch.setForeground(new java.awt.Color(0, 102, 150));
        jButtonresearch.setText("research");
        jButtonresearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonresearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonresearchActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonresearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, -1, -1));

        jButtonadd.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButtonadd.setForeground(new java.awt.Color(0, 102, 150));
        jButtonadd.setText("  add  ");
        jButtonadd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonaddActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        jButtonrefresh.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButtonrefresh.setForeground(new java.awt.Color(0, 102, 150));
        jButtonrefresh.setText("refresh");
        jButtonrefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonrefreshActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonrefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));
        jPanel3.add(jDateChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 160, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("date_de_sortie:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 110, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 450, 460));

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

    private void txtid_appartementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtid_appartementMouseClicked
        jLabel_err_loca.setVisible(false);
        jLabel_err_date.setVisible(false);
        jLabel_err_app.setVisible(false);
        jLabel_err_cin_prop.setVisible(false);
        jLabel_err_cin_loca.setVisible(false);
    }//GEN-LAST:event_txtid_appartementMouseClicked

    private void txtid_appartementKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtid_appartementKeyPressed
        char c =evt.getKeyChar();
        if(Character.isDigit(c) || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE ){
            jLabel_err_app.setVisible(false);
            txtid_appartement.setEditable(true);
        }
        else{
            txtid_appartement.setEditable(false);
            jLabel_err_app.setVisible(true);

        }
    }//GEN-LAST:event_txtid_appartementKeyPressed

    private void jDateChooser2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser2PropertyChange
        if (jDateChooser2.getDate() != null && jDateChooser1.getDate() != null) {
            if (jDateChooser1.getDate().before(jDateChooser2.getDate())) {
                // La date de fin est antérieure à la date de début
                jLabel_err_date.setVisible(true);
                //jLabel_err_date.setText("La date de fin doit être après la date de début.");
            } else {
                // Les dates sont valides
                jLabel_err_date.setVisible(false);
            }
        }
    }//GEN-LAST:event_jDateChooser2PropertyChange

    private void jDateChooser2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooser2KeyPressed

    }//GEN-LAST:event_jDateChooser2KeyPressed

    private void txtCIN_proprietaireMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCIN_proprietaireMouseClicked
        jLabel_err_loca.setVisible(false);
        jLabel_err_date.setVisible(false);
        jLabel_err_app.setVisible(false);
        jLabel_err_cin_prop.setVisible(false);
        jLabel_err_cin_loca.setVisible(false);
    }//GEN-LAST:event_txtCIN_proprietaireMouseClicked

    private void txtCIN_proprietaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCIN_proprietaireActionPerformed

    }//GEN-LAST:event_txtCIN_proprietaireActionPerformed

    private void txtCIN_proprietaireKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCIN_proprietaireKeyPressed
        char c =evt.getKeyChar();
        if(Character.isDigit(c) || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE ){
            jLabel_err_cin_prop.setVisible(false);
            txtCIN_proprietaire.setEditable(true);
        }
        else{
            txtCIN_proprietaire.setEditable(false);
            jLabel_err_cin_prop.setVisible(true);

        }
    }//GEN-LAST:event_txtCIN_proprietaireKeyPressed

    private void txtid_locationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtid_locationMouseClicked
        jLabel_err_loca.setVisible(false);
        jLabel_err_date.setVisible(false);
        jLabel_err_app.setVisible(false);
        jLabel_err_cin_prop.setVisible(false);
        jLabel_err_cin_loca.setVisible(false);
    }//GEN-LAST:event_txtid_locationMouseClicked

    private void txtid_locationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtid_locationKeyPressed
        char c =evt.getKeyChar();
        if(Character.isDigit(c) || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE ){
            jLabel_err_loca.setVisible(false);
            txtid_location.setEditable(true);
        }
        else{
            txtid_location.setEditable(false);
            jLabel_err_loca.setVisible(true);

        }
    }//GEN-LAST:event_txtid_locationKeyPressed

    private void txtCIN_locataireMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCIN_locataireMouseClicked
        jLabel_err_loca.setVisible(false);
        jLabel_err_date.setVisible(false);
        jLabel_err_app.setVisible(false);
        jLabel_err_cin_prop.setVisible(false);
        jLabel_err_cin_loca.setVisible(false);
    }//GEN-LAST:event_txtCIN_locataireMouseClicked

    private void txtCIN_locataireKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCIN_locataireKeyPressed
        char c =evt.getKeyChar();
        if(Character.isDigit(c) || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE ){
            jLabel_err_cin_loca.setVisible(false);
            txtCIN_locataire.setEditable(true);
        }
        else{
            txtCIN_locataire.setEditable(false);
            jLabel_err_cin_loca.setVisible(true);
        }
    }//GEN-LAST:event_txtCIN_locataireKeyPressed

    private void txtid_appartement1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtid_appartement1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtid_appartement1MouseClicked

    private void txtid_appartement1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtid_appartement1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtid_appartement1KeyPressed

    private void jButtonaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonaddActionPerformed
        DB_Connexion db = new DB_Connexion();
        String id_location=txtid_location.getText();
        String id_appa=txtid_appartement.getText();
        String cin_loc=txtCIN_locataire.getText();
        String cin_pro=txtCIN_proprietaire.getText();
        System.out.println("essai");
        Date dateDebut = jDateChooser2.getDate();
        Date datefin = jDateChooser1.getDate();
        System.out.println("add clicked");
        Location location=new Location(id_location,id_appa,cin_loc,cin_pro,dateDebut,datefin);
        System.out.println("instance location cree");
        if ((id_location.equals(""))||(id_appa.equals(""))||(cin_loc.equals(""))||(cin_pro.equals(""))||(dateDebut==null)||(datefin==null)){
            JOptionPane.showMessageDialog(this, "Erreur lors de l'ajout d'une location.Veuillez remplir tous les champs", "Erreur", JOptionPane.ERROR_MESSAGE);
            System.out.println("champs vide");}
        else{
        if(db.add_location(location)){
            JOptionPane.showMessageDialog(this, "Ajout du contrat avec success");
            db.miseajourappartement();
        }
        else{
            JOptionPane.showMessageDialog(this, "Erreur lors de l'ajout d'une location.", "Erreur", JOptionPane.ERROR_MESSAGE);
            System.out.println("addlocation retourne false!!!");}
        }
    }//GEN-LAST:event_jButtonaddActionPerformed

    private void jButtonresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonresetActionPerformed
        jLabel_err_loca.setVisible(false);
        jLabel_err_date.setVisible(false);
        jLabel_err_app.setVisible(false);
        jLabel_err_cin_prop.setVisible(false);
        jLabel_err_cin_loca.setVisible(false);
        txtCIN_proprietaire.setText("");
        txtCIN_locataire.setText("");
        txtid_location.setText("");
        txtid_appartement.setText("");
        jDateChooser1.setDate(null);
        jDateChooser2.setDate(null);
        
    }//GEN-LAST:event_jButtonresetActionPerformed

    private void jButtonrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonrefreshActionPerformed
        DB_Connexion db=new DB_Connexion();
        ResultSet rs=db.location_refresh();
        try {
        DefaultTableModel model = (DefaultTableModel) jTable.getModel(); // Récupère le modèle existant de votre JTable
        model.setRowCount(0); // Efface les lignes existantes du modèle

        // Ajoute les données du ResultSet à votre modèle de table
        while (rs.next()) {
            Object[] rowData = {rs.getInt("id_location"), rs.getString("cin_loc"),
                    rs.getInt("id_app"), rs.getString("cin_pro"),
                    rs.getObject("datedebut"), rs.getObject("datefin")};
            model.addRow(rowData);
        }
        if(model.getRowCount()==0){
            JOptionPane.showMessageDialog(this, "Erreur lors du rafraîchissement de la liste des locatons.", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
      
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonrefreshActionPerformed

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        if (jDateChooser2.getDate() != null && jDateChooser1.getDate() != null) {
            if (jDateChooser1.getDate().before(jDateChooser2.getDate())) {
                // La date de fin est antérieure à la date de début
                jLabel_err_date.setVisible(true);
                //jLabel_err_date.setText("La date de fin doit être après la date de début.");
            } else {
                // Les dates sont valides
                jLabel_err_date.setVisible(false);
            }
        }
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void jButtonresetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonresetMouseClicked
        jLabel_err_loca.setVisible(false);
        jLabel_err_date.setVisible(false);
        jLabel_err_app.setVisible(false);
        jLabel_err_cin_prop.setVisible(false);
        jLabel_err_cin_loca.setVisible(false);
    }//GEN-LAST:event_jButtonresetMouseClicked

    private void jButtonresearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonresearchActionPerformed
        DB_Connexion db = new DB_Connexion();
        String id_location=txtid_location.getText();
        String id_appa=txtid_appartement.getText();
        String cin_loc=txtCIN_locataire.getText();
        String cin_pro=txtCIN_proprietaire.getText();
        Date dateDebut = jDateChooser2.getDate();
        Date datefin = jDateChooser1.getDate();
        if ((dateDebut==null)&&(datefin==null)&&(id_location.equals(""))&&(id_appa.equals(""))&&(cin_loc.equals(""))&&(cin_pro.equals(""))){
            JOptionPane.showMessageDialog(this, "Veuillez remplir au moins un critère de recherche", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        else{
            Location location=new Location(id_location,id_appa,cin_loc,cin_pro,dateDebut,datefin);
            ResultSet rs=db.affiche_location(location);
            System.out.println(rs);//a effacer

            try {
            DefaultTableModel model = (DefaultTableModel) jTable.getModel(); // Récupère le modèle existant de votre JTable
            model.setRowCount(0); // Efface les lignes existantes du modèle

            // Ajoute les données du ResultSet à votre modèle de table
            while (rs.next()) {
                Object[] rowData = {rs.getInt("id_location"), rs.getString("cin_loc"),
                        rs.getInt("id_app"), rs.getString("cin_pro"),
                        rs.getObject("datedebut"), rs.getObject("datefin")};
                model.addRow(rowData);
            }
            if(model.getRowCount()==0)
                JOptionPane.showMessageDialog(this, "NO_DATA_FOUND");
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButtonresearchActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButtonupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonupdateActionPerformed
        DB_Connexion db = new DB_Connexion();
        String id_location=txtid_location.getText();
        String id_appa=txtid_appartement.getText();
        String cin_loc=txtCIN_locataire.getText();
        String cin_pro=txtCIN_proprietaire.getText();
        Date dateDebut = jDateChooser2.getDate();
        Date datefin = jDateChooser1.getDate();
        Date datesortie=jDateChooser3.getDate();  
        if (id_location.equals("") || (datesortie == null))
            JOptionPane.showMessageDialog(this, "Erreur le  champs id_location et date de sortie sont obligatoires", "Erreur", JOptionPane.ERROR_MESSAGE);
        else {
        Location location = new Location(id_location, id_appa, cin_loc, cin_pro, dateDebut, datefin,datesortie);
        System.out.println("instance location cree");
        
            if (db.update_location(location)) {
                JOptionPane.showMessageDialog(this, "mise a jour de la date de sortie avec success");
            } else {
                JOptionPane.showMessageDialog(this, "Erreur lors de la mise a jour de la date de sortie .Veuillez verifier les données !", "Erreur", JOptionPane.ERROR_MESSAGE);
                System.out.println("updatelocation retourne false!!!");
            }
        
    }
    }//GEN-LAST:event_jButtonupdateActionPerformed

    private void jButtonremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonremoveActionPerformed
        DB_Connexion db = new DB_Connexion();
        String id_location=txtid_location.getText();
        String id_appa=txtid_appartement.getText();
        String cin_loc=txtCIN_locataire.getText();
        String cin_pro=txtCIN_proprietaire.getText();
        Date dateDebut = jDateChooser2.getDate();
        Date datefin = jDateChooser1.getDate();
        System.out.println("remove clicked");
        if (id_location.equals(""))
            JOptionPane.showMessageDialog(this, "Erreur le champs id_location est obligatoire", "Erreur", JOptionPane.ERROR_MESSAGE);
        else{
        Location location=new Location(id_location,id_appa,cin_loc,cin_pro,dateDebut,datefin);
        System.out.println("instance location cree");
        if(db.remove_location(location))
            JOptionPane.showMessageDialog(this, "suppression du contrat avec success");
        else{
            JOptionPane.showMessageDialog(this, "Erreur lors de la suppression du contrat de location.Veuillez verifier les données !", "Erreur", JOptionPane.ERROR_MESSAGE);
            System.out.println("addlocation retourne false!!!");}
        }
    }//GEN-LAST:event_jButtonremoveActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        // Obtenir la ligne sélectionnée
    int selectedRow = jTable.getSelectedRow();
    if (selectedRow != -1) {
        // Obtenir les données de la ligne sélectionnée
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        int idloc = Integer.parseInt(String.valueOf(model.getValueAt(selectedRow, 0))); // CIN
        String cinl = (String) model.getValueAt(selectedRow, 1); // Nom
        String cinp = (String) model.getValueAt(selectedRow, 3); // Prénom
        int idapp = Integer.parseInt( String.valueOf(model.getValueAt(selectedRow, 2))); // Prénom
        java.sql.Date date_deb = (java.sql.Date) model.getValueAt(selectedRow, 4); // Date de naissance
        java.sql.Date date_fin = (java.sql.Date) model.getValueAt(selectedRow, 5); // Date de naissance


        // Remplir les champs de texte
        txtid_location.setText(Integer.toString(idloc));
        txtCIN_proprietaire.setText(cinp);
        txtCIN_locataire.setText(cinl);
        txtid_appartement.setText(Integer.toString(idapp));
        jDateChooser1.setDate(date_fin);
        jDateChooser2.setDate(date_deb);

    }
    }//GEN-LAST:event_jTableMouseClicked

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
            java.util.logging.Logger.getLogger(GestionLoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionLoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionLoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionLoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionLoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonadd;
    private javax.swing.JButton jButtonrefresh;
    private javax.swing.JButton jButtonremove;
    private javax.swing.JButton jButtonresearch;
    private javax.swing.JButton jButtonreset;
    private javax.swing.JButton jButtonupdate;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_err_app;
    private javax.swing.JLabel jLabel_err_cin_loca;
    private javax.swing.JLabel jLabel_err_cin_prop;
    private javax.swing.JLabel jLabel_err_date;
    private static javax.swing.JLabel jLabel_err_loca;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField txtCIN_locataire;
    private javax.swing.JTextField txtCIN_proprietaire;
    private javax.swing.JTextField txtid_appartement;
    private javax.swing.JTextField txtid_appartement1;
    private javax.swing.JTextField txtid_location;
    // End of variables declaration//GEN-END:variables
}
