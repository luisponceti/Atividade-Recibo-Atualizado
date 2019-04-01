package br.com.db1.recibos;

import java.util.ArrayList;
import java.util.List;


public class Pedido {

	private StatusTipoPedido status;

	private Cliente cliente;

	private String numero;
	
	private ProdutoHistorico historicos;

	public Pedido(Cliente cliente, String numero) {
		this.cliente = cliente;	
		this.numero = numero;
		this.status = StatusTipoPedido.ABERTO;
		
	}

	public Cliente getCliente(){
		return this.cliente;
	}
	
	public String getNumero(){
		return this.numero;
	}
	
	public void addItem(){
		List<Produto> produtos = new ArrayList<>();
		List<ProdutoDoPedido> quantidade = new ArrayList<>();
		
	}
	
	
}
