import java.util.Scanner;
public class App {
	public static void main(String[]args) {
		int numInicial, numFinal;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o n�mero inical do intervalo:");
		numInicial = in.nextInt();
		System.out.println("Digite o n�mero final do intervalo:");
		numFinal = in.nextInt();
		Tabuada t = new Tabuada(numInicial, numFinal);
		in.close();
		t.close();
	}
}
