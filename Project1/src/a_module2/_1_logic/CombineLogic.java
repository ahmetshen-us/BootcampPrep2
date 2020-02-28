package a_module2._1_logic;

public class CombineLogic {
	public static void main(String[] args) {
		boolean a = true;
		boolean b = true;
		boolean c = false;
		

		System.out.println(a && b && c); // evaluates to true - a AND b are both true
		System.out.println(a || b || c); // evaluates to true - a OR b (or both) are true - if not both are false it is always true  
		System.out.println(!a); // not a, negate
		
		System.out.println(a && b && !c); 
		
		
	}

}
