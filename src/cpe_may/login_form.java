package cpe_may;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;

public class login_form extends javax.swing.JFrame {
    int xMouse,yMouse;
    String check_role,passing="",username,password;
    public login_form() {
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        pass_text = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        user_text = new javax.swing.JTextField();
        role_set = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 190, 10));

        jSeparator2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 190, 10));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_male_user_125px.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        pass_text.setBackground(new java.awt.Color(21, 25, 26));
        pass_text.setForeground(new java.awt.Color(255, 255, 255));
        pass_text.setText("jPassword");
        pass_text.setBorder(null);
        pass_text.setCaretColor(new java.awt.Color(255, 255, 255));
        pass_text.setPreferredSize(new java.awt.Dimension(105, 28));
        pass_text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pass_textMouseClicked(evt);
            }
        });
        getContentPane().add(pass_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 190, -1));

        jButton2.setBackground(new java.awt.Color(21, 25, 26));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_return_30px.png"))); // NOI18N
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setPreferredSize(new java.awt.Dimension(45, 45));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, -1, -1));

        user_text.setBackground(new java.awt.Color(34, 40, 44));
        user_text.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        user_text.setForeground(new java.awt.Color(255, 255, 255));
        user_text.setText("example123");
        user_text.setBorder(null);
        user_text.setCaretColor(new java.awt.Color(255, 255, 255));
        user_text.setPreferredSize(new java.awt.Dimension(6, 28));
        user_text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_textMouseClicked(evt);
            }
        });
        getContentPane().add(user_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 190, -1));

        role_set.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        role_set.setForeground(new java.awt.Color(21, 25, 26));
        role_set.setText("jLabel5");
        getContentPane().add(role_set, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 110, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOGIN");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 130, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("         Password:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 110, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("          Username:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 120, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/login - Copy.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void user_textMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_textMouseClicked
        user_text.setText("");
    }//GEN-LAST:event_user_textMouseClicked

    private void pass_textMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pass_textMouseClicked
        pass_text.setText("");
    }//GEN-LAST:event_pass_textMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean log_user=false,log_pass=false;
        check_role = role_set.getText();
        String user = user_text.getText();
        String pass = pass_text.getText();
        int tries = 4;
        try{
            String DBdir = "c:/ACSHS DATABASE/";
            File f1 = new File(DBdir);
            if(!f1.exists()){
                f1.mkdir();
            }
            String DB_name = "ACSHS_Database.accdb";
            String DB_path = DBdir + "/" + DB_name;
            File f2 = new File(DB_path);
            if(!f2.exists()){
                InputStream iStream = login_form.class.getResourceAsStream("database/"+DB_name);
                Files.copy(iStream, f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
            }
            Connection con1=DriverManager.getConnection("jdbc:ucanaccess://" + DB_path);
            Statement st1 = con1.createStatement();
            String S1 ="SELECT * FROM system_user WHERE username='"+user+"'";
            st1.execute(S1);
            ResultSet rs1 = st1.getResultSet();
            if(rs1.next()){
                log_user = true;

                try{
                    Connection con2=DriverManager.getConnection("jdbc:ucanaccess://" + DB_path);
                    Statement st2 = con2.createStatement();
                    String S2 ="SELECT * FROM system_user WHERE password='"+pass+"'";
                    st2.execute(S2);
                    ResultSet rs2 = st2.getResultSet();
                    if(rs2.next()){
                        log_pass = true;

                        try{
                            Connection con3=DriverManager.getConnection("jdbc:ucanaccess://" + DB_path);
                            Statement st3 = con3.createStatement();
                            String S3 ="SELECT * FROM system_user WHERE username='"+user+"' AND password = '"+pass+"'";
                            PreparedStatement pst = con3.prepareStatement(S3);
                            ResultSet rsGet = pst.executeQuery();
                            st3.execute(S3);
                            ResultSet rs3 = st3.getResultSet();
                            if(rsGet.next()){
                                passing = rsGet.getString("role");
                                username = rsGet.getString("username");
                                password = rsGet.getString("password");
                            }
                            if(rs3.next()){
                                if("admin".equals(passing)){
                                    if("teacher".equals(check_role)){
                                        new stud_main().setVisible(true);
                                        stud_main.user_log.setText(username);
                                    }else if("librarian".equals(check_role)){
                                        new library_main().setVisible(true);
                                        library_main.user_log.setText(username);
                                    }
                                }
                                
                                new main().setVisible(false);
                                this.setVisible(false);
                            } 

                        }catch(Exception e){
                            System.out.println(e);
                        }
                    }
                     main mf = new main();
                     mf.setVisible(false);
                }catch(Exception e){
                    System.out.println(e);
                }
            }
                //try_label.setText("Please Try Again:");
                tries = tries - 1;
                //try_no.setText(String.valueOf(tries));
                            
        } catch (Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        new main().setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField pass_text;
    public static javax.swing.JLabel role_set;
    private javax.swing.JTextField user_text;
    // End of variables declaration//GEN-END:variables
}
