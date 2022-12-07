package prjSalarioTransporte;
import java.util.Scanner;
public class SalarioTransporte {
	public static void main (String[] args) {
		double salarioBruto, descVT;
		Scanner ler= new Scanner (System.in);
		System.out.println("Digite o salário bruto da pessoa, que está com desconto de 6% relacionado com o vale transporte:");
		salarioBruto=ler.nextDouble();
		descVT=(salarioBruto*6)/100;
		System.out.println("o desconto relacionado com o vale transporte é R$"+descVT+".");
		ler.close();
	}

}
