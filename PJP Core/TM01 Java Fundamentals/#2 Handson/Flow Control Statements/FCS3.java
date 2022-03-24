/*
QUESTION 3 :
Write a program to check if the program has received command line arguments or not.

If the program has not received arguments then print "No Values", else print all the values in a single line separated by ,(comma)

Example1) java Example
O/P: No values

Example2) java Example Mumbai Bangalore
O/P: Mumbai,Bangalore

[Hint: You can use length property of an array to check its length]
 */

package javaFundamentals;

public class FCS3 {
	public static void main(String[] args) {
		
		int k = args.length;
		
		if(k==0) {
			System.out.println("No Values");
		} else {
			for (String x : args) {
				System.out.print(x+ ",");
			}
//			String a = args[0];
//			for(int i=1;i<args.length;i++) {
//				a = a + "," + args[i];
//			}
//			System.out.println(a);
		}
	}
}

/*
 OUTPUT:
 No Values
 
 OUTPUT:
 Wipro Bangalore Chetan
 */
