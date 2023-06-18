package calcArea;
import java.util.Scanner;
public abstract class BaseAltura {
	Scanner in = new Scanner(System.in);
	private double b, h;
	
	//construtor
	public BaseAltura() {
		System.out.println("Digite a Altura:");
		h=in.nextDouble();
		System.out.println("Digite a Base:");
		b=in.nextDouble();
	}
	
	//getters and setters
	public void setBase(double b) {
		this.b = b;
	}
	public double getBase() {
		return b;
	}
	
	public void setAltura(double h) {
		this.h=h;
	}
	public double getAltura() {
		return h;
	}
	
	public abstract double calc();
}
