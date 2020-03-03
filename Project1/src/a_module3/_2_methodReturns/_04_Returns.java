package a_module3._2_methodReturns;

public class _04_Returns {
	public static void main(String[] args) {
		System.out.println(power(2,6));

		int x = power(2,6);
		System.out.println(x);


	}
	
	public static int power(int base, int exp) {
	    int result = 1;
	    for (int i = 1; i <= exp; i++) {
	        result *= base;
	    }
	    return result;
	}
	
	
//	public static ReturnType myMethod(parameters) {
//	    return ReturnTypeData;
//	}


}
