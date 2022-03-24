/*
 Question 1.B:
 B) Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57. 

     lastDigit(7, 17) = true
     lastDigit(6, 17) = false
     lastDigit(3, 113) = true
 */

package javaFundamentals;
import java.util.*;

public class FCS1B {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int a = input.nextInt();
		System.out.println("Enter Second Number");
		int b = input.nextInt();
		
		int a1 = SameDigit(a);
		int b1 = SameDigit(b);
		
		if (a1 == b1) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
	
	static int SameDigit(int x) {

		return x%10;
		
	}
}

/*
OUTPUT:
Enter First Number
7
Enter Second Number
17
True

OUTPUT:
Enter First Number
6
Enter Second Number
17
False
 */
