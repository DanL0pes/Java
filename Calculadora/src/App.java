import java.util.Scanner;
public class App {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		Calculadora c = new Calculadora();
		System.out.println("Digite o primeiro n�mero:");
		c.n1 = in.nextInt();
		System.out.println("Digite o segundo n�mero:");
		c.n2 = in.nextInt();
		System.out.println("Escolha a opera��o: soma[1]/sub[2]/mult[3]/div[4]");
		int i = in.nextInt();
		switch(i) {
			case 1:
				c.soma();
				break;
			case 2:
				c.sub();
				break;
			case 3:
				c.mult();
				break;
			case 4:
				c.div();
				break;
		}
	}
}
