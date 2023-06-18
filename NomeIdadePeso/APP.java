package NomeIdadePeso;
import java.util.*;
public class APP {
	ublic static void main(String[] args) {
		pScanner in = new Scanner(System.in);
		POO calc = new POO();
		
		String nome;
		int idade;
		double peso;
		
		System.out.println("Digite seu nome:");
		nome = in.nextLine();
		
		System.out.println("Digite sua idade:");
		idade = in.nextInt();
		
		System.out.println("Digite seu peso");
		peso = in.nextDouble();
		
		System.out.println();
		
		calc.nomeUser(nome);
		calc.idadeUser(idade);
		calc.pesoUser(peso);

	}

}
