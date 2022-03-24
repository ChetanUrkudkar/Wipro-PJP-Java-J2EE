// is Palindrome (string)
// https://tests.mettl.com/v2/authenticateKey/ffe8042

package day10;

public class B {
	public static void main(String[] args) {
		String input1 = "madAM";
		System.out.println(isPalindrome(input1));
	}
	
	public static int isPalindrome(String input1) {
		
		String word1 = input1.toLowerCase();
		String[] wordArr = word1.split("");

		String revWord = "";
		for (String x : wordArr) {
			revWord = x + revWord;
		}

		int returnValue = 0;
		if (word1.equals(revWord)) {
			returnValue = 2;
		} else {
			returnValue = 1;
		}

		return returnValue;
	}
}