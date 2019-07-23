package pack3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	
	public static void main(String args[]) {
		
		System.out.println("Menu:\n1.Email Validation\n2.Service Provider Identification");
		Scanner sc = new Scanner(System.in);
		int choice = Integer.parseInt(sc.nextLine());
		if(choice==1) {
			System.out.println("Enter your choice:");
			String email=sc.nextLine();
			if(validateEmailId(email))
				System.out.println("Enter the email to be validated:");
			else
				System.out.println("Emailis valid");
		 }
		else if(choice==2) {
			System.out.println("Enter the mobile number to identify the service provider:");
			String email=sc.nextLine();
			String s=identifyServiceProvider(email);
			if(s!=null)
				System.out.println("Mobile number belongs to "+s);
			else
				System.out.println("Mobile number is not identified");
		 }
			
}

	
	
	
public 	static String identifyServiceProvider(String mobile) {
	String p =mobile.substring(0,4);
	if(p.equals("9870"))
		return "Airtel";
	else 
		if(p.equals("7012"))		
	return "Jio";
		else
			if(p.equals("8180"))
				return "Vodafone";
	return null;
	
}
	
	
	

public 	static Boolean validateEmailId(String email)  {
	Boolean flag=Pattern.matches("[a-zA-z]{1}[a-zA-Z0-9._]{1,}@[a-zA-Z]{1,}.[a-zA-Z]{2,6}", email);
	
	
	return flag;
		

	}

}
