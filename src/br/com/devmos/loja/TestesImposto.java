package br.com.devmos.loja;

import java.math.BigDecimal;

import br.com.devmos.loja.imposto.CalculadoraDeImposto;
import br.com.devmos.loja.imposto.ICMS;
import br.com.devmos.loja.orcamento.Orcamento;

public class TestesImposto {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 6);
		CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
		System.out.println("Imposto de: " + calculadora.calcular(new ICMS(), orcamento));

	}

}
