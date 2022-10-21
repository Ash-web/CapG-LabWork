package lab1;

import java.util.*;

public class Ex6 {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a no. :");
	int n = sc.nextInt();
	int diff = calculateDifference(n);
	System.out.println("Diff = " +diff);
}
static int calculateDifference(int n) {
	int sq1 = 0;
	int sq2 = 0;
	int res=0;
	for(int i = 0;i<=n;i++) {
		sq1+=i*i;
		sq2+=i;
		res = (sq1 - (sq2*sq2));
	}
	return res;
}
}
