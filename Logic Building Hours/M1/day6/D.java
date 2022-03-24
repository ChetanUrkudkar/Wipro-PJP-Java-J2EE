// Nth Prime
// https://tests.mettl.com/v2/authenticateKey/34fdaa41

package day6;

public class D {
	public static void main(String[] args) {
		int input1 = 5;
		System.out.println(NthPrime(input1));
	}
	
	public static int NthPrime(int input1) {
		
		if (input1 < 0) {
			input1 = (-1) * input1;
		}
		
		int count = 0, num = 1, i;
		while (count < input1) {
			num = num+1;
			for (i = 2; i <= num; i++) {
				if (num % i == 0) {
					break;
				}
			}
			if (i == num) {
				count += 1;
			}
		}
		return num;
	}
}
