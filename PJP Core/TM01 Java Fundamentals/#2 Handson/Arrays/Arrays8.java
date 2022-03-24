/*
 QUESTION:
Write a program to print the sum of the elements of an array following the given below condition.

If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.

Eg1) Array Elements - 10,3,6,1,2,7,9
O/P: 22   
[i.e 10+3+9]

Eg2) Array Elements - 7,1,2,3,6
O/P:19

Eg3) Array Elements - 1,6,4,7,9
O/P:10
 */

package javaFundamentals;
import java.util.*;

public class Arrays8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Size of Array :");
		int size = input.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter Elements for Array :");
		for(int i=0; i<size; i++) {
			arr[i] = input.nextInt();
		}
		
		int loc6 = 0;
		int loc7 = 0;
		for(int i=0; i<size; i++) {
			if (arr[i] == 6) {
				loc6 = i;
			} else if (arr[i] == 7) {
				loc7 = i;
			}
		}
		
		int sum = 0;
		if(loc6 < loc7) {
			for(int i=0; i<loc6; i++) {
				sum = sum + arr[i];
			}
			for(int i=loc7+1; i<size; i++ ) {
				sum = sum + arr[i];
			}
			System.out.println("SUM : " +sum);
		} else {
			for(int i=0; i<size; i++) {
				sum = sum + arr[i];
			}
			System.out.println("SUM : " +sum);
		}
	}
}

/*
 OUTPUT:
Enter Size of Array :
7
Enter Elements for Array :
10
3
6
1
2
7
9
SUM : 22

 OUTPUT:
Enter Size of Array :
5
Enter Elements for Array :
7
1
2
3
6
SUM : 19
 */