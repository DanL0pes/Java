package calcArea;

import java.util.Scanner;
public class App {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o tipo de forma: (1-Quadrado) (2-Retângulo) (3-Triângulo) (4-Trapézio)");
		int i = in.nextInt();
		switch(i) {
		case 1:
			Quadrado q = new Quadrado();
			System.out.println(q.calc());
			break;
		case 2:
			Retangulo r = new Retangulo();
			System.out.println(r.calc());
			break;
		case 3:
			Triangulo t = new Triangulo();
			System.out.println(t.calc());
			break;
		case 4:
			Trapezio tz = new Trapezio();
			System.out.println(tz.calc());
			break;
		default:
			System.out.println("Digite de 1 a 4...");
			break;
		}
		in.close();
	}
}
