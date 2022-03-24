// All Digits Counts
// https://tests.mettl.com/v2/authenticateKey/ed6b4da

package day7;

public class B {
	public static void main(String[] args) {
		int input1 = 1015;
		System.out.println(allDigitsCount(input1));
	}
	
	public static int allDigitsCount(int input1) {
		
		if (input1 < 0) {
			input1 = (-1) * input1;
		}
		
		int count = 0;
		while (input1 != 0) {
			input1 = input1 / 10;
			count += 1;
		}
		return count;
	}
}