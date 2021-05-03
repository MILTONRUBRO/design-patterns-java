package br.com.devmos.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.devmos.loja.DomainException;
import br.com.devmos.loja.orcamento.Orcamento;

public abstract class SituacaoOrcamento {
	
	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

	public void aprovar(Orcamento orcamento) {
		throw new DomainException("Orcamento n�o pode ser aprovado");
	}
	
	public void reprovar(Orcamento orcamento) {
		throw new DomainException("Orcamento n�o pode ser reprovado");
	}
	
	public void finalizar(Orcamento orcamento) {
		throw new DomainException("Orcamento n�o pode ser finalizado");
	}

}
