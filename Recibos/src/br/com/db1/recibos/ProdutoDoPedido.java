package br.com.db1.recibos;

public class ProdutoDoPedido {

	private String produto;

	private Double quantidade;

	private Double valor;

	public ProdutoDoPedido(String numero, String produto, Double quantidade) {

		Validador.naoPodeSerNulo(produto, "produto");
		Validador.naoPodeSerNulo(quantidade, "quantidade");

		this.produto = produto;
		this.quantidade = quantidade;
		// this.valor = Produto.valor();
	}

	public String getProduto() {
		return this.produto;
	}

	public Double getQuantidade() {
		return this.quantidade;
	}

}
