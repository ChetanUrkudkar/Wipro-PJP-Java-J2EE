/*
QUESTION 5:
Initialize a character variable in a program and 

print 'Alphabhet' if the initialized value is an alphabhet, 

print 'Digit' if the initialized value is a number, and 

print 'Special Character', if the initialized value is anything else.
 */

package javaFundamentals;
import java.util.*;

public class FCS5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a Character");
		char a = input.next().charAt(0);
		
		if(Character.isAlphabetic(a)) {
			System.out.println("Alphabet");
		} else if (Character.isDigit(a)) {
			System.out.println("Digit");
		} else {
			System.out.println("Special Character");
		}
	}
}

/*
OUTPUT:
Enter a Character
a
Alphabet

OUTPUT:
Enter a Character
A
Alphabet

OUTPUT:
Enter a Character
13
Digit

OUTPUT:
Enter a Character
+
Special Character
 */