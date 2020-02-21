package a_module2._1_logic;

public class Boolean {
	public static void main(String[] args) {
		/*
		 * 
		 * A boolean is a primitive data, so you save it directly in memory but it only
		 * has two possible values it can either be true or false.
		 */

//		Why is the following not an error?
		System.out.println("testing" == "testing");

//		strings are not primitive data they are what
//		we call objects, so strings have their
//		own very special way of being compared.
		String s = "String testing";
		System.out.println(s.substring(7));

		System.out.println("testing" == s.substring(7));

//		How is == different than .equals?
		System.out.println("testing".equals("testing"));
		System.out.println("testing".equals(s.substring(7)));

		String name = "John Doe";
		System.out.println();
		System.out.println(name.equals("John")); // too short
		System.out.println(name.equals("john doe")); // case doesn’t match
		System.out.println(name.equals("John Doe ")); // extra space at end
		System.out.println(name.equals("John  Doe ")); // extra space in middle

		System.out.println(name.equals("John Doe"));
		System.out.println(name.equalsIgnoreCase("john doe"));
		System.out.println(name.startsWith("Joh"));
		System.out.println(name.endsWith("Doe"));
		System.out.println(name.contains(" "));

//		Boolean logic
		String status = "preferred";
		System.out.println(status.equals("preferred"));

		if (status.equals("preferred")) {
			System.out.println("Preferred discount applied");
//			price = price * 0.90;
		}

		int numberEntered = 1234;
		if (numberEntered != 12345) {
			System.out.println("You entered the magic number!");
//			   points = points + 1;
		} else {
			System.out.println("Sorry, that’s not right.");
		}

		int temperature = 90;
		if (temperature > 70) {
			System.out.println("No coat required");
		} else if (temperature > 50) {
			System.out.println("Wear a jacket");
		} else if (temperature > 20) {
			System.out.println("Wear a warm coat");
		} else {
			System.out.println("Stay inside!");
		}

		boolean straight = true;
		boolean flush = true;

		if (straight) {
			if (flush) {
				System.out.println("straight flush");
			} else {
				System.out.println("straight");
			}
		} else if (flush) {
			System.out.println("flush");
		}

		if (straight && flush) {
			System.out.println("straight flush");
		} else if (straight) {
			System.out.println("straight");
		} else if (flush) {
			System.out.println("flush");
		}

	}
}
