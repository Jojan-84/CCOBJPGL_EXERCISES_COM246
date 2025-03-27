import java.util.Scanner;
import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner skan = new Scanner(System.in);
        File deets = new File("accounts.txt"); 
        if (deets.exists()) {
            System.out.println("Shit's all good bro.");
        }
        Scanner reader = new Scanner(deets);



        System.out.println("Enter thine username, cuh");
        
        String name = skan.nextLine();

        System.out.println("Enter thine password, cuh");
        
        String pasword = skan.nextLine();


        User the_guy = new User(name, pasword);



        //System.out.println("Yo username is" + " " + name);
        //System.out.println("Yo password is" + " " +  pasword);

        

        boolean userPassed = false;
        while (reader.hasNextLine()) {
            String filedata = reader.nextLine();
            String user = filedata.split(",")[0];
            String word = filedata.split(",")[1];
            if (name.equals(user) && pasword.equals(word)) {
                userPassed = true;
                break;
            } else {
                continue;
            }
        }

        if (userPassed == true) {
            System.out.println("You have successfully logged in. What's good, " + the_guy.GetUsername());
        } else {
            System.out.println("Oh my gawsh, this is terrible, you seem to be lost oh my goodness oh my gosh you were wrong you aren't part of the login club you dingus you crocodile you absolute wet noodle I hope you eat undercooked lasAGNA.");
        }

         

        skan.close();	
        reader.close();
    }
}