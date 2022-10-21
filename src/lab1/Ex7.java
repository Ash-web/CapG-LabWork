package lab1;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int currDig = num%10;
		num = num/10;

	while(num>0) {
		if(num<=num%10)
		{ flag=true;
		break;
		}
		currDig = num%10;
		num = num/10;
	}
	if(flag) {
		System.out.println("Not Increasing");
	}
	else
		System.out.println("Increasing");
}
}
