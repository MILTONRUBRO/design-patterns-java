package br.com.devmos.loja.imposto;

import java.math.BigDecimal;

import br.com.devmos.loja.orcamento.Orcamento;

public abstract class ImpostoDecorator {
	
	private ImpostoDecorator outro;

	public ImpostoDecorator(ImpostoDecorator outro) {
		this.outro = outro;
	}
	
	protected abstract BigDecimal realizarCalculo(Orcamento orcamento);
	
	public BigDecimal calcular(Orcamento orcamento) {
		BigDecimal valorImposto = realizarCalculo(orcamento);
		BigDecimal valorOutroImposto = BigDecimal.ZERO;
		
		if(outro != null) {
			valorOutroImposto = outro.realizarCalculo(orcamento);
		}
		return valorImposto.add(valorOutroImposto);
	}
	

}
