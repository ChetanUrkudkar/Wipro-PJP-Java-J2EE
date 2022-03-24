/*
 QUESTION 12:
Write a program to check if a given number is prime or not.
 */


package javaFundamentals;
import java.util.*;

public class FCS12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a Number :");
		int num = input.nextInt();
		
		int flag = 0;
		if (num > 1) {
			for(int i=2; i<num; ++i) {
				if(num%i==0) {
					flag = 1;
				}
			}
		}
		if (flag == 0) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
	}
}

/*
 OUTPUT:
Enter a Number :
13
Prime

 OUTPUT:
Enter a Number :
1998
Not Prime
 */
