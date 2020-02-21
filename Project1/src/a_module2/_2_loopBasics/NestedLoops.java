package a_module2._2_loopBasics;

public class NestedLoops {
//	What is a nested loop?
//			Nested loops is simply the concept of when you place
//			one loop inside of another.
public static void main(String[] args) {
	for (int i = 1; i <= 2; i++) {
		   System.out.println("Outer i = " + i);
		   for (int j = 1; j <= 3; j++) {
		      System.out.println("  Inner j = " + j);
		   }
	}


	for (int row = 1; row <= 5; row++) {
		   for (int col = 1; col <= 5; col++) {
		      System.out.print("0 ");
		   }
		   System.out.println();
		}
	
	//Re-write above as 1,1 * 1,2 * 1,3

	
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

}
}
