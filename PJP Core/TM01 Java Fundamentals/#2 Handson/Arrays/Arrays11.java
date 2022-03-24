/*
 QUESTION 11:
Given an array of type int, print true if every element is 1 or 4. 

only14([1, 4, 1, 4]) = true
only14([1, 4, 2, 4]) = false
only14([1, 1]) = true
 */

package javaFundamentals;
import java.util.*;

public class Arrays11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter size of Array :");
		int size = input.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter Elements for Array :");
		for(int i=0; i<size; i++) {
			arr[i] = input.nextInt();
		}
		
		Boolean flag = false;
		for(int x: arr) {
			if ((x == 1) || (x == 4)) {
				continue;
			} else {
				flag = true;
				break;
			}
		}
		
		if(flag == false) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}

/*
 OUTPUT:
Enter size of Array :
5
Enter Elements for Array :
1
4
1
4
1
true

 OUTPUT:
Enter size of Array :
5
Enter Elements for Array :
1
4
2
4
3
false
 */
