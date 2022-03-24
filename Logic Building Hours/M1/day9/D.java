// Weight of a hill pattern 
// https://tests.mettl.com/v2/authenticateKey/d612c0e6

package day9;

public class D {
	public static void main(String[] args) {
		int input1 = 4;
		int input2 = 1;
		int input3 = 5;
		System.out.println(totalHillWeight(input1, input2, input3));
	}
	
	public static int totalHillWeight(int input1, int input2, int input3) {
		
		int multiplier = 2;
		int sum = input2;
		int nextNum = input2;
		int count = 1;
		while (count != input1) {
			nextNum = nextNum + input3;
			sum = sum + (nextNum * multiplier);
			count += 1;
			multiplier += 1;
		}
		return sum;
	}
}
