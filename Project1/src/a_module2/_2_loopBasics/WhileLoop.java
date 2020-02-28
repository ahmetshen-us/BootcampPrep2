package a_module2._2_loopBasics;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		int sum = 0;
//		int number = 1;
//		while (number != 0) {
//		    System.out.print("Enter a number or 0 to get the sum: ");
//		    number = input.nextInt();
//		    sum = sum + number;
//		}
//		System.out.println("The sum is " + sum);

		
//		String answer = "KK";
//		while (!answer.equals("yes") && !answer.equals("no")) { // (false && true ) = true
//		    System.out.println("Enter yes or no: ");
//		    answer = input.next();
//		}
//		System.out.println("Thank you!");

		
//		System.out.print("Enter yes or no: ");
//		String answer = input.next();
//		while (!answer.equals("yes") && !answer.equals("no")) {
//		    System.out.println("Enter ONLY yes or no, please: ");
//		    answer = input.next();
//		}
//		System.out.println("Thank you!");

		
//	Practice
//		https://practiceit.cs.washington.edu/problem/view/bjp4/chapter5/s1-whileLoops
		
		String word = "a";
		while (word.length() < 10) {
		    word = "b" + word + "b";
		}
		System.out.println(word);
		

		
		int x = 100;
		while (x > 0) {
		    System.out.println(x / 10);
		    x = x / 2;
		}
		
//		https://practiceit.cs.washington.edu/problem/view/bjp4/chapter5/s2-forToWhile
	}

}
