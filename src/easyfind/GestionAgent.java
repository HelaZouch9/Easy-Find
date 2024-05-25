
package easyfind;

import java.awt.event.KeyEvent;
import source.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class GestionAgent extends javax.swing.JFrame {

    public GestionAgent() {
        initComponents();
        jLabel_err_cin.setVisible(false);
        jLabel_err_prenom.setVisible(false);
        jLabel_err_nom.setVisible(false);
        jLabel_err_tel.setVisible(false);
        jLabel_err_mail.setVisible(false);
        jLabel_err_salaire.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtprenom = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtcin = new javax.swing.JTextField();
        txtnom = new javax.swing.JTextField();
        jLabel_err_tel = new javax.swing.JLabel();
        jLabel_err_mail = new javax.swing.JLabel();
        jLabel_err_cin = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButtonremove = new javax.swing.JButton();
        jButtonupdate = new javax.swing.JButton();
        jButtonreset = new javax.swing.JButton();
        jButtonresearch = new javax.swing.JButton();
        jButtonadd = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txttel = new javax.swing.JTextField();
        jLabel_err_nom = new javax.swing.JLabel();
        jLabel_err_prenom = new javax.swing.JLabel();
        jButtonrefresh = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtsalaire = new javax.swing.JTextField();
        jLabel_err_salaire = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtmdp = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/mini_logo.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 500, 440, 560));

        jPanel2.setBackground(new java.awt.Color(0, 102, 150));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "username", "CIN_agent", "Nom _agent", "Prenom _gent", "date_naissance", "telephone", "email", "mdp", "salaire"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 530, 350));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 570, 420));

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel28.setText("Se déconnecter");
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 160, 30));

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout1.png"))); // NOI18N
        jLabel29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 160, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 150));
        jLabel2.setText("Gestion Agent");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 320, 70));

        jLabel14.setBackground(new java.awt.Color(25, 17, 1));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("CIN agent:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 282, 28));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Username:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 180, 20));

        jLabel13.setForeground(new java.awt.Color(0, 102, 150));
        jLabel13.setText("_________________________");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 150, 40));

        txtusername.setFont(txtusername.getFont().deriveFont(txtusername.getFont().getSize()+2f));
        txtusername.setBorder(null);
        txtusername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtusernameMouseClicked(evt);
            }
        });
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        txtusername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtusernameKeyPressed(evt);
            }
        });
        jPanel3.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 120, 20));

        jLabel9.setForeground(new java.awt.Color(0, 102, 150));
        jLabel9.setText("__________________");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 120, 40));

        jLabel11.setForeground(new java.awt.Color(0, 102, 150));
        jLabel11.setText("__________________");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 130, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Prenom Agent:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 180, 20));

        jLabel17.setBackground(new java.awt.Color(25, 17, 1));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Date de naissance:");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 282, 28));

        txtprenom.setFont(txtprenom.getFont().deriveFont(txtprenom.getFont().getSize()+2f));
        txtprenom.setBorder(null);
        txtprenom.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtprenom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtprenomMouseClicked(evt);
            }
        });
        txtprenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprenomActionPerformed(evt);
            }
        });
        txtprenom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtprenomKeyPressed(evt);
            }
        });
        jPanel3.add(txtprenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 130, 20));

        jLabel18.setForeground(new java.awt.Color(0, 102, 150));
        jLabel18.setText("______________");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 110, 40));

        txtcin.setFont(txtcin.getFont().deriveFont(txtcin.getFont().getSize()+2f));
        txtcin.setBorder(null);
        txtcin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcinMouseClicked(evt);
            }
        });
        txtcin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcinActionPerformed(evt);
            }
        });
        txtcin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcinKeyPressed(evt);
            }
        });
        jPanel3.add(txtcin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 110, 20));

        txtnom.setFont(txtnom.getFont().deriveFont(txtnom.getFont().getSize()+2f));
        txtnom.setBorder(null);
        txtnom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnomMouseClicked(evt);
            }
        });
        txtnom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnomKeyPressed(evt);
            }
        });
        jPanel3.add(txtnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 120, 20));

        jLabel_err_tel.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_err_tel.setText("Veuillez entrer uniquement des chiffres.");
        jPanel3.add(jLabel_err_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 220, 20));

        jLabel_err_mail.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_err_mail.setText("adresse email invalide");
        jPanel3.add(jLabel_err_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 130, 20));

        jLabel_err_cin.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_err_cin.setText("Veuillez entrer uniquement des chiffres.");
        jPanel3.add(jLabel_err_cin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 210, 20));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Nom agent:");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 150, 20));

        jButtonremove.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButtonremove.setForeground(new java.awt.Color(0, 102, 150));
        jButtonremove.setText("remove");
        jButtonremove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonremoveMouseClicked(evt);
            }
        });
        jButtonremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonremoveActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonremove, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));

        jButtonupdate.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButtonupdate.setForeground(new java.awt.Color(0, 102, 150));
        jButtonupdate.setText("update");
        jButtonupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonupdateMouseClicked(evt);
            }
        });
        jButtonupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonupdateActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, -1, -1));

        jButtonreset.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButtonreset.setForeground(new java.awt.Color(0, 102, 150));
        jButtonreset.setText("reset");
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
        jPanel3.add(jButtonreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, -1, -1));

        jButtonresearch.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButtonresearch.setForeground(new java.awt.Color(0, 102, 150));
        jButtonresearch.setText("research");
        jButtonresearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonresearchMouseClicked(evt);
            }
        });
        jButtonresearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonresearchActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonresearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, -1, -1));

        jButtonadd.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButtonadd.setForeground(new java.awt.Color(0, 102, 150));
        jButtonadd.setText("  add  ");
        jButtonadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonaddMouseClicked(evt);
            }
        });
        jButtonadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonaddActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        jLabel21.setForeground(new java.awt.Color(0, 102, 150));
        jLabel21.setText("_______________________________");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 160, 40));

        txtemail.setFont(txtemail.getFont().deriveFont(txtemail.getFont().getSize()+2f));
        txtemail.setBorder(null);
        txtemail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtemailMouseClicked(evt);
            }
        });
        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtemailKeyPressed(evt);
            }
        });
        jPanel3.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 170, 20));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("Numero Telephone:");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 180, 20));

        jLabel23.setForeground(new java.awt.Color(0, 102, 150));
        jLabel23.setText("_______________________________");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 150, 40));

        txttel.setFont(txttel.getFont().deriveFont(txttel.getFont().getSize()+2f));
        txttel.setBorder(null);
        txttel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txttelMouseClicked(evt);
            }
        });
        txttel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelActionPerformed(evt);
            }
        });
        txttel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttelKeyPressed(evt);
            }
        });
        jPanel3.add(txttel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 120, 20));

        jLabel_err_nom.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_err_nom.setText("Veuillez entrer uniquement des lettres.");
        jPanel3.add(jLabel_err_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 220, 20));

        jLabel_err_prenom.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_err_prenom.setText("Veuillez entrer uniquement des lettres.");
        jPanel3.add(jLabel_err_prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 220, 20));

        jButtonrefresh.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButtonrefresh.setForeground(new java.awt.Color(0, 102, 150));
        jButtonrefresh.setText("refresh");
        jButtonrefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonrefreshMouseClicked(evt);
            }
        });
        jButtonrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonrefreshActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonrefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, -1));

        jLabel19.setBackground(new java.awt.Color(25, 17, 1));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Salaire:");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 282, 28));

        jLabel26.setForeground(new java.awt.Color(0, 102, 150));
        jLabel26.setText("_______________________________");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 160, 40));

        jLabel24.setForeground(new java.awt.Color(0, 102, 150));
        jLabel24.setText("_______________________________");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 160, 40));

        txtsalaire.setFont(txtsalaire.getFont().deriveFont(txtsalaire.getFont().getSize()+2f));
        txtsalaire.setBorder(null);
        txtsalaire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtsalaireMouseClicked(evt);
            }
        });
        txtsalaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsalaireActionPerformed(evt);
            }
        });
        txtsalaire.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsalaireKeyPressed(evt);
            }
        });
        jPanel3.add(txtsalaire, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 120, 20));

        jLabel_err_salaire.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_err_salaire.setText("Veuillez entrer uniquement des chiffres.");
        jPanel3.add(jLabel_err_salaire, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 220, 20));

        jLabel25.setBackground(new java.awt.Color(25, 17, 1));
        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setText("Mdp:");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 282, 28));

        txtmdp.setFont(txtmdp.getFont().deriveFont(txtmdp.getFont().getSize()+2f));
        txtmdp.setBorder(null);
        txtmdp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtmdpMouseClicked(evt);
            }
        });
        txtmdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmdpActionPerformed(evt);
            }
        });
        txtmdp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmdpKeyPressed(evt);
            }
        });
        jPanel3.add(txtmdp, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 130, 20));

        jLabel27.setBackground(new java.awt.Color(25, 17, 1));
        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setText("Adresse Email:");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 282, 28));
        jPanel3.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 130, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 490, 490));

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

        jLabel4.setBackground(new java.awt.Color(0, 102, 150));
        jLabel4.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(25, 118, 211));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Espace Administrateur");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 550, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bg.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 590));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1118, 575));

        setSize(new java.awt.Dimension(1118, 575));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtusernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtusernameMouseClicked
        jLabel_err_cin.setVisible(false);
        jLabel_err_prenom.setVisible(false);
        jLabel_err_nom.setVisible(false);
        jLabel_err_tel.setVisible(false);
        jLabel_err_mail.setVisible(false);
        jLabel_err_salaire.setVisible(false);
    }//GEN-LAST:event_txtusernameMouseClicked

    private void txtusernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusernameKeyPressed
        
    }//GEN-LAST:event_txtusernameKeyPressed

    private void txtprenomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtprenomMouseClicked
        jLabel_err_cin.setVisible(false);
        jLabel_err_prenom.setVisible(false);
        jLabel_err_nom.setVisible(false);
        jLabel_err_tel.setVisible(false);
        jLabel_err_mail.setVisible(false);
        jLabel_err_salaire.setVisible(false);
    }//GEN-LAST:event_txtprenomMouseClicked

    private void txtprenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprenomActionPerformed

    }//GEN-LAST:event_txtprenomActionPerformed

    private void txtprenomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprenomKeyPressed
        char c =evt.getKeyChar();
        if(Character.isLetter(c) || c==' '|| evt.getKeyCode() == KeyEvent.VK_BACK_SPACE ){
            jLabel_err_prenom.setVisible(false);
            txtprenom.setEditable(true);
        }
        else{
            txtprenom.setEditable(false);
            jLabel_err_prenom.setVisible(true);
        }
    }//GEN-LAST:event_txtprenomKeyPressed

    private void txtcinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcinMouseClicked
        jLabel_err_cin.setVisible(false);
        jLabel_err_prenom.setVisible(false);
        jLabel_err_nom.setVisible(false);
        jLabel_err_tel.setVisible(false);
        jLabel_err_mail.setVisible(false);
        jLabel_err_salaire.setVisible(false);
    }//GEN-LAST:event_txtcinMouseClicked

    private void txtcinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcinKeyPressed
        char c =evt.getKeyChar();
        if(Character.isDigit(c) || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE ){
            jLabel_err_cin.setVisible(false);
            txtcin.setEditable(true);
        }
        else{
            txtcin.setEditable(false);
            jLabel_err_cin.setVisible(true);

        }
    }//GEN-LAST:event_txtcinKeyPressed

    private void txtnomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnomMouseClicked
        jLabel_err_cin.setVisible(false);
        jLabel_err_prenom.setVisible(false);
        jLabel_err_nom.setVisible(false);
        jLabel_err_tel.setVisible(false);
        jLabel_err_mail.setVisible(false);
        jLabel_err_salaire.setVisible(false);
    }//GEN-LAST:event_txtnomMouseClicked

    private void txtnomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomKeyPressed
        char c =evt.getKeyChar();
        if(Character.isLetter(c) || c==' '|| evt.getKeyCode() == KeyEvent.VK_BACK_SPACE ){
            jLabel_err_nom.setVisible(false);
            txtnom.setEditable(true);
        }
        else{
            txtnom.setEditable(false);
            jLabel_err_nom.setVisible(true);
        }
    }//GEN-LAST:event_txtnomKeyPressed

    private void jButtonaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonaddActionPerformed
        String username=txtusername.getText().trim();
        String cin=txtcin.getText().trim();
        String nom=txtnom.getText().trim();
        String prenom=txtprenom.getText().trim();
        String tel=txttel.getText().trim();
        String email=txtemail.getText().trim();
        String mdp=txtmdp.getText().trim();
        String salaire1=txtsalaire.getText();
        Date date_naissance=jDateChooser1.getDate();
        if((username.equals("")) ||(cin.equals(""))||(nom.equals(""))||(prenom.equals(""))||(tel.equals(""))||(email.equals(""))||(mdp.equals(""))||(salaire1.equals(""))||(date_naissance == null))
            JOptionPane.showMessageDialog(this, "Erreur lors de l'ajout du client.Il faut remplir tous les champs", "Erreur", JOptionPane.ERROR_MESSAGE);
        else{
            Double salaire=Double.parseDouble(salaire1);
            Agent a=new Agent(username,cin,nom,prenom,tel,email,mdp,salaire,date_naissance);
            DB_Connexion db=new DB_Connexion();
            if(db.add_agent(a))
                JOptionPane.showMessageDialog(this, "ajout avec success a la liste des agents.");
            else
                JOptionPane.showMessageDialog(this, "Erreur lors d'ajout a la liste des agents.", "Erreur", JOptionPane.ERROR_MESSAGE);
                

        }
    }//GEN-LAST:event_jButtonaddActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void txtemailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtemailMouseClicked
        jLabel_err_cin.setVisible(false);
        jLabel_err_prenom.setVisible(false);
        jLabel_err_nom.setVisible(false);
        jLabel_err_tel.setVisible(false);
        jLabel_err_mail.setVisible(false);
        jLabel_err_salaire.setVisible(false);
    }//GEN-LAST:event_txtemailMouseClicked

    private void txtemailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyPressed
        char c =evt.getKeyChar();
        if(Character.isLetter(c) || c==' '||Character.isDigit(c) || c=='@'|| c=='_'||c=='.' || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE ){
            jLabel_err_mail.setVisible(false);
            txtemail.setEditable(true);
        }
        else{
            txtemail.setEditable(false);
            jLabel_err_mail.setVisible(true);
        }
    }//GEN-LAST:event_txtemailKeyPressed

    private void txttelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txttelMouseClicked
        jLabel_err_cin.setVisible(false);
        jLabel_err_prenom.setVisible(false);
        jLabel_err_nom.setVisible(false);
        jLabel_err_tel.setVisible(false);
        jLabel_err_mail.setVisible(false);
        jLabel_err_salaire.setVisible(false);
    }//GEN-LAST:event_txttelMouseClicked

    private void txttelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelKeyPressed
        char c =evt.getKeyChar();
        if(Character.isDigit(c) || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE ){
            jLabel_err_tel.setVisible(false);
            txttel.setEditable(true);
        }
        else{
            txttel.setEditable(false);
            jLabel_err_tel.setVisible(true);
        }
    }//GEN-LAST:event_txttelKeyPressed

    private void jButtonresearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonresearchActionPerformed

    }//GEN-LAST:event_jButtonresearchActionPerformed

    private void jButtonaddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonaddMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonaddMouseClicked

    private void jButtonremoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonremoveMouseClicked
        String username=txtusername.getText().trim();
        String cin=txtcin.getText().trim();
        String nom=txtnom.getText().trim();
        String prenom=txtprenom.getText().trim();
        String tel=txttel.getText().trim();
        String email=txtemail.getText().trim();
        String mdp=txtmdp.getText().trim();
        String salaire1=txtsalaire.getText();
        Date date_naissance=jDateChooser1.getDate();
        
        //Agent a=new Agent(username,cin,nom,prenom,tel,email,mdp,salaire,date_naissance);
    }//GEN-LAST:event_jButtonremoveMouseClicked

    private void jButtonupdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonupdateMouseClicked
        String username=txtusername.getText().trim();
        String cin=txtcin.getText().trim();
        String nom=txtnom.getText().trim();
        String prenom=txtprenom.getText().trim();
        String tel=txttel.getText().trim();
        String email=txtemail.getText().trim();
        String mdp=txtmdp.getText().trim();
        String salaire1=txtsalaire.getText();
        Date date_naissance=jDateChooser1.getDate();
        
        
        //Agent a=new Agent(username,cin,nom,prenom,tel,email,mdp,salaire,date_naissance);

    }//GEN-LAST:event_jButtonupdateMouseClicked

    private void jButtonrefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonrefreshMouseClicked
        DB_Connexion db=new DB_Connexion();
        ResultSet rs=db.agent_refresh();
        try {
        DefaultTableModel model = (DefaultTableModel) jTable.getModel(); // Récupère le modèle existant de votre JTable
        model.setRowCount(0); // Efface les lignes existantes du modèle

        // Ajoute les données du ResultSet à votre modèle de table
        while (rs.next()) {
            Object[] rowData = {rs.getString("username_agent"), rs.getString("cin_agent"),
                    rs.getString("nom_agent"), rs.getString("prenom_agent"),
                    rs.getObject("date_naissance_agent"), rs.getString("tel_agent"),
                    rs.getString("email_agent"),rs.getString("mdp"),rs.getDouble("salaire")};
            model.addRow(rowData);
        }
        if(model.getRowCount()==0){
            JOptionPane.showMessageDialog(this, "Erreur lors du rafraîchissement de la liste des agents.", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
      
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jButtonrefreshMouseClicked

    private void jButtonresetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonresetMouseClicked
        // TODO add your handling code here: /*a completer*/
    }//GEN-LAST:event_jButtonresetMouseClicked

    private void jButtonresearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonresearchMouseClicked
        String username=txtusername.getText().trim();
        String cin=txtcin.getText().trim();
        String nom=txtnom.getText().trim();
        String prenom=txtprenom.getText().trim();
        String tel=txttel.getText().trim();
        String email=txtemail.getText().trim();
        String mdp=txtmdp.getText().trim();
        String salaire1=txtsalaire.getText();
        Date date_naissance=jDateChooser1.getDate();
        Double salaire=0.0;
        if(!salaire1.equals(""))
            salaire=Double.parseDouble(salaire1);
        if((username.equals("")) && (cin.equals(""))&&(nom.equals(""))&&(prenom.equals(""))&&(tel.equals(""))&&(email.equals(""))&&(mdp.equals(""))&&(salaire1.equals(""))&&(date_naissance == null))
            JOptionPane.showMessageDialog(this, "Veuillez remplir au moins un champ", "Erreur", JOptionPane.ERROR_MESSAGE);
        else{
        Agent a=new Agent(username,cin,nom,prenom,tel,email,mdp,salaire,date_naissance);
        DB_Connexion db= new DB_Connexion();
        ResultSet rs=db.afficher_agent(a);
        try {
        DefaultTableModel model = (DefaultTableModel) jTable.getModel(); // Récupère le modèle existant de votre JTable
        model.setRowCount(0); // Efface les lignes existantes du modèle

        // Ajoute les données du ResultSet à votre modèle de table
        while (rs.next()) {
            Object[] rowData = {rs.getString("username_agent"), rs.getString("cin_agent"),
                    rs.getString("nom_agent"), rs.getString("prenom_agent"),
                    rs.getObject("date_naissance_agent"), rs.getString("tel_agent"),
                    rs.getString("email_agent"),rs.getString("mdp"),rs.getDouble("salaire")};
            model.addRow(rowData);
        }
        if(model.getRowCount()==0){
            JOptionPane.showMessageDialog(this, "NO_DATA_FOUND");
        }
      
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        }
        
    }//GEN-LAST:event_jButtonresearchMouseClicked

    private void txtsalaireMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsalaireMouseClicked
        jLabel_err_cin.setVisible(false);
        jLabel_err_prenom.setVisible(false);
        jLabel_err_nom.setVisible(false);
        jLabel_err_tel.setVisible(false);
        jLabel_err_mail.setVisible(false);
        jLabel_err_salaire.setVisible(false);
    }//GEN-LAST:event_txtsalaireMouseClicked

    private void txtsalaireKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsalaireKeyPressed
        char c =evt.getKeyChar();
        if(Character.isDigit(c) || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE ||c=='.' ){
            jLabel_err_salaire.setVisible(false);
            txtsalaire.setEditable(true);
        }
        else{
            txtsalaire.setEditable(false);
            jLabel_err_salaire.setVisible(true);
        }
    }//GEN-LAST:event_txtsalaireKeyPressed

    private void txtmdpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtmdpMouseClicked
        jLabel_err_cin.setVisible(false);
        jLabel_err_prenom.setVisible(false);
        jLabel_err_nom.setVisible(false);
        jLabel_err_tel.setVisible(false);
        jLabel_err_mail.setVisible(false);
        jLabel_err_salaire.setVisible(false);
    }//GEN-LAST:event_txtmdpMouseClicked

    private void txtmdpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmdpKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmdpKeyPressed

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        jLabel_err_cin.setVisible(false);
        jLabel_err_prenom.setVisible(false);
        jLabel_err_nom.setVisible(false);
        jLabel_err_tel.setVisible(false);
        jLabel_err_mail.setVisible(false);
        jLabel_err_salaire.setVisible(false);
    }//GEN-LAST:event_txtusernameActionPerformed

    private void jButtonremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonremoveActionPerformed
        String username=txtusername.getText().trim();
        String cin=txtcin.getText().trim();
        String nom=txtnom.getText().trim();
        String prenom=txtprenom.getText().trim();
        String tel=txttel.getText().trim();
        String email=txtemail.getText().trim();
        String mdp=txtmdp.getText().trim();
        String salaire1=txtsalaire.getText();
        Date date_naissance=jDateChooser1.getDate();
        Double salaire=0.0;
        if((username.equals("")) && (cin.equals(""))&&(nom.equals(""))&&(prenom.equals(""))&&(tel.equals(""))&&(email.equals(""))&&(mdp.equals(""))&&(salaire1.equals(""))&&(date_naissance == null))
            JOptionPane.showMessageDialog(this, "Erreur lors de suppression des agents.Il faut remplir au moins un champ", "Erreur", JOptionPane.ERROR_MESSAGE);
        else{
            
            if (!salaire1.equals(""))
                salaire=Double.parseDouble(salaire1);
            Agent a=new Agent(username,cin,nom,prenom,tel,email,mdp,salaire,date_naissance);
            DB_Connexion db=new DB_Connexion();
            if(db.remove_agent(a))
                JOptionPane.showMessageDialog(this, "suppression avec success a partir de la liste des agents.");
            else
                JOptionPane.showMessageDialog(this, "Agent inexistant", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonremoveActionPerformed

    private void jButtonupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonupdateActionPerformed
        String username=txtusername.getText().trim();
        String cin=txtcin.getText().trim();
        String nom=txtnom.getText().trim();
        String prenom=txtprenom.getText().trim();
        String tel=txttel.getText().trim();
        String email=txtemail.getText().trim();
        String mdp=txtmdp.getText().trim();
        String salaire1=txtsalaire.getText();
        Date date_naissance=jDateChooser1.getDate();
        Double salaire=0.0;
        if((cin.equals("")) || ((nom.equals(""))&&(prenom.equals(""))&&(tel.equals(""))&&(email.equals(""))&&(mdp.equals(""))&&(salaire1.equals(""))&&(date_naissance == null)))
            JOptionPane.showMessageDialog(this, "Erreur lors de la mise a jour des agents. Le champ de cin est obligatoire et il faut remplir le champ à modifier ", "Erreur", JOptionPane.ERROR_MESSAGE);
        else{
            
            if (!salaire1.equals("")){
                salaire=Double.parseDouble(salaire1);}
            System.out.println("la valeur de tel recupérée"+tel);
            Agent a=new Agent(username,cin,nom,prenom,tel,email,mdp,salaire,date_naissance);
            DB_Connexion db=new DB_Connexion();
            if(db.update_agent(a))
                JOptionPane.showMessageDialog(this, "mise à jour  avec success de la liste des agents.");
            else
                JOptionPane.showMessageDialog(this, "Agent inexistant", "Erreur", JOptionPane.ERROR_MESSAGE);
                

        }
    }//GEN-LAST:event_jButtonupdateActionPerformed

    private void txtmdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmdpActionPerformed
        jLabel_err_cin.setVisible(false);
        jLabel_err_prenom.setVisible(false);
        jLabel_err_nom.setVisible(false);
        jLabel_err_tel.setVisible(false);
        jLabel_err_mail.setVisible(false);
        jLabel_err_salaire.setVisible(false);
    }//GEN-LAST:event_txtmdpActionPerformed

    private void txttelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelActionPerformed

    private void txtcinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcinActionPerformed

    private void jButtonresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonresetActionPerformed
        jLabel_err_cin.setVisible(false);
        jLabel_err_prenom.setVisible(false);
        jLabel_err_nom.setVisible(false);
        jLabel_err_tel.setVisible(false);
        jLabel_err_mail.setVisible(false);
        jLabel_err_salaire.setVisible(false);
        txtcin.setText("");
        txtnom.setText("");
        txtprenom.setText("");
        txtsalaire.setText("");
        txttel.setText("");
        txtusername.setText("");
        txtmdp.setText("");
        txtemail.setText("");
        jDateChooser1.setDate(null);
    }//GEN-LAST:event_jButtonresetActionPerformed

    private void jButtonrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonrefreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonrefreshActionPerformed

    private void txtsalaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsalaireActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsalaireActionPerformed

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        new EasyFindLocation().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel29MouseClicked

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        // Obtenir la ligne sélectionnée
    int selectedRow = jTable.getSelectedRow();
    if (selectedRow != -1) {
        // Obtenir les données de la ligne sélectionnée
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        String username = (String) model.getValueAt(selectedRow, 0); // CIN
        String cin = (String) model.getValueAt(selectedRow, 1); // Nom
        String nom = (String) model.getValueAt(selectedRow, 2); // Prénom
        String prenom = (String) model.getValueAt(selectedRow, 3); // Prénom
        String tel = (String) model.getValueAt(selectedRow, 5); // Téléphone
        String email = (String) model.getValueAt(selectedRow, 6); // Email
        double salaire=(double) model.getValueAt(selectedRow, 8);
        String mdp = (String) model.getValueAt(selectedRow, 7);
        java.sql.Date date_naissance = (java.sql.Date) model.getValueAt(selectedRow, 4); // Date de naissance

        // Remplir les champs de texte
        txtcin.setText(cin);
        txtnom.setText(nom);
        txtprenom.setText(prenom);
        txttel.setText(tel);
        txtemail.setText(email);
        txtusername.setText(username);
        txtsalaire.setText(Double.toString(salaire));
        txtmdp.setText(mdp);
        jDateChooser1.setDate(date_naissance);
    }
    }//GEN-LAST:event_jTableMouseClicked

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
            java.util.logging.Logger.getLogger(GestionAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionAgent().setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JLabel jLabel9;
    private static javax.swing.JLabel jLabel_err_cin;
    private javax.swing.JLabel jLabel_err_mail;
    private javax.swing.JLabel jLabel_err_nom;
    private javax.swing.JLabel jLabel_err_prenom;
    private javax.swing.JLabel jLabel_err_salaire;
    private javax.swing.JLabel jLabel_err_tel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField txtcin;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtmdp;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtprenom;
    private javax.swing.JTextField txtsalaire;
    private javax.swing.JTextField txttel;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
