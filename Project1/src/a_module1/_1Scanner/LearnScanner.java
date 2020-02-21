package a_module1._1Scanner;

import java.util.Scanner;

public class LearnScanner {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome!");

//        Should we have a space after ?
		System.out.print("What is your name? ");
		//String name = input.next();
		String name = input.nextLine();
		System.out.println("Hello " + name);

		System.out.print("Enter an integer ");
		int count = input.nextInt();
		System.out.println("you entered " + count);

		System.out.print("Enter a double ");
		double amount = input.nextDouble();
		System.out.println("you entered " + amount);

		name = input.next(); // Mesele? String name(can not redefine)
		int age = input.nextInt();
		double weight = input.nextDouble();
//        What is wrong?
		System.out.println(name + " is " + age + " year old and weighs " + weight + "lb");

		input.close();
	}
}
