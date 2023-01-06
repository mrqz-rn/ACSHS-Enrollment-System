package cpe_may;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CPE_may {
    public static void main(String[] args) {
      try{
            String DBdir = "c:/ACSHS DATABASE/";
            File f1 = new File(DBdir);
            if(!f1.exists()){
                f1.mkdir();
            }
            String DB_name = "ACSHS_database.accdb";
            String DB_path = DBdir + "/" + DB_name;
            File f2 = new File(DB_path);
            if(!f2.exists()){
                InputStream iStream = CPE_may.class.getResourceAsStream("database/"+DB_name);
                Files.copy(iStream, f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
            }
            Connection con1=DriverManager.getConnection("jdbc:ucanaccess://" + DB_path);
            Statement st1 = con1.createStatement();
            System.out.println("DATABASE CONNECTED!");
            new start().setVisible(true);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
