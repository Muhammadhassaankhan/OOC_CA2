package usermanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class ConnectionDB extends DBData {
    
   static Connection con;
    static Statement stmt;
    
    public static boolean setupDB ()throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException
        {
            // Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
               
        try{
               Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                     con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
                     stmt = con.createStatement();
                     //stmt.execute("CREATE DATABASE IF NOT EXIST " +DB_NAME+ ";" );
                     
                     stmt.execute("USE " + DB_NAME + ";");
                    //String sql = "CREATE TABLE IF NOT EXISTS " + LOGIN+ "( "
                      //      + "uname VARCHAR(50)," + "password VARCHAR(50),"+ ");";
                    
                    //stmt.execute(sql);
                    return true;
    
    
    
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        }
}