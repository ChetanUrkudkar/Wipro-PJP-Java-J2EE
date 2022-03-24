// Nth Fibonacci
// https://tests.mettl.com/v2/authenticateKey/f390cadf

package day6;

import java.util.*;

public class C {
	public static void main(String[] args) {
		int input1 = 8;
		System.out.println(nthFibonacci(input1));
	}
	
	public static int nthFibonacci(int input1) {
		List<Integer> arr = new ArrayList<Integer>();
		
		if (input1 < 0) {
			input1 = (-1) * input1;
		}
		
		arr.add(0);
		arr.add(1);
		
		for (int i=2; i<input1; i++) {
			int a = arr.get(i-1) + arr.get(i-2);
			arr.add(a);
		}
		
		return arr.get(input1-1);
	}

}
