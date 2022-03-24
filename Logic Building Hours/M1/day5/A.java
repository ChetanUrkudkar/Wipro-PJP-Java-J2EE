// Is N an exact multiple of M?
// https://tests.mettl.com/v2/authenticateKey/36c4ef58

package day5;

public class A {
	public static void main(String[] args) {
		int input1 = -3;
		int input2 = 27;
		System.out.println(isMultiple(input1, input2));
	}
	
	public static int isMultiple(int input1, int input2) {
		
		if (input1 == 0 || input2 == 0) {
			return 3;
		}
		
		if (input1 < 0) {
			input1 = (-1) * input1;
		}
		
		if (input1 % input2 == 0) {
			return 2;
		} else {
			return 1;
		}
	}
}
