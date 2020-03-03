package a_module3._4_StringClass;

public class StringClass {
	public static void main(String[] args) {

		System.out.println("John Doe".length()); // returns the integer value 8
		System.out.println("".length()); // returns 0

		String name = "John Doe";
		System.out.println(name.length()); // returns 8

		System.out.println("example".substring(0, 4));
		System.out.println("example".substring(1, 2));
		System.out.println("example".substring(4, 7));
		System.out.println("example".substring(3, 3));
		System.out.println("example".substring(4));
		System.out.println("example".substring(6));
		System.out.println("example".substring(7));
//		System.out.println("example".substring(-1, 4));
//		System.out.println("example".substring(0,8)	);
//		System.out.println("example".substring(4,3)	);

	}
}
