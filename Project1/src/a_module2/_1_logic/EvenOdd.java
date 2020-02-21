package a_module2._1_logic;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
//		Write Java code to read an integer from the user, 
//		then print even if that number is an even number or odd otherwise.
//		You may assume that the user types a valid integer. 
//		The input/output should match the following example:
//
//			Type a number: 14
//			even

		Scanner input = new Scanner(System.in);
		System.out.print("type a number: ");
		int number = input.nextInt();
		System.out.println("your number is " + number);

		if (number % 2 == 0)
			System.out.println("even");
		if (number % 2 == 1)
			System.out.println("odd");
		System.out.println("hi");
//		Then look at redundant statements
//		https://practiceit.cs.washington.edu/problem/view/bjp4/chapter4/s10-javaIsAwesome
	}

}
