/*
 QUESTION 11:
Write a program to print even numbers between 23 and 57. Each number should be printed in a separate row.
 */

package javaFundamentals;

public class FCS11 {
	public static void main(String[] args) {
		
		for(int i = 23; i<=57; ++i) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}

/*
 OUTPUT:
24
26
28
30
32
34
36
38
40
42
44
46
48
50
52
54
56
 */
