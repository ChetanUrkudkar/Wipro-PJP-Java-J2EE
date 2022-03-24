// Is Odd?
// https://tests.mettl.com/v2/authenticateKey/dbdac2a9

package day4;

public class B {
	public static void main(String[] args) {
		int input1 = 13;
		System.out.println(isOdd(input1));
	}
	
	public static int isOdd(int input1) {
		if (input1 < 0) {
			input1 = (-1) * input1;
		}
		
		int returnValue = 0;
		if (input1 % 2 == 1) {
			returnValue = 2;
		} else {
			returnValue = 1;
		}
		return returnValue;
	}
}
