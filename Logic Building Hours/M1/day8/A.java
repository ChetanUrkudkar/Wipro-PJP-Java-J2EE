// digitSum : Sum of all digits in N
// https://tests.mettl.com/v2/authenticateKey/ab1d60cc

package day8;

public class A {
	public static void main(String[] args) {
		int input1 = -976592;
		System.out.println(digitSum(input1));
	}
	
	public static int digitSum(int input1) {
		
		int negFlag = 0;
		if (input1 <= 0) {
			if (input1 < 0) {
				input1 = (-1) * input1;
				negFlag = 1;
			} else {
				return 0;
			}
		}
		
		int ans = addition(input1);
		
		if (negFlag == 1) {
			ans = ans * (-1);
		}
		
		return ans;
	}
	
	public static int addition(int input1) {
		
		int num = input1;
		int temp = 0;
		int sum = 0;
		while (num != 0) {
			temp = num % 10;
			num = num / 10;
			sum = sum + temp;
		}
		
		if (sum > 9) {
			int newSum = sum;
			sum = addition(newSum);
		}
		return sum;
	}
}