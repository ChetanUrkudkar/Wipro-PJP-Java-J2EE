// digitSum opt: sum of even or odd digits
// https://tests.mettl.com/v2/authenticateKey/a05abbcf

package day8;

public class D {
	public static void main(String[] args) {
		int input1 = 9625;
		String input2 = "odd";
		System.out.println(EvenOddDigitsSum(input1, input2));
	}
	
	public static int EvenOddDigitsSum(int input1, String input2) {
		
		if (input1 < 0) {
			input1 = (-1) * input1;
		}
		
		int temp = 0, oSum = 0, eSum = 0;
		while (input1 != 0) {
			temp = 0;
			temp = input1 % 10;
			if (temp % 2 == 0) {
				eSum = eSum + temp;
			} else {
				oSum = oSum + temp;
			}
			input1 = input1 / 10;
		}
		
		int returnValue = 0;
		if (input2.equals("even")) {
			returnValue = eSum;
		} else {
			returnValue = oSum;
		}
		
		return returnValue;
	}
}