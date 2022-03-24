/*
 QUESTION 5:
write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.
 */

package javaFundamentals;
import java.util.*;

public class Arrays5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Size of Array :");
		int size = input.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter Elements for Array :");
		for(int i=0; i<size; i++) {
			arr[i] = input.nextInt();
		}
		
		for(int i=0; i<size-1; i++) {
			for(int j=0; j<size-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("Largest 2 Elements : " +arr[size-1] + " and " + arr[size-2]);
		System.out.println("Smallest 2 Elements : " +arr[0] + " and " + arr[1]);
	}

}

/*
 OUTPUT:
Enter Size of Array :
5
Enter Elements for Array :
13
5
1998
10
20
Largest 2 Elements : 1998 and 20
Smallest 2 Elements : 5 and 10
 */