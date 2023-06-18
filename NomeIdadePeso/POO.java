package NomeIdadePeso;

public class POO {

	String nome;
	int idade;
	double peso;
	
	public void nomeUser(String nome) {
		System.out.println("Nome: " + nome);
	}
	
	public void idadeUser(int idade) {
		if (idade < 18) {
			System.out.println("Idade: " + idade + " - Menor de idade");
		}else {
			System.out.println("Idade: " + idade + " - Maior de idade");
		}
	}
	
	public void pesoUser(double peso) {
		if (idade < 70) {
			System.out.println("Peso: " + peso + " - Menos de 70Kg");
		}else {
			System.out.println("Peso: " + peso + " - Mais de 70Kg");
		}
	}
	
	
}
