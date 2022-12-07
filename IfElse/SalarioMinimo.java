package prjSalarioMinimo;
import java.util.*;
public class SalarioMinimo {
	public static void main (String args[]) {
		Scanner in=new Scanner (System.in);
		double salario;
		System.out.println ("Digite o salário do usuário:");
		salario=in.nextDouble();
		if (salario>=954) {
			System.out.println ("O salário está acima ou é igual ao valor do salário mínimo.");
		}else {
			System.out.println ("O salário está abaixo do valor do salário mínimo.");
		}
		in.close();
	}

}
