import java.util.*;
public class RetanguloAreaPerimetro {
	public static void main(String[]args) {
		double b, h, a, p;
		Scanner in = new Scanner (System.in);
		System.out.println("Digite a base do ret�ngulo:");
		b = in.nextDouble();
		System.out.println("Digite a altura do ret�ngulo: ");
		h = in.nextDouble();
		a = b*h;
		p = (b+h)*2;
		System.out.println("A �rea do ret�ngulo � "+a+" e o per�metro � "+p);
		in.close();
	}
}
