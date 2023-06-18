package produtoAtt;
import java.util.*;
public class App {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		int id;
		String produto;
		String descricaoProduto;
		double valor;
		String dataCadastro;
		id=in.nextInt();
		produto=in.next();
		descricaoProduto=in.next();
		valor=in.nextDouble();
		dataCadastro=in.next();
		System.out.println("");
		Produto p = new Produto(id, produto, descricaoProduto, valor, dataCadastro);
		p.exibirProduto();
		in.close();
	}
}
