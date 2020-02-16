package a_module1.dataTypes;

public class Song {

	/*
	 * Scope
	 * 
	 * Any variable you declare between the curly braces of a method is called a
	 * local variable because you can only use it locally inside the method. If you
	 * try to use it outside the method, Java will report an error,
	 * "cannot find symbol". In general, we say that a variable’s scope is the lines
	 * of code where it can be used, the places in your code where it is "visible".
	 * 
	 * You can, however, declare two different variables that use the same name in
	 * two different methods! Consider this code:
	 * 
	 * 
	 */

	/*
	 * Class constants
	 * 
	 * In addition to declaring local variables inside a method, you can also
	 * declare variables that are NOT part of any method, but whose scope is the
	 * entire class – these are called, not surprisingly, class variables. For now,
	 * we will use these only for declaring variables whose value never changes –
	 * called “class constants”.
	 * 
	 * To declare one of these, you need to add the terms public static final before
	 * the type, AND set the value as you would in an assignment statement. It’s
	 * best to place these right below the class declaration like this:
	 * 
	 * 
	 */

	public static final double PI = 3.14;
	public static final int MAX_SPEED = 80;
	public static final int DAYS_IN_WEEK = 7;

	/*
	 * Note that the Java naming convention is to use all capital letters for class
	 * constants, separating words by underscores to make them readable – because
	 * remember no variable names can have spaces in them!
	 */

	/*
	 * Why declare a variable with a fixed value? Isn’t the whole point of a
	 * variable is that its value can vary? Well, yes, but there are two common and
	 * useful ways to use a class constant:
	 * 
	 * You want all methods in the class to use exactly the same value for
	 * something; for example, use 3.14 for PI, or MAX_SPEED for 80. If you later
	 * want to change this value, you only have to change it in one place. This not
	 * only avoids having to find everywhere it’s used and change it multiple times,
	 * but, more important, ensures that you don’t overlook one place or
	 * accidentally change an 80 somewhere in the program that represented a maximum
	 * age instead of a speed! You want to use names rather than values so that the
	 * meaning of an expression is clear; for example, using DAYS_IN_WEEK instead of
	 * 7 as in: calendarRows = DAYS_IN_WEEK; It is considered good style to replace
	 * repeated numbers with a class constant whenever possible to make your code
	 * more readable.
	 * 
	 * 
	 */
	
	// x = 15;
	// y= 26
	// x = y+ 16;
	
	public static void main(String[] args) {
		double pll = 3.14; // define a variable named pi and set it 3.14
		System.out.println(pll);
		
		// double pll = 3.24; // can not redefine a variable in the same scope
		pll = 3.24; // change variable value to 3.24;
		System.out.println(pll);
		
		pll = 6.88;
		pll = 3.99;
		pll = 3.77;
		System.out.println(pll);
		
		System.out.println(PI);
		String line = "This is the chorus";
		System.out.println(line);
		verse();
		System.out.println(line);
	}

	public static void verse() {
		// System.out.println(pi);
		double pi = 3.15;
		System.out.println(PI);
		String line = "This is my verse";
		System.out.println(line);
	}
}
