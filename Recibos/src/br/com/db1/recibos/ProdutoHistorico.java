package br.com.db1.recibos;

import java.time.LocalDateTime;

public class ProdutoHistorico {

	private LocalDateTime data;

	private StatusTipoPedido status;

	public ProdutoHistorico(LocalDateTime data, StatusTipoPedido statusPedido) {
		this.data = LocalDateTime.now();
		statusPedido = status;
	}
	
	public StatusTipoPedido getStatus(){
		return this.status;
	}

}
