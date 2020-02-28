package a_module2._2_loopBasics;

public class NumberTriangle {

	public static void main(String[] args) {
//		Write for loops to produce the following output:
//
//			1
//			22
//			333
//			4444
//			55555
//			666666
//			7777777

		for (int i = 1; i < 8; i++) {
			for (int j = 0; j < i; j++) { // one line rakam repeat
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
