package cpe_may;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.plaf.basic.BasicRadioButtonUI;
import net.proteanit.sql.DbUtils;

public class stud_reg extends javax.swing.JFrame {
    int xMouse,yMouse;
    String Course_d,CourseNo_d,Gr_lvl;
    public stud_reg() {
        initComponents();
         JButton [] btns = {jButton1,jButton2};
         for(JButton btn : btns){
            btn.setBackground(new Color(21,25,28)); 
            btn.setUI(new BasicButtonUI());
            btn.addMouseListener(new MouseListener(){
                @Override
                public void mouseClicked(MouseEvent e){
                    
                }
                @Override
                public void mousePressed(MouseEvent me) {
                    btn.setBackground(new Color(54,81,120));
                }
                @Override
                public void mouseReleased(MouseEvent me) {
                    btn.setBackground(new Color(54,81,207));
                }
                @Override
                public void mouseEntered(MouseEvent me) {
                    btn.setBackground(new Color(54,81,207));
                }
                @Override
                public void mouseExited(MouseEvent me) {
                    btn.setBackground(new Color(21,25,26));
                }
            });
        }
        JRadioButton [] rbtns = {gr11,gr12,stem,abm,humss,cp,as,ei};
        for(JRadioButton rbtn : rbtns){
            rbtn.setBackground(new Color(21,25,28)); 
            rbtn.setUI(new BasicRadioButtonUI());
            rbtn.addMouseListener(new MouseListener(){
                @Override
                public void mouseClicked(MouseEvent e){
                    
                }
                @Override
                public void mousePressed(MouseEvent me) {
                    rbtn.setBackground(new Color(54,81,120));
                }
                @Override
                public void mouseReleased(MouseEvent me) {
                    rbtn.setBackground(new Color(54,81,207));
                }
                @Override
                public void mouseEntered(MouseEvent me) {
                    rbtn.setBackground(new Color(54,81,207));
                }
                @Override
                public void mouseExited(MouseEvent me) {
                    rbtn.setBackground(new Color(21,25,26));
                }
            });
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        user_ses = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fname_text = new javax.swing.JTextField();
        mname_text = new javax.swing.JTextField();
        lname_text = new javax.swing.JTextField();
        mm_text = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        gen_com = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        lrn_text = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        con_text = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        add_text = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        mail_text = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        gr11 = new javax.swing.JRadioButton();
        gr12 = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        emer_p = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        emer_r = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        emer_c = new javax.swing.JTextField();
        dd_text = new javax.swing.JTextField();
        yyyy_text = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        stem = new javax.swing.JRadioButton();
        abm = new javax.swing.JRadioButton();
        humss = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        cp = new javax.swing.JRadioButton();
        as = new javax.swing.JRadioButton();
        ei = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(21, 25, 26));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        user_ses.setForeground(new java.awt.Color(21, 25, 26));
        user_ses.setText("jLabel7");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(user_ses)
                .addContainerGap(526, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(user_ses)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, -1));

        jPanel2.setBackground(new java.awt.Color(34, 40, 44));

