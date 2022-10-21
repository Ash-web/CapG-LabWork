package lab5;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	//if (age<15);
     public String toString() {
    	 return "Age is less than 15";
     }
	//System.out.println("Age is less than 15");
}


public class Ex1 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age");
		int age = sc.nextInt();
		if(age<15)
		try {
			throw new InvalidAgeException();
			
		}
		catch(InvalidAgeException e) {
			System.out.println("Enter value > than 15");
		}
	}
}
