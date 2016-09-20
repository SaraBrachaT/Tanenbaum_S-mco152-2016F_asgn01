import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args){
		//instantiate keyboard as Scanner
		Scanner keyboard = new Scanner(System.in);
		
		//obtain user input
		System.out.println("Welcome to the Adder!");
		System.out.println("Please enter the first number you would like to add");
		double num1 = keyboard.nextDouble();
		System.out.println("Please enter the second number");
		double num2 = keyboard.nextDouble();
		
		//add!
		Adder add = new Adder(num1, num2);
		System.out.println("The sum is " + add.add());
		
	}
}
