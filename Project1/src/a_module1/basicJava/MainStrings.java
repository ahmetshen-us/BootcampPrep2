package a_module1.basicJava;

public class MainStrings {

	public static void main(String[] args) {
//		Strings
//		In Java, a String is any sequence of characters – letters, digits, spaces, punctuation, and other “special characters”. Here are some examples of Strings defined in Java:

//		String	Explanation
		/*
		 * "Hello, world" You used this String in the previous section! It has 12
		 * characters. The space between the comma and “w” is also counted as a
		 * character. The double quotes are not part of the String, they define where
		 * the String starts and where it ends.
		 */

//		"12234"	This is a String, not an integer number because it’s enclosed in double quotes.
//		"!"	This String is just a single character: an exclamation point.
//		"><}{_^$#@^"	This is a String with 10 special characters in it.
		
		/*
		 * "" This is a special String: an “empty String” that contains NO characters at
		 * all. The two double quotes are right next to each other, without even a space
		 * between them.
		 */
		
		
//		Escape Sequences
		/*
		 * What if you want to create a String that contains a double quote character?
		 * Tricky! If you wrote
		 * """, Java would be confused. The computer can't tell if """ is an empty
		 * String followed by a double quote, or a String consisting of a double quote
		 * character. Java includes a way for you to clarify this ambiguity with what is
		 * called an “escape sequence”. When Java sees a backslash in a String this
		 * tells Java to "escape" or skip the next character's function and simply add
		 * it to the String. Here are the escape sequences we’ll use in this course:";
		 */
		System.out.println("John \"JJ\" Doe");
		System.out.println("Use \\, not /");
		System.out.println("1\titem");
		System.out.println("line 1\nline 2");

		System.out.println("Hello, world!");
//		It’s kind of wordy, but the words do make sense in a way:
//
//		System essentially refers to the computer as a whole
//		out refers to the standard output device: the console
//		println indicates that you want to “print” as a complete line (ln) of text

//		Difference between print and println?
		System.out.print("Hello, ");
		System.out.print("Joe");
		System.out.print("! Hello, ");
		System.out.print("Jane");
		System.out.println("!");

		System.out.println("line 1\nline 2\nline3");

//		What is the output produced from the following statements?

		System.out.println("\"Quotes\"");
		System.out.println("Slashes \\//");
		System.out.println("How '\"confounding' \"\\\" it is!");

		/*
		 * Which of the following are valid Strings? "hello world" correct "h3110_w0r1d"
		 * correct "hello World" ""hello" "world""
		 */
		
		
//		What does an escape sequence do?
//Tells the computer to include special characters in a String that would otherwise break it


	}

}
