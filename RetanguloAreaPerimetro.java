import java.util.*;
public class RetanguloAreaPerimetro {
	public static void main(String[]args) {
		double b, h, a, p;
		Scanner in = new Scanner (System.in);
		System.out.println("Digite a base do retângulo:");
		b = in.nextDouble();
		System.out.println("Digite a altura do retângulo: ");
		h = in.nextDouble();
		a = b*h;
		p = (b+h)*2;
		System.out.println("A área do retângulo é "+a+" e o perímetro é "+p);
		in.close();
	}
}
