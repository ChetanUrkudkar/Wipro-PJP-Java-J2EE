// Is Prime?
// https://tests.mettl.com/v2/authenticateKey/b1efaa3d

package day6;

public class A {
	public static void main(String[] args) {
		int input1 = 7;
		System.out.println(isPrime(input1));
	}
	
	public static int isPrime(int input1) {
		if (input1 < 0) {
			input1 = (-1) * input1;
		}
		
		boolean flag = true;
		for (int i=2; i<input1; i++) {
			if (input1 % i == 0) {
				flag = false;
				break;
			}
		}
		int finalCount = 0;
		if (flag) {
			finalCount = 2;
		} else {
			finalCount = 1;
		}
		
		return finalCount;
	}
}


