
package usermanagementsystem;
//import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
import java.util.Scanner;
//import static usermanagementsystem.DBData.DB_URL;
//import static usermanagementsystem.DBData.PASSWORD;
//import static usermanagementsystem.DBData.USER;
public class Login {
    CreatUser cru = new CreatUser();
    
    public static void main(String [] args)throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException
{
        if(ConnectionDB.setupDB()){
            System.out.println("Data base created successfully\n");
            
            AdminLogin adm = new AdminLogin();
//            

//            Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
//                Statement stmt = con.createStatement();
                System.out.println("");
                System.out.println("Welcome User Management System\n");
                System.out.println("Admin Login Press 1");
                System.out.println("User Login Press 2");
                System.out.println("New User Registration Press 3");
                System.out.println("For EXIT Press 4");
                System.out.println("Enter your choice\n");
                
                Scanner sr = new Scanner(System.in);
                int ch = sr.nextInt();
                sr.nextLine();
                
                switch(ch){
                    
                    case 1:{
                        // try{
//              Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
//                Statement stmt = con.createStatement();
//                        //Scanner sr = new Scanner(System.in);
//                 System.out.println("Enter username\n");
//                 String username = sr.nextLine();
//                 System.out.println("\n Enter Password");
//                 String password = sr.nextLine();
//             
//                String query = "select * from login where username ='"+username+"' and password ='"+password+"'";
//                java.sql.ResultSet rs = stmt.executeQuery(query);
//                if (rs.next()){
                    
//                }else{
//                    System.out.println("User name or password is incorect");
//                
//                }
//                }catch(Exception e){
//           
//                e.printStackTrace();

        // }
                adm.adminlogin();
                }
                    break;
                    case 2:{
                        System.out.println("user log in");
                    
                    
                    
                    }
                    case 3:{
                        System.out.println("Signup for Registration\n");
                        System.out.println("Enter user info");
                        System.out.println("First name");
                        String fname = sr.nextLine();
                        System.out.println("Second name");
                        String lname = sr.nextLine();
                        System.out.println("Date of Birth");
                        String dob = sr.nextLine();
                        System.out.println("email");
                        String email = sr.nextLine();
                        System.out.println("User Name");
                        String username = sr.nextLine();
                        System.out.println("Password");
                        String pass = sr.nextLine();
                        
                        UserData register = new UserData(fname,lname,dob,email,username,pass);
                        
                        if(cru.addUser(register)){
                            
                            System.out.println("User Created Successfully");
                        }
                        else{
                            System.out.println("There is something is missing unable to create Account");
                        }
                        
                    
                    
                    
                    }
                    case 4:{
                        System.out.println("Exit");
                    
                    
                    }
                    default:
                        System.out.println("invalid selection");
                        
                        
                
                
                
                }
                        
//                Scanner sr = new Scanner(System.in);
//                 System.out.println("Enter username\n");
//                 String username = sr.nextLine();
//                 System.out.println("\n Enter Password");
//                 String password = sr.nextLine();
//             
//                String query = "select * from login where username ='"+username+"' and password ='"+password+"'";
//                java.sql.ResultSet rs = stmt.executeQuery(query);
//                if (rs.next()){
//                    
//                }else{
//                    System.out.println("User name or password is incorect");
//                
//                }
        }else{
            System.out.println("there is some problem with connction");
            //return;
       }
    }
}