// Non-Repeated Digits counts
// https://tests.mettl.com/v2/authenticateKey/e46500f5

package day7;

public class D {
	public static void main(String[] args) {
		int input1 = 1015;
		System.out.println(NonRepeatedDigitsCount(input1));
	}
	
	public static int NonRepeatedDigitsCount(int input1) {
		
		if (input1 < 0) {
			input1 = (-1) * input1;
		}
		
		int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		while(input1 != 0) {
			int temp = input1 % 10;
			arr[temp]++;
			input1 = input1 / 10;
		}
		
		int count = 0; 
		for (int x : arr) {
			if (x == 1) {
				count += 1;
			}
		}
		return count;
	}
}
