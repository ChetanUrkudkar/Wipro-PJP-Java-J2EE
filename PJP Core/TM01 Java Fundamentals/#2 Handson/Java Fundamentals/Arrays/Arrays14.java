/*
 QUESTION 14:
Write a program to find the biggest number in a 3*3 array. The program is supposed to receive 9 integer numbers as command line arguments.

Example1:
C:\>java Sample 1 2 3
O/P: Please enter 9 integer numbers

Example2:
C:\>java Sample 1 23 45 55 121 222 56 77 89
O/P: 
The given array is :
1 23 45 
55 121 222 
56 77 89 
The biggest number in the given array is 222
 */

package javaFundamentals;
import java.util.*;

public class Arrays14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int m=1, n=3, p=3;
		int[][][] arr = new int[m][n][p];
		
		int icount = 0, jcount = 0, kcount = 0;
		
		System.out.println("Enter 9 Elements for 3x3 Array :");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				for(int k=0; k<p; k++) {
					arr[i][j][k] = input.nextInt();
				}
			}
		}
		
		System.out.println("\nThe Given 3D array :");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				for(int k=0; k<p; k++) {
					System.out.print(arr[i][j][k]+ " ");
				}
				System.out.println("");
			}
			System.out.println("");
		}
		
		int maxElement = arr[0][0][0];
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				for(int k=0; k<p; k++) {
					if (arr[i][j][k] > maxElement) {
						maxElement = arr[i][j][k];
					}
				}
			}
		}
		System.out.println("The biggest number in the given array is :" +maxElement);
	}
}

/*
 OUTPUT:
Enter 9 Elements for 3x3 Array :
1
23
45
55
121
222
56
77
89

The Given 3D array :
1 23 45 
55 121 222 
56 77 89 

The biggest number in the given array is :222
 */
