package lab1;

import java.util.*;


public class OperatorsAndAssignmentsEx5 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = calculateSum(n);
		System.out.println("Sum =" +res);

	}

	private static int calculateSum(int n) {
		// TODO Auto-generated method stub
		int sum = 0;
		//int n;
		for(int i=0;i<=n;i++) {
			if((i%3 == 0)||(i%5 == 0)) {
				sum+=i;
				
			}
			
		
	}
		return sum;


}}
