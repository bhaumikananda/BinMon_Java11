package udemy.java.eleven.variable;

public class VariableAssignment {
	
	public static void main(String[] args) {
		int primitiveCats = 10;
		int primitiveDogs = primitiveCats;
		primitiveCats = 14;
		System.out.println("Count of primitiveCat is "+ primitiveCats);
		System.out.println("Count of primitiveDog is "+ primitiveDogs);		
		
		Integer wrapCats = 10;
		Integer wrapDogs = wrapCats;
		wrapCats = 14;
		System.out.println("Count of wrapCat is "+ wrapCats);
		System.out.println("Count of wrapeDog is "+ wrapDogs);		
		
	}

}
