/*
QUESTION 4:
Initialize two character variables in a program and display the characters in alphabetical order.

Example1) if the first character is 's' and second character is 'e' then the output should be  e,s

Example2) if the first character is 'a' and second character is 'e', then the output should be a,e
 */

package javaFundamentals;
import java.util.*;

public class FCS4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter First Character :");
		char a = input.next().charAt(0);
		System.out.println("Enter Second Character :");
		char b = input.next().charAt(0);
		
		if (a>b) {
			System.out.println(b+ "," +a);
		} else {
			System.out.println(a+ "," +b);
		}
	}
}


/*
OUTPUT:
Enter First Character :
c
Enter Second Character :
h
c,h

OUTPUT:
Enter First Character :
t
Enter Second Character :
a
a,t
 */
