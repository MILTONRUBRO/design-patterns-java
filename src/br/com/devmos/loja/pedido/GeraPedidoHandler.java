package br.com.devmos.loja.pedido;

import java.time.LocalDateTime;

import br.com.devmos.loja.Orcamento;

public class GeraPedidoHandler {
	
	//construtor com injecao de dependencias: repository, service
	
	public void executa(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());		
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
		System.out.println("Salvar no banco de dados");
		System.out.println("Enviar email com dados do pedido");
		
	}

}
