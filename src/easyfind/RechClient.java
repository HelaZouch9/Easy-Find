
package easyfind;

import java.awt.event.KeyEvent;
import source.*;
import source.DB_Connexion;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class RechClient extends javax.swing.JFrame {

    public RechClient() {
        initComponents();
        jLabel_err_cin.setVisible(false);
        jLabel_err_prenom.setVisible(false);
        jLabel_err_nom.setVisible(false);
        jLabel_err_tel.setVisible(false);
        jLabel_err_mail.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelback = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldnom = new javax.swing.JTextField();
        jTextFieldprenom = new javax.swing.JTextField();
        jTextFieldemail = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel_err_cin = new javax.swing.JLabel();
        jLabel_err_nom = new javax.swing.JLabel();
        jLabel_err_prenom = new javax.swing.JLabel();
        jLabel_err_tel = new javax.swing.JLabel();
        jLabel_err_mail = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jButton_afficher = new javax.swing.JButton();
        jButton_régulier = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_clear = new javax.swing.JButton();
        jLabelbg = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 150));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Clients");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 339, 68));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 0, 50, 68));

        jLabelback.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelback.setForeground(new java.awt.Color(255, 255, 255));
        jLabelback.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fleche1.png"))); // NOI18N
        jLabelback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelbackMouseClicked(evt);
            }
        });
        jPanel2.add(jLabelback, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 13, 48, 49));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, -2, 1130, 80));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Nom:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 101, 45));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Prénom:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 101, 45));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Téléphone:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 101, 45));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("CIN_client :");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 101, 45));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Email:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 101, 45));

        jTextFieldnom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldnomMouseClicked(evt);
            }
        });
        jTextFieldnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldnomActionPerformed(evt);
            }
        });
        jTextFieldnom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldnomKeyPressed(evt);
            }
        });
        jPanel3.add(jTextFieldnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 230, 40));

        jTextFieldprenom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldprenomMouseClicked(evt);
            }
        });
        jTextFieldprenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldprenomActionPerformed(evt);
            }
        });
        jTextFieldprenom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldprenomKeyPressed(evt);
            }
        });
        jPanel3.add(jTextFieldprenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 227, 39));

        jTextFieldemail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldemailMouseClicked(evt);
            }
        });
        jTextFieldemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldemailActionPerformed(evt);
            }
        });
        jTextFieldemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldemailKeyPressed(evt);
            }
        });
        jPanel3.add(jTextFieldemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 227, 39));

        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 230, 30));

        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 230, 40));

        jLabel_err_cin.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_err_cin.setText("Veuillez entrer uniquement des chiffres.");
        jPanel3.add(jLabel_err_cin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 210, 20));

        jLabel_err_nom.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_err_nom.setText("Veuillez entrer uniquement des lettres.");
        jPanel3.add(jLabel_err_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 220, 20));

        jLabel_err_prenom.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_err_prenom.setText("Veuillez entrer uniquement des lettres.");
        jPanel3.add(jLabel_err_prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 220, 20));

        jLabel_err_tel.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_err_tel.setText("Veuillez entrer uniquement des chiffres.");
        jPanel3.add(jLabel_err_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 220, 20));

        jLabel_err_mail.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_err_mail.setText("adresse email invalide");
        jPanel3.add(jLabel_err_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 130, 20));
        jPanel3.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 230, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Date de naissance:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 180, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 430, 370));

        jButton_afficher.setBackground(new java.awt.Color(0, 102, 150));
        jButton_afficher.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_afficher.setForeground(new java.awt.Color(255, 255, 255));
        jButton_afficher.setText("Afficher");
        jButton_afficher.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_afficher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_afficherActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_afficher, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 206, 47));

        jButton_régulier.setBackground(new java.awt.Color(0, 102, 150));
        jButton_régulier.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_régulier.setForeground(new java.awt.Color(255, 255, 255));
        jButton_régulier.setText("Client régulier");
        jButton_régulier.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_régulier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_régulierActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_régulier, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, 206, 47));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CIN", "Nom", "Prénom", "Tel", "Email", "Date de naissance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 630, 378));

        jButton_clear.setBackground(new java.awt.Color(0, 102, 150));
        jButton_clear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_clear.setForeground(new java.awt.Color(255, 255, 255));
        jButton_clear.setText("Clear");
        jButton_clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_clearActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 203, 47));

        jLabelbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/easyfind.png"))); // NOI18N
        jPanel1.add(jLabelbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 490, 210, 170));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bg.jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1130, 580));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, -1));

        setSize(new java.awt.Dimension(1118, 575));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabelbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelbackMouseClicked
        Dashboard da =new Dashboard();
        da.setVisible(true);
        //hide
        this.dispose();
    }//GEN-LAST:event_jLabelbackMouseClicked

    private void jTextFieldnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldnomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldnomActionPerformed

    private void jTextFieldprenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldprenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldprenomActionPerformed

    private void jTextFieldemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldemailActionPerformed

    private void jButton_afficherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_afficherActionPerformed

        // Récupérer les valeurs des champs d'entrée
    String cin = jTextField2.getText().trim();
    String nom = jTextFieldnom.getText().trim();
    String prenom = jTextFieldprenom.getText().trim();
    String tel = jTextField1.getText().trim();
    String email = jTextFieldemail.getText().trim();
    Date date_naissance = jDateChooser1.getDate();
    
    // Vérifier que l'email est valide
    if (!email.isEmpty()){
        if (!isValidEmail(email)) {
            jLabel_err_mail.setText("Adresse email invalide."); // Afficher le message d'erreur
            jLabel_err_mail.setVisible(true);
            return; // Arrêter l'exécution si l'email est invalide
        }
    }


    // Vérifier que au moins un champ n'est pas vide
    if (cin.isEmpty() && nom.isEmpty() && prenom.isEmpty() && tel.isEmpty() && email.isEmpty() && date_naissance == null) {
        // Si tous les champs sont vides, afficher un message d'erreur
        JOptionPane.showMessageDialog(this, "Veuillez remplir au moins un champ.", "Erreur", JOptionPane.ERROR_MESSAGE);
        return; // Arrêter l'exécution si aucun champ n'est rempli
    }

    // Si au moins un champ est rempli, continuer avec la logique
    Client c = new Client(nom, prenom, tel, cin, email, date_naissance); // Obtenir un objet client avec les champs remplis
    DB_Connexion db = new DB_Connexion();
    ResultSet rs = null;

    try {
        rs = db.afficher_client(c); // Méthode hypothétique qui prend un objet Client
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); // Récupérer le modèle existant de votre JTable
        model.setRowCount(0); // Effacer les lignes existantes du modèle

        // Ajoute les données du ResultSet au modèle de table
        while (rs.next()) {
            Object[] rowData = {
                rs.getString("cin_client"),
                rs.getString("nom_client"),
                rs.getString("prenom_client"),
                rs.getString("tel_client"),
                rs.getString("email_client"),
                rs.getDate("date_naissance_client")
            };
            model.addRow(rowData);
        }

        if (model.getRowCount() == 0) { // Si aucune donnée n'est trouvée
            JOptionPane.showMessageDialog(this, "Aucune donnée trouvée.", "Information", JOptionPane.INFORMATION_MESSAGE);
        }

    } catch (SQLException e) {
        e.printStackTrace(); // Afficher l'erreur SQL dans la console
        JOptionPane.showMessageDialog(this, "Erreur lors de l'exécution de la requête.", "Erreur", JOptionPane.ERROR_MESSAGE);
    } finally {
        if (rs != null) {
            try {
                rs.close(); // Fermer le ResultSet pour éviter les fuites de mémoire
            } catch (SQLException e) {
                e.printStackTrace(); // Gérer l'erreur de fermeture
            }
        }
    }
    }//GEN-LAST:event_jButton_afficherActionPerformed

    private void jButton_régulierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_régulierActionPerformed
        DB_Connexion db=new DB_Connexion();
        ResultSet rs=db.get_regulier();
        try {
            if (rs.next()){
            String cin=rs.getString("cin_loc");
            int nbr=rs.getInt("nb_locations");
            JOptionPane.showMessageDialog(this, "Le client régulier est le client avec CIN: " + cin + " ayant effectué " + nbr + " locations.", "Client régulier", JOptionPane.INFORMATION_MESSAGE);}
            else
               JOptionPane.showMessageDialog(this, "Aucun client régulier trouvé.", "Client régulier", JOptionPane.INFORMATION_MESSAGE); 
            } catch (SQLException ex) {
            Logger.getLogger(RechClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_régulierActionPerformed

    private void jButton_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_clearActionPerformed
        jTextField1.setText("");
        jTextFieldnom.setText("");
        jTextFieldprenom.setText("");
        jTextField2.setText("");
        jTextFieldemail.setText("");
        jDateChooser1.setDate(null);
    }//GEN-LAST:event_jButton_clearActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        jLabel_err_cin.setVisible(false);
        jLabel_err_prenom.setVisible(false);
        jLabel_err_nom.setVisible(false);
        jLabel_err_tel.setVisible(false);
        jLabel_err_mail.setVisible(false);
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextFieldnomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldnomMouseClicked
        jLabel_err_cin.setVisible(false);
        jLabel_err_prenom.setVisible(false);
        jLabel_err_nom.setVisible(false);
        jLabel_err_tel.setVisible(false);
        jLabel_err_mail.setVisible(false);
    }//GEN-LAST:event_jTextFieldnomMouseClicked

    private void jTextFieldprenomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldprenomMouseClicked
        jLabel_err_cin.setVisible(false);
        jLabel_err_prenom.setVisible(false);
        jLabel_err_nom.setVisible(false);
        jLabel_err_tel.setVisible(false);
        jLabel_err_mail.setVisible(false);
    }//GEN-LAST:event_jTextFieldprenomMouseClicked

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        jLabel_err_cin.setVisible(false);
        jLabel_err_prenom.setVisible(false);
        jLabel_err_nom.setVisible(false);
        jLabel_err_tel.setVisible(false);
        jLabel_err_mail.setVisible(false);
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextFieldemailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldemailMouseClicked
        jLabel_err_cin.setVisible(false);
        jLabel_err_prenom.setVisible(false);
        jLabel_err_nom.setVisible(false);
        jLabel_err_tel.setVisible(false);
        jLabel_err_mail.setVisible(false);
    }//GEN-LAST:event_jTextFieldemailMouseClicked

    private void jTextFieldprenomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldprenomKeyPressed
        char c =evt.getKeyChar();
        if(Character.isLetter(c) || c==' '|| evt.getKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getKeyCode() == KeyEvent.VK_SHIFT || evt.getKeyCode() == KeyEvent.VK_CAPS_LOCK){
            jLabel_err_prenom.setVisible(false);
            jTextFieldprenom.setEditable(true);
        }
        else{
            jTextFieldprenom.setEditable(false);
            jLabel_err_prenom.setVisible(true);
        }
    }//GEN-LAST:event_jTextFieldprenomKeyPressed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        char c =evt.getKeyChar();
        if(Character.isDigit(c) || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getKeyCode() == KeyEvent.VK_SHIFT || evt.getKeyCode() == KeyEvent.VK_CAPS_LOCK){
            jLabel_err_cin.setVisible(false);
            jTextField1.setEditable(true);
        }
        else{
            jTextField1.setEditable(false);
            jLabel_err_cin.setVisible(true);

        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextFieldnomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldnomKeyPressed
        char c =evt.getKeyChar();
        if(Character.isLetter(c) || c==' '|| evt.getKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getKeyCode() == KeyEvent.VK_SHIFT || evt.getKeyCode() == KeyEvent.VK_CAPS_LOCK){
            jLabel_err_nom.setVisible(false);
            jTextFieldnom.setEditable(true);
        }
        else{
            jTextFieldnom.setEditable(false);
            jLabel_err_nom.setVisible(true);
        }
    }//GEN-LAST:event_jTextFieldnomKeyPressed

    private void jTextFieldemailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldemailKeyPressed
        char c =evt.getKeyChar();
        if(Character.isLetter(c) || c==' '||Character.isDigit(c) || c=='@'|| c=='_'||c=='.' || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getKeyCode() == KeyEvent.VK_SHIFT || evt.getKeyCode() == KeyEvent.VK_CAPS_LOCK ){
            jLabel_err_mail.setVisible(false);
            jTextFieldemail.setEditable(true);
        }
        else{
            jTextFieldemail.setEditable(false);
            jLabel_err_mail.setVisible(true);
        }
    }//GEN-LAST:event_jTextFieldemailKeyPressed

    private boolean isValidEmail(String email) {
        // Regex pour valider une adresse e-mail
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        return email.matches(emailRegex);
    }
    
    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        char c =evt.getKeyChar();
        if(Character.isDigit(c) || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getKeyCode() == KeyEvent.VK_SHIFT || evt.getKeyCode() == KeyEvent.VK_CAPS_LOCK){
            jLabel_err_tel.setVisible(false);
            jTextField2.setEditable(true);
        }
        else{
            jTextField2.setEditable(false);
            jLabel_err_tel.setVisible(true);
        }
    }//GEN-LAST:event_jTextField2KeyPressed

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
            java.util.logging.Logger.getLogger(RechClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RechClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RechClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RechClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RechClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_afficher;
    private javax.swing.JButton jButton_clear;
    private javax.swing.JButton jButton_régulier;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private static javax.swing.JLabel jLabel_err_cin;
    private javax.swing.JLabel jLabel_err_mail;
    private javax.swing.JLabel jLabel_err_nom;
    private javax.swing.JLabel jLabel_err_prenom;
    private javax.swing.JLabel jLabel_err_tel;
    private javax.swing.JLabel jLabelback;
    private javax.swing.JLabel jLabelbg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldemail;
    private javax.swing.JTextField jTextFieldnom;
    private javax.swing.JTextField jTextFieldprenom;
    // End of variables declaration//GEN-END:variables
}
