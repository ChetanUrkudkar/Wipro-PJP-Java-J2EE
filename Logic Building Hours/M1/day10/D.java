// Most FrequentDigit
// https://tests.mettl.com/v2/authenticateKey/916310b8

package day10;
import java.util.*;

public class D {
	public static void main(String[] args) {
		int input1 = 123;
		int input2 = 234;
		int input3 = 345;
		int input4 = 673;
		System.out.println(MostFrequentDigit(input1, input2, input3, input4));
	}
	
	public static int MostFrequentDigit (int input1, int input2, int input3, int input4) {
		
		String allNo = String.valueOf(input1) + String.valueOf(input2) + String.valueOf(input3) + String.valueOf(input4);
		int[] digitFrequency = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; // 0-9
		
		for (int i = 0; i < allNo.length(); i++) {
			digitFrequency[Integer.parseInt(String.valueOf(allNo.charAt(i)))]++;
		}
		
		int max = Arrays.stream(digitFrequency).max().getAsInt();
		int mostFrequentDigit = 0;
		
		for (int i=9; i>=0; i--) {
			if (max == digitFrequency[i]) {
				mostFrequentDigit = i;
				break;
			}
		}
		
		return mostFrequentDigit;
	}
}
		
//		int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
//		getDigits(arr, input1);
//		getDigits(arr, input2);
//		getDigits(arr, input3);
//		getDigits(arr, input4);
//		
//		int max = Arrays.stream(arr).max().getAsInt();
//
//		int returnValue = 0;
//		for (int i=9; i>=0; i--) {
//			if (arr[i] == max) {
//				returnValue = i;
//				break;
//			}
//		}
//		return returnValue;		
//	}
//
//	public static int[] getDigits(int[] arr, int num){
//
//		while(num != 0) {
//			int temp = num % 10;
//			arr[temp]++;
//			num = num / 10;
//		}
//		return arr;	
//	}
//}
