package a_module2._2_loopBasics;

public class NestedLoops {
//	What is a nested loop? ic ice
//			Nested loops is simply the concept of when you place
//			one loop inside of another.
	public static void main(String[] args) {
//		for (int i = 1; i <= 2; i++) {
//			System.out.println("Outer i = " + i);
//			for (int j = 1; j <= 3; j++) {
//				System.out.println("  Inner j = " + j);
//			}
//		}
//i 1
//j 1
//j 2
//j 3
//i 2
//j 1
//j 2
//j 3
		
//		for (int row = 1; row <= 3; row++) { // row - satir
//			for (int col = 1; col <= 5; col++) { // column -sutun
//				System.out.print("0 ");
//			}
//			System.out.println();
//		}
//		0 0 0 0 0 
//		0 0 0 0 0
//		0 0 0 0 0
		
		
		// 1 1 1
		// 2 2 2
		// 3 3 3 
	

		// Re-write above as 
		// 1,1 * 1,2 * 1,3
		// 2,1 * 2,2 * 2,3
		
//		for (int satir = 1; satir <= 3; satir++) { // row - satir		
//			for (int sutun = 1; sutun <= 3; sutun++) { // column -sutun
//				System.out.print(satir+","+sutun+"\t");
//			} 
//			// scope
//			System.out.println();
//		}
		
		

		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 5; col++) {
				if (row == col) {
		         System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		
//		1 0 0 0 0
//		0 1 0 0 0
//		0 0 1 0 0
//		0 0 0 1 0
//		0 0 0 0 1

	}
}
