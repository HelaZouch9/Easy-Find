
package easyfind;

import easyfind.Dashboard;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import source.*;
import source.DB_Connexion;

public class appartementrecherche extends javax.swing.JFrame {
    private Connection connection;
    
    public appartementrecherche() {
        initComponents();
        jRadioButton3.setActionCommand("non");
        jRadioButton4.setActionCommand("oui");
        jLabel_err_loca.setVisible(false);
        jLabel_err_loca1.setVisible(false);
        jLabel_err_loca2.setVisible(false);
    }
    private void connectToDatabase() {
        /*try {
            // Charger le driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Créer la connexion
            String url = "jdbc:mysql://localhost:3306/immobilier";
            String user = "root";
            String password = "W7301@jqir#";
            connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erreur de connexion à la base de données", "Erreur", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }*/
  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        id = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jTextField10 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jSpinner1 = new com.toedter.components.JSpinField();
        jSpinner5 = new com.toedter.components.JSpinField();
        jLabel_err_loca = new javax.swing.JLabel();
        jLabel_err_loca1 = new javax.swing.JLabel();
        jLabel_err_loca2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 102, 150));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setViewportView(jTable1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_app", "cin_prop", "nb_piece", "nb_personne", "type_loc", "gouv", "prix", "meuble"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 540, 390));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 570, 430));

        jPanel4.setBackground(new java.awt.Color(0, 102, 150));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("X");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 10, 20, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fleche1.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

        jLabel2.setBackground(new java.awt.Color(55, 67, 117));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Appartements");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        id.setText("Id appartement ");
        jPanel2.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 130, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Nombre de piece ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 140, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Prix ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 60, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Gouvernorat ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 120, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "choisir", "Tunis", "Ben Arous", "Manouba", "Ariana", "Bizerte", "Nabeul", "Siliana", "Beja", "El Kef", "Jandouba", "Zaghouen", "Sousse", "Monastir", "Mahdia", "Sfax", "Kairouan", "Kasserine", "Sidi Bouzid", "Touzeur", "Kebili", "Gafsa", "Mednine", "Tatawine", "Gebes" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 120, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Type de location");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 140, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "choisir", "Par nuitée", "Par mois" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 120, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Nombre maximal de personnes");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 220, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Meublé ?");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 90, -1));

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("Non");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("Oui");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jTextField10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField10.setName(""); // NOI18N
        jTextField10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField10MouseClicked(evt);
            }
        });
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField10KeyPressed(evt);
            }
        });
        jPanel2.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 130, 20));

        jLabel21.setText("______________________________");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 150));
        jButton1.setText("l'appartement le plus demandé");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 290, 40));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 150));
        jButton2.setText("Research");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 120, 40));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 150));
        jButton3.setText("Reset");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 120, 40));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("CIN_proprietaire");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 140, -1));

        jTextField13.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField13MouseClicked(evt);
            }
        });
        jTextField13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField13KeyPressed(evt);
            }
        });
        jPanel2.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 130, -1));

        jLabel25.setText("________________________________");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        jTextField14.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField14MouseClicked(evt);
            }
        });
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jTextField14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField14KeyPressed(evt);
            }
        });
        jPanel2.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 130, -1));

        jLabel26.setText("________________________________");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, -1));

        jSpinner1.setMaximum(10);
        jSpinner1.setMinimum(0);
        jPanel2.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 70, 30));

        jSpinner5.setMaximum(5);
        jSpinner5.setMinimum(0);
        jPanel2.add(jSpinner5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 70, 30));

        jLabel_err_loca.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_err_loca.setText("Veuillez entrer uniquement des chiffres.");
        jPanel2.add(jLabel_err_loca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 210, 20));

        jLabel_err_loca1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_err_loca1.setText("Veuillez entrer uniquement des chiffres.");
        jPanel2.add(jLabel_err_loca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 210, 20));

        jLabel_err_loca2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_err_loca2.setText("Veuillez entrer uniquement des chiffres.");
        jPanel2.add(jLabel_err_loca2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 210, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 490, 470));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 580));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/mini_logo.png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 500, 560, 590));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bg.jpg"))); // NOI18N
        jLabel22.setText("jLabel30");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2190, 2590));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextField10.setText("");
        jTextField13.setText("");
        jTextField14.setText("");
        jSpinner1.setValue(0);
        jSpinner5.setValue(0);
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        buttonGroup2.clearSelection(); 
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); // Récupère le modèle existant de votre JTable
        model.setRowCount(0);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        DB_Connexion db = new DB_Connexion();
        String id_appart = jTextField10.getText();
        String cin_prop = jTextField13.getText();
        String prix = jTextField14.getText();
        int nb_piece1 = (int) jSpinner5.getValue();
        String nb_piece =Integer.toString(nb_piece1);
        int max_personne1 = (int) jSpinner1.getValue();
        String max_personne  =Integer.toString(max_personne1);
        String type = (String) jComboBox2.getSelectedItem();
        String gouv = (String) jComboBox1.getSelectedItem();
        String selectedValue = null;
        if (buttonGroup2.getSelection() != null) {
            selectedValue = buttonGroup2.getSelection().getActionCommand();
        }
        boolean meuble = "oui".equals(selectedValue);
        if ((id_appart.isEmpty())&&(prix.isEmpty())&&(nb_piece.equals("0"))&&(max_personne.equals("0"))&&(cin_prop.isEmpty())){
            JOptionPane.showMessageDialog(this,"Veuillez remplir au moins un champ.", "Erreur",JOptionPane.ERROR_MESSAGE);}
        else{
        Appartement a = new Appartement(id_appart, nb_piece, gouv, prix, meuble, type, max_personne, cin_prop,selectedValue);
        ResultSet rs = db.affiche_appart(a);

        try {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        while (rs.next()) {
            Object[] rowData = {
                rs.getString("id_app"),
                rs.getString("cin_propri"),
                rs.getInt("nbre_piece"),
                rs.getInt("nbre_personne_max"),
                rs.getString("type_location"),
                rs.getString("gouvernorat"),
                rs.getString("prix"),
                rs.getBoolean("meublé")
            };
            model.addRow(rowData);
            //System.out.println("ghhhhhh");
        }

        if (model.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "NO_DATA_FOUND");
        }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erreur SQL: " + e.getMessage());
        }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
        DB_Connexion db= new DB_Connexion();
        
        // Exécuter la requête SQL
        ResultSet rs = db.appartement_demande();

        // Vérifier s'il y a un résultat
        if (rs.next()) {
            int id_app = rs.getInt("id_app");
            int nbLocations = rs.getInt("nombre_de_locations");

            JOptionPane.showMessageDialog(this, "L'appartement le plus demandé est celui dont l'id est " + id_app + " ayant effectué " + nbLocations + " locations.", "Appartement le plus demandé", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Aucun appartement demandé", "Appartement le plus demandé", JOptionPane.INFORMATION_MESSAGE);
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Erreur lors de la recherche de l'appartement le plus demandé.", "Erreur", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Dashboard da =new Dashboard();
        da.setVisible(true);
        //hide
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jTextField10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField10MouseClicked
        jLabel_err_loca.setVisible(false);
        jLabel_err_loca1.setVisible(false);
        jLabel_err_loca2.setVisible(false);
    }//GEN-LAST:event_jTextField10MouseClicked

    private void jTextField13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField13MouseClicked
        jLabel_err_loca.setVisible(false);
        jLabel_err_loca1.setVisible(false);
        jLabel_err_loca2.setVisible(false);
    }//GEN-LAST:event_jTextField13MouseClicked

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField14MouseClicked
        jLabel_err_loca.setVisible(false);
        jLabel_err_loca1.setVisible(false);
        jLabel_err_loca2.setVisible(false);
    }//GEN-LAST:event_jTextField14MouseClicked

    private void jTextField10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyPressed
        char c =evt.getKeyChar();
        if(Character.isDigit(c) || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE){
            jLabel_err_loca.setVisible(false);
            jTextField10.setEditable(true);
        }
        else{
            jTextField10.setEditable(false);
            jLabel_err_loca.setVisible(true);
        }
    }//GEN-LAST:event_jTextField10KeyPressed

    private void jTextField13KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField13KeyPressed
        char c =evt.getKeyChar();
        if(Character.isDigit(c) || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE){
            jLabel_err_loca1.setVisible(false);
            jTextField13.setEditable(true);
        }
        else{
            jTextField13.setEditable(false);
            jLabel_err_loca1.setVisible(true);
        }
    }//GEN-LAST:event_jTextField13KeyPressed

    private void jTextField14KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField14KeyPressed
        char c =evt.getKeyChar();
        if(Character.isDigit(c) || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE ||c=='.'){
            jLabel_err_loca2.setVisible(false);
            jTextField14.setEditable(true);
        }
        else{
            jTextField14.setEditable(false);
            jLabel_err_loca2.setVisible(true);
        }
    }//GEN-LAST:event_jTextField14KeyPressed


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
            java.util.logging.Logger.getLogger(appartementrecherche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(appartementrecherche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(appartementrecherche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(appartementrecherche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new appartementrecherche().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private static javax.swing.JLabel jLabel_err_loca;
    private static javax.swing.JLabel jLabel_err_loca1;
    private static javax.swing.JLabel jLabel_err_loca2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.components.JSpinField jSpinner1;
    private com.toedter.components.JSpinField jSpinner5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    // End of variables declaration//GEN-END:variables
}
