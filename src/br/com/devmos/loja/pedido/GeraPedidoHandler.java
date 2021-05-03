package br.com.devmos.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.devmos.loja.orcamento.Orcamento;
import br.com.devmos.loja.pedido.acao.AcaoAposGerarPedido;

public class GeraPedidoHandler {
	
	List<AcaoAposGerarPedido> acoes;
	
	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}
	
	public void executa(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());		
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
		acoes.forEach(acao -> acao.executar(pedido));
	}

}
