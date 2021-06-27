package udemy.java.eleven.loopsNcondition;

public class StringEquals {

	public static void main(String[] args) {
		String textOne = "String Test";
		String textTwo = "String Test";
		
		boolean check = textOne == textTwo;
		System.out.println("String are identical " + check);
		System.out.println("String are identical " + textOne.equals(textTwo));

		String textOne_ = new String("String Test");
		String textTwo_ = new String("String Test");

		boolean checkOne =false;
		
		if(textOne_ == textTwo_) {
			checkOne = true;
		}else{
			checkOne = false;
		}
		System.out.println("String are identical " + checkOne);
		System.out.println("String are identical " + textOne_.equals(textTwo_));

	}

}
