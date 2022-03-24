/*
 QUESTION 10:
Print an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and print the given array, or make a new array.

evenOdd([1, 0, 1, 0, 0, 1, 1]) = [0, 0, 0, 1, 1, 1, 1]
evenOdd([3, 3, 2]) = [2, 3, 3]
evenOdd([2, 2, 2]) = [2, 2, 2]
 */


package javaFundamentals;
import java.util.*;

public class Arrays10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter size of Array :");
		int size = input.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter Elements for Array :");
		for(int i=0; i<size; i++) {
			arr[i] = input.nextInt();
		}
		
		int[] newArr = new int[size];
		
		int count = 0;
		for(int x: arr) {
			if(x % 2 == 0) {
				newArr[count] = x;
				count++;
			}
		}
		
		for(int x: arr) {
			if(x % 2 == 1) {
				newArr[count] = x;
				count++;
			}
		}
		
		for(int x: newArr) {
			System.out.print(x+ " ");
		}
		
	}
}

/*
 OUTPUT:
Enter size of Array :
5
Enter Elements for Array :
1
2
3
2
4
2 2 4 1 3 
 */
