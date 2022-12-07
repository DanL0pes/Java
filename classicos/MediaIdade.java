import java.util.*;
public class MediaIdade {
	public static void main(String args[]) {
		int i, idade, menor=999, maior=0, n;
		double mediaAltura, tempMedia=0, altura[] = new double[11];
		Scanner in = new Scanner(System.in);
		for(i=1;i<=10;i++) {
			System.out.println("Digite a idade:");
			idade = in.nextInt();	
			System.out.println("Digite a altura:");
			altura[i] = in.nextDouble();
			System.out.println("");
			if(maior<idade) {
				maior = idade;
			} else if(menor>idade){
				menor = idade;
			}
		}
		for(n=0; n<=10; n++) {
			tempMedia = altura[n] + tempMedia;
		}
		mediaAltura = tempMedia/10;
		System.out.printf("A média de altura, é: "+mediaAltura);
		System.out.println();
		System.out.println("O maior tem "+maior+" anos");
		System.out.println("O menor tem "+menor+" anos");
		in.close();
	}
}
