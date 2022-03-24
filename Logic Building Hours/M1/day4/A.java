// Is Even?
// https://tests.mettl.com/v2/authenticateKey/2bd025dc

package day4;

public class A {
	public static void main(String[] args) {
		int input1 = 4;
		System.out.println(isEven(input1));
	}
	
	public static int isEven(int input1) {
		if (input1 < 0) {
			input1 = (-1) * input1;
		}
		
		int returnValue = 0;
		if (input1 % 2 == 0) {
			returnValue = 2;
		} else {
			returnValue = 1;
		}
		return returnValue;
	}
}
