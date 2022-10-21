package lab2;
import java.lang.reflect.Array;
import java.util.*;

public class Ex1 {
public static void main(String args[]) {
	int size;
	Scanner sc1 = new Scanner(System.in);
	
	System.out.println("Enter size:");
	size = sc1.nextInt();
	
	int[] arr1 = new int[size];
	Scanner sc2 = new Scanner(System.in);
	System.out.println("Enter elements:");
	for(int i=0;i<arr1.length;i++) {
        arr1[i] = sc2.nextInt();
}
	int min = Integer.MAX_VALUE;
	for(int i =0;i<arr1.length;i++) {
		if(arr1[i]<min) {
			min = arr1[i];
		}
	}
	//System.out.println("");
	int min2 = Integer.MAX_VALUE;
	for(int i =0;i<arr1.length;i++) {
		if(arr1[i]>min && arr1[i]<min2) {
			min2 = arr1[i];
		}
	}
	System.out.println("Second smallest:" +min2);
	
	
}}
	
