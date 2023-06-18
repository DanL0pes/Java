package somatoria;

public class Somatoria {
	public Somatoria() {
		int soma = 0;
		for(int i=0;i<=100;i++) { 
			soma = soma + i;
			System.out.println(soma + " ");
		}
	}
	public void close() {
		System.out.println("Programa encerrado.");
	}
}
