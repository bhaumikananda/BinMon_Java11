package udemy.java.eleven.loopsNcondition;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		System.out.println("This is a switch test, please send input as int only between (except 10 or more)");
		
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();

		switch (value) {
		case 0:
			System.out.println("Selected Zero");
			break;
		case 1:
			System.out.println("Selected One");
			break;
		case 2:
			System.out.println("Selected Two");
			break;
		case 3:
			System.out.println("Selected Three");
			break;
		case 4:
			System.out.println("Selected Four");
			break;
		case 5:
			System.out.println("Selected Five");
			break;
		case 6:
			System.out.println("Selected Six");
			break;
		case 7:
			System.out.println("Selected Seven");
			break;
		case 8:
			System.out.println("Selected Eight");
			break;
		case 9:
			System.out.println("Selected Nine");
			break;
		case 10:
			System.out.println("Selected Ten, this is invalid");
			scanner.close();
			System.exit(0);
			break;
		default:
			System.out.println("Selected more than Ten, this is invalid");
			scanner.close();
			System.exit(0);
			break;
		}
	}

}
