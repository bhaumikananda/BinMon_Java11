package udemy.java.eleven.loopsNcondition;

import java.util.Scanner;

public class SwitchStatementString {

	public static void main(String[] args) {
		System.out.println("This is a switch test, please send input as String only (for family name)");
		
		Scanner scanner = new Scanner(System.in);
		String value = scanner.nextLine();
		scanner.close();
		
		switch (value) {
		case "Nitai Pada":
			System.out.println("Father First Name");
			break;
		case "Ananda":
			System.out.println("My First Name");
			break;
		case "Kashyap":
			System.out.println("Son First Name");
			break;
		case "Bhaumik":
			System.out.println("My Surname");
			break;
		default:
			System.out.println("Outside family stream");
			System.exit(0);
			break;
		}
	}

}