        jLabel1.setFont(new java.awt.Font("Comfortaa", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BASIC INFORMATION");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FULL NAME: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("First Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Middle Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Last Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("BIRTHDAY:");

        fname_text.setBackground(new java.awt.Color(21, 25, 26));
        fname_text.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        fname_text.setForeground(new java.awt.Color(255, 255, 255));
        fname_text.setCaretColor(new java.awt.Color(255, 255, 255));
        fname_text.setPreferredSize(new java.awt.Dimension(6, 26));

        mname_text.setBackground(new java.awt.Color(21, 25, 26));
        mname_text.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        mname_text.setForeground(new java.awt.Color(255, 255, 255));
        mname_text.setCaretColor(new java.awt.Color(255, 255, 255));
        mname_text.setPreferredSize(new java.awt.Dimension(6, 26));

        lname_text.setBackground(new java.awt.Color(21, 25, 26));
        lname_text.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        lname_text.setForeground(new java.awt.Color(255, 255, 255));
        lname_text.setCaretColor(new java.awt.Color(255, 255, 255));
        lname_text.setPreferredSize(new java.awt.Dimension(6, 26));

        mm_text.setBackground(new java.awt.Color(21, 25, 26));
        mm_text.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        mm_text.setForeground(new java.awt.Color(255, 255, 255));
        mm_text.setCaretColor(new java.awt.Color(255, 255, 255));
        mm_text.setPreferredSize(new java.awt.Dimension(6, 26));

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("mm ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("GENDER:");

        gen_com.setBackground(new java.awt.Color(21, 25, 26));
        gen_com.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        gen_com.setForeground(new java.awt.Color(255, 255, 255));
        gen_com.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female" }));
        gen_com.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("LRN:");

        lrn_text.setBackground(new java.awt.Color(21, 25, 26));
        lrn_text.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        lrn_text.setForeground(new java.awt.Color(255, 255, 255));
        lrn_text.setCaretColor(new java.awt.Color(255, 255, 255));
        lrn_text.setPreferredSize(new java.awt.Dimension(6, 26));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CONTACT NO:");

        con_text.setBackground(new java.awt.Color(21, 25, 26));
        con_text.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        con_text.setForeground(new java.awt.Color(255, 255, 255));
        con_text.setCaretColor(new java.awt.Color(255, 255, 255));
        con_text.setPreferredSize(new java.awt.Dimension(6, 26));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ADDRESS:");

        add_text.setBackground(new java.awt.Color(21, 25, 26));
        add_text.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        add_text.setForeground(new java.awt.Color(255, 255, 255));
        add_text.setCaretColor(new java.awt.Color(255, 255, 255));
        add_text.setPreferredSize(new java.awt.Dimension(6, 26));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("E-MAIL:");

        mail_text.setBackground(new java.awt.Color(21, 25, 26));
        mail_text.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        mail_text.setForeground(new java.awt.Color(255, 255, 255));
        mail_text.setCaretColor(new java.awt.Color(255, 255, 255));
        mail_text.setPreferredSize(new java.awt.Dimension(6, 26));

        jLabel15.setFont(new java.awt.Font("Comfortaa", 1, 22)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("COURSE & TRACK");

        jPanel3.setBackground(new java.awt.Color(34, 40, 44));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GRADE LEVEL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        gr11.setBackground(new java.awt.Color(21, 25, 26));
        gr11.setForeground(new java.awt.Color(255, 255, 255));
        gr11.setText("Grade 11");
        gr11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gr11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gr11ActionPerformed(evt);
            }
        });

        gr12.setBackground(new java.awt.Color(21, 25, 26));
        gr12.setForeground(new java.awt.Color(255, 255, 255));
        gr12.setText("Grade 12");
        gr12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gr12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gr12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gr12)
                    .addComponent(gr11))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gr11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gr12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("PERSON TO CONTACT IN-CASE OF EMERGENCY:");

        emer_p.setBackground(new java.awt.Color(21, 25, 26));
        emer_p.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        emer_p.setForeground(new java.awt.Color(255, 255, 255));
        emer_p.setCaretColor(new java.awt.Color(255, 255, 255));
        emer_p.setPreferredSize(new java.awt.Dimension(6, 26));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("NAME:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("RELATIONSHIP:");

        emer_r.setBackground(new java.awt.Color(21, 25, 26));
        emer_r.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        emer_r.setForeground(new java.awt.Color(255, 255, 255));
        emer_r.setCaretColor(new java.awt.Color(255, 255, 255));
        emer_r.setPreferredSize(new java.awt.Dimension(6, 26));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("CONTACT NO:");

        emer_c.setBackground(new java.awt.Color(21, 25, 26));
        emer_c.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        emer_c.setForeground(new java.awt.Color(255, 255, 255));
        emer_c.setCaretColor(new java.awt.Color(255, 255, 255));
        emer_c.setPreferredSize(new java.awt.Dimension(6, 26));

        dd_text.setBackground(new java.awt.Color(21, 25, 26));
        dd_text.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        dd_text.setForeground(new java.awt.Color(255, 255, 255));
        dd_text.setCaretColor(new java.awt.Color(255, 255, 255));
        dd_text.setPreferredSize(new java.awt.Dimension(6, 26));

        yyyy_text.setBackground(new java.awt.Color(21, 25, 26));
        yyyy_text.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        yyyy_text.setForeground(new java.awt.Color(255, 255, 255));
        yyyy_text.setCaretColor(new java.awt.Color(255, 255, 255));
        yyyy_text.setPreferredSize(new java.awt.Dimension(6, 26));

        jLabel20.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText(" dd");

        jLabel21.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("yyyyy");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add Student");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_return_30px.png"))); // NOI18N
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(34, 40, 44));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "COURSE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(34, 40, 44));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ACADEMIC STRANDS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        stem.setBackground(new java.awt.Color(21, 25, 26));
        stem.setForeground(new java.awt.Color(255, 255, 255));
        stem.setText("STEM");
        stem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        stem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stemActionPerformed(evt);
            }
        });

        abm.setBackground(new java.awt.Color(21, 25, 26));
        abm.setForeground(new java.awt.Color(255, 255, 255));
        abm.setText("ABM");
        abm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        abm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abmActionPerformed(evt);
            }
        });

        humss.setBackground(new java.awt.Color(21, 25, 26));
        humss.setForeground(new java.awt.Color(255, 255, 255));
        humss.setText("HUMSS");
        humss.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        humss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                humssActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(abm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(humss, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(abm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(humss)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(34, 40, 44));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TECH-VOC", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        cp.setBackground(new java.awt.Color(21, 25, 26));
        cp.setForeground(new java.awt.Color(255, 255, 255));
        cp.setText("CP");
        cp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpActionPerformed(evt);
            }
        });

        as.setBackground(new java.awt.Color(21, 25, 26));
        as.setForeground(new java.awt.Color(255, 255, 255));
        as.setText("AS");
        as.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        as.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asActionPerformed(evt);
            }
        });

        ei.setBackground(new java.awt.Color(21, 25, 26));
        ei.setForeground(new java.awt.Color(255, 255, 255));
        ei.setText("EI");
        ei.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(as, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(cp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ei, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(as)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ei)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(add_text, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mail_text, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fname_text, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mname_text, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lname_text, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mm_text, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel9)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dd_text, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(yyyy_text, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel10)
                                        .addGap(12, 12, 12)
                                        .addComponent(gen_com, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lrn_text, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(con_text, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel16)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel19)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(emer_c, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(emer_r, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel17)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(emer_p, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(227, 227, 227))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fname_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mname_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lname_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(mm_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(gen_com, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dd_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yyyy_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lrn_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(con_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(add_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(mail_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emer_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(emer_r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(emer_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(27, 27, 27))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 570, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gr11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gr11ActionPerformed
       if(gr11.isSelected()){
           gr12.setSelected(false);
           Gr_lvl = "11";
       }
    }//GEN-LAST:event_gr11ActionPerformed

    private void stemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stemActionPerformed
       if(stem.isSelected()){
           abm.setSelected(false);
           humss.setSelected(false);
           cp.setSelected(false);
           as.setSelected(false);
           ei.setSelected(false);
           Course_d = "STEM";
           CourseNo_d = "01";
       }
    }//GEN-LAST:event_stemActionPerformed

    private void cpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpActionPerformed
      if(cp.isSelected()){
           abm.setSelected(false);
           humss.setSelected(false);
           stem.setSelected(false);
           as.setSelected(false);
           ei.setSelected(false);
           Course_d = "CP";
           CourseNo_d = "04";
       }
    }//GEN-LAST:event_cpActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        new stud_main().show();
        this.setVisible(false);
        stud_main.user_log.setText(user_ses.getText());
        String DBdir = "c:/ACSHS DATABASE/";
        String DB_name = "ACSHS_database.accdb";
        String DB_path = DBdir + "/" + DB_name;
        try{
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://" + DB_path);
            Statement st = conn.createStatement();
            String query2 = "SELECT Student_id,Stud_Fname,Stud_Mname,Stud_Lname,Stud_lrn,Stud_birth,Stud_gen,Course FROM enrollee";
            ResultSet rs = st.executeQuery(query2);
            stud_main.jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void gr12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gr12ActionPerformed
        if(gr12.isSelected()){
           gr11.setSelected(false);
           Gr_lvl = "12";
       }
    }//GEN-LAST:event_gr12ActionPerformed

    private void abmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abmActionPerformed
        if(abm.isSelected()){
           stem.setSelected(false);
           humss.setSelected(false);
           cp.setSelected(false);
           as.setSelected(false);
           ei.setSelected(false);
           Course_d = "ABM";
           CourseNo_d = "02";
       }
    }//GEN-LAST:event_abmActionPerformed

    private void humssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_humssActionPerformed
        if(humss.isSelected()){
           stem.setSelected(false);
           abm.setSelected(false);
           cp.setSelected(false);
           as.setSelected(false);
           ei.setSelected(false);
           Course_d = "HUMSS";
           CourseNo_d = "03";
       }
    }//GEN-LAST:event_humssActionPerformed

    private void asActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asActionPerformed
        if(as.isSelected()){
           abm.setSelected(false);
           humss.setSelected(false);
           cp.setSelected(false);
           stem.setSelected(false);
           ei.setSelected(false);
           Course_d = "AS";
           CourseNo_d = "05";
       }
    }//GEN-LAST:event_asActionPerformed

    private void eiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eiActionPerformed
        if(ei.isSelected()){
           abm.setSelected(false);
           humss.setSelected(false);
           cp.setSelected(false);
           as.setSelected(false);
           stem.setSelected(false);
           Course_d = "EI";
           CourseNo_d = "06";
       }
    }//GEN-LAST:event_eiActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Fname,Mname,Lname,bmm,bdd,byy,gen,address,email,e_per,e_rel,birth,stud_idF;
        String lrn,con,e_con;
        int stud_list=1000,s_id=0,stud_id1;
        Fname = fname_text.getText();
        Mname = mname_text.getText();
        Lname = lname_text.getText();
        bmm = mm_text.getText();
        bdd = dd_text.getText();
        byy = yyyy_text.getText();
        birth = bmm +"/"+bdd+"/"+byy;
        gen = gen_com.getSelectedItem().toString();
        address = add_text.getText();
        email = mail_text.getText();
        e_per = emer_p.getText();
        e_rel = emer_r.getText();
        lrn = lrn_text.getText();  
        con =con_text.getText();
        e_con = emer_c.getText(); 
        String DBdir = "c:/ACSHS DATABASE/";
        String DB_name = "ACSHS_database.accdb";
        String DB_path = DBdir + "/" + DB_name;
        try{
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://" + DB_path);
            Statement st = conn.createStatement();
            
            String query = "INSERT INTO enrollee(Stud_Fname,Stud_Mname,Stud_Lname,Stud_lrn,Course,Course_id"
                    +",Stud_gr,Stud_gen,Stud_birth,Stud_add,Stud_con,Stud_email,Guardian,Contact,Relation,B_mm,B_dd,B_yyyy)"
                    + "VALUES ('"+Fname+"','"+Mname+"','"+Lname+"','"+lrn+"','"+Course_d+"','"+CourseNo_d+"',"
                    + " '"+Gr_lvl+"','"+gen+"','"+birth+"','"+address+"','"+con+"','"+email+"','"+e_per+"','"+e_con+"','"+e_rel+"','"+bmm+"','"+bdd+"','"+byy+"')";
            st.execute(query);

            
        }catch(Exception e){
            System.out.println(e);
        }
        try{
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://" + DB_path);
            String query2 = "SELECT * FROM enrollee WHERE Stud_Fname='"+Fname+"' AND Stud_Lname='"+Lname+"' ";
            Statement st = conn.createStatement();
            st.execute(query2);
            ResultSet rs = st.getResultSet();
            while ((rs!=null)&&(rs.next())){
                s_id = rs.getInt("ID");
            }
            stud_id1 = stud_list + s_id;
            String ref = Integer.toString(stud_id1);
            stud_idF =  ref + "-" + Gr_lvl + CourseNo_d;
            String for_studID = "UPDATE enrollee set Student_id= '"+stud_idF+"' WHERE ID = '"+s_id+"' ";
             st.execute(for_studID);
            new NewStud_notif().show();
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stud_reg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton abm;
    private javax.swing.JTextField add_text;
    private javax.swing.JRadioButton as;
    private javax.swing.JTextField con_text;
    private javax.swing.JRadioButton cp;
    private javax.swing.JTextField dd_text;
    private javax.swing.JRadioButton ei;
    private javax.swing.JTextField emer_c;
    private javax.swing.JTextField emer_p;
    private javax.swing.JTextField emer_r;
    private javax.swing.JTextField fname_text;
    private javax.swing.JComboBox<String> gen_com;
    private javax.swing.JRadioButton gr11;
    private javax.swing.JRadioButton gr12;
    private javax.swing.JRadioButton humss;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField lname_text;
    private javax.swing.JTextField lrn_text;
    private javax.swing.JTextField mail_text;
    private javax.swing.JTextField mm_text;
    private javax.swing.JTextField mname_text;
    private javax.swing.JRadioButton stem;
    public static javax.swing.JLabel user_ses;
    private javax.swing.JTextField yyyy_text;
    // End of variables declaration//GEN-END:variables
}
