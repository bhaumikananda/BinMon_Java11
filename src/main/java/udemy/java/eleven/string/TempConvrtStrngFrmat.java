package udemy.java.eleven.string;

import java.util.Locale;
import java.util.Scanner;

public class TempConvrtStrngFrmat {
	
	public static void main(String[] args) {
		Scanner scaleScanner = new Scanner(System.in);
		System.out.println("Enter the scale of temp you want to convert (c or f)>> ");
		String inputTempScale = scaleScanner.nextLine();
		
		Scanner valScanner = new Scanner(System.in);
		System.out.println("Enter the scale of temp you want to convert (use double value)>> ");
		double inputTempVal = valScanner.nextDouble();

		valScanner.close();
		scaleScanner.close();
		
		if (inputTempScale.equals("c")){
			System.out.println("Rcvd centigrd val "+String.format(Locale.ENGLISH, "%f", Double.valueOf(inputTempVal))+" it's faren val is "+ Double.valueOf(centiToFaren(inputTempVal)));
		}else if ((inputTempScale.equals("f"))) {
			System.out.println("Rcvd faren val "+String.format(Locale.ENGLISH, "%f", Double.valueOf(inputTempVal))+" it's centi val is "+Double.valueOf(farenToCenti(inputTempVal)));
		}else {
			System.out.println("Invalid Temperature scale received as input "+ inputTempScale);
		}

	}
	
	private static double centiToFaren(double centiTemp) {
		return ((centiTemp)*9)/5+32;
	}
	
	private static double farenToCenti(double farenhiteTemp) {
		return ((farenhiteTemp-32)*5)/9;	
	}
}
