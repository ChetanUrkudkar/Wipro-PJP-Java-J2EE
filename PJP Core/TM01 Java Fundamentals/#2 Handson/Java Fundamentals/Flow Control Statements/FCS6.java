/*
QUESTION 6:
Write a program to accept gender ("Male" or "Female") and age from command line arguments and print the percentage of interest based on the given conditions.

If the gender is 'Female' and age is between 1 and 58, the percentage of interest is 8.2%.

If the gender is 'Female' and age is between 59 and 100, the percentage of interest is 9.2%.

If the gender is 'Male' and age is between 1 and 58, the percentage of interest is 8.4%.

If the gender is 'Male' and age is between 59 and 100, the percentage of interest is 10.5%.
 */

package javaFundamentals;

public class FCS6 {
	public static void main(String[] args) {
		
		String gender = args[0];
		int age = Integer.parseInt(args[1]);
		
		if (gender.equals("Male")) {
			if (age >= 1 && age <= 58) {
				System.out.println("The Percentage of interest is 8.4%");
			} else {
				System.out.println("The Percentage of interest is 10.5%");
			}
		} else {
			if (age >= 1 && age <= 58) {
				System.out.println("The Percentage of interest is 8.2%");
			} else {
				System.out.println("The Percentage of interest is 9.2%");
			}
		}
	}
}

/*
 OUTPUT:
 Male 25
 The Percentage of interest is 8.4%
 
 OUTPUT:
 Male 65
 The Percentage of interest is 10.5%
 
 OUTPUT:
 Female 25
 The Percentage of interest is 8.2%
 
 OUTPUT:
 Female 65
 The Percentage of interest is 9.2%
 */