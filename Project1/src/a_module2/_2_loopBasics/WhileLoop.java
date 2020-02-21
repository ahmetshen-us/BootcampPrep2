package a_module2._2_loopBasics;

public class WhileLoop {

	public static void main(String[] args) {
		
		int sum = 0;
		int number = 1;
		while (number != 0) {
		    System.out.println("Enter a number or 0 to get the sum: ");
//		    number = input.nextInt();
		    sum += number;
		}
		System.out.println("The sum is " + sum);

		
//		String answer = "";
//		while (!answer.equals("yes") && !answer.equals("no")) {
//		    System.out.println("Enter yes or no: ");
//		    answer = input.getNext();
//		}
//		System.out.println("Thank you!");

		
//		System.out.print("Enter yes or no: ");
//		String answer = input.getNext();
//		while (!answer.equals("yes") && !answer.equals("no")) {
//		    System.out.println("Enter ONLY yes or no, please: ");
//		    answer = input.getNext();
//		}
//		System.out.println("Thank you!");

		
//	Practice
//		https://practiceit.cs.washington.edu/problem/view/bjp4/chapter5/s1-whileLoops
//		https://practiceit.cs.washington.edu/problem/view/bjp4/chapter5/s2-forToWhile
	}

}
