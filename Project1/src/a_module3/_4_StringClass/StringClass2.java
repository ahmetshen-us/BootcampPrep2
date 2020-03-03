package a_module3._4_StringClass;

public class StringClass2 {
	public static void main(String[] args) {
		System.out.println("example".indexOf("e"));
		System.out.println("example".indexOf("m"));
		System.out.println("example".indexOf("q"));
		System.out.println("example".indexOf("E"));
		System.out.println("example".indexOf(""));// empty String returns beginning
		System.out.println("example".indexOf('p')); // char argument is OK
		System.out.println("example".indexOf("ple"));
		System.out.println("example".indexOf("plx"));

		System.out.println("hello".equals("goodbye"));
		System.out.println("hello".charAt(2));
		System.out.println("hello".lastIndexOf("l"));
		System.out.println("HELLO".toLowerCase());
		System.out.println("hello".toUpperCase());
		System.out.println("hello".replace('l', 'x'));
		System.out.println();
		System.out.println();
		System.out.println();

	}
}
