// Sum of last digits of two given numbers
// https://tests.mettl.com/v2/authenticateKey/783a1fcf

package day4;

public class E {
	public static void main(String[] args) {
		int input1 = 267;
		int input2 = -154;
		System.out.println(addLastDigits(input1, input2));
	}
	
	public static int addLastDigits(int input1, int input2) {

		if (input1 < 0) {
			input1 = (-1) * input1;
		} 
		if (input2 < 0) {
			input2 = (-1) * input2;
		}
		
		return ((input1 % 10) + (input2 % 10));
	}
}
