import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args){
		//instantiate keyboard as Scanner
		Scanner keyboard = new Scanner(System.in);
		
		//obtain user input
		System.out.println("Welcome to the Add and Subtract Calculator!");
		System.out.println("Please enter the first number");
		double num1 = keyboard.nextDouble();
		System.out.println("Please enter the second number");
		double num2 = keyboard.nextDouble();
		
		//add!
		Adder add = new Adder(num1, num2);
		Subtractor sub = new Subtractor(num1, num2);
		System.out.println("The sum of " + num1 + " and " + num2 + " is " + add.add());
		System.out.println("And " + num1 + " minus " + num2 + " is " + sub.subtract());
		
	}
}
