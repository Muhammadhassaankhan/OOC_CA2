package usermanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
//import java.sql.PreparedStatement;
import java.sql.SQLException;
import static usermanagementsystem.DBData.DB_URL;
import static usermanagementsystem.DBData.PASSWORD;
import static usermanagementsystem.DBData.USER;


public class UsersLogin {
    
    public void loginUsers() throws SQLException {
        try(
            Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
                Statement stmt = con.createStatement();
              // PreparedStatement stmt = con.prepareStatement();
                )
        {
            Scanner sr = new Scanner(System.in);
            System.out.println("Enter Username OR Email: ");
            String username = sr.nextLine();
            System.out.println("Enter Password: ");
            String password = sr.nextLine();
            

            String query = "SELECT * FROM Userinfo WHERE username = '"+username+"' OR email = '"+username+"' AND password = '"+password+"'";
            ResultSet rs = stmt.executeQuery(query);
                if (rs.next()){
                    System.out.println("Login Successfully.........");
                    System.out.println("Welcome  " +rs.getString("fname") +" " +rs.getNString("lname") );
                    System.out.println("");
                    System.out.println("Update profile press 1");
                    System.out.println("View Profile press 2");
                    System.out.println("Logout press 3");
                    System.out.println("");
                    int ch = sr.nextInt();
                    sr.nextLine();
                    
                
                    switch (ch){
                        case 1:{
                    

                        System.out.println("update user info");
                        System.out.println("First name");
                        String nfname = sr.nextLine();
                        System.out.println("Second name");
                        String nlname = sr.nextLine();
                        System.out.println("Date of Birth");
                        String ndob = sr.nextLine();
                        System.out.println("Password");
                        String npass = sr.nextLine();
                        String qre ="update userinfo set fname = '"+nfname+"', lname = '"+nlname+"', date_of_birth = '"+ndob+"', password = '"+npass+"' where username = '"+username+"'";
                        stmt.executeUpdate(qre);
                        System.out.println(" User Profile Updated");
                        }break;
                        case 2:{
                            System.out.println("view profile");
                            //System.out.printf("fname: %s, lname: %s, email: %s, Date_of_Birth: %s\n",rs.getString("fname")
                        
                        
                        }
                        case 3:{
                            System.out.println("Logout Successfully");
                            sr.close();
                            System.exit(0);
                        }break;
                    
                        default:
                            System.out.println("Invalid Input!");
                        break;    
                    
                    }
                            
                 
                   
                   
                }else{
                    System.out.println("User name or password is incorect");
                
                }

        } catch(Exception e) {
                e.printStackTrace();  
        }
    }
    
}
