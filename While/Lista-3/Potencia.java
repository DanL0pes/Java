import java.util.*;
public class Potencia {
	public static void main(String[] args) {
		int num, numBase, numExpoente, i=1;
		Scanner in = new Scanner (System.in);
		System.out.println("Digite o n�mero da Base:");
		numBase = in.nextInt();
		System.out.println("Digite o n�mero da Expoente:");
		numExpoente = in.nextInt();
		num = numBase;
		while (i < numExpoente) {
			num = num * numBase;
			i++;
		}
		System.out.println("O resultado da pot�ncia �: "+ num);
		in.close();
	}
}
