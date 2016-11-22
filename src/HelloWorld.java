import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args){
		//instantiate keyboard as Scanner
		Scanner keyboard = new Scanner(System.in);
		
		//obtain user input
		System.out.println("Welcome to the Add and Subtract Calculator!");
		
		int choice;
		do{
		System.out.println("Please enter the first number");
		double num1 = keyboard.nextDouble();
		System.out.println("Please enter the second number");
		double num2 = keyboard.nextDouble();
		System.out.println("Press 1 to add these numbers and 2 to subtract them. Press 3 to quit");
		choice = keyboard.nextInt();
		
		//perform calculation
		Calculator calc = new Calculator(num1, num2);
		switch(choice){
			case 1:
				System.out.println("The sum of " + num1 + " and " + num2 + " is " + calc.add());
				break;
			case 2:
				System.out.println("And " + num1 + " minus " + num2 + " is " + calc.subtract());
				break;
		}
		} //end do
		while(choice != 3);
		
		System.out.println("Thank you for using the Add and Subtract Calculator");
	}
}
