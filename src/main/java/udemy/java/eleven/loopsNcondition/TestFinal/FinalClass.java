package udemy.java.eleven.loopsNcondition.TestFinal;

public final class FinalClass {
	
	final int coreValue;
	
	public FinalClass(int coreValue) {
		super();
		this.coreValue = coreValue;
	}
	
	public int getCoreValue() {
		return coreValue;
	}


	public void print() {
		System.out.println("My core value is "+ coreValue);
	}

	
}
