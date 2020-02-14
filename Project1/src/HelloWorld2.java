
// file and folder -> dosya ve klasör

// Filename and class name should match
// What happens if this requirement is not met?

public class HelloWorld2 { // opening curly braces

	public static void main(String[] args) {

		// programing giris bolumu
//		starting point of code execution
		System.out.println("Hello World2");

// How is Java platform independent?
// What does "compile" mean?
// What is .class extension? Java Bytecode of the source code
// JVM - Java Virtual Machine

// Java is case sensitive means what? Cases should match.
// MyClassName vs myclassname

		String myStringName = "Yunus"; // declare and initialize
		String mystringname = "Umare"; // " double quotes
		String n = "";

		System.out.println(mystringname); // call or use variable
		System.out.println(myStringName);

//What is Camel case?
//		myStringName - for methods and variables
//		MyClassName - for class names

//Select all the features of Java:
//Object oriented
//Compiled
//Memory management

// What is a compiler?
// The part of Java that translates your source code into machine code

// Which of the following are valid names for Java classes according to convention?
// Hello World
// Hello_World
// helloWorld
// HelloWorld

// What is a Class?
// The class is the outermost layer of the program. It starts with the keywords "public class" and then whatever the name of your file is.

// public class YourClass {
// The name of your class has to exactly match the name of your file, including capitalization. The class is enclosed by a set of curly braces or "{ }" characters. All code you want to run should be placed between these two characters.
// 2-class.PNG

// Main Method
// The main method is the wrapper that tells your computer which lines of code to run.
// In Java it has a very specific series of keywords:

//public static void main(String[] args) {
		/*
		 * After the open curly brace, you should put each line of code you want the
		 * computer to run. Don't forget to add the closing curly brace after all your
		 * code. As you can see in the image it is convention to add a layer of
		 * indentation between the main method and the class, this shows that the main
		 * method is inside the class.
		 * 
		 */
//3-mainMethod

// Statements
// The statements are the lines of code for the computer to run. 
// Each line is called a "statement" and should end with a semi-colon(;).
		/*
		 * You can have as many statements as you want, the computer will run each line
		 * from top to bottom one after the other. Again, as these are inside the main
		 * method all statements should be one level of indentation in.
		 */
// 4-statements.PNG

// What is the name of the outermost wrapper that contains all your code
// Class

// What happens if you forget to add a semi-colon at the end of a line of code?
// The computer reports a "compiler error"

		System.out.println("heyo");
		System.out.println("pembe");

//		compile error and runtime error

		/*
		 * Comments are notes written in the source code by the programmer to describe
		 * or clarify the code. They are ignored by the Java compiler so they are
		 * intended only as messages to the humans that will read the code files.
		 */

		/*
		 * multi line comments are placed between the slash and asterisk markers
		 */

// single line comments are placed after double forward slashes

// Select all the places you should put comments
// Above the class header
// Above each method
// To describe particularly tricky lines of code

	}
} // closing curly braces
