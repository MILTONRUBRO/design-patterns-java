package br.com.devmos.loja.imposto;

import java.math.BigDecimal;

import br.com.devmos.loja.Orcamento;

public class ISS implements Imposto{
	
	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
	}

}
