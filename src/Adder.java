
public class Adder {

	double num1;
	double num2;
	double sum;
	
	public Adder(double numb1, double numb2){
		this.num1 = numb1;
		this.num2 = numb2;
	}
	
	public double add(){
		this.sum = this.num1 + this.num2;
		return sum;
	}
}