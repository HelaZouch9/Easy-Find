package easyfind;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import source.*;
import source.DB_Connexion;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Gestion_clients extends javax.swing.JFrame {
    private Connection connection;
    public Gestion_clients() {
        initComponents();
        jLabel_err_cin.setVisible(false);
        jLabel_err_prenom.setVisible(false);
        jLabel_err_nom.setVisible(false);
        jLabel_err_tel.setVisible(false);
        jLabel_err_mail.setVisible(false);
        this.setLocationRelativeTo(null);//center form
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel_err_cin = new javax.swing.JLabel();
        jLabel_err_nom = new javax.swing.JLabel();
        jLabel_err_prenom = new javax.swing.JLabel();
        jLabel_err_tel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel_err_mail = new javax.swing.JLabel();
        jLabel_logo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel_bg = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton_add = new javax.swing.JButton();
        jButton_refresh = new javax.swing.JButton();
        jButton_clear = new javax.swing.JButton();
        jButton_edit = new javax.swing.JButton();
        jButton_remove = new javax.swing.JButton();
        jLabelback = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(186, 189, 226));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(55, 67, 117));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nos clients");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 6, 208, 43));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("CIN_client :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 101, 45));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Prénom:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 101, 45));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Nom:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 101, 45));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Téléphone:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 101, 45));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Email:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 101, 45));

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
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 227, 30));

        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 227, 30));

        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 227, 30));

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField4.setText("cust@gmail.com");
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
        });
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 227, 30));

        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
        });
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
        });
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 227, 30));

        jLabel_err_cin.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_err_cin.setText("Veuillez entrer uniquement des chiffres.");
        jPanel2.add(jLabel_err_cin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 210, 20));

        jLabel_err_nom.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_err_nom.setText("Veuillez entrer uniquement des lettres.");
        jPanel2.add(jLabel_err_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 220, 20));

        jLabel_err_prenom.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_err_prenom.setText("Veuillez entrer uniquement des lettres.");
        jPanel2.add(jLabel_err_prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 220, 20));

        jLabel_err_tel.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_err_tel.setText("Veuillez entrer uniquement des chiffres.");
        jPanel2.add(jLabel_err_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 220, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Date de naissance:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 160, 45));
        jPanel2.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 230, 30));

        jLabel_err_mail.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_err_mail.setText("adresse email invalide");
        jPanel2.add(jLabel_err_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 130, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 440, 402));
        jPanel1.add(jLabel_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 516, 186, 56));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("X");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 0, 43, 52));

        jLabel_bg.setBackground(new java.awt.Color(25, 118, 211));
        jPanel1.add(jLabel_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(941, 118, 8, 511));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 580, -1));

        jButton_add.setBackground(new java.awt.Color(55, 67, 117));
        jButton_add.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_add.setForeground(new java.awt.Color(255, 255, 255));
        jButton_add.setText("Add");
        jButton_add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 134, 40));

        jButton_refresh.setBackground(new java.awt.Color(55, 67, 117));
        jButton_refresh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_refresh.setForeground(new java.awt.Color(255, 255, 255));
        jButton_refresh.setText("Refresh");
        jButton_refresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_refreshActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 206, 40));

        jButton_clear.setBackground(new java.awt.Color(55, 67, 117));
        jButton_clear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_clear.setForeground(new java.awt.Color(255, 255, 255));
        jButton_clear.setText("Clear");
        jButton_clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_clearActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, 202, 40));

        jButton_edit.setBackground(new java.awt.Color(55, 67, 117));
        jButton_edit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_edit.setForeground(new java.awt.Color(255, 255, 255));
        jButton_edit.setText("Edit");
        jButton_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_editActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 134, 40));

        jButton_remove.setBackground(new java.awt.Color(55, 67, 117));
        jButton_remove.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_remove.setForeground(new java.awt.Color(255, 255, 255));
        jButton_remove.setText("Remove");
        jButton_remove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_removeActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, 134, 40));

        jLabelback.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabelback.setForeground(new java.awt.Color(255, 255, 255));
        jLabelback.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fleche1.png"))); // NOI18N
        jLabelback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelbackMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelback, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 6, 36, 34));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jButton_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addActionPerformed
        DB_Connexion db=new DB_Connexion();
        String cin = jTextField5.getText().trim();
        String nom = jTextField1.getText().trim();
        String prenom = jTextField2.getText().trim();
        String tel = jTextField3.getText().trim();
        String email = jTextField4.getText().trim();
        java.util.Date date_naissance=jDateChooser1.getDate();
    
    // Vérifier que l'email est valide
    if (!isValidEmail(email)) {
        jLabel_err_mail.setText("Adresse email invalide."); // Afficher le message d'erreur
        jLabel_err_mail.setVisible(true);
        return; // Arrêter l'exécution si l'email est invalide
    }
        if (cin.equals("") || nom.equals("") || prenom.equals("") || tel.equals("") || email.equals("")||(date_naissance == null))
            JOptionPane.showMessageDialog(this, "Erreur lors de l'ajout du client.Veuillez remplir tous les champs", "Erreur", JOptionPane.ERROR_MESSAGE);
        else{
            Client c =new Client(nom,prenom,cin,tel,email,date_naissance);
            if (db.add_client(c))
                JOptionPane.showMessageDialog(this, "Client ajouté avec succès !");
            else
               JOptionPane.showMessageDialog(this, "Erreur lors de l'ajout du client.", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_addActionPerformed

    private void jButton_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_refreshActionPerformed

        DB_Connexion db=new DB_Connexion();
        ResultSet rs = db.refresh_client();
        System.out.println(rs);
    try {
        DefaultTableModel model = new DefaultTableModel();
        
        // Ajouter les colonnes au modèle de table
        model.addColumn("CIN");
        model.addColumn("Nom");
        model.addColumn("Prénom");
        model.addColumn("Téléphone");
        model.addColumn("Email");
        model.addColumn("Date de naissance");
        
        // Parcourir les résultats de la requête et ajouter les données au modèle de table
        while (rs.next()) {
            String cin = rs.getString("cin_client");
            String nom = rs.getString("nom_client");
            String prenom = rs.getString("prenom_client");
            String tel = rs.getString("tel_client");
            String email = rs.getString("email_client");
            Date date= rs.getDate("date_naissance_client");
            model.addRow(new Object[]{cin, nom, prenom, tel, email,date});
        }
        
        // Afficher les données dans le jTable2
        jTable2.setModel(model);
        if(model.getRowCount()==0)
            JOptionPane.showMessageDialog(this, "NO_DATA_FOUND");
        
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Erreur lors du rafraîchissement de la liste des clients.", "Erreur", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton_refreshActionPerformed

    private void jButton_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_clearActionPerformed
        // Effacer le contenu des champs texte
        jTextField5.setText("");
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jDateChooser1.setDate(null);
    }//GEN-LAST:event_jButton_clearActionPerformed

    private void jButton_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editActionPerformed
        DB_Connexion db=new DB_Connexion();
        String cin = jTextField5.getText();
        String nom = jTextField1.getText();
        String prenom = jTextField2.getText();
        String tel = jTextField3.getText();
        String email = jTextField4.getText();
        java.util.Date date_naissance = jDateChooser1.getDate();
    
    //Vérifier que l'email est valide
    if (!isValidEmail(email)) {
        jLabel_err_mail.setText("Adresse email invalide."); // Afficher le message d'erreur
        jLabel_err_mail.setVisible(true);
        return; // Arrêter l'exécution si l'email est invalide
    }
        if (cin.equals(""))
            JOptionPane.showMessageDialog(this, "Erreur lors de la mise a jour du client.Le champ cin_client est obligatoire", "Erreur", JOptionPane.ERROR_MESSAGE);
        else{
            if (nom.equals("") && prenom.equals("") && tel.equals("") && email.equals("") && date_naissance==null)
                JOptionPane.showMessageDialog(this, "Erreur lors de la mise a jour du client.Il faut remplir au moins un champ", "Erreur", JOptionPane.ERROR_MESSAGE);
            else{
                // Récupérer les valeurs actuelles du client
                Client existingClient = null;
                try {
                ResultSet rs = db.afficher_client(new Client("", "", cin,"" , "", null));
                if (rs.next()) {
                // Stocker les anciennes valeurs
                String existingNom = rs.getString("nom_client");
                String existingPrenom = rs.getString("prenom_client");
                String existingTel = rs.getString("tel_client");
                String existingEmail = rs.getString("email_client");
                Date existingDateNaissance= rs.getDate("date_naissance_client");

                // Remplir les champs manquants avec les anciennes valeurs
                if (nom.isEmpty()) {
                    nom = existingNom;
                }

                if (prenom.isEmpty()) {
                    prenom = existingPrenom;
                }

                if (tel.isEmpty()) {
                    tel = existingTel;
                }

                if (email.isEmpty()) {
                    email = existingEmail;
                }

                if (date_naissance == null) {
                    date_naissance = existingDateNaissance;
                }

                Client c=new Client(nom,prenom,cin,tel,email,date_naissance);
                if(db.update_client(c))
                    JOptionPane.showMessageDialog(this, "Client mis a jour avec succès !");
                else
                    JOptionPane.showMessageDialog(this, "Erreur lors de la mise a jour du client.", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
                } catch(SQLException e){
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Erreur lors de la recuperation des donnees du client","Erreur", JOptionPane.ERROR_MESSAGE);
                    
                }}
        
        }
    }//GEN-LAST:event_jButton_editActionPerformed

    private void jButton_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_removeActionPerformed
        DB_Connexion db=new DB_Connexion();
        String cin = jTextField5.getText();
        String nom = jTextField1.getText();
        String prenom = jTextField2.getText();
        String tel = jTextField3.getText();
        String email = jTextField4.getText();
        java.util.Date date_naissance = jDateChooser1.getDate();
    
    // Vérifier que l'email est valide
    /*if (!isValidEmail(email)) {
        jLabel_err_mail.setText("Adresse email invalide."); // Afficher le message d'erreur
        jLabel_err_mail.setVisible(true);
        //return; // Arrêter l'exécution si l'email est invalide
    }*/
        if (cin.equals(""))
            JOptionPane.showMessageDialog(this, "Erreur lors de la suppression du client.Le champ cin_client est obligatoire", "Erreur", JOptionPane.ERROR_MESSAGE);
        else{
            Client c =new Client(nom,prenom,cin,tel,email,date_naissance);
            if (db.remove_client(c))
                JOptionPane.showMessageDialog(this, "Client supprimé avec succès !");
            else
               JOptionPane.showMessageDialog(this, "Erreur lors de la suppression du client.Veuillez verifier les données", "Erreur", JOptionPane.ERROR_MESSAGE);
            
        }

    }//GEN-LAST:event_jButton_removeActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jLabelbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelbackMouseClicked
        Dashboard da =new Dashboard();
        da.setVisible(true);
        //hide
        this.dispose();
    }//GEN-LAST:event_jLabelbackMouseClicked

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        char c =evt.getKeyChar();
        if(Character.isLetter(c) || c==' '||Character.isDigit(c) || c=='@'|| c=='_'||c=='.' || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getKeyCode() == KeyEvent.VK_SHIFT || evt.getKeyCode() == KeyEvent.VK_CAPS_LOCK){
            jLabel_err_mail.setVisible(false);
            jTextField4.setEditable(true);
        }
        else{
            jTextField4.setEditable(false);
            jLabel_err_mail.setVisible(true);
        }
    }//GEN-LAST:event_jTextField4KeyPressed
    
    private boolean isValidEmail(String email) {
        // Regex pour valider une adresse e-mail
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        return email.matches(emailRegex);
    }
    
    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        char c =evt.getKeyChar();
        if(Character.isLetter(c) || c==' '|| evt.getKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getKeyCode() == KeyEvent.VK_SHIFT || evt.getKeyCode() == KeyEvent.VK_CAPS_LOCK){
            jLabel_err_prenom.setVisible(false);
            jTextField2.setEditable(true);
        }
        else{
            jTextField2.setEditable(false);
            jLabel_err_prenom.setVisible(true);
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        char c =evt.getKeyChar();
        if(Character.isLetter(c) || c==' '|| evt.getKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getKeyCode() == KeyEvent.VK_SHIFT || evt.getKeyCode() == KeyEvent.VK_CAPS_LOCK){
            jLabel_err_nom.setVisible(false);
            jTextField1.setEditable(true);
        }
        else{
            jTextField1.setEditable(false);
            jLabel_err_nom.setVisible(true);
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        char c =evt.getKeyChar();
        if(Character.isDigit(c) || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getKeyCode() == KeyEvent.VK_SHIFT || evt.getKeyCode() == KeyEvent.VK_CAPS_LOCK){
            jLabel_err_cin.setVisible(false);
            jTextField5.setEditable(true);
        }
        else{
            jTextField5.setEditable(false);
            jLabel_err_cin.setVisible(true);

        }
    }//GEN-LAST:event_jTextField5KeyPressed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        char c =evt.getKeyChar();
        if(Character.isDigit(c) || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getKeyCode() == KeyEvent.VK_SHIFT || evt.getKeyCode() == KeyEvent.VK_CAPS_LOCK){
            jLabel_err_tel.setVisible(false);
            jTextField3.setEditable(true);
        }
        else{
            jTextField3.setEditable(false);
            jLabel_err_tel.setVisible(true);
        }
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // Obtenir la ligne sélectionnée
    int selectedRow = jTable2.getSelectedRow();
    if (selectedRow != -1) {
        // Obtenir les données de la ligne sélectionnée
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        String cin = (String) model.getValueAt(selectedRow, 0); // CIN
        String nom = (String) model.getValueAt(selectedRow, 1); // Nom
        String prenom = (String) model.getValueAt(selectedRow, 2); // Prénom
        String tel = (String) model.getValueAt(selectedRow, 3); // Téléphone
        String email = (String) model.getValueAt(selectedRow, 4); // Email
        Date date_naissance = (Date) model.getValueAt(selectedRow, 5); // Date de naissance

        // Remplir les champs de texte
        jTextField5.setText(cin);
        jTextField1.setText(nom);
        jTextField2.setText(prenom);
        jTextField3.setText(tel);
        jTextField4.setText(email);
        jDateChooser1.setDate(date_naissance);
    }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
        jLabel_err_cin.setVisible(false);
        jLabel_err_prenom.setVisible(false);
        jLabel_err_nom.setVisible(false);
        jLabel_err_tel.setVisible(false);
        jLabel_err_mail.setVisible(false);
    }//GEN-LAST:event_jTextField5MouseClicked

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        jLabel_err_cin.setVisible(false);
        jLabel_err_prenom.setVisible(false);
        jLabel_err_nom.setVisible(false);
        jLabel_err_tel.setVisible(false);
        jLabel_err_mail.setVisible(false);
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        jLabel_err_cin.setVisible(false);
        jLabel_err_prenom.setVisible(false);
        jLabel_err_nom.setVisible(false);
        jLabel_err_tel.setVisible(false);
        jLabel_err_mail.setVisible(false);
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
        jLabel_err_cin.setVisible(false);
        jLabel_err_prenom.setVisible(false);
        jLabel_err_nom.setVisible(false);
        jLabel_err_tel.setVisible(false);
        jLabel_err_mail.setVisible(false);
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        jLabel_err_cin.setVisible(false);
        jLabel_err_prenom.setVisible(false);
        jLabel_err_nom.setVisible(false);
        jLabel_err_tel.setVisible(false);
        jLabel_err_mail.setVisible(false);
    }//GEN-LAST:event_jTextField4MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestion_clients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_add;
    private javax.swing.JButton jButton_clear;
    private javax.swing.JButton jButton_edit;
    private javax.swing.JButton jButton_refresh;
    private javax.swing.JButton jButton_remove;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_bg;
    private static javax.swing.JLabel jLabel_err_cin;
    private javax.swing.JLabel jLabel_err_mail;
    private javax.swing.JLabel jLabel_err_nom;
    private javax.swing.JLabel jLabel_err_prenom;
    private javax.swing.JLabel jLabel_err_tel;
    private javax.swing.JLabel jLabel_logo;
    private javax.swing.JLabel jLabelback;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
