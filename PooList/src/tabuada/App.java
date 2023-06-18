package tabuada;
import java.util.Scanner;
public class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um número para tabuada:");
		int num = in.nextInt();
		Tabuada tab = new Tabuada(num);
		in.close();
		tab.close();
	}
}
