import java.util.*;
public class PrecoProduto {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double pProd, lucro, pVenda;
		String r;
		do {
			System.out.println("Digite o valor de f�brica do produto:");
			pProd = in.nextDouble();
			System.out.println("Digite o lucro em porcentagem (ex: 30):");
			lucro = in.nextDouble();
			pVenda = pProd + pProd * (lucro/100);
			System.out.println("O Pre�o de venda do produto � de : "+pVenda+" Reais");
			System.out.println("Quer continuar? (S/N)");
			r = in.next();
		}while(r.equals("S") || r.equals("s") );
		in.close();
		System.out.println("Execu��o encerrada.");
	}
}
