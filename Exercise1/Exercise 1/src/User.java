public class User {
     private String Username;
     private String Password;

     //constructor
     User(String uname, String pword){
        this.Username = uname;
        this.Password = pword;
     }


     //getters
     public String GetUsername() {
        return this.Username;
     }

     public String GetPassword() {
        return this.Password;
     }

    }
    
