package a_module3._2_overloading;

public class OverloadingMethods {

	public static void main(String[] args) {

	}

	public static void power(int base, int exp) {
		int result = 1;
		for (int i = 1; i <= exp; i++) {
			result *= base;
		}
		System.out.println("base to the " + exp + " = " + result);
	}
	
	public static void power(double base, double exp) {
	    // Kasey write better code here
	}
	
	public static void power2(int exp) {
	    power(2, exp);
	}

	
}
