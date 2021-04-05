package br.com.devmos.loja.situacao;

import br.com.devmos.loja.Orcamento;

public class Reprovado extends SituacaoOrcamento {
	
	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}

}
