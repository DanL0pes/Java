package dados;

public class Dados {
	String retNome, retorno, retEstadoIdade, retEstadoPeso;
	public String calc(String nome, int idade, int peso) {
		retNome = nome;
		if (idade < 18) {
			retEstadoIdade = ("Idade: " + idade + " - Menor de idade");
		}else {
			retEstadoIdade = ("Idade: " + idade + " - Maior de idade");
		}
		if (peso <= 70) {
			retEstadoPeso = ("Peso: " + peso + "kg - Menos ou igual à 70 kg.");
		}else {
			retEstadoPeso = ("Peso: " + peso + "kg - Maior de 70 kg.");
		}
		retorno = (retNome + "; "+ retEstadoIdade +"; "+retEstadoPeso);
		return(retorno);
	}
}
