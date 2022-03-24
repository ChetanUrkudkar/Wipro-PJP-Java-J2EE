// Return second last digit of given number
// https://tests.mettl.com/v2/authenticateKey/9f87004e

package day4;

public class D {
	public static void main(String[] args) {
		int input1 = -197;
		System.out.println(secondLastDigitOf(input1));
	}
	
	public static int secondLastDigitOf(int input1) {
		if (input1 < 0) {
			input1 = (-1) * input1;
		}
		int temp = 0;
		if (input1 < 10) {
			return -1;
		} else {
			int count = 0;
			while(input1 != 0) {
				count += 1;
				temp = 0;
				temp = input1 % 10;
				input1 = input1 / 10;
				if (count == 2) {
					break;
				}
			}
		}
		return temp;
	}
}