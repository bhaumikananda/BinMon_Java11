package udemy.java.eleven.string;

import java.util.Locale;

public class StringFormatter {
	
	public static void main(String[] args) {
		double numberString = 2307.4589;
		System.out.println("Case 01 "+String.format(Locale.ENGLISH, "%a", numberString));
		System.out.println("Case 02 "+String.format(Locale.ENGLISH, "%b", numberString));
		System.out.println("Case 03 "+String.format(Locale.ENGLISH, "%5c", 'A'));// This is for left padding in Char
		System.out.println("Case 04 "+String.format(Locale.ENGLISH, "%5f", 45.0));// This is for left padding in number
		System.out.println("Case 05 "+String.format(Locale.ENGLISH, "%e", numberString));
		System.out.println("Case 06 "+String.format(Locale.ENGLISH, "%.2f", numberString));
		System.out.println("Case 07 "+String.format(Locale.ENGLISH, "%.8g", numberString));
		System.out.println("Case 08 "+String.format(Locale.ENGLISH, "%.8h", numberString));
		System.out.println("Case 10 "+String.format(Locale.ENGLISH, "%5o", 454));//print octal value of 454 with 5 left padding
		System.out.println("Case 11 "+String.format(Locale.ENGLISH, "%s", numberString));
		System.out.println("Case 11 "+String.format(Locale.ENGLISH, "%5x", 454));// print hex val with 5 left padding

	}

}
