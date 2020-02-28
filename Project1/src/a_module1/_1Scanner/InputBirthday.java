package a_module1._1Scanner;

import java.util.Scanner;

public class InputBirthday {
	/*
	 * On what day of the month were you born? 8 
	 * What is the name of the month in which you were born? May 
	 * In what year were you born? 1981 
	 * You were born on May 8, 1981.You're mighty old!
	 * 
	 */

//	Also print their age?
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("On what day of the month were you born?");
		int dayOfMonth = scanner.nextInt();
		
		System.out.print("What is the name of the month in which you were born?");
	    String nameOfMonth = scanner.next(); // may
	    String capitalizeNameOfMonth = nameOfMonth.substring(0, 1).toUpperCase()+nameOfMonth.substring(1);
	    // HW - define a method called capitalize(String) that capitalizes first letter 
	    // String capitalizeNameOfMonth = capitalize(nameOfMonth);
	    
	    //String firstLetterofMonth = nameOfMonth.substring(0, 1);
	    //String capitalizeFirstLetter = firstLetterofMonth.toUpperCase();
	    
	    
	    System.out.print("In what year were you born?");
	    int year = scanner.nextInt();
	    
	    int age = 2020 - year;
	    		
	    System.out.println("you were born on " + capitalizeNameOfMonth + " " + dayOfMonth + ", " + year + " and you are "+ age +" years old." + "You're mighty old!");
	    
	    
		
		
		
		scanner.close();
	}
}
