package imc;
import java.util.Scanner;
public class App {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		Imc imc = new Imc();
		double peso, altura;
		System.out.println("Digite sua altura em metros:");
		altura = in.nextDouble();
		System.out.println("Digite seu peso em Kg:");
		peso = in.nextDouble();
		imc.imc(peso, altura);
		System.out.println(imc.estado);
		in.close();
	}
}
