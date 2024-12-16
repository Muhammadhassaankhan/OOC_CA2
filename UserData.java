
package usermanagementsystem;

public class UserData {
    
    private String fname;
    private String lname;
    private String date_of_birth;
    private String email;
    //private int phone_number;
    private String username;
    private String password;
    //private static int User_id=1;
    
    public UserData(){
    
    }
    
    
    public UserData(String fname,String lname,String date_of_birth,String email,String username){
        
        
        this.fname = fname;
        this.lname = lname;
        this.date_of_birth = date_of_birth;
        this.email = email;
   //   this.phone_number = phone_number;
        this.username = username;

    }
    public UserData(String fname,String lname,String date_of_birth,String email,String username,String password){
        this.fname = fname;
        this.lname = lname;
        this.date_of_birth = date_of_birth;
        this.email = email;
   //   this.phone_number = phone_number;
        this.username = username;
        this.password = password;
    }
    //setter 
    //public int getId() { return id; }
    //public void setId(int id) { this.id = id; }
    
    public void setfname(String fname) { 
        this.fname = fname;
    }
    
    public void setlname(String lname) { 
        this.lname = lname;
    }
    public void setDOB(String date_of_birth){
        this.date_of_birth = date_of_birth;
    }
//    public void setemail(String email){
//        this.email = email;
//    }
//    public void setUsername(String username) {
//        this.username = username;
//    }
    public void setPassword(String password) {
        this.password = password;
    }
    
//    public void setRole(String role) {
//        this.role = role; 
//    }
    
   
        //getter
    public String getfname() {
        return fname;
    }
//    public String getRole() {
//        return role; }
    public String getlname() {
        return lname;
    }
    public String getDOB() {
        return date_of_birth;
    }
       public String getEmail() {
         return email;
     }
    public String getUsername() {
        return username;
    }
  
    public String getPassword() {
        return password;
    }
   
    
    
}
