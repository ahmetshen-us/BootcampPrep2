package a_module2._2_loopBasics;

public class ForLoop {

	public static void main(String[] args) {

		int i = 10;
		// for (initialization; test-condition; update) {
		// watch for infinite loops
		for (; i < 20; i += 2) {
			System.out.println("inside for loop -> " + i);
			
			
		}

		System.out.println(i);
//		System.out.println(i);
//		i++;
//		System.out.println(i);
		
//		for (int ja = 0; ja < 11; ja++) {
//			System.out.print(ja+" ");	
//		}

	}
}
