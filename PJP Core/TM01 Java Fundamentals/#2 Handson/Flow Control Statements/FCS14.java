/*
 QUESTION 14:
Write a program to print the sum of all the digits of a given number.
Example1) 
I/P:1234
O/P:10
 */


package javaFundamentals;
import java.util.*;

public class FCS14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num, temp, rem, sum = 0;
		System.out.println("Enter a Number :");
		num = input.nextInt();
		
		temp = num;
		
		while (temp != 0) {
			rem = temp % 10;
			temp = temp / 10;
			sum = sum + rem;
		}
		System.out.println(sum);
	}


}

/*
 OUTPUT:
Enter a Number :
1234
10
 */
