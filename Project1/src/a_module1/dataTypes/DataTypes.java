package a_module1.dataTypes;

public class DataTypes {
	/*
	 * 
	 * Java defines a few very simple and efficient primitive data types. There are
	 * eight of these in total, but we’re going to focus on just four of them:
	 * 
	 * Integer
	 * 
	 * Integers represent whole numbers. You may be familiar with integers from
	 * algebra class. Integers are numbers that are not fractions nor have decimals,
	 * for example, 422, -13 and 0. Java refers to these as type int. As computer
	 * memory is not infinitely big there is a limit to how big an integer you can
	 * store. The largest int that Java can represent is actually 2,147,483,647, and
	 * the smallest is -2,147,483,648. This is big enough for most purposes, but
	 * note that it’s only about ¼ the population of Earth, so there will be
	 * situations in which using an int won't work.
	 * 
	 * Double
	 * 
	 * Doubles are real numbers like 3.14159, -2.718, and 2145.2731. You can also
	 * write these in a form of scientific notation; for example, 1.23e2 is the same
	 * as 123, and 921e-1 is 92.1. For historical reasons, Java calls these type
	 * double. These can represent much bigger and smaller numbers, but they are in
	 * general only approximations, not exact values as they can only hold so many
	 * decimal places. This can lead to rounding errors when you might not expect
	 * them!
	 * 
	 * Character
	 * 
	 * Characters are single characters such as letters, symbols and spaces. These
	 * are not just limited to english, but all languages. For example, A, X, 0, z,
	 * ?, and =, but also Ω, ä, Я, and many more! Each of these is a char in Java.
	 * When you define a char, enclose it in single quotes, like 'a'. String objects
	 * are made up of char characters. NOTE: 'a' is NOT the same as "a": the first
	 * is a char, the second is a String that contains a single char.
	 * 
	 * Boolean
	 * 
	 * Booleans are a type of data that can only have either two values: True or
	 * False. Booleans are the building block for logic based decisions, you can
	 * think of them as representing yes or no, on or off, positive or negative,
	 * etc... Java calls these boolean values, in honor of George Boole who created
	 * a theory of algebra for numbers with only two values.
	 * 
	 * 
	 */

	public static void main(String[] args) {
// What is a variable?
//		A variable is a named space in memory
//		for specific type of data.

//		What is scope?
		/*
		 * 
		 * Variables also have this idea of scope wherever you make your variable it's
		 * only going to live within the closest set of curly braces. And then as soon
		 * as the computer gets to that left curly brace it's going forget your
		 * variable.
		 */
		
		
		/*
		 * A lot of times you're going to get the Cannot find symbol exception this
		 * means that whatever name you're using for your variable the computer doesn't
		 * understand. The simplest reason is probably because you mistyped it or maybe
		 * you used a different capitalization when you declared it and then from you
		 * when you called it. The other reason could be because you declared it
		 * somewhere after you're trying to use it like maybe you forgot that you tried
		 * to use it up on line 2 but you don't declare into line 10. As far as the
		 * computer is concerned that variable does not exist until after it's declared.
		 * Another common issue is for getting the scope of your variable. Since your
		 * variable only lives within the closest set of curly braces if you make it in
		 * one method and then try to use it in another method the computer is not going
		 * to know what's going on.
		 */
		
//		Select all of the following expressions that correctly associate a piece of data with their appropriate data type
//		1.0 is a double correct
//		456 is an int correct
//		'd' is a char correct
		
//		Select all of the following that are valid int values
//		1 
//		-34 
//		709281 
//		-10101 

	}

}
