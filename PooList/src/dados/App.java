package dados;
import java.util.Scanner;
public class App {
		public static void main(String[]args) {
			Scanner in = new Scanner(System.in);
			Dados d = new Dados();
			String nome;
			int idade, peso;
			System.out.println("Digite seu nome completo:");
			nome = in.nextLine();
			System.out.println("Digite sua idade:");
			idade = in.nextInt();
			System.out.println("Digite seu peso em kg:");
			peso = in.nextInt();			
			System.out.println("Este são os dados:");
			System.out.println(d.calc(nome, idade, peso));
			in.close();
		}
}
