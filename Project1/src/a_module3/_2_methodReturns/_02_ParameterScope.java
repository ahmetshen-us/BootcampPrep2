package a_module3._2_methodReturns;

public class _02_ParameterScope {

	public static void main(String[] args) {
		int x = 5;
		
//		Capturing the return value from method
		x = change(x);
		System.out.println(x);
	}

//	What did void mean? 
//	Now we have int, what does that mean?
	private static int change(int x) {
		x = x * 10;
		return x;
		
//		What is return here, what does is mean?
		
//		Warning, do not put any more statements after return statement
//		Return should be the last statement in a method
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	A return is a specific way to send information out of a method.
//	What it does is it at the very end of a method, sends back
//	a single piece of information that says, hey, I've done all my work.
//	Here are my results.
}
