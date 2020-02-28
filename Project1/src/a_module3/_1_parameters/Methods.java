package a_module3._1_parameters;

public class Methods {

	public static void power2exp6() {
		System.out.println("2 to the 6 (2^6) = 64");
	}
	
	public static void printGrade(double score) {
		if (score >= 90.0) {
			System.out.println('A');
		} else if (score >= 80.0) {
			System.out.println('B');
		} else if (score >= 70.0) {
			System.out.println('C');
		} else if (score >= 60.0) {
			System.out.println('D');
		} else {
			System.out.println('F');
		}
	}

	public static void nPrintln(String message, int n) {
		for (int i = 0; i < n; i++)
			System.out.println(message);
	}


//	Question: Does is matter if main method is at the top or on the bottom? 
//	or somewhere else?
	public static void main(String[] args) {
		power2exp6();
		printGrade(78.5);
		nPrintln("Hello", 3);

		
	}

	
}
