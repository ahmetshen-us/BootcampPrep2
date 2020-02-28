package a_module2._2_loopBasics;

public class Loops {
	public static void main(String[] args) {
//		System.out.println("+-+-+-+");
//		System.out.println("+-+-+-+");
//		System.out.println("+-+-+-+");
//		System.out.println("+-+-+-+");

		for (int i = 1; i <= 4; i++) {
			//System.out.println("+-+-+-+"+i);
		}
		
//		Syntax
//		for (initialization; test; update) {
//		    body
//		}

//		for (int i = 0; i < 4; i++) // 0, 1, 2, 3
//		for (int j = 0; j <= 6; j += 2) // 0, 2, 4, 6
//		for (int x=4; x>0; x--) // 4, 3, 2, 1

////		for (int i = 2 ; i < 7; i++) // 2, 3,4,5,6
//		System.out.println("2 squared = " + 2 * 2);
//		System.out.println("3 squared = " + 3 * 3);
//		System.out.println("4 squared = " + 4 * 4);
//		System.out.println("5 squared = " + 5 * 5);
//		System.out.println("6 squared = " + 6 * 6);
//
		for (int n = 1; n <= 10; n++) {
			//System.out.println(n);
			//System.out.println(n + " squared = " + (n * n));
		}
//
//		for (int i = 1; i <= 3; i++) {
//			System.out.println("+---+---+---+");
//			System.out.println("|---|---|---|");
//		}
//		
//		System.out.println("+---+---+---+");
		
		
//			Or:

//			System.out.println("+---+---+---+");
//			for (int i=1; i<=3; i++) {
//			   System.out.println("|---|---|---|");
////			   System.out.println("+---+---+---+");
//			}
		
		// comment out
		// uncomment
		/*
		 * 
		 * Or, finally you could use an if statement to avoid duplicating the line of
		 * code. Which of these variations you use depends on which you think best
		 * communicates the purpose of the code.
		 * 
		 */
		for (int i = 1; i <= 4; i++) {
			System.out.println("+---+---+---+");
			if (i < 4) {
				System.out.println("|---|---|---|");
			}
		}

		
		
//		What are infinite loops?
		

	}
}
