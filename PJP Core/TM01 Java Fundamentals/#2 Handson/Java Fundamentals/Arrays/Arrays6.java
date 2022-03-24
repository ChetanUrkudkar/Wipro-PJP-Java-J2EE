/*
 QUESTION 6:
Write a program to initialize an array and print them in a sorted order.
 */

package javaFundamentals;
import java.util.*;

public class Arrays6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Size of Array :");
		int size = input.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter Elements for Array :");
		for(int i=0; i<size; i++) {
			arr[i] = input.nextInt();
		}
		
		for(int j=0; j<size-1; j++) {
			for(int k=0; k<size-j-1; k++) {
				if (arr[k] > arr[k+1]) {
					int temp = arr[k];
					arr[k] = arr[k+1];
					arr[k+1] = temp;
				}
			}
		}
		
		for(int x: arr) {
			System.out.print(x + " ");
		}
	}
}

/*
 OUTPUT
Enter Size of Array :
5
Enter Elements for Array :
13
5
1998
10
20
5 10 13 20 1998 
 */
