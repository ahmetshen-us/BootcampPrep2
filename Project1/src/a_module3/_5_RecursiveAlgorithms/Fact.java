package a_module3._5_RecursiveAlgorithms;

public class Fact {

	public static void main(String[] args) {

		System.out.println(factorial(4));

	}
	public static int factorial(int n) {
	    int result = 1;
	    for (int i = 2; i <= n; i++) {
	        result *= i;
	    }
	    return result;
	}

	
//			factorial(5) = 5 * factorial(4)
//			factorial(4) = 4 * factorial(3)
//			factorial(3) = 3 * factorial(2)
//			factorial(2) = 2 * factorial(1)
//			factorial(1) = 1

}
