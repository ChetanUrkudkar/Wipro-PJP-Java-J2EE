// Return last digit of given number
// https://tests.mettl.com/v2/authenticateKey/454f012b

package day4;

public class C {
	public static void main(String[] args) {
		int input1 = -197;
		System.out.println(lastDigitOf(input1));
	}
	
	public static int lastDigitOf(int input1) {
		if (input1 < 0) {
			input1 = (-1) * input1;
		}
		
		return input1 % 10;
	}
}