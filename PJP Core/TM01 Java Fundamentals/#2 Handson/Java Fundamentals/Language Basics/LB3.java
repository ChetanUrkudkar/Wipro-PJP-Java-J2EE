/*
QUESTION 3:
Write a Program to accept two integers as command line arguments and print the sum of the two numbers

Example1)
C:\>Java Sample 10 20
0/P Expected: The sum of 10 and 20 is 30
 */


package javaFundamentals;

public class LB3 {
	public static void main(String[] args) {
		
		int a, b, sum;
		
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		
		sum = a+b;
		
		System.out.println("The sum of " + a + " and " + b + " is " + sum);
	}

}

/*
 OUTPUT :
 The sum of 10 and 20 is 30
 */