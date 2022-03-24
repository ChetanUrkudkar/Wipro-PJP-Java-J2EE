// Of given 5 numbers, how many are even?
// https://tests.mettl.com/v2/authenticateKey/8edbe922

package day5;

public class B {
	public static void main(String[] args) {
		int input1 = 15;
		int input2 = 0;
		int input3 = -12;
		int input4 = 19;
		int input5 = 28;
		System.out.println(countEvens(input1, input2, input3, input4, input5));
	}
	
	public static int countEvens(int input1, int input2, int input3, int input4, int input5) {
		int[] arr = {input1, input2, input3, input4, input5};
		
		int count = 0;
		for (int x : arr) {
			
			if (x % 2 == 0) {
				count += 1;
			}
		}
		return count;
	}
}
