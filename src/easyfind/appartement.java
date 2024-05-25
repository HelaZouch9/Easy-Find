
package easyfind;

import easyfind.Dashboard;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import source.Appartement;
import source.DB_Connexion;

/**
 *
 * @author linda
 */
public class appartement extends javax.swing.JFrame {

    private Connection connection;
    public appartement() {
        initComponents();
        jScrollPane1.setViewportView(jTable2);
        jRadioButton3.setActionCommand("non");
        jRadioButton4.setActionCommand("oui");
        jRadioButton2.setActionCommand("non");
        jRadioButton1.setActionCommand("oui");
        jLabel_err_loca.setVisible(false);
        jLabel_err_loca1.setVisible(false);
        jLabel_err_loca2.setVisible(false);
        jLabel_err_loca3.setVisible(false);
        jLabel_err_loca4.setVisible(false);
        jLabel_err_loca5.setVisible(false);
        jLabel_err_loca6.setVisible(false);
        jLabel_err_rue.setVisible(false);
        
    }
    private void connectToDatabase() {
        try {
            // Charger le driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Créer la connexion
            String url = "jdbc:mysql://localhost:3307/immobilier";
            String user = "root";
            String password = "A4892@hela#2024";
            connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erreur de connexion à la base de données", "Erreur", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jTextField17 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel_err_loca = new javax.swing.JLabel();
        jLabel_err_loca1 = new javax.swing.JLabel();
        jLabel_err_loca2 = new javax.swing.JLabel();
        jLabel_err_loca3 = new javax.swing.JLabel();
        jLabel_err_loca4 = new javax.swing.JLabel();
        jLabel_err_loca5 = new javax.swing.JLabel();
        jLabel_err_loca6 = new javax.swing.JLabel();
        jLabel_err_rue = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1118, 575));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Nos appartements");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 250, 50));

