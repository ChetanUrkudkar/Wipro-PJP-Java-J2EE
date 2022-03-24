// Is Palindrome Possible?
// https://tests.mettl.com/v2/authenticateKey/f4fdb02

package day9;

public class B {
	public static void main(String[] args) {
		int input1 = 21251; 
		System.out.println(isPalinNumPossible(input1));
	}
	
	public static int isPalinNumPossible(int input1) {
		
		if (input1 < 0) {
			input1 = (-1) * input1;
		}
		
		int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		int num = input1, temp = 0, digits = 0;
		while (num != 0) {
			temp = 0;
			temp = num % 10;
			digits += 1;
			arr[temp]++;
			num = num / 10;
		}
		
		int flag = 0, oddCount = 0;
		if (digits % 2 == 0) {
			for (int x : arr) {
				if (x % 2 != 0) {
					flag = 1;
					break;
				}
			}
		} else {
			for (int x : arr) {
				if (x % 2 != 0) {
					oddCount += 1;
					if (oddCount > 1) {
						flag = 1;
						break;
					}
				}
			}
		}
		
		int returnValue = 0;
		if (flag == 0) {
			returnValue = 2;
		} else {
			returnValue = 1;
		}
		
		return returnValue;
	}
}