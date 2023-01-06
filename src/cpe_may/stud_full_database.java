package cpe_may;
import static cpe_may.stud_reg.user_ses;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class stud_full_database extends javax.swing.JFrame {
    int xMouse,yMouse,roll,loop=0;
    String tableRows;
    
    public stud_full_database() {
        
        initComponents();
        JButton [] btns = {jButton1,jButton2,jButton3,jButton4,jButton5};
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
            String countRow = "SELECT COUNT(Student_id,Stud_Fname,Stud_Mname,Stud_Lname,Stud_lrn,Stud_birth,Stud_gen,Course,Course_id,"
                    + "Stud_gr,Stud_birth,Stud_add,Stud_con,Stud_email,Guardian,Contact,Relation,ID) FROM school_rec";
            String query = "SELECT Student_id,Stud_Fname,Stud_Mname,Stud_Lname,Stud_lrn,Stud_birth,Stud_gen,Course,Course_id,"
                    + "Stud_gr,Stud_birth,Stud_add,Stud_con,Stud_email,Guardian,Contact,Relation,ID FROM school_rec";
            ResultSet rs = st.executeQuery(query);
            ResultSet rsCount = st.executeQuery(countRow);
            jTable1.setModel(DbUtils.resultSetToTableModel(rsCount));
            tableRows =  jTable1.getValueAt(0,0).toString();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            System.out.println(e);
        }
        // TO GET THE MODEL OF TABLE
        this.dm = (DefaultTableModel) jTable1.getModel();
        // TO GET THE MODEL OF TABLE
    }
        // SETTING THE MODEL
        DefaultTableModel dm;
        // SETTING THE MODEL
        
        
        private String getCelVal(int x, int y){
        return dm.getValueAt(x, y).toString();
        }
        private void writeToExcel(){
            XSSFWorkbook wb = new XSSFWorkbook();
            XSSFSheet ws = wb.createSheet();
            
            TreeMap<String,Object[]> data = new TreeMap<>();
            data.put("0",new Object[]{dm.getColumnName(0), dm.getColumnName(1), dm.getColumnName(2), dm.getColumnName(3)
        , dm.getColumnName(4), dm.getColumnName(5), dm.getColumnName(6), dm.getColumnName(7), dm.getColumnName(8)
        , dm.getColumnName(9), dm.getColumnName(10), dm.getColumnName(11), dm.getColumnName(12), dm.getColumnName(13)
        , dm.getColumnName(14), dm.getColumnName(15), dm.getColumnName(16), dm.getColumnName(17)} );
        roll = Integer.parseInt(tableRows);
        do{
            int ind = loop;
            loop++;
            String loopS = Integer.toString(loop);
            data.put(loopS, new Object[]{getCelVal(ind,0), getCelVal(ind,1), getCelVal(ind,2), getCelVal(ind,3), getCelVal(ind,4), getCelVal(ind,5)
            , getCelVal(ind,6), getCelVal(ind,7), getCelVal(ind,8), getCelVal(ind,9), getCelVal(ind,10), getCelVal(ind,11), getCelVal(ind,12)
            , getCelVal(ind,13), getCelVal(ind,14), getCelVal(ind,15), getCelVal(ind,16), getCelVal(ind,17)});
        }while(loop<roll);
	//data.put("1", new Object[]{getCelVal(0,0), getCelVal(0,1), getCelVal(0,2), getCelVal(0,3), getCelVal(0,4), getCelVal(0,5)
        //, getCelVal(0,6), getCelVal(0,7), getCelVal(0,8), getCelVal(0,9), getCelVal(0,10), getCelVal(0,11), getCelVal(0,12)
        //, getCelVal(0,13), getCelVal(0,14), getCelVal(0,15), getCelVal(0,16), getCelVal(0,17)});
        //---------------------------------------------------------------------------------------------
        //data.put("2", new Object[]{getCelVal(1,0), getCelVal(1,1), getCelVal(1,2), getCelVal(1,3), getCelVal(1,4), getCelVal(1,5)
        //, getCelVal(1,6), getCelVal(1,7), getCelVal(1,8), getCelVal(1,9), getCelVal(1,10), getCelVal(1,11), getCelVal(1,12)
        //, getCelVal(1,13), getCelVal(1,14), getCelVal(1,15), getCelVal(1,16), getCelVal(1,17)});
        //---------------------------------------------------------------------------------------------
        //data.put("3", new Object[]{getCelVal(2,0), getCelVal(2,1), getCelVal(2,2), getCelVal(2,3), getCelVal(2,4), getCelVal(2,5)
        //, getCelVal(2,6), getCelVal(2,7), getCelVal(2,8), getCelVal(2,9), getCelVal(2,10), getCelVal(2,11), getCelVal(2,12)
        //, getCelVal(2,13), getCelVal(2,14), getCelVal(2,15), getCelVal(2,16), getCelVal(2,17)});
        
        Set<String> ids = data.keySet();
        XSSFRow row;
        int rowID = 0;
        
        for(String key: ids){
            row = ws.createRow(rowID++);
            Object[] values = data.get(key);
            int cellID = 0;
            for(Object o: values){
                Cell cell = row.createCell(cellID++);
                cell.setCellValue(o.toString());
            }
        }
        try{
            FileOutputStream fos = new FileOutputStream(new File("C:/ACSHS Database/export.xlsx"));
            wb.write(fos);
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(stud_full_database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(stud_full_database.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        user_ses = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

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
        user_ses.setText("jLabel4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(user_ses)
                .addContainerGap(996, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(user_ses)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, -1));

        jPanel2.setBackground(new java.awt.Color(34, 40, 44));

        jLabel1.setFont(new java.awt.Font("Earthbound", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("STUDENT RECORD");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(54, 81, 120));
        jScrollPane1.setViewportView(jTable1);

        jComboBox1.setBackground(new java.awt.Color(21, 25, 26));
        jComboBox1.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Name", "LRN" }));
        jComboBox1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBox1.setName(""); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("OK");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Earthbound", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sort By:");

        jLabel3.setFont(new java.awt.Font("Earthbound", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Group By:");

        jComboBox2.setBackground(new java.awt.Color(21, 25, 26));
        jComboBox2.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "STEM", "AMB", "HUMSS", "CP", "AS", "EI" }));
        jComboBox2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("OK");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Original Database");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Export Table");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_return_30px.png"))); // NOI18N
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(350, 350, 350)
                        .addComponent(jLabel1)
                        .addGap(0, 412, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jButton5))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1040, 640));

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

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        new stud_main().show();
        stud_main.user_log.setText(user_ses.getText());
        this.setVisible(false);
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String DBdir = "c:/ACSHS DATABASE/";
        String DB_name = "ACSHS_database.accdb";
        String DB_path = DBdir + "/" + DB_name;
        try{
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://" + DB_path);
            Statement st = conn.createStatement();
            String query = "SELECT Student_id,Stud_Fname,Stud_Mname,Stud_Lname,Stud_lrn,Stud_birth,Stud_gen,Course,Course_id,"
                    + "Stud_gr,Stud_birth,Stud_add,Stud_con,Stud_email,Guardian,Contact,Relation,ID FROM school_rec";
            ResultSet rs = st.executeQuery(query);
             jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        writeToExcel();
        new export_succes().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stud_full_database().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public static javax.swing.JLabel user_ses;
    // End of variables declaration//GEN-END:variables
}
