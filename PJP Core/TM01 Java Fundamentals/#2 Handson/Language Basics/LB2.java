/*
QUESTION 2:
Write a Program to accept a String as a command line argument and print a Welcome message as given below.

Examples 1)
C:\> Java Sample John
O/P Expected : welcome John
 */

package javaFundamentals;

public class LB2 {
	public static void main(String[] args) {
		System.out.println("Welcome " + args[0]);
	}
}

/*
 OUTPUT :
 Welcome 10
 */