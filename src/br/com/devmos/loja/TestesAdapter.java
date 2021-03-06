package br.com.devmos.loja;

import java.math.BigDecimal;

import br.com.devmos.loja.http.JavaHttpClient;
import br.com.devmos.loja.orcamento.Orcamento;
import br.com.devmos.loja.orcamento.RegistroDeOrcamento;

public class TestesAdapter {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
		orcamento.aprovar();
		orcamento.finalizar();
		
		RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
		registro.registrar(orcamento);
	}
}
