
package usermanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
//import static usermanagementsystem.ConnectionDB.con;
//import static usermanagementsystem.ConnectionDB.stmt;
import static usermanagementsystem.DBData.DB_URL;
import static usermanagementsystem.DBData.PASSWORD;
import static usermanagementsystem.DBData.USER;
import java.util.Scanner;

public class RemoveUser{
    
    public void removeUser()throws SQLException {
        try (
               Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
                //Statement stmt = con.createStatement()){
            ){    
                System.out.print("Enter the User Name to remove: ");
                Scanner sr = new Scanner(System.in);
                String rname = sr.nextLine();
            //scanner.nextLine(); // clear the newline character

                PreparedStatement stmt = con.prepareStatement("DELETE FROM userinfo WHERE username = '"+rname+"';");
//            PreparedStatement statement = connection.prepareStatement(query);
//            statement.setInt(1, userId);
                stmt.executeUpdate();
                System.out.println("User deleted Successfuly");
                
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error removing user: " + e.getMessage());
        }
    }
}