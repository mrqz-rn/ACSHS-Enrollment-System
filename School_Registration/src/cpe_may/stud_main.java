package cpe_may;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;
import net.proteanit.sql.DbUtils;

public class stud_main extends javax.swing.JFrame {
    int xMouse,yMouse;
    String LRN,studID;
    String fname,mname,lname,fullname;
    public stud_main() {
        initComponents();
        JButton [] btns = {jButton1,jButton2,jButton4,jButton5,jButton6};
        for(JButton btn : btns){
            btn.setBackground(new Color(21,25,26)); 
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
        
        jTable1.getTableHeader().setFont(new Font("Comfortaa",Font.BOLD,12));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(54,81,207));
        jTable1.getTableHeader().setForeground(new Color(255,255,255));
        jTable1.setSelectionForeground(Color.white);
        
        String DBdir = "c:/ACSHS DATABASE/";
        String DB_name = "ACSHS_database.accdb";
        String DB_path = DBdir + "/" + DB_name;
        
        
        try{
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://" + DB_path);
            Statement st = conn.createStatement();
            String count = "SELECT COUNT(Student_id,Stud_Fname,Stud_Mname,Stud_Lname,Stud_lrn,Stud_birth,Stud_gen,Course) FROM enrollee";
            String query = "SELECT Student_id,Stud_Fname,Stud_Mname,Stud_Lname,Stud_lrn,Stud_birth,Stud_gen,Course FROM enrollee ";
            ResultSet rs = st.executeQuery(query);
            PreparedStatement pst = conn.prepareStatement(count);
            ResultSet rs2 = pst.executeQuery();
            
            jTable1.setModel(DbUtils.resultSetToTableModel(rs2));
            String as =  jTable1.getValueAt(0,0).toString();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
            count_val.setText(as);
        }catch(Exception e){
            System.out.println(e);
        }
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        user_log = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        fullname_txt = new javax.swing.JTextField();
        birth_txt = new javax.swing.JTextField();
        gen_txt = new javax.swing.JTextField();
        lrn_txt = new javax.swing.JTextField();
        con_txt = new javax.swing.JTextField();
        email_txt = new javax.swing.JTextField();
        guard_txt = new javax.swing.JTextField();
        gcon_txt = new javax.swing.JTextField();
        grel_txt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        studID_txt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        strand_txt = new javax.swing.JTextField();
        count_val = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(21, 25, 26));

        jPanel4.setBackground(new java.awt.Color(21, 25, 26));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_user_45px.png"))); // NOI18N

