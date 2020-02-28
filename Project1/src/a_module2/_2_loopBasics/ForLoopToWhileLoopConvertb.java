package a_module2._2_loopBasics;

public class ForLoopToWhileLoopConvertb {

	public static void main(String[] args) {

		// b.

		System.out.println("b.");

		int total = 25;

		for (int number = 1; number <= (total / 2); number++) {

			total = total - number;

			System.out.println(total + " " + number);

		}

		System.out.println();
		
		

	}

}
