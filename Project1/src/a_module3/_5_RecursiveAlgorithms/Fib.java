package a_module3._5_RecursiveAlgorithms;

public class Fib {
	public static void main(String[] args) {
		System.out.println(fibonacci(4));
	}

	public static int fibonacci(int n) {
		if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
	
	
//			Fibonacci(1) = 1 = base case
//			Fibonacci(2) = 1 = base case
//			Fibonacci(3) = 2 = 1 + 1
//			Fibonacci(4) = 3 = 1 + 2
//			Fibonacci(5) = 5 = 3 + 2
//			Fibonacci(6) = 8 = 5 + 3


}
