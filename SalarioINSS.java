import java.util.*;
public class SalarioINSS {
	public static void main(String [] args) {
		Scanner in = new Scanner (System.in);
		double vAula, qntAula, salario, salarioD = 0;
		System.out.println("Digite a quantidade de Aulas: ");
		qntAula = in.nextDouble();
		System.out.println("Digite o valor da Aula: ");
		vAula = in.nextDouble();
		salario = vAula * qntAula;
		if(salario <= 1212.00 && salario > 0) {
			salarioD = salario - (salario*0.075);
		}else if(salario <= 2427.35 && salario > 0) {
			salarioD = salario - (salario*0.09);
		}else if(salario <= 3641.03 && salario > 0) {
			salarioD = salario - (salario*0.12);
		}else if(salario <= 7087.22 && salario > 0) {
			salarioD = salario - (salario*0.14);
		}else if(salario <= 12136.79 && salario > 0) {
			salarioD = salario - (salario*0.145);
		}else if(salario <= 24273.57 && salario > 0) {
			salarioD = salario - (salario*0.165);
		}else if(salario <= 47333.46 && salario > 0) {
			salarioD = salario - (salario*0.19);
		}else if(salario > 47333.46 && salario > 0) {
			salarioD = salario - (salario*0.22);
		}else {
			System.out.println("Salário inválido.");
		}
		if(salario>0) {
			System.out.println("O salário líquido é de "+salarioD+" reais.");
		}
		in.close();
	}
}
