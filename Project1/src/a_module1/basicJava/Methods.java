package a_module1.basicJava;

public class Methods {
	/*
	 * Divide and Conquer - Parcala bol ve feth et
	 * 
	 * Most useful computer programs are much longer than our five line
	 * "Hello World" program. Many programs are HUGE – literally tens of millions of
	 * lines of code. No human can possibly understand all 10 million lines of a
	 * program all at once – in fact, most programmers will admit that they can only
	 * focus on at most a couple hundred lines of code at a time, and experienced
	 * programmers prefer chunks of no more than 50 lines or so (about what you can
	 * see on a screen at a one time). To be able to create large programs, we have
	 * to be able to break the job down into small, manageable parts.
	 * 
	 * The process of breaking a task down into smaller parts is called
	 * "procedural decomposition", and almost programming languages provide a way to
	 * do this. Java does it using what it calls "methods". Our Hello World program
	 * had a single method called main, but most Java programs have several methods.
	 * In general, you should break your program up into methods when:
	 * 
	 * 
	 */

	public static void main(String[] args) { // curly braces
// What is declaring a method and calling a method?
	}

//	You can break a task into distinct non-trivial subtasks in order to understand it better. For example:
//  Fly airplane
//  1. Take off
//  2. Fly
//  3. Land

//You could even break one or more subtasks down further:

//Fly airplane
//1. Take-off
//   1. Push back from gate
//   2. Taxi to runway
//   3. Increase speed until off ground
//   4. Climb to cruise altitude
//2. Fly
//3. Land

//	What is redundant code?
	/*
	 * 
	 * You have "redundant code": unnecessarily repeated code that appears more than
	 * once in your program. It’s OK to use methods to eliminate redundancy for even
	 * a single, complicated line. That way if you ever have to change it, you only
	 * have to change it in one place!
	 * 
	 * 
	 * Your method is getting bigger than 20-30 lines of code; look for groups of
	 * statements that are related pull them out into a method.
	 */

	/*
	 * When you decompose a program into methods, examine each method to make sure
	 * it is doing a single, specific thing – not a random collection of unrelated
	 * things. Try to capture what the method is doing in a few words like we did in
	 * the airplane example above. If you can’t describe your method's task in a few
	 * words, maybe it needs to be broken down further.
	 * 
	 * Ideally, once you have organized your program with methods, your main method
	 * turns into a list of method calls, each that handle their own small piece of
	 * the task to be performed. Thus your main method turns into a sort of outline
	 * of what your code is doing, making it easier for someone reading your code to
	 * quickly understand what it does.
	 */

//	Method names
//	As the purpose of a method is typically to accomplish a task, it's a good idea to start a method’s name with a verb: calculate, report, print etc... Followed by whatever item that task is performed on: calculateAge, reportResults, printSummary etc...
//
//	The Java convention is for method names to start with a lower case letter, and use uppercase letters to start each following word with no spaces. This is called “camel case”: the uppercase letters are the camel’s humps! Here’s how the methods for our flying example should look:
//
//	   flyAirplane
//	   takeOff
//	   pushBackFromGate
//	   taxiToRunway
//	   increaseSpeedUntilOffGround
//	   climbToCruiseAltitude

//	Writing a Method

//	The first line of a method is called the "method header" and it contains some specific keywords:

//	public static void myMethod() {
//	Each of these keywords have specific functions, and we'll learn about some of the other keywords later in this course. For now, we’re going to keep it simple so all our methods will be public, static, and void. Here is the syntax for creating your own method including the method header:

//	public static void methodName () {
//	   statement 1;
//	   statement 2;
//	   …
//	   statement n;
//	}

//	This is called "defining" or "declaring" a method, and you should place your methods after the main method. This means they should be placed after main's closing curly brace, but before your class's closing curly brace, like so:

//	Calling/Invoking a Method
	/*
	 * Just defining a method won't actually tell the computer to execute that code.
	 * To actually run the code inside your method, another method has to "call", or
	 * invoke, it by name. Each method invocation statement starts with the name of
	 * the method you want to execute, followed by a pair of parentheses finishing
	 * with a semicolon. Again using our flying example, here’s how the method calls
	 * would look:
	 */

//	public static void main(String[] args) {
//		takeOff(); // takeOff  method is called/execute/invoke
//	}

//	takeOff Method is defined/declared below
//	public static void takeOff() {
//		pushBackFromGate();
//		taxiToRunway();
//		increaseSpeedUntilOffGround();
//		climbToCruiseAltitude();
//	}

//	When you call a method, the computer jumps to that method definition, runs all the code inside that method, then returns to the line where it was called. We will discuss the details of how the computer runs methods in the next section.
//3-controlFlow.PNG

//	Which of the following method headers uses the correct syntax?
//			  public static void example() {

//	Where do you put static methods?
//			Inside the class, outside the main method

}
