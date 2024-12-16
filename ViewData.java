
package usermanagementsystem;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.sql.ResultSet;
import static usermanagementsystem.ConnectionDB.con;
import static usermanagementsystem.ConnectionDB.stmt;
import static usermanagementsystem.DBData.DB_URL;


public class ViewData extends ConnectionDB{
    
    public ArrayList<UserData> viewAllUsers(){
        
        ArrayList<UserData> viewdata =new ArrayList();
        try{
            con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
                     stmt = con.createStatement();
                     
                     
                     ResultSet rs = stmt.executeQuery(String.format("SELECT * FROM %S; " , TABLE_NAME));
                     
                     while(rs.next()){
                         String first_name = rs.getString("fname");
                         String last_name = rs.getString("lname");
                         String date_of_birth = rs.getString("date_of_birth");
                         String email = rs.getString("email");
                         String user_name= rs.getString("username");
                         
                         
                         UserData userdata= new UserData(first_name,last_name,date_of_birth,email,user_name);
                         viewdata.add(userdata);
        
                     }
                
        }catch(Exception e){
            e.printStackTrace();
        
        
        }
    return viewdata;
    
    
    }
   
}
