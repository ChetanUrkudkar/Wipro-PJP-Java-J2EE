/*
 QUESTION 13:
Write a program to print prime numbers between 10 and 99.
 */

package javaFundamentals;

public class FCS13 {
	public static void main(String[] args) {
		
		int flag = 0;
		int j;
		for(int i=10; i<=99; i++) {
			for(j=2; j<i; j++) {
				if(i % j == 0) {
					flag = 1;
				}
			}
			if (flag == 0) {
				System.out.println(i);
			}
			flag = 0;
		}
	}
}

/*
 OUTPUT:
11
13
17
19
23
29
31
37
41
43
47
53
59
61
67
71
73
79
83
89
97
 */
