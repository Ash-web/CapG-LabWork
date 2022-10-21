package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex2 m = new Ex2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int size = sc.nextInt();
		String[] arr = new String[size];
		System.out.println("Enter the elements: ");
		for(int i=0;i<size;i++) {
		arr[i] =sc.next();}
		m.sortStrings(arr);
		System.out.println("Solution: ");
for(int i=0;i<(size);i++) {
			System.out.print(arr[i] + " ");
		}

	}
		
		public String[] sortStrings(String arr[]) {
			Arrays.sort(arr);
			String s1,s2;
			int mid;
			for(int i=0;i<(arr.length);i++) {
				mid = (arr[i].length()/2);
				s1 = (arr[i].substring(0,mid)).toUpperCase();
				s2 = (arr[i].substring(mid,arr[i].length())).toLowerCase();
				arr[i]= s1+  s2;
			}
			return arr;
		}

		

}
