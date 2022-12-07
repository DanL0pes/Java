import java.util.Scanner;

public class MaiorMenor {
	public static void main(String[] args) {
		int a[] = new int[10];
		int maiorN = 0, menorN = 9999999999;
		Scanner in = new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			System.out.print("Digite o "+(i+1)+". numero: ");
			a[i] = in.nextInt();
		}
		
		for(int i=0;i<10;i++) {
			if(a[i]>maiorN) {
				maiorN = a[i];
			}
			if(a[i]<menorN || i==0) {
				menorN = a[i];
			}
		}
		System.out.println("O maior numero digitado é: "+maiorN);
		System.out.println("O menor numero digitado é: "+menorN);
		
		in.close();
	}
}