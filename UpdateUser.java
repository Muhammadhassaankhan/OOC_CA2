package usermanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.ResultSet;
import static usermanagementsystem.DBData.DB_URL;
import static usermanagementsystem.DBData.PASSWORD;
import static usermanagementsystem.DBData.USER;


public class UpdateUser {
    
    public void userUpdate() throws SQLException{
        
        
        try(
                Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
                Statement stmt = con.createStatement();
                ){
                //UserData usd = new UserData();
                    System.out.print("Enter the User Name for Update profile: ");
                    Scanner sr = new Scanner(System.in);
                    String updname = sr.nextLine();
                
                    System.out.println("update user info");
                    System.out.println("First name");
                    String nfname = sr.nextLine();
                    System.out.println("Second name");
                    String nlname = sr.nextLine();
                    System.out.println("Date of Birth");
                    String ndob = sr.nextLine();
                    System.out.println("Password");
                    String npass = sr.nextLine();
                    String qre ="update userinfo set fname = '"+nfname+"', lname = '"+nlname+"', date_of_birth = '"+ndob+"', password = '"+npass+"' where username = '"+updname+"'";
                    stmt.executeUpdate(qre);
                   
                    System.out.println(" User Profile Updated");
                    
                    
                       
                
                //String qry = "select * from userinfo where username = '"+updname+"'";
//                ResultSet rs = stmt.executeQuery(qry);
//                while(rs.next()){
                    
         //       }
//                    String fname = rs.getString("fname");
//                    String lname = rs.getString("lname");
//                    String dob = rs.getString("date_of_birth");
//                    String email = rs.getString("email");
//                    String username= rs.getString("username");
//                    
//                    
//                    UserData usd= new UserData(fname,lname,dob,email,username);
//                    
                    
//                    usd.setfname(nfname);
//                    usd.setlname(nlname);
//                    usd.setDOB(ndob);
//                    usd.setemail(nemail);
//                    usd.setUsername(nusername);
//                    usd.setPassword(npass);
//                UserData update = new UserData(nfname,nlname,ndob,nemail,nusername,npass);
//                        
//                        if(){
//                            
//                            System.out.println("Updated Record Successfully");
//                        }
//                        else{
//                            System.out.println("There is something is missing unable to create Account");
//                        }
//                }
       
        }catch(Exception e){
            e.printStackTrace();
        
        }

    }
    
}
