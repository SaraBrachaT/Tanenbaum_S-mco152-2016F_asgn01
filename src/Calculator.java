
public class Calculator {
	
	private double num1;
	private double num2;
	private double sum;
	private double difference;
	
	public Calculator(double numb1, double numb2){
		this.num1 = numb1;
		this.num2 = numb2;
	}
	
	public double add(){
		this.sum = this.num1 + this.num2;
		return sum;
	}
	
	public double subtract(){
		return this.difference = this.num1 - this.num2;
	}
}
