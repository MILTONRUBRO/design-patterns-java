package br.com.devmos.loja;

import java.math.BigDecimal;

import br.com.devmos.loja.situacao.EmAnalise;
import br.com.devmos.loja.situacao.SituacaoOrcamento;

public class Orcamento {
	
	private BigDecimal valor;
	private int quantidadeItens;
	private SituacaoOrcamento situacao;
	

	public int getQuantidadeItens() {
		return quantidadeItens;
	}

	public void setQuantidadeItens(int quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Orcamento(BigDecimal valor, int quantidadeItens) {
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
		this.situacao = new EmAnalise();
	}

	public SituacaoOrcamento getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}
	
	public void aplicarDescontoExtra() {
		BigDecimal valorDesconto = this.situacao.calcularValorDescontoExtra(this);
		this.valor = this.valor.subtract(valorDesconto);
	}
	
	public void aprovar() {
		this.situacao.aprovar(this);
	}
	
	public void reprovar() {
		this.situacao.reprovar(this);
	}
	
	public void finalizar() {
		this.situacao.finalizar(this);
	}
	
}
