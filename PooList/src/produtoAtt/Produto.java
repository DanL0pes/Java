package produtoAtt;

public class Produto {
	private int id;
	private String produto;
	private String descricaoProduto;
	private double valor;
	private String dataCadastro;
	
	public Produto(int id, String produto, String descricaoProduto, double valor, String dataCadastro){
		this.id= id;
		this.produto = produto;
		this.descricaoProduto = descricaoProduto;
		this.valor = valor;
		this.dataCadastro = dataCadastro;
	}
	
	public void exibirProduto() {
		System.out.println("id: "+ id);
		System.out.println("produto: "+produto);
		System.out.println("descricaoProduto: "+descricaoProduto);
		System.out.println("valor: "+valor);
		System.out.println("dataCadastro: "+dataCadastro);
	}
}
	
