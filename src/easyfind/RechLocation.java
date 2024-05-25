package easyfind;

import java.awt.Dimension;
import javax.swing.UIManager;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Date;
import source.DB_Connexion;
import source.Location;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class RechLocation extends javax.swing.JFrame {

    public RechLocation() {
        initComponents();
        /*RoundedPanel roundedPanel = new RoundedPanel(20, Color.GRAY); // Crée un JPanel avec des coins arrondis de rayon 20 et une ombre grise
        roundedPanel.setPreferredSize(new Dimension(200, 100)); // Taille du panel
        // Ajouter le JPanel personnalisé à votre conteneur avec AbsoluteLayout
        jPanel2.setLayout(null); // Définit le layout sur null pour utiliser AbsoluteLayout
        jPanel2.add(roundedPanel);
        roundedPanel.setBounds(5, 5, 200, 100); // Spécifie les coordonnées et la taille du JPanel*/
        //pour rendre la couleur transparent 
        /*jPanel2.setBackground(new Color(0, 102, 150, 128));

        getContentPane().add(jPanel2);*/
        // Initialiser la visibilité des messages d'erreur à false
    jLabel_err_loca.setVisible(false);
    jLabel_err_date.setVisible(false);
    jLabel_err_app.setVisible(false);
    jLabel_err_cin_prop.setVisible(false);
    jLabel_err_cin_loca.setVisible(false);
    jLabel_nodatafound.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCIN_proprietaire = new javax.swing.JTextField();
        txtid_location = new javax.swing.JTextField();
        txtCIN_locataire = new javax.swing.JTextField();
        txtid_appartement = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jBrecherche = new javax.swing.JButton();
        jBreset = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        jLabel_err_date = new javax.swing.JLabel();
        jLabel_err_loca = new javax.swing.JLabel();
        jLabel_err_app = new javax.swing.JLabel();
        jLabel_err_cin_prop = new javax.swing.JLabel();
        jLabel_err_cin_loca = new javax.swing.JLabel();
        jLabel_nodatafound = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GestionLocation");
        setUndecorated(true);
        setSize(new java.awt.Dimension(1118, 575));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fleche1.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 30));

        jPanel2.setBackground(new java.awt.Color(0, 102, 150));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_location", "CIN_locataire", "id_appartement", "CIN_propietaire", "date_debut", "date_fin"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Long.class, java.lang.Integer.class, java.lang.Long.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 19, 523, 400));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 550, 440));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 150));
        jLabel3.setText("LES CONTRATS DE LOCATION");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 310, 60));

        jLabel7.setForeground(new java.awt.Color(0, 102, 150));
        jLabel7.setText("______________________");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 180, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("CIN locataire:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 150, 20));

        jLabel9.setForeground(new java.awt.Color(0, 102, 150));
        jLabel9.setText("__________________");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 200, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("CIN propriétaire :");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 180, 20));

        jLabel11.setForeground(new java.awt.Color(0, 102, 150));
        jLabel11.setText("_______________________");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 170, 30));

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
        jPanel3.add(txtCIN_proprietaire, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 180, 20));

        txtid_location.setFont(txtid_location.getFont().deriveFont(txtid_location.getFont().getSize()+2f));
        txtid_location.setBorder(null);
        txtid_location.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtid_locationMouseClicked(evt);
            }
        });
        txtid_location.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtid_locationActionPerformed(evt);
            }
        });
        txtid_location.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtid_locationKeyPressed(evt);
            }
        });
        jPanel3.add(txtid_location, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 120, 20));

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
        jPanel3.add(txtCIN_locataire, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 150, 20));

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
        jPanel3.add(txtid_appartement, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 120, 20));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("id_appartement:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 120, 20));

        jLabel13.setForeground(new java.awt.Color(0, 102, 150));
        jLabel13.setText("_______________________________");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 150, 30));

        jBrecherche.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jBrecherche.setForeground(new java.awt.Color(0, 102, 150));
        jBrecherche.setText("Recherche");
        jBrecherche.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBrecherche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBrechercheMouseClicked(evt);
            }
        });
        jBrecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBrechercheActionPerformed(evt);
            }
        });
        jPanel3.add(jBrecherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, -1, -1));

        jBreset.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jBreset.setForeground(new java.awt.Color(0, 102, 150));
        jBreset.setText("Reset");
        jBreset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBresetActionPerformed(evt);
            }
        });
        jPanel3.add(jBreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, -1, -1));

        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        jPanel3.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 160, 30));

        jLabel14.setBackground(new java.awt.Color(25, 17, 1));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("id_location:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 282, 28));

        jLabel16.setBackground(new java.awt.Color(25, 17, 1));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("date_fin_location:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 282, 28));

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
        jPanel3.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 160, 30));

        jLabel17.setBackground(new java.awt.Color(25, 17, 1));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("date_debut_location:");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 282, 28));

        jLabel_err_date.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_err_date.setText("La date de fin doit être après la date de début.");
        jPanel3.add(jLabel_err_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 260, 20));

        jLabel_err_loca.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_err_loca.setText("Veuillez entrer uniquement des chiffres.");
        jPanel3.add(jLabel_err_loca, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 160, 210, 20));

        jLabel_err_app.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_err_app.setText("Veuillez entrer uniquement des chiffres.");
        jPanel3.add(jLabel_err_app, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 210, 20));

        jLabel_err_cin_prop.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_err_cin_prop.setText("Veuillez entrer uniquement des chiffres.");
        jPanel3.add(jLabel_err_cin_prop, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 220, 20));

        jLabel_err_cin_loca.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_err_cin_loca.setText("Veuillez entrer uniquement des chiffres.");
        jPanel3.add(jLabel_err_cin_loca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 220, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 460, 450));

        jLabel_nodatafound.setBackground(new java.awt.Color(0, 102, 150));
        jLabel_nodatafound.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_nodatafound.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_nodatafound.setText("No Data Found");
        jPanel1.add(jLabel_nodatafound, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 480, 190, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 150));
        jLabel4.setText("    X");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 0, 49, 39));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/mini_logo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 490, 410, 560));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bg.jpg"))); // NOI18N
        jLabel1.setText("No Data Found");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 580));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(1118, 575));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jBresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBresetActionPerformed
        txtid_location.setText("");
        txtid_appartement.setText("");
        txtCIN_proprietaire.setText("");
        txtCIN_locataire.setText("");
        jDateChooser1.setDate(null);
        jDateChooser2.setDate(null);
        jLabel_err_loca.setVisible(false);
        jLabel_err_date.setVisible(false);
        jLabel_err_app.setVisible(false);
        jLabel_err_cin_prop.setVisible(false);
        jLabel_err_cin_loca.setVisible(false);
        jLabel_nodatafound.setVisible(false);
        
    }//GEN-LAST:event_jBresetActionPerformed

    private void jBrechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBrechercheActionPerformed
        
    }//GEN-LAST:event_jBrechercheActionPerformed

    private void txtCIN_proprietaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCIN_proprietaireActionPerformed
 
    }//GEN-LAST:event_txtCIN_proprietaireActionPerformed

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

    private void txtid_appartementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtid_appartementMouseClicked
       jLabel_err_loca.setVisible(false);
        jLabel_err_date.setVisible(false);
        jLabel_err_app.setVisible(false);
        jLabel_err_cin_prop.setVisible(false);
        jLabel_err_cin_loca.setVisible(false);
    }//GEN-LAST:event_txtid_appartementMouseClicked

    private void txtid_locationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtid_locationMouseClicked
        jLabel_err_loca.setVisible(false);
        jLabel_err_date.setVisible(false);
        jLabel_err_app.setVisible(false);
        jLabel_err_cin_prop.setVisible(false);
        jLabel_err_cin_loca.setVisible(false);
    }//GEN-LAST:event_txtid_locationMouseClicked

    private void txtCIN_locataireMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCIN_locataireMouseClicked
        jLabel_err_loca.setVisible(false);
        jLabel_err_date.setVisible(false);
        jLabel_err_app.setVisible(false);
        jLabel_err_cin_prop.setVisible(false);
        jLabel_err_cin_loca.setVisible(false);
    }//GEN-LAST:event_txtCIN_locataireMouseClicked

    private void txtCIN_proprietaireMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCIN_proprietaireMouseClicked
        jLabel_err_loca.setVisible(false);
        jLabel_err_date.setVisible(false);
        jLabel_err_app.setVisible(false);
        jLabel_err_cin_prop.setVisible(false);
        jLabel_err_cin_loca.setVisible(false);
    }//GEN-LAST:event_txtCIN_proprietaireMouseClicked

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

    private void jDateChooser2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooser2KeyPressed
        
    }//GEN-LAST:event_jDateChooser2KeyPressed

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

    private void jBrechercheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBrechercheMouseClicked
        DB_Connexion db = new DB_Connexion();
        String id_location=txtid_location.getText();
        String id_appa=txtid_appartement.getText();
        String cin_loc=txtCIN_locataire.getText();
        String cin_pro=txtCIN_proprietaire.getText();
        Date dateDebut = jDateChooser2.getDate();
        Date datefin = jDateChooser1.getDate();
        jLabel_nodatafound.setVisible(false);
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
                jLabel_nodatafound.setVisible(true);
            }
            catch (SQLException e) {
                e.printStackTrace();
            }}
    }//GEN-LAST:event_jBrechercheMouseClicked

    private void txtid_locationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtid_locationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtid_locationActionPerformed

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

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    
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
            java.util.logging.Logger.getLogger(RechLocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RechLocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RechLocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RechLocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RechLocation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBrecherche;
    private javax.swing.JButton jBreset;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_err_app;
    private javax.swing.JLabel jLabel_err_cin_loca;
    private javax.swing.JLabel jLabel_err_cin_prop;
    private javax.swing.JLabel jLabel_err_date;
    private static javax.swing.JLabel jLabel_err_loca;
    private javax.swing.JLabel jLabel_nodatafound;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField txtCIN_locataire;
    private javax.swing.JTextField txtCIN_proprietaire;
    private javax.swing.JTextField txtid_appartement;
    private javax.swing.JTextField txtid_location;
    // End of variables declaration//GEN-END:variables
}
