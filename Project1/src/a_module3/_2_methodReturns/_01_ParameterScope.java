package a_module3._2_methodReturns;

public class _01_ParameterScope {
//	Question: What pass by value vs pass by reference?

	public static void main(String[] args) {
		int x = 5;
		change(x);
		System.out.println(x);
	}

	private static void change(int x) {
		x = x * 10;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	 pass  variable in, but
//	really it's not the variable that's getting passed, it's the value five.
}
