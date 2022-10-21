package lab5;
import java.util.*;

class FullNameException extends Exception{
	public String toString() {
		return "Invalid";
	}
}
public class Ex2 {
	public static void main(String[] args) {
		String firstName;
		String lastName;
	
Scanner sc = new Scanner(System.in);
System.out.println("first name");
firstName = sc.nextLine();
System.out.println("last name");
lastName = sc.nextLine ();
try {
	if(firstName.isEmpty()||lastName.isEmpty()) {
		throw new FullNameException();
	}
	System.out.println("Full Name:" + firstName + " " + lastName);
}
catch(FullNameException e) {
	System.out.println("name is blank");
}
	}
}
