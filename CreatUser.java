
package usermanagementsystem;

import static usermanagementsystem.ConnectionDB.DB_URL;
import static usermanagementsystem.ConnectionDB.USER;
import static usermanagementsystem.ConnectionDB.PASSWORD;
//import static usermanagementsystem.ConnectionDB.TABLE_NAME;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//import static usermanagementsystem.DBData.TABLE_NAME;

public class CreatUser {
//    Connection con;
//    Statement stmt;
            
    public boolean addUser(UserData userdata)throws SQLException{
        
        try(
                       //ConnectionDB con = new ConnectionDB();
                Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
                Statement stmt = con.createStatement();
                ){
                    String fname = userdata.getfname();
                    String lname = userdata.getlname();
                    String dob = userdata.getDOB();
                    String email = userdata.getEmail();
                    String username = userdata.getUsername();
                    String pass = userdata.getPassword();
                    String sql = "insert into userinfo values('"+fname+"','"+lname+"','"+dob+"','"+email+"','"+username+"','"+pass+"')";
//                String sql = String.format("INSERT INTO " + TABLE_NAME + "VALUES("
//                    + "'%s', '%s', '%s', '%s', '%s', '%s');" ,
//                    userdata.getfname(),
//                    userdata.getlame(),
//                    userdata.getDOB(),
//                    userdata.getEmail(),
//                    userdata.getUsername(),
//                    userdata.getPassword()
//                    );
                    stmt.executeUpdate(sql);
                    System.out.println("");
                    return true;
            
        
            }catch(Exception e){
            e.printStackTrace();
            return false;
        
            }
    }
    
}
