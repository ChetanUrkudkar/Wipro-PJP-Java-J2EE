// weight of string
// https://tests.mettl.com/v2/authenticateKey/387952fc

package day10;

public class C {
	public static void main(String[] args) {
		String input1 = "All Zebras are Black & White!!";
		int input2 = 0;
		System.out.println(weightOfString(input1, input2));
	}
	
	public static int weightOfString(String input1, int input2) {
		int weight = 0;
		
		for (int i = 0; i < input1.length(); i++) {
			char letter = input1.charAt(i);
			
			if (input2 == 0) {
				if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || 
					letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
					continue;
				}
			}
			
			if (letter >= 65 && letter <= 90) {
				weight += letter - 64;
			} else if (letter >= 97 && letter <= 122) {
				weight += letter - 96;
			} 
		}
		return weight;
	}
}
//		String word = input1.replaceAll("[^a-zA-Z0-9]", "");
//
//		int sum = 0;
//		if (input2 == 0) {
//			word = word.replaceAll("[aeiouAEIOU]", "");
//			System.out.println(word);
//			for (int i=0; i<word.length(); i++) {
//				int ascii = word.charAt(i);
//				System.out.println(ascii);
//				if (ascii != 97 || ascii != 101 || ascii != 105 || ascii != 111 || ascii != 117 || ascii != 65 || ascii != 69 || ascii != 73 || ascii != 79 || ascii != 85) {
//				if (ascii != 101 || ascii != 97) {
//				if (ascii <= 90) {
//					ascii = ascii - 64;
//						System.out.println(ascii);
//					sum = sum + ascii;
//				} else {
//					ascii = ascii - 96;
//					sum = sum + ascii;
//				}
//			}
//		} else {
//			for (int i=0; i<word.length(); i++) {
//				int ascii = word.charAt(i);
//				if (ascii <= 90) {
//					ascii = ascii - 64;
//					sum = sum + ascii;
//				} else {
//					ascii = ascii - 96;
//					sum = sum + ascii;
//				}
//			}
//		}
//		return sum;