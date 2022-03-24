// Is Palindrome Number?
// https://tests.mettl.com/v2/authenticateKey/28c41d9d

package day9;

public class A {
	public static void main(String[] args) {
		int input1 = 18981;
		System.out.println(isPalinNum(input1));
	}
	
	public static int isPalinNum(int input1) {
		
		if (input1 < 0) {
			input1 = (-1) * input1;
		}
		
		int num = input1, sum = 0;
		while (num != 0) {
			int temp = num % 10;
			sum = (sum * 10) + temp;
			num = num / 10;
		}
		
		int palinOk = 1;
		if (sum == input1) {
			palinOk = 2;
		}
		return palinOk;
	}
}