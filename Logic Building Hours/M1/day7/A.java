// Number of Primes in a specified range
// https://tests.mettl.com/v2/authenticateKey/87c41143

package day7;

public class A {
	public static void main(String[] args) {
		int input1 = 2;
		int input2 = 20;
		System.out.println(countPrimesInRange(input1, input2));
	}
	
	public static int countPrimesInRange(int input1, int input2) {
		
		if (input1 < 0) {
			input1 = (-1) * input1;
		}
		if (input2 < 0) {
			input2 = (-1) * input2;
		}
		
		int count = 0;
		for (int i=input1; i<=input2; i++) {
			if (i == 1 || i == 0) {
				continue;
			}
			int flag = 1;
		    for (int j=2; j<=i/2; ++j) {
		    	if (i % j == 0) {
		        	flag = 0;
		           	break;
				}
			}
		    if (flag == 1) {
		    	count += 1;
		    }
		}
		return count;
	}
}