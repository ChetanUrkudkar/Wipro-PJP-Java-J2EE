// Factorial of a number
// https://tests.mettl.com/v2/authenticateKey/8c1f2ae

package day6;

public class B {
	public static void main(String[] args) {
		int input1 = 9;
		System.out.println(nFactorial(input1));
	}
	
	public static int nFactorial(int input1) {
		if (input1 < 0) {
			input1 = (-1) * input1;
		}
		
		int fact = 1;
		for (int i=2; i<=input1; i++) {
			fact = fact * i;
		}
		return fact;
	}
}
