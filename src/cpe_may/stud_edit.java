package cpe_may;

import static cpe_may.stud_reg.user_ses;
import java.awt.Color;
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

public class stud_edit extends javax.swing.JFrame {
    int xMouse,yMouse;
    String LRN,studID;
    public stud_edit() {
        initComponents();
        JButton [] btns = {jButton1,jButton2};
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
        studID_lb.setText(stud_main.studID_txt.getText());
        LRN = stud_main.lrn_txt.getText();
        lrn_text.setText(LRN);
        studID = studID_lb.getText();
        String DBdir = "c:/ACSHS DATABASE/";
        String DB_name = "ACSHS_database.accdb";
        String DB_path = DBdir + "/" + DB_name;
        
        try{
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://" + DB_path);
            String query = "SELECT Stud_Fname,Stud_Mname,Stud_Lname,B_mm,B_dd,B_yyyy,Stud_gen,Stud_lrn,Stud_con,Stud_add,Stud_email,"
                    + "Guardian,Contact,Relation,Stud_gr,Course"
                    + " FROM enrollee WHERE Student_id='"+studID+"' AND Stud_lrn='"+LRN+"' ";
            PreparedStatement pst = conn.prepareStatement(query);
            
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                fname_text.setText(rs.getString("Stud_Fname"));
                mname_text.setText(rs.getString("Stud_Mname"));
                lname_text.setText(rs.getString("Stud_Lname"));
                gen_com.setSelectedItem(rs.getString("Stud_gen"));
                lrn_text.setText(rs.getString("Stud_lrn"));
                con_text.setText(rs.getString("Stud_con"));
                add_text.setText(rs.getString("Stud_add"));
                mail_text.setText(rs.getString("Stud_email"));
                emer_p.setText(rs.getString("Guardian"));
                emer_c.setText(rs.getString("Contact"));
                emer_r.setText(rs.getString("Relation"));
                grlvl_lb.setText(rs.getString("Stud_gr"));
                strand_lb.setText(rs.getString("Course"));
                mm_text.setText(rs.getString("B_mm"));
                dd_text.setText(rs.getString("B_dd"));
                yyyy_text.setText(rs.getString("B_yyyy"));
            }
            
        }catch(Exception e){
            System.out.println(e);
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
        fname_text = new javax.swing.JTextField();
        mname_text = new javax.swing.JTextField();
        lname_text = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mm_text = new javax.swing.JTextField();
        dd_text = new javax.swing.JTextField();
        yyyy_text = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        gen_com = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lrn_text = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        con_text = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        add_text = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        mail_text = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        studID_lb = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        grlvl_lb = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        strand_lb = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        emer_p = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        emer_r = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        emer_c = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

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
        user_ses.setText("jLabel8");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(user_ses)
                .addContainerGap(476, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(user_ses)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, -1));

        jPanel2.setBackground(new java.awt.Color(34, 40, 44));

