/*
 QUESTION 1.A:
 A) Write a program to check if a given integer number is Positive, Negative, or Zero.
 */


package javaFundamentals;
import java.util.*;

public class FCS1A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a Number :");
		int a = s.nextInt();
		
		if(a == 0) {
			System.out.println("Zero");
		} else {
			if (a > 0) {
				System.out.println("Positive");
			} else {
				System.out.println("Negative");
			}
		}
	}
}

/*
 OUTPUT :
 Enter a Number :
 0
 Zero
 
 Enter a Number :
 13
 Positive
 
 Enter a Number :
 -99
 Negative
 */