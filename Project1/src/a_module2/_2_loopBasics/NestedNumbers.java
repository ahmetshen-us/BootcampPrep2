package a_module2._2_loopBasics;

public class NestedNumbers {

	public static void main(String[] args) {
//		Write nested for loops that produce the following output:
//
//
//			000111222333444555666777888999
//			000111222333444555666777888999
//			000111222333444555666777888999

		// 1st step - 0123456789 - 
		
		for (int k = 0; k < 3; k++) {
			
			for (int i = 0; i < 10; i++) {
				for (int j = 10; j < 13; j++) {
					System.out.print(i);
				}
			}
			
			if (k < 2)
				System.out.println();
		}

	}

}
