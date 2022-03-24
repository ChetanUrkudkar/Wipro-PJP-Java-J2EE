/*
 QUESTION 4:
 Initialize an integer array with ascii values and print the corresponding character values in a single row.
 */


package javaFundamentals;

public class Arrays4 {
	public static void main(String[] args) {
		
		int[] arr = {67, 104, 101, 116, 97, 110};
		
		for(int x : arr) {
			System.out.print((char)x + " ");
		}
	}
}

/*
 OUTPUT:
C h e t a n 
 */