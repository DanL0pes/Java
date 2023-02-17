import java.util.*;
public class InversorTrêsAlgarismos {
	public static void main (String[]args) {
		int n, i=0;
		Scanner in = new Scanner (System.in);
		System.out.println("Digite um número inteiro de três algarismos:");
		n = in.nextInt();
		while (n>=100) {
			n= n-100;
			i++;
		} while (n>=10) {
			n= n-10;
			i=i+10;
		} while (n>=1) {
			n= n-1;
			i=i+100;
		}
		System.out.println("O valor ao inverso é: "+i);
		in.close();
	}
}
