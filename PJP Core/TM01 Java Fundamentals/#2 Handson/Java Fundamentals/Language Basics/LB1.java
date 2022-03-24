/*
QUESTION 1:
Write a Program that accepts two Strings as command line arguments and generate the output in the required format.

Example1)
If the two command line arguments are Wipro and Bangalore then the output generated should be Wipro Technologies Bangalore.

Example2)
of the command line arguments are ABC and Mumbai then the output generated should be ABC Technologies Mumbai

[Note: It is mandatory to pass two arguments in command line]
 */


package javaFundamentals;

public class LB1 {
	public static void main(String[] args) {
		System.out.println(args[0] + " Technologies " + args[1]);
	}
}

/*
 OUTPUT :
 Wipro Technologies Bangalore
 */