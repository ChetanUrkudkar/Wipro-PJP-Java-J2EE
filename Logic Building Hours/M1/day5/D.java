// Of 5 numbers, how many are even or odd?
// https://tests.mettl.com/v2/authenticateKey/607636d7

package day5;

public class D {
	public static void main(String[] args) {
		int input1 = 12;
		int input2 = 17;
		int input3 = 19;
		int input4 = -14;
		int input5 = 115;
		String input6 = "odd";
		
		System.out.println(countEvensOdds(input1, input2, input3, input4, input5, input6));
	}
	
	public static int countEvensOdds(int input1, int input2, int input3, int input4, int input5, String input6) {
		
		int[] arr = {input1, input2, input3, input4, input5};
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i] < 0) {
				arr[i] = (-1) * arr[i];
			}
		}
		
		int count = 0;
		if (input6.equals("even")) {
			for (int x : arr) {
				if (x % 2 == 0) {
					count += 1;
				}
			}
		} else {
			for (int x : arr) {
				if (x % 2 == 1) {
					count += 1;
				}
			}
		}
		return count;	
	}
}
