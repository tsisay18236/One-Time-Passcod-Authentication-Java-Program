import java.util.Scanner;
import java.util.Random;   //add Random class to Generate random otp
public class ZeroKnowledgeProofsOfOTP {


//method must define outside the main method   
public static char[] OTP(int len){
  System.out.println("Generating otp number random() : ");
  System.out.print("You OTP is : ");
  
  String numbers = "0123456789";
 // Using random method
  Random rndm_method = new Random();
  
  char[] otp = new char[len];
  
  for (int i = 0; i < len; i++) {
       // Use of charAt() method : to get character value
    // Use of nextInt() as it is scanning the value as int
       otp[i] =numbers.charAt(rndm_method.nextInt(numbers.length()));
   }
   return otp; //return the otp
}
  

public static void main(String[] args) {
// Creates a scanner
   Scanner sc = new Scanner(System.in);
    boolean valid = false;
    String userName;
    String password;
  
  
   do{ // start a loop
       // Asks user to enter password
       System.out.print("Please enter username:");
       userName = sc.nextLine();

      // Checks to see if password is at least 8 characters.
      if (userName.length()<6){
           valid = false;
           //System.out.println(" );
          continue; // skip to next iteration
       }

  do{ // start a loop
      // Asks user to enter password
       System.out.print("Now Please enter password:");
       password = sc.nextLine();

      // Checks to see if password is at least 8 characters.
      if(password.length()<8){
        valid = false;
        System.out.println("Password must have at least 8 characters");
        continue; // skip to next iteration
      }
   
   // Checks each character to see if it is acceptable.
   for (int i = 0; i < password.length(); i++){
      char c = password.charAt(i);

     if ( ('a' <= c && c <= 'z') // Checks if it is a lower case letter
          || ('A' <= c && c <= 'Z') //Checks if it is an upper case letter
          || ('0' <= c && c <= '9') //Checks to see if it is a digit
        )
      {
        valid = true;
      }//end if 
    else
    {
      // tells the user that only letters & digits are allowed
      System.out.println("Only letter & digits are acceptable.");
      valid = false;
      break;
    }//end else
  } //end for loop
 } while(!valid); // verify if the password is valid, if not repeat the process
} while (!valid); // verify if the userName is valid, if not repeat the process


    // if the password is valid, tell the user it's accepted
    System.out.println("Password Accepted");
    System.out.println("");
  
   int length = 4;
    System.out.println(OTP(length));

  }//end main
}//end class
  
