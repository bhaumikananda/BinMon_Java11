package udemy.java.eleven.variable;

public class TemperatureConvert {
	
	public static void main(String[] args) {
		System.out.println("32.0 degree Farenhite is equivalent to "+farenToCenti(32)+" Centigrade");
		System.out.println("00.0 degree Centigrade is equivalent to "+centiToFaren(0)+" Farenhite");
	}
	
	private static double farenToCenti(double farenhiteTemp) {
		return ((farenhiteTemp-32)*5)/9;	
	}

	private static double centiToFaren(double centiTemp) {
		return ((centiTemp)*9)/5+32;
	}
}
