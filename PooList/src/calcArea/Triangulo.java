package calcArea;

public class Triangulo extends BaseAltura{
	public double calc() {
		double area;
		area = getAltura() * getBase()/2;
		return area;
	}
}
