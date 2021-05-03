package br.com.devmos.loja.orcamento.situacao;

import br.com.devmos.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {
	
	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}

}
