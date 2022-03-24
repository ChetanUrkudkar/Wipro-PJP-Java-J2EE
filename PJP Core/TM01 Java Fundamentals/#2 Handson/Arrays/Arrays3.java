/*
 QUESTION 3:
Write a program to initialize an integer array with values and check if a given number is present in the array or not.

If the number is not found, it will print -1 else it will print the index value of the given  number in the array.

Example 1) If the Array elements are  {1,4,34,56,7} and the search element is 90, then the output expected is -1.

Example 2)If the Array elements are  {1,4,34,56,7} and the search element is 56, then the output expected is 3.
 */

package javaFundamentals;
import java.util.*;

public class Arrays3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Size of Array :");
		int size = input.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter Elements for Array :");
		for(int i=0; i<size; i++) {
			arr[i] = input.nextInt();
		}
		
		System.out.println("Enter Search Element :");
		int search = input.nextInt();
		
		int j, flag = 0;
		for(j=0; j<size; j++) {
			if(arr[j] == search){
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println(-1);
		} else {
			System.out.println(j);
		}
	}
}

/*
 OUTPUT:
Enter Size of Array :
5
Enter Elements for Array :
78
16
489
35
69
Enter Search Element :
35
3

 OUTPUT:
Enter Size of Array :
5
Enter Elements for Array :
78
695
415
23
14
Enter Search Element :
89
-1
 */
