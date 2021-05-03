package br.com.devmos.loja.imposto;

import java.math.BigDecimal;

import br.com.devmos.loja.orcamento.Orcamento;

public interface Imposto {
	
	BigDecimal calcular(Orcamento orcamento);

}
