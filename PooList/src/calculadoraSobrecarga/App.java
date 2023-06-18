package calculadoraSobrecarga;

import java.util.Scanner;

public class App {
	public static void main(String[]args) {
		double n1, n2;
		Scanner in = new Scanner (System.in);
		CalculadoraSobrecarga c = new CalculadoraSobrecarga();
		System.out.println("Digite o primeiro número:");
		c.n1 = in.nextDouble();
		n1 = c.n1;
		System.out.println("Digite o segundo número:");
		c.n2 = in.nextDouble();
		n2 = c.n2;
		c.calc();
		c.calc(n1,n2);
		System.out.println("A multiplicação desses números é: "+c.calc1());
		System.out.println("A divisão desses números é: "+c.calc1(n1,n2));
		in.close();
	}
}
