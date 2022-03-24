// Unique Digits Counts
// https://tests.mettl.com/v2/authenticateKey/b7aac4a5

package day7;

public class C {
	public static void main(String[] args) {
		int input1 = 1015;
		System.out.println(UniqueDigitsCount(input1));
	}
	
	public static int UniqueDigitsCount(int input1) {
		
		if (input1 < 0) {
			input1 = (-1) * input1;
		}
		
		int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		while (input1 != 0) {
			int temp = input1 % 10;
			arr[temp]++;
			input1 = input1 / 10;
		}
		
		int count = 0;
		for (int x : arr) {
			if (x >= 1) {
				count += 1;
			}
		}
		return count;
	}
}