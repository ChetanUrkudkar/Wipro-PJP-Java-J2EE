/*
 QUESTION 2:
Write a program to initialize an integer array and find the maximum and minimum value of the array.
 */

package javaFundamentals;
import java.util.*;

public class Arrays2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Size of Array :");
		int size = input.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter Elements for Array :");
		for(int i=0; i<size; i++) {
			arr[i] = input.nextInt();
		}
		
		int maxElement = arr[0];
		for(int x : arr) {
			if(x > maxElement) {
				maxElement = x;
			}
		}
		System.out.println("Maximun : " +maxElement);
		
		int minElement = arr[0];
		for(int y : arr) {
			if(y < minElement) {
				minElement = y;
			}
		}
		System.out.println("Minimum : " +minElement);
	}
}

/*
 OUTPUT:
Enter Size of Array :
5
Enter Elements for Array :
48
21
99
23
17
Maximun : 99
Minimum : 17
 */