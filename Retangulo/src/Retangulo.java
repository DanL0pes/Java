import java.util.Scanner;
public class Retangulo {
	double b, a, area, per;
	Scanner in = new Scanner (System.in);
	public void ler() {
		System.out.println("Informe o valor da altura: ");
		a = in.nextDouble();
		System.out.println("Informe o valor da base: ");
		b = in.nextDouble();
	}
	public void area() {
		area = b*a;
		System.out.println("O valor da área é "+area);
	}
	public void per() {
		per = (b+a)*2;
		System.out.println("O valor do perímetro é "+per);
	}
}
