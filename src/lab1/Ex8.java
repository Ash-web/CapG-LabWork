package lab1;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = false;
Scanner sc = new Scanner(System.in);
System.out.println("Enter no.:");
int num = sc.nextInt();
while(num>1) {
		if(num%2 != 0) {
			flag = true;
			break;
	}
		num = num/2;
}
		if(flag) {
			System.out.println("No");
		}else {
			System.out.println("Yes");}
}

	}


