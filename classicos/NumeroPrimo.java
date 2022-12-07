import java.util.*;
public class NumeroPrimo {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int i;
		double n, res, cont=0;
		System.out.println("Digite o número desejado:");
		n = in.nextDouble();
		for (i=1;i<=n;i++) {
			res = n%i;
			if(res==0) {
				cont++;
			}
		}
		if(cont == 2) {
			System.out.println("Número é primo.");
		}else {
			System.out.println("Número não é primo.");
		}
		in.close();
	}
}
