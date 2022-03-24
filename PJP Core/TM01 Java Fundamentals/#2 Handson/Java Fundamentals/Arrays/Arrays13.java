/*
 QUESTION 13:
Write a program to reverse the elements of a given 2*2 array. Four integer numbers needs to be passed as Command Line arguments.

Example1)
C:\>java Sample 1 2 3
O/P: Please enter 4 integer numbers

Example2)
C:\>java Sample 1 2 3 4
O/P: 
 The given array is :
  1 2 
  3 4 
 The reverse of the array is :
  4 3 
  2 1
 */


package javaFundamentals;
import java.util.*;

public class Arrays13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int m=2, n=2;
		int[][] arr = new int[m][n];
		
		System.out.println("Enter 4 Elements for 2x2 Array :");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = input.nextInt();
			}
		}
		
		System.out.println("The Given 2D Array : ");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println("");
		}
		
		System.out.println("The Reversed 2D Array : ");
		for(int i=m-1; i>=0; i--) {
			for(int j=n-1; j>=0; j--) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println("");
		}
	}
}

/*
 OUTPUT:
Enter 4 Elements for 2x2 Array :
1
2
3
4
The Given 2D Array : 
1 2 
3 4 
The Reversed 2D Array : 
4 3 
2 1 

 */