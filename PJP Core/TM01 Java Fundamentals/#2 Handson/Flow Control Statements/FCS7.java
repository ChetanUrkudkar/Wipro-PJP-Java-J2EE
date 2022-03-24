/*
 QUESTION 7:
Initialize a character variable with an alphabhet in a program.

If the character value is in lowercase, the output should be displayed in uppercase in the following format.

Example1)
i/p:a
o/p:a->A

If the character value is in uppercase, the output should be displayed in lowercase in the following format.

Example2)
i/p:A
o/p:A->a
 */

package javaFundamentals;
import java.util.*;

public class FCS7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a Character :");
		char ch = input.next().charAt(0);
		int ascii = ch;
		char new_ch = 0;
		
		if (ascii >= 97  && ch <= 122) {
			int new_ascii = ascii - 32;
			new_ch = (char)new_ascii;
		} else if (ch >= 65 && ch <= 90) {
			int new_ascii = ascii + 32;
			new_ch = (char)new_ascii;
		}
		System.out.println(new_ch);	
	}
}

/*
 OUTPUT:
Enter a Character :
h
H

 OUTPUT:
Enter a Character :
e
E
 */