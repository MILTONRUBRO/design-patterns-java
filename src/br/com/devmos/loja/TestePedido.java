package br.com.devmos.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.devmos.loja.pedido.GeraPedido;
import br.com.devmos.loja.pedido.GeraPedidoHandler;
import br.com.devmos.loja.pedido.acao.EnviarEmail;
import br.com.devmos.loja.pedido.acao.SalvarPedidoBancoDeDados;

public class TestePedido {
	
	public static void main(String[] args) {
		String cliente = "Jose Maria";
		BigDecimal valorOrcamento = new BigDecimal("300");
		int quantidadeItens = 3;
		
		GeraPedido pedido = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(
				Arrays.asList(new SalvarPedidoBancoDeDados(), 
							  new EnviarEmail()));
		
		handler.executa(pedido);
	}

}
