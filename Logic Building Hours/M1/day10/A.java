// Return second word inUppercase
// https://tests.mettl.com/v2/authenticateKey/4a72723f

package day10;

public class A {
	public static void main(String[] args) {
		String input1 = "Wipro Technologies Bangalore";
		System.out.println(secondWordUpperCase(input1));
	}
	
	public static String secondWordUpperCase(String input1) {
		
		String[] word = input1.split(" ", 3);

		int count = 0;
		for (int i=0; i<word.length; i++) {
			count += 1;
		}

		String returnValue;
		if (count >= 2) {
			returnValue = word[1].toUpperCase();
		} else {
			returnValue = "LESS";
		}
		return returnValue;
	}
}