        id.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        id.setText("Id appartement ");
        jPanel2.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 100, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Numero d'appartement ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Nombre de piece ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 110, 20));

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel());
        jSpinner1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSpinner1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jSpinner1PropertyChange(evt);
            }
        });
        jPanel2.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 70, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Prix ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 30, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Gouvernorat ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Code_postal ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 80, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Rue ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 50, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "choisir", "Tunis", "Ben Arous", "Manouba", "Ariana", "Bizerte", "Nabeul", "Siliana", "Beja", "El Kef", "Jandouba", "Zaghouen", "Sousse", "Monastir", "Mahdia", "Sfax", "Kairouan", "Kasserine", "Sidi Bouzid", "Touzeur", "Kebili", "Gafsa", "Mednine", "Tatawine", "Gebes" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 120, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Type de location");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 110, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "choisir", "Par nuitée", "Par mois" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 120, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Nombre maximal de personnes");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 190, -1));

        jSpinner4.setModel(new javax.swing.SpinnerNumberModel());
        jSpinner4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSpinner4.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jSpinner4PropertyChange(evt);
            }
        });
        jPanel2.add(jSpinner4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 70, 30));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Oui");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Non");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Etat");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "choisir", "libre", "occupé" }));
        jPanel2.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Meublé ?");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Disponibilité");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("Non");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, -1));

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("Oui");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Surface");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 110, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("CIN_proprietaire");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 110, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Pénalité");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 110, -1));

        jTextField9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField9MouseClicked(evt);
            }
        });
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField9KeyPressed(evt);
            }
        });
        jPanel2.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 110, -1));

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
        jPanel2.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 130, 20));

        jTextField11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField11MouseClicked(evt);
            }
        });
        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField11KeyPressed(evt);
            }
        });
        jPanel2.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 130, 20));

        jTextField12.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField12MouseClicked(evt);
            }
        });
        jTextField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField12KeyPressed(evt);
            }
        });
        jPanel2.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 130, -1));

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
        jPanel2.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 130, -1));

        jTextField14.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField14MouseClicked(evt);
            }
        });
        jTextField14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField14KeyPressed(evt);
            }
        });
        jPanel2.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 130, 20));

        jLabel19.setText("_____________________");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        jLabel20.setText("_____________________");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        jLabel24.setText("_____________________");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        jLabel25.setText("_____________________");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        jLabel26.setText("_____________________");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, -1, -1));

        jLabel27.setText("_____________________");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel29.setText("_____________________");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, -1));

        jTextField15.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField15MouseClicked(evt);
            }
        });
        jTextField15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField15KeyPressed(evt);
            }
        });
        jPanel2.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 130, 20));

        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton12.setForeground(new java.awt.Color(0, 102, 150));
        jButton12.setText("Add");
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 100, 40));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 150));
        jButton2.setText("Edit");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 100, 40));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 150));
        jButton3.setText("Refresh");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 100, 40));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 102, 150));
        jButton4.setText("Remove");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 100, 40));

        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 102, 150));
        jButton10.setText("Clear");
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 100, 40));

        jTextField17.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField17MouseClicked(evt);
            }
        });
        jTextField17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField17KeyPressed(evt);
            }
        });
        jPanel2.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 130, 20));

        jLabel28.setText("_____________________");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, -1, -1));

        jLabel_err_loca.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_err_loca.setText("Veuillez entrer uniquement des chiffres.");
        jPanel2.add(jLabel_err_loca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 210, 20));

        jLabel_err_loca1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_err_loca1.setText("Veuillez entrer uniquement des chiffres.");
        jPanel2.add(jLabel_err_loca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 210, 20));

        jLabel_err_loca2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_err_loca2.setText("Veuillez entrer uniquement des chiffres.");
        jPanel2.add(jLabel_err_loca2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 210, 20));

        jLabel_err_loca3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_err_loca3.setText("Veuillez entrer uniquement des chiffres.");
        jPanel2.add(jLabel_err_loca3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 210, 20));

        jLabel_err_loca4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_err_loca4.setText("Veuillez entrer uniquement des chiffres.");
        jPanel2.add(jLabel_err_loca4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 210, 20));

        jLabel_err_loca5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_err_loca5.setText("Veuillez entrer uniquement des chiffres.");
        jPanel2.add(jLabel_err_loca5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 210, 20));

        jLabel_err_loca6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_err_loca6.setText("Veuillez entrer uniquement des chiffres.");
        jPanel2.add(jLabel_err_loca6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 210, 20));

        jLabel_err_rue.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_err_rue.setText("Veuillez entrer uniquement des lettres.");
        jPanel2.add(jLabel_err_rue, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 220, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 560, 510));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fleche1.png"))); // NOI18N
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, 40));

        jPanel3.setBackground(new java.awt.Color(0, 102, 150));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_app", "num", "nb_piece", "surface", "rue", "code_postal", "etat", "type", "gouv", "dispo", "max_pers", "meublé", "cin_prop", "penalite", "prix"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.String.class, java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable2);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, 510, 420));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 530, 450));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("X");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel7MouseReleased(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, 30, 40));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/mini_logo.png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 480, 560, 590));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bg.jpg"))); // NOI18N
        jLabel22.setText("jLabel30");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2190, 2590));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jSpinner1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jSpinner1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jSpinner1PropertyChange

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jSpinner4PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jSpinner4PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jSpinner4PropertyChange

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseReleased

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        DB_Connexion db = new DB_Connexion();
        String id_app = jTextField10.getText().trim();
        String penaliteText = jTextField14.getText().trim();
        String prix = jTextField17.getText().trim();
        String surface = jTextField9.getText().trim();
        String rue = jTextField12.getText().trim();
        String code_postal = jTextField11.getText().trim();
        String numText = jTextField15.getText().trim();
        String nb_pieceText = String.valueOf(jSpinner4.getValue());
        String nb_personne_maxText = String.valueOf(jSpinner1.getValue());
        String type = (String) jComboBox2.getSelectedItem();
        String gouvernorat = (String) jComboBox1.getSelectedItem();
        String etat = (String) jComboBox3.getSelectedItem();
        String selectedValue = null;
        if (buttonGroup2.getSelection() != null) {
            selectedValue = buttonGroup2.getSelection().getActionCommand();
        }
        boolean meuble = "oui".equals(selectedValue);
        String selectedValue1 = null;
        if (buttonGroup1.getSelection() != null) {
            selectedValue1 = buttonGroup1.getSelection().getActionCommand();
        }
        boolean disponibilite = "oui".equals(selectedValue1);
        String cin_prop = jTextField13.getText().trim();

        // Vérifier les champs vides
        if (id_app.isEmpty() || penaliteText.isEmpty() || prix.isEmpty() || surface.isEmpty() || rue.isEmpty() || code_postal.isEmpty() || numText.isEmpty() || nb_pieceText.isEmpty() || nb_personne_maxText.isEmpty() || cin_prop.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Veuillez remplir tous les champs.", "Erreur", JOptionPane.ERROR_MESSAGE);
            return; // Arrêter l'exécution de la méthode
        }

        double penalite = Double.parseDouble(penaliteText);
        int num = Integer.parseInt(numText);
        int nb_piece = Integer.parseInt(nb_pieceText);
        int nb_personne_max = Integer.parseInt(nb_personne_maxText); 
        
        try {
            String url = "jdbc:mysql://localhost:3307/immobilier";
            String user = "root";
            String password = "A4892@hela#2024";
            connection = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = connection.prepareStatement("INSERT INTO Appartement (id_app,surface, nbre_piece, gouvernorat, num, rue, code_postal, prix, meublé, type_location, nbre_personne_max, penalite,etat, disponibilite,cin_propri) VALUES (?, ?, ?, ?, ?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, id_app);
            ps.setString(2, surface);
            ps.setInt(3, nb_piece);
            ps.setString(4, gouvernorat);
            ps.setInt(5, num);
            ps.setString(6, rue);
            ps.setString(7, code_postal);
            ps.setString(8, prix);
            ps.setBoolean(9, meuble);
            ps.setString(10, type);
            ps.setInt(11, nb_personne_max);
            ps.setDouble(12, penalite);
            ps.setString(13, etat);
            ps.setBoolean(14, disponibilite);
            ps.setString(15, cin_prop); 
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Appartement ajouté avec succès !");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erreur lors de l'ajout de l'appartement.", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
       

        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       DB_Connexion db = new DB_Connexion();
       String id_app = jTextField10.getText().trim();
       String penaliteText = jTextField14.getText().trim();
       String prix = jTextField17.getText().trim();
       String surface = jTextField9.getText().trim();
       String rue = jTextField12.getText().trim();
       String code_postal = jTextField11.getText().trim();
       String numText = jTextField15.getText().trim();
       String nb_pieceText = String.valueOf(jSpinner4.getValue());
       String nb_personne_maxText = String.valueOf(jSpinner1.getValue());
       String type = (String) jComboBox2.getSelectedItem();
       String gouvernorat = (String) jComboBox1.getSelectedItem();
       String etat = (String) jComboBox3.getSelectedItem();
       String selectedValue = null;
       String cin_prop = jTextField13.getText().trim();
       if (buttonGroup2.getSelection() != null) {
            selectedValue = buttonGroup2.getSelection().getActionCommand();
        }
        boolean meuble = "oui".equals(selectedValue);

        // Mettre à jour la valeur de meuble en fonction de la sélection des boutons radio
        if (jRadioButton3.isSelected()) {
            meuble = false; // Si le bouton "Non" est sélectionné, meuble est faux
        }
        if (jRadioButton4.isSelected()) {
            meuble = true; // Si le bouton "Oui" est sélectionné, meuble est vrai
        }

        String selectedValue1 = null;
        if (buttonGroup1.getSelection() != null) {
            selectedValue1 = buttonGroup1.getSelection().getActionCommand();
        }
        boolean disponibilite = "oui".equals(selectedValue1);

       // Mettre à jour l'objet Appartement avec les nouvelles valeurs
       Appartement a = new Appartement(id_app, surface, nb_pieceText, gouvernorat, numText, rue, code_postal, prix, meuble, type, nb_personne_maxText, penaliteText, disponibilite, cin_prop, etat, selectedValue, selectedValue1);

       if (id_app.isEmpty()) {
           JOptionPane.showMessageDialog(this, "L'ID de l'appartement est obligatoire pour la mise à jour.", "Erreur", JOptionPane.ERROR_MESSAGE);
       } else {
           if (penaliteText.isEmpty() && prix.isEmpty() && surface.isEmpty() && rue.isEmpty() && code_postal.isEmpty() && numText.isEmpty() && nb_pieceText.isEmpty() && nb_personne_maxText.isEmpty() && cin_prop.isEmpty()) {
               JOptionPane.showMessageDialog(this, "Veuillez remplir au moins un champ pour la mise à jour.", "Erreur", JOptionPane.ERROR_MESSAGE);
           } else {
               if (db.update_appart(a)) {
                   JOptionPane.showMessageDialog(this, "Appartement mis à jour.");
               } else {
                   JOptionPane.showMessageDialog(this, "Erreur lors de la mise à jour.", "Erreur", JOptionPane.ERROR_MESSAGE);
               }
           }
       }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
        // Créer une requête SQL pour sélectionner tous les clients
        String sql = "SELECT id_app, num, nbre_piece, surface, rue,code_postal,etat,type_location,gouvernorat,disponibilite,nbre_personne_max,meublé,cin_propri,penalite,prix FROM Appartement";
        String url = "jdbc:mysql://localhost:3307/immobilier";
        String user = "root";
        String password = "A4892@hela#2024";
        connection = DriverManager.getConnection(url, user, password);
        // Préparer la déclaration SQL
        PreparedStatement ps = connection.prepareStatement(sql);
        
        // Exécuter la requête SQL
        ResultSet rs = ps.executeQuery();
        
        // Créer un modèle de table pour stocker les données clients
        DefaultTableModel model = new DefaultTableModel();
        
        // Ajouter les colonnes au modèle de table
        model.addColumn("id_app");
        model.addColumn("num");
        model.addColumn("nb_piece");
        model.addColumn("surface");
        model.addColumn("rue");
        model.addColumn("code_postal");
        model.addColumn("etat");
        model.addColumn("type");
        model.addColumn("gouv");
        model.addColumn("dispo");
        model.addColumn("max_pers");
        model.addColumn("meublé");
        model.addColumn("cin_prop");
        model.addColumn("penalite");
        model.addColumn("prix");
        
        // Parcourir les résultats de la requête et ajouter les données au modèle de table
        while (rs.next()) {
            String id_app = rs.getString("id_app");
            int num = rs.getInt("num");
            int nbre_piece = rs.getInt("nbre_piece");
            int surface = rs.getInt("surface");
            String rue = rs.getString("rue");
            String code_postal = rs.getString("code_postal");
            String etat = rs.getString("etat");
            String type_location = rs.getString("type_location");
            String gouvernorat = rs.getString("gouvernorat");
            boolean disponibilite = rs.getBoolean("disponibilite");
            int nbre_personne_max = rs.getInt("nbre_personne_max");
            boolean meuble = rs.getBoolean("meublé");
            String cin_propri = rs.getString("cin_propri");
            double penalite = rs.getDouble("penalite");
            double prix = rs.getDouble("prix");

            model.addRow(new Object[]{id_app, num, nbre_piece, surface, rue, code_postal, etat, type_location, gouvernorat, disponibilite, nbre_personne_max, meuble, cin_propri, penalite, prix});
        }
        
        // Afficher les données dans le jTable2
        jTable2.setModel(model);
        
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Erreur lors du rafraîchissement de la liste des appartements.", "Erreur", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jTextField10.setText("");  
        jTextField9.setText("");   
        jTextField14.setText("");  
        jTextField17.setText("");  
        jTextField12.setText("");  
        jTextField11.setText("");  
        jTextField15.setText("");  
        jSpinner4.setValue(0);     
        jSpinner1.setValue(0);     
        jComboBox2.setSelectedIndex(0);  
        jComboBox1.setSelectedIndex(0);  
        jComboBox3.setSelectedIndex(0);  
        buttonGroup2.clearSelection();   
        buttonGroup1.clearSelection();  
        jTextField13.setText("");
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel(); // Récupère le modèle existant de votre JTable
        model.setRowCount(0);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String id_app = jTextField10.getText();

        try {
            String url = "jdbc:mysql://localhost:3307/immobilier";
            String user = "root";
            String password = "A4892@hela#2024";
            connection = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = connection.prepareStatement("DELETE FROM Appartement WHERE id_app=?");
            ps.setString(1, id_app);
            ps.executeUpdate();
            if (id_app.isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Veuillez donner l'id de l'appartement à supprimer.", "Erreur", JOptionPane.ERROR_MESSAGE);
            }else
            JOptionPane.showMessageDialog(this, "Appartement supprimé avec succès !");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erreur lors de la suppression de l'appartement.", "Erreur", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        Dashboard da =new Dashboard();
        da.setVisible(true);
        //hide
        this.dispose();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jTextField10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField10MouseClicked
        jLabel_err_loca.setVisible(false);
        jLabel_err_loca1.setVisible(false);
        jLabel_err_loca2.setVisible(false);
        jLabel_err_loca3.setVisible(false);
        jLabel_err_loca4.setVisible(false);
        jLabel_err_loca5.setVisible(false);
        jLabel_err_loca6.setVisible(false);
        jLabel_err_rue.setVisible(false);
    }//GEN-LAST:event_jTextField10MouseClicked

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

    private void jTextField15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField15MouseClicked
        jLabel_err_loca.setVisible(false);
        jLabel_err_loca1.setVisible(false);
        jLabel_err_loca2.setVisible(false);
        jLabel_err_loca3.setVisible(false);
        jLabel_err_loca4.setVisible(false);
        jLabel_err_loca5.setVisible(false);
        jLabel_err_loca6.setVisible(false);
        jLabel_err_rue.setVisible(false);
    }//GEN-LAST:event_jTextField15MouseClicked

    private void jTextField15KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField15KeyPressed
        char c =evt.getKeyChar();
        if(Character.isDigit(c) || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE){
            jLabel_err_loca1.setVisible(false);
            jTextField15.setEditable(true);
        }
        else{
            jTextField15.setEditable(false);
            jLabel_err_loca1.setVisible(true);
        }
    }//GEN-LAST:event_jTextField15KeyPressed

    private void jTextField9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField9MouseClicked
        jLabel_err_loca.setVisible(false);
        jLabel_err_loca1.setVisible(false);
        jLabel_err_loca2.setVisible(false);
        jLabel_err_loca3.setVisible(false);
        jLabel_err_loca4.setVisible(false);
        jLabel_err_loca5.setVisible(false);
        jLabel_err_loca6.setVisible(false);
        jLabel_err_rue.setVisible(false);
    }//GEN-LAST:event_jTextField9MouseClicked

    private void jTextField9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyPressed
        char c =evt.getKeyChar();
        if(Character.isDigit(c) || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE ||c=='.'){
            jLabel_err_loca2.setVisible(false);
            jTextField9.setEditable(true);
        }
        else{
            jTextField9.setEditable(false);
            jLabel_err_loca2.setVisible(true);
        }
    }//GEN-LAST:event_jTextField9KeyPressed

    private void jTextField11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField11MouseClicked
        jLabel_err_loca.setVisible(false);
        jLabel_err_loca1.setVisible(false);
        jLabel_err_loca2.setVisible(false);
        jLabel_err_loca3.setVisible(false);
        jLabel_err_loca4.setVisible(false);
        jLabel_err_loca5.setVisible(false);
        jLabel_err_loca6.setVisible(false);
        jLabel_err_rue.setVisible(false);
    }//GEN-LAST:event_jTextField11MouseClicked

    private void jTextField11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyPressed
        char c =evt.getKeyChar();
        if(Character.isDigit(c) || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE){
            jLabel_err_loca3.setVisible(false);
            jTextField11.setEditable(true);
        }
        else{
            jTextField11.setEditable(false);
            jLabel_err_loca3.setVisible(true);
        }
    }//GEN-LAST:event_jTextField11KeyPressed

    private void jTextField13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField13MouseClicked
        jLabel_err_loca.setVisible(false);
        jLabel_err_loca1.setVisible(false);
        jLabel_err_loca2.setVisible(false);
        jLabel_err_loca3.setVisible(false);
        jLabel_err_loca4.setVisible(false);
        jLabel_err_loca5.setVisible(false);
        jLabel_err_loca6.setVisible(false);
        jLabel_err_rue.setVisible(false);
    }//GEN-LAST:event_jTextField13MouseClicked

    private void jTextField13KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField13KeyPressed
        char c =evt.getKeyChar();
        if(Character.isDigit(c) || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE){
            jLabel_err_loca4.setVisible(false);
            jTextField13.setEditable(true);
        }
        else{
            jTextField13.setEditable(false);
            jLabel_err_loca4.setVisible(true);
        }
    }//GEN-LAST:event_jTextField13KeyPressed

    private void jTextField14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField14MouseClicked
        jLabel_err_loca.setVisible(false);
        jLabel_err_loca1.setVisible(false);
        jLabel_err_loca2.setVisible(false);
        jLabel_err_loca3.setVisible(false);
        jLabel_err_loca4.setVisible(false);
        jLabel_err_loca5.setVisible(false);
        jLabel_err_loca6.setVisible(false);
        jLabel_err_rue.setVisible(false);
    }//GEN-LAST:event_jTextField14MouseClicked

    private void jTextField14KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField14KeyPressed
        char c =evt.getKeyChar();
        if(Character.isDigit(c) || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE ||c=='.'){
            jLabel_err_loca5.setVisible(false);
            jTextField14.setEditable(true);
        }
        else{
            jTextField14.setEditable(false);
            jLabel_err_loca5.setVisible(true);
        }
    }//GEN-LAST:event_jTextField14KeyPressed

    private void jTextField17KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField17KeyPressed
        char c =evt.getKeyChar();
        if(Character.isDigit(c) || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE ||c=='.'){
            jLabel_err_loca6.setVisible(false);
            jTextField17.setEditable(true);
        }
        else{
            jTextField17.setEditable(false);
            jLabel_err_loca6.setVisible(true);
        }
    }//GEN-LAST:event_jTextField17KeyPressed
      
    private void jTextField17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField17MouseClicked
        jLabel_err_loca.setVisible(false);
        jLabel_err_loca1.setVisible(false);
        jLabel_err_loca2.setVisible(false);
        jLabel_err_loca3.setVisible(false);
        jLabel_err_loca4.setVisible(false);
        jLabel_err_loca5.setVisible(false);
        jLabel_err_loca6.setVisible(false);
        jLabel_err_rue.setVisible(false);
    }//GEN-LAST:event_jTextField17MouseClicked

    private void jTextField12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyPressed
        char c =evt.getKeyChar();
        if(Character.isLetter(c) || c==' '|| evt.getKeyCode() == KeyEvent.VK_BACK_SPACE ){
            jLabel_err_rue.setVisible(false);
            jTextField17.setEditable(true);
        }
        else{
            jTextField17.setEditable(false);
            jLabel_err_rue.setVisible(true);
        }
    }//GEN-LAST:event_jTextField12KeyPressed

    private void jTextField12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField12MouseClicked
        jLabel_err_loca.setVisible(false);
        jLabel_err_loca1.setVisible(false);
        jLabel_err_loca2.setVisible(false);
        jLabel_err_loca3.setVisible(false);
        jLabel_err_loca4.setVisible(false);
        jLabel_err_loca5.setVisible(false);
        jLabel_err_loca6.setVisible(false);
        jLabel_err_rue.setVisible(false);
    }//GEN-LAST:event_jTextField12MouseClicked
    public int getGovernorateCode(String governorate) {
        switch (governorate.toLowerCase()) {
            case "tunis":
                return 1;
            case "ariana":
                return 2;
            case "ben arous":
                return 3;
            case "manouba":
                return 4;
            case "nabeul":
                return 5;
            case "zaghouan":
                return 6;
            case "bizerte":
                return 7;
            case "beja":
                return 8;
            case "jendouba":
                return 9;
            case "kef":
                return 10;
            case "siliana":
                return 11;
            case "sousse":
                return 12;
            case "monastir":
                return 13;
            case "mahdia":
                return 14;
            case "sfax":
                return 15;
            case "kairouan":
                return 16;
            case "kasserine":
                return 17;
            case "sidi bouzid":
                return 18;
            case "gabes":
                return 19;
            case "medenine":
                return 20;
            case "gafsa":
                return 21;
            case "tozeur":
                return 22;
            case "kebili":
                return 23;
            case "tataouine":
                return 24;
            default:
                throw new IllegalArgumentException("Gouvernorat inconnu : " + governorate);
        }
    }   
    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int selectedRow = jTable2.getSelectedRow();
        if (selectedRow != -1) {
            // Obtenir les données de la ligne sélectionnée
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            String id = (String) model.getValueAt(selectedRow, 0); 
            String num = (String) model.getValueAt(selectedRow, 1).toString(); 
            String piece = model.getValueAt(selectedRow, 2).toString(); 
            String sur = (String) model.getValueAt(selectedRow, 3).toString(); 
            String rue = (String) model.getValueAt(selectedRow, 4).toString(); 
            String post = (String) model.getValueAt(selectedRow, 5).toString(); 
            String etat = (String) model.getValueAt(selectedRow, 6).toString();
            String type = (String) model.getValueAt(selectedRow, 7).toString(); 
            String gouv = (String) model.getValueAt(selectedRow, 8).toString(); 
            boolean meuble = (boolean) model.getValueAt(selectedRow, 11);
            System.out.println(meuble);
            String max = model.getValueAt(selectedRow, 10).toString();
            boolean dispo = (boolean) model.getValueAt(selectedRow, 9);
            String cinp = (String) model.getValueAt(selectedRow, 12).toString();
            String pena = (String) model.getValueAt(selectedRow, 13).toString();
            String prix = (String) model.getValueAt(selectedRow, 14).toString();

            // Remplir les champs de texte
            jTextField10.setText(id);
            jTextField15.setText(num);
            jTextField9.setText(sur);
            jTextField12.setText(rue);
            jTextField11.setText(post);
            jTextField13.setText(cinp);
            jTextField14.setText(pena);
            jTextField17.setText(prix);
            jSpinner4.setValue(Integer.parseInt(piece));     
            jSpinner1.setValue(Integer.parseInt(max)); 
            if(type.equals("Par nuitée"))
                jComboBox2.setSelectedIndex(1);
            if(type.equals("Par mois"))
                jComboBox2.setSelectedIndex(2); 
            jComboBox1.setSelectedIndex(getGovernorateCode(gouv));  
            if(etat.equals("libre"))
                jComboBox3.setSelectedIndex(1);
            if(etat.equals("occupé"))
                jComboBox3.setSelectedIndex(2); 
            if (meuble == false) 
               jRadioButton3.setSelected(true) ;
            if (meuble == true) 
               jRadioButton4.setSelected(true) ;
            if (dispo == true) 
               jRadioButton1.setSelected(true) ;
            if (dispo == false) 
               jRadioButton2.setSelected(true) ;
            
            
        }

    }//GEN-LAST:event_jTable2MouseClicked

    
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
            java.util.logging.Logger.getLogger(appartement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(appartement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(appartement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(appartement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new appartement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private static javax.swing.JLabel jLabel_err_loca;
    private static javax.swing.JLabel jLabel_err_loca1;
    private static javax.swing.JLabel jLabel_err_loca2;
    private static javax.swing.JLabel jLabel_err_loca3;
    private static javax.swing.JLabel jLabel_err_loca4;
    private static javax.swing.JLabel jLabel_err_loca5;
    private static javax.swing.JLabel jLabel_err_loca6;
    private javax.swing.JLabel jLabel_err_rue;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
