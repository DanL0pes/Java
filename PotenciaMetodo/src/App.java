import java.util.*;
public class App {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		Potencia p = new Potencia();
		double b, e;
		System.out.println("Digite a base:");
		b = in.nextDouble();
		System.out.println("Digite o expoente:");
		e = in.nextDouble();
		System.out.println(p.c(b, e));
		in.close();
	}
}
