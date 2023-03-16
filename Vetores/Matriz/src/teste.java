import java.util.*;
public class teste {
	public static void main(String[]args) {
		int matriz[][][] = new int[3][3][3];
		Scanner in = new Scanner (System.in);
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				for(int k=0;k<=2;k++) {
					System.out.println("Digite o valor do local ["+i+"] ["+j+"]"+"["+k+"]");
					matriz[i][j][k] = in.nextInt();
				}
			}
		}
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				for(int k=0;k<=2;k++) {
					System.out.print(matriz[i][j][k]+ " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		in.close();
	}
}
