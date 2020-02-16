package a_module1.dataTypes;

public class OOPS {
//What is the problem here?
	public static void main(String[] args) {
		int x = 0;
		System.out.println("x is " + x);
		x = (int) 15.2;//  set x to 15.2
		System.out.println("x is now " + x);

		int y;//  set y to 1 more than x
		y = x + 1;
		System.out.println("x and y are " + x + " and " + y);
	}

}