        jLabel1.setFont(new java.awt.Font("Comfortaa", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EDIT Student Data");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FULL NAME: ");

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

        mm_text.setBackground(new java.awt.Color(21, 25, 26));
        mm_text.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        mm_text.setForeground(new java.awt.Color(255, 255, 255));
        mm_text.setCaretColor(new java.awt.Color(255, 255, 255));
        mm_text.setPreferredSize(new java.awt.Dimension(6, 26));

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

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("GENDER:");

        gen_com.setBackground(new java.awt.Color(21, 25, 26));
        gen_com.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        gen_com.setForeground(new java.awt.Color(255, 255, 255));
        gen_com.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female" }));
        gen_com.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("mm ");

        jLabel20.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText(" dd");

        jLabel21.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("yyyyy");

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

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("STUDENT ID:");

        studID_lb.setFont(new java.awt.Font("Comfortaa", 1, 16)); // NOI18N
        studID_lb.setForeground(new java.awt.Color(255, 255, 255));
        studID_lb.setText("0000000000");

        jLabel15.setFont(new java.awt.Font("Comfortaa", 1, 22)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("COURSE & TRACK");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("GRADE LEVEL:");

        grlvl_lb.setFont(new java.awt.Font("Comfortaa", 1, 16)); // NOI18N
        grlvl_lb.setForeground(new java.awt.Color(255, 255, 255));
        grlvl_lb.setText("0000000000");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("STRAND:");

        strand_lb.setFont(new java.awt.Font("Comfortaa", 1, 16)); // NOI18N
        strand_lb.setForeground(new java.awt.Color(255, 255, 255));
        strand_lb.setText("0000000000");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("PERSON TO CONTACT IN-CASE OF EMERGENCY:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("NAME:");

        emer_p.setBackground(new java.awt.Color(21, 25, 26));
        emer_p.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        emer_p.setForeground(new java.awt.Color(255, 255, 255));
        emer_p.setCaretColor(new java.awt.Color(255, 255, 255));
        emer_p.setPreferredSize(new java.awt.Dimension(6, 26));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("RELATIONSHIP:");

        emer_r.setBackground(new java.awt.Color(21, 25, 26));
        emer_r.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        emer_r.setForeground(new java.awt.Color(255, 255, 255));
        emer_r.setCaretColor(new java.awt.Color(255, 255, 255));
        emer_r.setPreferredSize(new java.awt.Dimension(6, 26));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("CONTACT NO:");

        emer_c.setBackground(new java.awt.Color(21, 25, 26));
        emer_c.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        emer_c.setForeground(new java.awt.Color(255, 255, 255));
        emer_c.setCaretColor(new java.awt.Color(255, 255, 255));
        emer_c.setPreferredSize(new java.awt.Dimension(6, 26));

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

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Edit Student");
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(emer_c, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(emer_r, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(emer_p, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(grlvl_lb)
                            .addGap(57, 57, 57)
                            .addComponent(jLabel18)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(strand_lb))
                        .addComponent(jLabel15)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(add_text, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(mail_text, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(66, 66, 66)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(studID_lb)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(studID_lb))
                .addGap(18, 18, 18)
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
                .addGap(29, 29, 29)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(grlvl_lb)
                    .addComponent(jLabel18)
                    .addComponent(strand_lb))
                .addGap(29, 29, 29)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emer_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(emer_r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(emer_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 520, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        new stud_main().show();
        stud_main.user_log.setText(user_ses.getText());
        this.setVisible(false);
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

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,D14;
        String DBdir = "c:/ACSHS DATABASE/";
        String DB_name = "ACSHS_database.accdb";
        String DB_path = DBdir + "/" + DB_name;
            D1 =  fname_text.getText();
            D2 =  mname_text.getText();
            D3 =  lname_text.getText();
            D4 =  mm_text.getText();
            D5 =  dd_text.getText();
            D6 =  yyyy_text.getText();
            D7 =  gen_com.getSelectedItem().toString();
            D8 =  lrn_text.getText();
            D9 =  con_text.getText();
            D10 =  add_text.getText();
            D11 =  mail_text.getText();
            D12 =  emer_p.getText();
            D13 =  emer_c.getText();
            D14 =  emer_r.getText();
        try{
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://" + DB_path);
            Statement st = conn.createStatement();
            String query = "UPDATE enrollee set Stud_Fname='"+D1+"',Stud_Mname='"+D2+"',Stud_Lname='"+D3+"',"
                    + "B_mm='"+D4+"',B_dd='"+D5+"',B_yyyy='"+D6+"',Stud_gen='"+D7+"',Stud_lrn='"+D8+"',"
                    + "Stud_con='"+D9+"',Stud_add='"+D10+"',Stud_email='"+D11+"',Guardian='"+D12+"',"
                    + "Contact='"+D13+"',Relation='"+D14+"' "
                    + " WHERE Student_id='"+studID+"' AND Stud_lrn='"+LRN+"' ";
            st.execute(query);
            
            new update_edit().setVisible(true);
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
                new stud_edit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add_text;
    private javax.swing.JTextField con_text;
    private javax.swing.JTextField dd_text;
    private javax.swing.JTextField emer_c;
    private javax.swing.JTextField emer_p;
    private javax.swing.JTextField emer_r;
    private javax.swing.JTextField fname_text;
    private javax.swing.JComboBox<String> gen_com;
    private javax.swing.JLabel grlvl_lb;
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
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lname_text;
    private javax.swing.JTextField lrn_text;
    private javax.swing.JTextField mail_text;
    private javax.swing.JTextField mm_text;
    private javax.swing.JTextField mname_text;
    private javax.swing.JLabel strand_lb;
    private javax.swing.JLabel studID_lb;
    public static javax.swing.JLabel user_ses;
    private javax.swing.JTextField yyyy_text;
    // End of variables declaration//GEN-END:variables
}
