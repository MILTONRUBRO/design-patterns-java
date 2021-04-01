package br.com.devmos.loja.imposto;

import java.math.BigDecimal;

import br.com.devmos.loja.Orcamento;

public interface Imposto {
	
	BigDecimal calcular(Orcamento orcamento);

}