        user_log.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        user_log.setForeground(new java.awt.Color(255, 255, 255));
        user_log.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_log.setText("USER");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(user_log, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user_log)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);

        jButton1.setBackground(new java.awt.Color(21, 25, 26));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_add_45px.png"))); // NOI18N
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setPreferredSize(new java.awt.Dimension(55, 55));
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
        jPanel1.add(jButton1);

        jButton2.setBackground(new java.awt.Color(21, 25, 26));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_edit_file_45px.png"))); // NOI18N
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setPreferredSize(new java.awt.Dimension(55, 55));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton4.setBackground(new java.awt.Color(21, 25, 26));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_database_40px.png"))); // NOI18N
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setPreferredSize(new java.awt.Dimension(55, 55));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jPanel1.add(jButton4);

        jPanel5.setBackground(new java.awt.Color(21, 25, 26));
        jPanel5.setPreferredSize(new java.awt.Dimension(100, 120));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5);

        jButton5.setBackground(new java.awt.Color(21, 25, 26));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_logout_rounded_down_30px.png"))); // NOI18N
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setPreferredSize(new java.awt.Dimension(45, 45));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 110, 570));

        jPanel2.setBackground(new java.awt.Color(34, 40, 44));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student_id", "Stud_Fname", "Stud_Mname", "Stud_Lname", "Stud_lrn", "Stud_birth", "Stud_gen", "Course"
            }
        ));
        jTable1.setFocusable(false);
        jTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable1.setRowHeight(20);
        jTable1.setSelectionBackground(new java.awt.Color(54, 81, 120));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("STUDENT NAME:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("BIRTHDAY:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("LRN:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("GENDER:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CONTACT NO:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("E-MAIL:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("EMERGENCY CONTACT");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("NAME:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CONTACT NO:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("RELATIONSHIP:");

        fullname_txt.setBackground(new java.awt.Color(21, 25, 26));
        fullname_txt.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        fullname_txt.setForeground(new java.awt.Color(255, 255, 255));
        fullname_txt.setCaretColor(new java.awt.Color(255, 255, 255));
        fullname_txt.setPreferredSize(new java.awt.Dimension(6, 26));

        birth_txt.setBackground(new java.awt.Color(21, 25, 26));
        birth_txt.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        birth_txt.setForeground(new java.awt.Color(255, 255, 255));
        birth_txt.setCaretColor(new java.awt.Color(255, 255, 255));
        birth_txt.setPreferredSize(new java.awt.Dimension(6, 26));

        gen_txt.setBackground(new java.awt.Color(21, 25, 26));
        gen_txt.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        gen_txt.setForeground(new java.awt.Color(255, 255, 255));
        gen_txt.setCaretColor(new java.awt.Color(255, 255, 255));
        gen_txt.setPreferredSize(new java.awt.Dimension(6, 26));

        lrn_txt.setBackground(new java.awt.Color(21, 25, 26));
        lrn_txt.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        lrn_txt.setForeground(new java.awt.Color(255, 255, 255));
        lrn_txt.setCaretColor(new java.awt.Color(255, 255, 255));
        lrn_txt.setPreferredSize(new java.awt.Dimension(6, 26));

        con_txt.setBackground(new java.awt.Color(21, 25, 26));
        con_txt.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        con_txt.setForeground(new java.awt.Color(255, 255, 255));
        con_txt.setCaretColor(new java.awt.Color(255, 255, 255));
        con_txt.setPreferredSize(new java.awt.Dimension(6, 26));

        email_txt.setBackground(new java.awt.Color(21, 25, 26));
        email_txt.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        email_txt.setForeground(new java.awt.Color(255, 255, 255));
        email_txt.setCaretColor(new java.awt.Color(255, 255, 255));
        email_txt.setPreferredSize(new java.awt.Dimension(6, 26));

        guard_txt.setBackground(new java.awt.Color(21, 25, 26));
        guard_txt.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        guard_txt.setForeground(new java.awt.Color(255, 255, 255));
        guard_txt.setCaretColor(new java.awt.Color(255, 255, 255));
        guard_txt.setPreferredSize(new java.awt.Dimension(6, 26));

        gcon_txt.setBackground(new java.awt.Color(21, 25, 26));
        gcon_txt.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        gcon_txt.setForeground(new java.awt.Color(255, 255, 255));
        gcon_txt.setCaretColor(new java.awt.Color(255, 255, 255));
        gcon_txt.setPreferredSize(new java.awt.Dimension(6, 26));
        gcon_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gcon_txtActionPerformed(evt);
            }
        });

        grel_txt.setBackground(new java.awt.Color(21, 25, 26));
        grel_txt.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        grel_txt.setForeground(new java.awt.Color(255, 255, 255));
        grel_txt.setCaretColor(new java.awt.Color(255, 255, 255));
        grel_txt.setPreferredSize(new java.awt.Dimension(6, 26));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Search:");

        jTextField10.setBackground(new java.awt.Color(21, 25, 26));
        jTextField10.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jTextField10.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField10.setPreferredSize(new java.awt.Dimension(6, 26));
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("STUDENT NO:");

        studID_txt.setBackground(new java.awt.Color(21, 25, 26));
        studID_txt.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        studID_txt.setForeground(new java.awt.Color(255, 255, 255));
        studID_txt.setCaretColor(new java.awt.Color(255, 255, 255));
        studID_txt.setPreferredSize(new java.awt.Dimension(6, 26));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("STRAND:");

        strand_txt.setBackground(new java.awt.Color(21, 25, 26));
        strand_txt.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        strand_txt.setForeground(new java.awt.Color(255, 255, 255));
        strand_txt.setCaretColor(new java.awt.Color(255, 255, 255));
        strand_txt.setPreferredSize(new java.awt.Dimension(6, 26));

        count_val.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        count_val.setForeground(new java.awt.Color(255, 255, 255));
        count_val.setText("00");

        jButton6.setBackground(new java.awt.Color(21, 25, 26));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("ENROLL");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.setPreferredSize(new java.awt.Dimension(45, 45));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("TOTAL APPLICANTS:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel16))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(275, 275, 275)
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(gcon_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(grel_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(109, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(count_val)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(guard_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(birth_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lrn_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(62, 62, 62)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(gen_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(con_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel15)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(strand_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(fullname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(50, 50, 50)
                                            .addComponent(jLabel14)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(studID_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 49, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(studID_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(fullname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(strand_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel6)
                        .addComponent(birth_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(gen_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(con_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(lrn_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(guard_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gcon_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grel_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(count_val)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 860, 570));

        jPanel3.setBackground(new java.awt.Color(21, 25, 26));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gcon_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gcon_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gcon_txtActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_jPanel3MouseDragged

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        new stud_reg().show();
        stud_reg.user_ses.setText(user_log.getText());
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
       new stud_full_database().show();
       stud_full_database.user_ses.setText(user_log.getText());
       this.setVisible(false);
       
    }//GEN-LAST:event_jButton4MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        String DBdir = "c:/ACSHS DATABASE/";
        String DB_name = "ACSHS_database.accdb";
        String DB_path = DBdir + "/" + DB_name;
        String mc = jTable1.getValueAt(jTable1.getSelectedRow(),0).toString();
        
        try{
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://" + DB_path);
            Statement st = conn.createStatement();
            String query = "SELECT * FROM enrollee WHERE Student_id=?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1,mc);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                fname = rs.getString("Stud_Fname");
                mname = rs.getString("Stud_Mname");
                lname = rs.getString("Stud_Lname");
                fullname = lname+", "+fname+" "+mname;
                fullname_txt.setText(fullname);  
                studID_txt.setText(rs.getString("Student_id"));
                birth_txt.setText(rs.getString("Stud_birth"));
                strand_txt.setText(rs.getString("Course"));
                gen_txt.setText(rs.getString("Stud_gen")); 
                lrn_txt.setText(rs.getString("Stud_lrn")); 
                con_txt.setText(rs.getString("Stud_con")); 
                email_txt.setText(rs.getString("Stud_email")); 
                guard_txt.setText(rs.getString("Guardian")); 
                gcon_txt.setText(rs.getString("Contact")); 
                grel_txt.setText(rs.getString("Relation")); 
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if("".equals(studID_txt.getText()) && "".equals(fullname_txt.getText())){
            new please_delNotice().setVisible(true);
        }else{
        new stud_edit().setVisible(true);
        this.setVisible(false);
        }
        stud_edit.user_ses.setText(user_log.getText());
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
        new main().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // ENROLL HERE
        LRN = stud_main.lrn_txt.getText();
        studID = studID_txt.getText();
        String DBdir = "c:/ACSHS DATABASE/";
        String DB_name = "ACSHS_database.accdb";
        String DB_path = DBdir + "/" + DB_name;
        String mc = jTable1.getValueAt(jTable1.getSelectedRow(),0).toString();
        try{
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://" + DB_path);
            Statement st = conn.createStatement();
            
            String query = "INSERT INTO school_rec(Student_id,Stud_Fname,Stud_Mname,Stud_Lname,Stud_lrn,Course,Course_id"
                    +",Stud_gr,Stud_gen,Stud_birth,Stud_add,Stud_con,Stud_email,Guardian,Contact,Relation,B_mm,B_dd,B_yyyy)"
                    + "SELECT Student_id,Stud_Fname,Stud_Mname,Stud_Lname,Stud_lrn,Course,Course_id,Stud_gr,Stud_gen,"
                    +"Stud_birth,Stud_add,Stud_con,Stud_email,Guardian,Contact,Relation,B_mm,B_dd,B_yyyy FROM enrollee "
                    + "WHERE Student_id='"+studID+"' AND Stud_lrn='"+LRN+"'";
            st.execute(query);
            
            String query2 = "DELETE FROM enrollee WHERE Student_id='"+studID+"' AND Stud_lrn='"+LRN+"' ";
            PreparedStatement pst = conn.prepareStatement(query2);
            pst.execute();
            
            new enrolled_notif().setVisible(true);
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stud_main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField birth_txt;
    private javax.swing.JTextField con_txt;
    private javax.swing.JLabel count_val;
    private javax.swing.JTextField email_txt;
    public static javax.swing.JTextField fullname_txt;
    private javax.swing.JTextField gcon_txt;
    private javax.swing.JTextField gen_txt;
    private javax.swing.JTextField grel_txt;
    private javax.swing.JTextField guard_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField10;
    public static javax.swing.JTextField lrn_txt;
    public static javax.swing.JTextField strand_txt;
    public static javax.swing.JTextField studID_txt;
    public static javax.swing.JLabel user_log;
    // End of variables declaration//GEN-END:variables
}
