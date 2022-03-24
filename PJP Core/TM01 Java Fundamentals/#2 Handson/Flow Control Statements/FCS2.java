/*
 QUESTION 2:
 Write a program to check if a given integer number is odd or even.
 */

package javaFundamentals;
import java.util.*;

public class FCS2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter A Number :");
		int num = input.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
}

/*
OUTPUT:
Enter A Number :
13
Odd

OUTPUT:
Enter A Number :
4
Even
*/