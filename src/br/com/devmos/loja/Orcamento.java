package br.com.devmos.loja;

import java.math.BigDecimal;

public class Orcamento {
	
	private BigDecimal valor;

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Orcamento(BigDecimal valor) {
		this.valor = valor;
	}

}
