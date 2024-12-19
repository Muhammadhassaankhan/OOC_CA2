/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usermanagementsystem;

  //import java.sql.Statement;
//import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.ResultSet;
import static usermanagementsystem.DBData.DB_URL;
import static usermanagementsystem.DBData.PASSWORD;
import static usermanagementsystem.DBData.USER;

public class AdminLogin {
    
    AdminMenu log = new  AdminMenu();
    
    public void adminlogin()throws SQLException {
        
         try{
              Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
                Statement stmt = con.createStatement();
                
                Scanner sr = new Scanner(System.in);
                while(true){
                 System.out.println("\nEnter username\n");
                 String username = sr.nextLine();
                 System.out.println("Enter Password\n");
                 String password = sr.nextLine();
             
                String query = "select * from Admin_login where username ='"+username+"' and password ='"+password+"'";
                ResultSet rs = stmt.executeQuery(query);
                if (rs.next()){
                    System.out.println("Admin Login Successfully.........");
                    log.loging();
                }else{
                    System.out.println("User name or password is incorect");
                
                }
               // log.loging();
                }
                
         
         
         
            }catch(Exception e){
           
                e.printStackTrace();

         }
  
    
    }
   
}
    

