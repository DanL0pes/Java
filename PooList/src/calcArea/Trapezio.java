package calcArea;

public class Trapezio extends BaseAltura{
	private double b2;
	
	//construtor
	public Trapezio(){
		System.out.println("Digite a Base 2:");
		b2 = in.nextDouble();
	}
	//get e set
	public void setBase2(double b2) {
		this.b2=b2;
	}
	public double getBase2() {
		return b2;
	}
	
	//met
	public double calc() {
		double area;
		area = (getBase() + getBase2())/2 * getAltura();
		return area;
	}
}
