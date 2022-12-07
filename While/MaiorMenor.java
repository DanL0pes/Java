import java.util.*;
public class MaiorMenor {
	public static void main(String args[]) {
		int i, anoA, anoN, idade, menor=999, maior=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o ano atual:");
		anoA = in.nextInt();
		for(i=1;i<=10;i++) {
			System.out.println("Digite o ano de nascimento:");
			anoN = in.nextInt();
			idade = anoA - anoN;
			System.out.println(idade+" anos");
			if(maior<idade) {
				maior = idade;
			} else if(menor>idade){
				menor = idade;
			}
		}
		System.out.println("O maior tem "+maior+" anos");
		System.out.println("O menor tem "+menor+" anos");
		in.close();
	}
}
