package br.com.devmos.loja.desconto;

import java.math.BigDecimal;

import br.com.devmos.loja.Orcamento;

public class DescontoParaOrcamentoComMaisDeCincoItens extends Desconto{

	public DescontoParaOrcamentoComMaisDeCincoItens(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal calcular(Orcamento orcamento) {
		if (orcamento.getQuantidadeItens() > 5) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}

		return proximo.calcular(orcamento);
	}
}
