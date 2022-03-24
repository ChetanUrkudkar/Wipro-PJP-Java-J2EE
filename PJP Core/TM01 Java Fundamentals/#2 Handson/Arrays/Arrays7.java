/*
 QUESTION 7:
Write a program to remove the duplicate elements in an array and print the same.
Example)
I/P:{12,34,12,45,67,89}
O/P:{12,34,45,67,89}
 */

package javaFundamentals;
import java.util.*;

public class Arrays7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Size of Array :");
		int size = input.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter Elements for Array :");
		for(int i=0; i<size; i++) {
			arr[i] = input.nextInt();
		}
		
		int[] newArr = new int[size];
		boolean[] mark = new boolean[size];
		
		for(int i=0; i<size; i++) {
			mark[i] = true;
		}
		for(int i=0; i<size; i++) {
			if(mark[i] == true) {
				for(int j=i+1; j<size; j++) {
					if(arr[i] == arr[j]) {
						mark[j] = false;
					}
				}
			}
		}
		
		for(int i=0; i<size; i++) {
			if(mark[i] == true) {
				newArr[i] = arr[i];
			}
		}
		
		int[] megaArr = new int[size];
		int count = 0;
		for(int x : newArr) {
			if (x != 0) {
				megaArr[count] = x;
				count++;
			}
		}
		
		int nonZero = size - count;
		for(int i=0; i<size-nonZero; i++) {
			System.out.print(megaArr[i]+ " ");
		}
	}
}

/*
 OUTPUT:
Enter Size of Array :
5
Enter Elements for Array :
1
4
7
1
6
4
2
1 4 7 6 2
 */