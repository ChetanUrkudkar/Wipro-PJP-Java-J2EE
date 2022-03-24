/*
 QUESTION 9:
Print a version of the given array where all the 10's have been removed. The remaining elements should shift left towards the start of the array as needed, and the empty spaces at the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and display the given array or make a new array.

withoutTen([1, 10, 10, 2]) = [1, 2, 0, 0]
withoutTen([10, 2, 10]) = [2, 0, 0]
withoutTen([1, 99, 10]) = [1, 99, 0]
 */

package javaFundamentals;
import java.util.*;

public class Arrays9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter size of Array :");
		int size = input.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter Elements for Array :");
		for(int i=0; i<size; i++) {
			arr[i] = input.nextInt();
			if (arr[i] == 10) {
				arr[i] = 0;
			}
		}
		
		int[] newArr = new int[size];
		
		int count = 0;
		for(int x : arr) {
			if (x != 0) {
				newArr[count] = x;
				count++;
			}
		}
		
		for(int x : newArr) {
			System.out.print(x+ " ");
		}
	}

}

/*
 OUTPUT:
Enter size of Array :
7
Enter Elements for Array :
1
10
3
10
9
6
7
1 3 9 6 7 0 0 
 */