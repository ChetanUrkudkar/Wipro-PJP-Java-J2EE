/*
 QUESTION 16:
Write a program to reverse a given number and print

Example1)
I/P: 1234
O/P:4321

Example2)
I/P:1004
O/P:4001
 */


package javaFundamentals;
import java.util.*;

public class FCS16 {
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
		System.out.println(reverse);
	}
}


/*
 OUTPUT:
Enter a Number :
1234
4321
 */