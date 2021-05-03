package br.com.devmos.loja;

import java.math.BigDecimal;

import br.com.devmos.loja.desconto.CalculadoraDeDescontos;
import br.com.devmos.loja.orcamento.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) {
		Orcamento primeiro = new Orcamento(new BigDecimal("200"), 6);
		Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);
		
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		
		System.out.println("Teste de primeiro desconto " + calculadora.calcular(primeiro));
		System.out.println("Teste de segundo desconto " + calculadora.calcular(segundo));

	}

}
