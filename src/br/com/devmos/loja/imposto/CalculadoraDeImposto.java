package br.com.devmos.loja.imposto;

import java.math.BigDecimal;

import br.com.devmos.loja.Orcamento;

public class CalculadoraDeImposto {
	
	public BigDecimal calcular(Imposto imposto, Orcamento orcamento) {
		return imposto.calcular(orcamento);
	}

}
