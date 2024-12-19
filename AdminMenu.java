
package usermanagementsystem;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminMenu {
    
    public void loging()throws SQLException{
    CreatUser cru = new CreatUser();
            
            ViewData vu = new ViewData();
            
            Scanner sr = new Scanner(System.in);
            try{
                while(true){
                System.out.println("User Manangement System \n");
                System.out.println("Please select your require option \n");
                System.out.println("Press 1 for Register the user \n");
                System.out.println("press 2 for Retrieve data from database \n");
                System.out.println("press 3 for Delet User ");
                System.out.println("Press 4 for User Update Profile");
                System.out.println("press 5 for exit \n");
                System.out.println("Enter your choice \n");
                
                int ch = sr.nextInt();
                sr.nextLine();
                
                switch(ch){
                    case 1 -> {
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
                       
                    case 2 -> {
                        ArrayList<UserData> user = vu.viewAllUsers();
                        
                        if(user.isEmpty()){
                            System.out.println("No Data Found");
                        }else{
                            System.out.printf("%-5s | %-10s | %-10s | %-15s | %-8s", "\n fname","lname","Date_of_birth","email","username\n");
                            
                            System.out.println("--------------------------------------\n");
                            
                            for(UserData userdata: user){
                                System.out.printf("%-5s | %-10s | %-10s | %-15s | %-8s",
                                        userdata.getfname(),
                                        userdata.getlname(),
                                        userdata.getDOB(),
                                        userdata.getEmail(),
                                        userdata.getUsername());
                                System.out.println("");
                            }
                        }
                    }
                    case 3->{
                        RemoveUser rmv = new RemoveUser();
                        rmv.removeUser();
                    }
                    
                    case 4->{
                        
                        UpdateUser upduser = new UpdateUser();
                        upduser.userUpdate();
                        
                       
                    }
                    case 5 ->{
                        System.out.println("Thank you for using our User Management System");
                        System.out.println("Good luck..............");
                        sr.close();
                        System.exit(0);
                        return;
                        
                    }                
                        
                    default -> System.out.println("Wronge input");
                
                }
            }
            }
            catch(Exception e){
                e.printStackTrace();
            }
    }
    
}
