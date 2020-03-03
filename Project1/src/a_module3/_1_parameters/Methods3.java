package a_module3._1_parameters;

public class Methods3 {

	public static void main(String[] args) {

		for (int k = 0; k < 3; k++) {

			printDigitsOneLine(3, "#"); // 000-111-222-333-444-555-666-777-888-999

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

	private static void printDigitsOneLine(int kacTane,String ayrac) {
		for (int rakam = 0; rakam < 10; rakam++) { // 0 - 9
			printDigitsTimes(rakam, kacTane); // 000

			if (rakam < 9) {
				System.out.print(ayrac);
			}
		}
	}

	private static void printDigitsTimes(int digit, int kacTane) {
		for (int j = 0; j < kacTane; j++) {
			System.out.print(digit);
		}
	}

}
