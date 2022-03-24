/*
 QUESTION 1:
Write a program to initialize an integer array and print the sum and average of the array.
 */

package javaFundamentals;
import java.util.*;

public class Arrays1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the size of array :");
		int n = input.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter 5 elements for array :");
		for (int i=0; i<n; i++) {
			arr[i] = input.nextInt();
		}
		
		int sum = 0;
		for(int x : arr) {
			sum = sum + x;
		}
		System.out.println("Sum = " +sum);
		
		float average;
		average = sum/n;
		System.out.println("Average = " +average);
	}
}


/*
 OUTPUT:
Enter the size of array :
5
Enter 5 elements for array :
12
48
95
63
2
Sum = 220
Average = 44.0
 */