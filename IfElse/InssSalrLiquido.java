import java.util.*;
public class InssSalrLiquido {
	public static void main (String args[]) {
		Scanner ler=new Scanner (System.in);
		double salario, aliquota, inss, salrLiquido;
		System.out.println ("Digite seu salário para saber o valor devido de INSS e o salário líquido:");
		salario=ler.nextDouble();
		System.out.println ("Digite o seu desconto de IRRF:");
		if(salario<=2500) {
			inss=salario*9/100;
			salrLiquido=salario-inss;
			System.out.println ("O valor do INSS é de R$"+inss+", e do salário líquido é de R$ "+salrLiquido+".");
		}else {
			aliquota=(salario-2500)*11/100;
			inss=225+aliquota;
			salrLiquido=salario-inss;
			System.out.println ("O valor do INSS é de R$ "+inss+", e do salário líquido é de R$ "+salrLiquido+".");
		}
		ler.close();
	}

}
