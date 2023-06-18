package produto;
import java.util.*;
public class App {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		Produto p = new Produto();
		p.setId(in.nextInt());
		p.setProduto(in.next());
		p.setDescricaoProduto(in.next());
		p.setValor(in.nextDouble());
		p.setDataCadastro(in.next());
		System.out.println("");
		System.out.println("id: "+ p.getId());
		System.out.println("produto: "+p.getProduto());
		System.out.println("descricaoProduto: "+p.getDescricaoProduto());
		System.out.println("valor: "+p.getValor());
		System.out.println("dataCadastro: "+p.getDataCadastro());
		in.close();
	}
}
