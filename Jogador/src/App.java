import java.util.Scanner;
public class App {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		Jogador j = new Jogador();
		System.out.println("Digite o nome do Jogador:");
		j.nome = in.next();
		System.out.println("Digite a posição:");
		j.posicao = in.next();
		System.out.println("Digite a idade:");
		j.idade = in.nextInt();
		System.out.println("O jogador escalado foi o "+j.nome+", que joga de "+j.posicao+" com "+j.idade+" anos.");
		j.chutar();
		j.fazerGol();
		in.close();
	}
}
