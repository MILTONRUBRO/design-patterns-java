package br.com.devmos.loja.desconto;

import java.math.BigDecimal;

import br.com.devmos.loja.Orcamento;

public class SemDesconto extends Desconto{

	public SemDesconto() {
		super(null);
	}

	public BigDecimal calcular(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
}
