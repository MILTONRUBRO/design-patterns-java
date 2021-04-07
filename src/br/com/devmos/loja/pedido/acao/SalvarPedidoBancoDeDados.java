package br.com.devmos.loja.pedido.acao;

import br.com.devmos.loja.pedido.Pedido;

public class SalvarPedidoBancoDeDados implements AcaoAposGerarPedido{
	
	@Override
	public void executar(Pedido pedido) {
		System.out.println("Salvando pedido no banco de dados");
	}

}
