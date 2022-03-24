/*
 QUESTION 12:
Given 2 int arrays, a and b, each length 3, form a new array of length 2, containing their middle elements.

middleWay([1, 2, 3], [4, 5, 6]) = [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) = [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) = [2, 4]
 */

package javaFundamentals;
import java.util.*;

public class Arrays12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		System.out.println("Enter size of Array :");
//		int size = input.nextInt();
		
		int[] arrOne = new int[3];
		int[] arrTwo = new int[3];
		int[] arrThree = new int[2];
		
		System.out.println("Enter 3 Elements for Array #1 :");
		for(int i=0; i<3; i++) {
			arrOne[i] = input.nextInt();
		}
		
		System.out.println("Enter 3 Elements for Array #2 :");
		for(int i=0; i<3; i++) {
			arrTwo[i] = input.nextInt();
		}
		
		arrThree[0] = arrOne[1];
		arrThree[1] = arrTwo[1];
		
		for(int x: arrThree) {
			System.out.print(x+ " ");
		}
 	}
}

/*
 OUTPUT:
Enter 3 Elements for Array #1 :
1
2
3
Enter 3 Elements for Array #2 :
4
5
6
2 5 
 */