import java.util.*;
public class IdadeTituloEleitor {
	public static void main (String args[]) {
		Scanner ler=new Scanner (System.in);
		short anoNascto, anoAtual, idade;
		System.out.println("Digite o seu ano de nascimento:");
		anoNascto=ler.nextShort();
		System.out.println("Digite o ano atual:");
		anoAtual=ler.nextShort();
		idade=(short) (anoAtual-anoNascto);
		System.out.println("Você possui "+idade+" anos de idade.");
		if (idade>=16) {
			System.out.println("Você poderá tirar o seu título de eleitor.");
		}else {
			System.out.println("Você não poderá tirar o seu título de eleitor.");
		}
		ler.close();
	}

}
