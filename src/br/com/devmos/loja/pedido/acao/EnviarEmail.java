package br.com.devmos.loja.pedido.acao;

import br.com.devmos.loja.pedido.Pedido;

public class EnviarEmail implements AcaoAposGerarPedido{
	
	@Override
	public void executar(Pedido pedido) {
		System.out.println("Enviando email com dados do pedido");
	}

}
