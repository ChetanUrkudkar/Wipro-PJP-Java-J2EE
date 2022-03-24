// digitSum odd: sum of odd digits in N
// https://tests.mettl.com/v2/authenticateKey/738fdee0

package day8;

public class C {
	public static void main(String[] args) {
		int input1 = 2134;
		System.out.println(OddDigitsSum(input1));
	}
	
	public static int OddDigitsSum(int input1) {
		
		if (input1 < 0) {
			input1 = (-1) * input1;
		}
		
		int temp = 0, sum = 0;
		while(input1 != 0) {
			temp = input1 % 10;
			if (temp % 2 == 1) {
				sum = sum + temp;
			}
			input1 = input1 / 10;
		}
		return sum;
	}
}