import java.util.Scanner;
public class exercicio1 {
	public static void main(String[]args) {
		int j;
		int soma[] = new int[4];
		int matriz[][] = new int[4][2];
		Scanner in = new Scanner (System.in);
		for(int i=0;i<=3;i++) {
			for(j=0;j<=1;j++) {
				System.out.println("Digite o valor do local ["+i+"] ["+j+"]");
				matriz[i][j] = in.nextInt();
				soma[i] = soma[i]+matriz[i][j];
			}
		}
		for(int i=0;i<=3;i++) {
			j=0;
			System.out.print(matriz[i][j]+ "+" +matriz[i][j+1]+" = "+soma[i]);
			System.out.println();
		}
		in.close();
	}
}
