/*
 QUESTION 17:
Write a Java program to find if the given number is palindrome or not

Example1)
C:\>java Sample 110011
O/P: 110011 is a palindrome

Example2)
C:\>java Sample 1234
O/P: 1234 is not a palindrome
 */

package javaFundamentals;
import java.util.*;

public class FCS17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num, temp, rem, reverse=0;
		System.out.println("Enter a Number :");
		num = input.nextInt();
		
		temp = num;
		
		while(temp != 0) {
			rem = temp%10;
			reverse = reverse * 10 + rem;
			temp = temp/10;
		}
		if (num == reverse) {
			System.out.println(num+ " is Palindrome");
		} else {
			System.out.println(num+ " is not palindrome");
		}
	}
}

/*
 OUTPUT:
Enter a Number :
1331
1331 is Palindrome

 OUTPUT:
Enter a Number :
1305
1305 is not palindrome
 */
