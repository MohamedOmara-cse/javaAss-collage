package passwdValidation.java;
import java.util.Scanner;

public class MainClass {
public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	    String s1 = sc.nextLine();
	        boolean result = UserMainCode.display(s1);
	        if(result){
	         System.out.println("Valid password");
	        }else{
	         System.out.println("Invalid password");
	        }
	  }
	}
	class UserMainCode {
	   
	    
	    public static boolean display(String password){
	if(password.matches(".*[0-9]{1,}.*") && password.matches(".*[@#$]{1,}.*") && password.length()>=6 && password.length()<=20)
	                    {
	                                    return true;
	                    }
	                    else
	                    {
	                                    return false;
	                    }
	       }
}
