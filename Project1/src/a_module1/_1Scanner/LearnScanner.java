package a_module1._1Scanner;

import java.util.Scanner;

public class LearnScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!");
        
//        Should we have a space after ?
        System.out.print("What is your name?");
        String name = input.next();
        System.out.println("Hello " + name);
        
        int count = input.nextInt();
        double  amount = input.nextDouble();

        String name = input.next();
        int age = input.nextInt();
        double weight = input.nextDouble();
//        What is wrong?
        System.out.println(name + " is " + age + " year old and weighs " + weight + "kg”);

        
        input.close();
    }
}
