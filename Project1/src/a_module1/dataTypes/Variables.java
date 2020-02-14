package a_module1.dataTypes;

public class Variables {

	public static void main(String[] args) {
//		Declaring and Using Variables
//
//		Before we can use a variable in Java, we must "declare" it. To do this you must tell Java what type of data you want your variable to store and give the variable a unique name within the given scope.
//
//		dataType variableName;
//		For example, to declare a variable of type String with the name "myString" we write:

		String myString;
		
//		Declaring the variable creates the space in memory for a value, to actually store a variable in that space you use an "assignment statement". An assignment statement associated the given value to the named variable. The assignment statement starts with the name of the variable whose value we are setting, then an equals sign, then the value we want to set, and finally, a semicolon to mark the end of the statement:
//
//			variableName = value;
//			If we wanted to store the String "Hello, world!" in our variable from before

			myString = "Hello, world!";


			System.out.println(myString);
//			If we set the variable to a new value and then repeat the same println statement, it will print out the new value "Hello yourself!" instead:

			myString = "Hello yourself!";
			System.out.println(myString);

	}

}
