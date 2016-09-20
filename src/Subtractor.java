
public class Subtractor {

	private double num1;
	private double num2;
	private double difference;
	
	public Subtractor(double numb1, double numb2){
		this.num1 = numb1;
		this.num2 = numb2;
	}
	
	public double subtract(){
		return this.difference = this.num1 - this.num2;
	}
}
