package a_module3._1_parameters;

public class Methods2 {

	public static void main(String[] args) {
		
		for (int k = 0; k < 3; k++) {
			
			printDigitsOneLine(); // 000111222333444555666777888999
			
			if (k < 2)
				System.out.println();
		}
		
		System.out.println();
		System.out.println();
	
		for (int i = 1; i < 8; i++) {
			for (int j = 0; j < i; j++) { // one line rakam repeat
				System.out.print(i);
			}
			System.out.println();
		}
	}

	private static void printDigitsOneLine() {
		for (int i = 0; i < 10; i++) { // 0 - 9
			printDigits3Times(i); // 000
		}
	}

	private static void printDigits3Times(int rakam) {
		for (int j = 0; j < 3; j++) {
			System.out.print(rakam);
		}
	}

}
