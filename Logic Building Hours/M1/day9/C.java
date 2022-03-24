// Create PIN using alpha, beta, gamma
// https://tests.mettl.com/v2/authenticateKey/be582d9f

package day9;

public class C {
	public static void main(String[] args) {
		int input1 = 123;
		int input2 = 582;
		int input3 = 175;
		System.out.println(createPIN(input1, input2, input3));
	}
	
	public static int createPIN(int input1, int input2, int input3) {
		
		if (input1 < 0) {
			input1 = (-1) * input1;
		}
		if (input2 < 0) {
			input2 = (-1) * input2;
		}
		if (input3 < 0) {
			input3 = (-1) * input3;
		}
		
		
		int temp1 = 0, temp2 = 0, temp3 = 0;
		int min1 = 0, min2 = 0, min3 = 0;
		int max1 = 0, max2 = 0, max3 = 0, max = 0;
		int num1 = input1, num2 = input2, num3 = input3;
		int count = 0;
		int sum = 0;
		
		while (num1 != 0) {
			count += 1;
			temp1 = num1 % 10;
			temp2 = num2 % 10;
			temp3 = num3 % 10;
			
			if (count == 1) {
				min1 = Math.min(temp1, Math.min(temp2, temp3));
				max1 = Math.max(temp1, Math.max(temp2, temp3));
				sum = (min1 * 1) + sum;
			}
			if (count == 2) {
				min2 = Math.min(temp1, Math.min(temp2, temp3));
				max2 = Math.max(temp1, Math.max(temp2, temp3));
				sum = (min2 * 10) + sum;
			}
			if (count == 3) {
				min3 = Math.min(temp1, Math.min(temp2, temp3));
				max3 = Math.max(temp1, Math.max(temp2, temp3));
				sum = (min3 * 100) + sum;
			}
			
			num1 = num1 / 10;
			num2 = num2 / 10;
			num3 = num3 / 10;
		}
		max = Math.max(max1, Math.max(max2, max3));
		sum = (max * 1000) + sum;
		
		return sum;
	}
}