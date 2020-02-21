package a_module2._1_logic;

public class Boolean {
	public static void main(String[] args) {
		/*
		 * 
		 * A boolean is a primitive data, so you save it directly in memory but it only
		 * has two possible values it can either be true or false.
		 */
		int x = 1; // = and ==

		// System.out.println("x == 1 " + (x == 1));
		// System.out.println("x == 2 " + (x == 2));

		// System.out.println("1 == 1 " + (1 == 1)); // == compare
		// System.out.println("1 == 2 " + (1 == 2));

		int y = 2;
		int y2 = 2;

		boolean isyequaltoy2 = (y == y2);
		// System.out.println("isyequaltoy2 is "+isyequaltoy2);

//		Why is the following not an error?
		// System.out.println("\"testing\" == \"testing\" => "+("testing" ==
		// "testing"));

		String s1 = "testing";
		// java creates an s1 object at location Memory 152 with content testing

		String s2 = "testing";
		// s2 points to s1 location Memory 152

		// System.out.println("s1 == s2 => "+(s1 == s2));

//		strings are not primitive data they are what
//		we call objects, so strings have their
//		own very special way of being compared.

		String s = "String testing";
		// System.out.println(s.substring(7));// testing

		// System.out.println("\"testing\" == s.substring(7) => "+("testing" ==
		// s.substring(7)));

//		How is == different than .equals?
		// System.out.println("\"testing\".equals(\"testing\") =>
		// "+("testing".equals("testing")));
		// System.out.println("\"testing\".equals(s.substring(7) =>
		// "+("testing".equals(s.substring(7))));

		String name = "John Doe";
		// System.out.println(name);
		// System.out.println(name.equals("John")); // too short
		// System.out.println(name.equals("john doe")); // case doesn’t match
		// System.out.println(name.equals("John Doe ")); // extra space at end
		// System.out.println(name.equals("John Doe ")); // extra space in middle

		// System.out.println(name.equals("John Doe"));
		// System.out.println(name.equalsIgnoreCase("john doe"));
		// System.out.println(name.startsWith("Joh"));
		// System.out.println(name.startsWith("John"));
		// System.out.println(name.startsWith("J"));
		// System.out.println(name.endsWith("Doe"));
		// System.out.println(name.contains(" "));
		// System.out.println(name.contains("e"));

//		Boolean logic
		String status = "preferred";
		// System.out.println(status.equals("preferred"));
		boolean zz = status.equals("preferred");

		if (zz) {
			// System.out.println("Preferred discount applied");
//			price = price * 0.90;
		}

		int numberEntered = 12345;
		if (numberEntered != 12345) {
			// System.out.println("You entered the magic number!");
//			   points = points + 1;
		} else {
			// System.out.println("Sorry, that’s not right.");
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

		int grade = 100;
		if (grade > 95) {
			System.out.println("A+");
		} else if (grade > 85) {
			System.out.println("B");
		} else {
			System.out.println("F");
		}

		boolean straight = true;
		boolean flush = false;

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
		
		// AND && - returns true if two sides are true
//		System.out.println(true && true); // true
//		System.out.println(true && false); // false
//		System.out.println(false && false); // false
//		
//		System.out.println(!false); // negate
//		System.out.println(!true);
		
		// OR || - returns true if any or both sides are true
//		System.out.println(true || true); // true
//		System.out.println(true || false); // true
//		System.out.println(false || false); // false
		
		
		
		
		
		
		

	}
}
