package lab3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex1 {
	
	public static void main(String[] args) {
		
		int sum = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Numbers as Strings ----->");
        String s = sc.next();
        
        System.out.println("You Entered ----->" + s);
        
        StringTokenizer st = new StringTokenizer(s," ");
        while(st.hasMoreTokens()) {
        	
        	int i = Integer.parseInt(st.nextToken());
        	System.out.println(i);
        	sum += i;	
        }
        System.out.println("The sum is: "+sum);
        sc.close();
	}}
        