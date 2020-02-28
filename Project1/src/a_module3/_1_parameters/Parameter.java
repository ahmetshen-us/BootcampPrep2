package a_module3._1_parameters;

public class Parameter {
	
	/*
	 * So, for example, if I create my program in a way that I can enter in what I
	 * want the values of the things in green to be, then I can pretty easily reuse
	 * this code to, say, make oatmeal raisin cookies. This concept of passing in
	 * information to a method is called a parameter. A parameter is just a variable
	 * that is declared in your method, but whose value you set at the call of that
	 * method.
	 */
	
	public static void main(String[] args) {

		byte number = 8;
		System.out.print(number + " decimal = ");
		// print out one digit after the other
		System.out.print(number / 64);
		System.out.print((number % 64) / 32);
		System.out.print((number % 32) / 16);
		System.out.print((number % 16) / 8);
		System.out.print((number % 8) / 4);
		System.out.print((number % 4) / 2);
		System.out.print(number % 2);
		System.out.println(" binary.");

//		Very long repetitive code is not readable
//		To write the method, we need to determine: 
//		What name do we want to give the method?
//		How many parameters does it need?
//		What are the types of each parameter?
//		What names should we give the parameters?

//		Should the method be usable in an expression?
//				• If yes, determine the return type of the method
//				• If no, the return type is void

		displayInBinary((byte) 126);
		
		power2(6);
		
		power2(16); // 2 to the 16 = 65536
		power2(0); // 2 to the 0 = 1
		power2(7); // 2 to the 7 = 128

	}

	public static void displayInBinary(byte n) {
		System.out.print(n + " decimal = ");
		// print out one digit after the other
		System.out.print(n / 64);
		System.out.print((n % 64) / 32);
		System.out.print((n % 32) / 16);
		System.out.print((n % 16) / 8);
		System.out.print((n % 8) / 4);
		System.out.print((n % 4) / 2);
		System.out.print(n % 2);
		System.out.println(" binary.");
	}
	
	public static void power2(int exp) {
	    int result = 1;
	    for (int i = 1; i <= exp; i++) {
	        result *= 2;
	    }
	    System.out.println("2 to the " + exp + " = " + result);
	}
	
//	Question why defining result in the following method not a problem?
	public static void power(int base, int exp) {
	    int result = 1;
	    for (int i = 1; i <= exp; i++) {
	        result *= base;
	    }
	    System.out.println("base to the " + exp + " = " + result);
	}



}
