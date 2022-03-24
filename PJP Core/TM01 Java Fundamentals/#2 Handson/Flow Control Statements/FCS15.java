/*
 QUESTION 15:
Write a program to print * in Floyds format (using for and while loop)
*
*  *
*  *   *

Example1)
C:\>java Sample 
O/P: Please enter an integer number

Example2)
C:\>java Sample 3
O/P :
*
*  * 
*  *  *
*/

package javaFundamentals;
import java.util.*;

public class FCS15 {
	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		
		System.out.println("Enter a Number :");
		int num = input.nextInt();
		
		for (int i=1; i<=num; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}

/*
 OUTPUT:
Enter a Number :
5
*
**
***
****
*****
 */
