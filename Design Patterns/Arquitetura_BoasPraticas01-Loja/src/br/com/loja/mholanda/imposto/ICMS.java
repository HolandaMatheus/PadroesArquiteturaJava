package br.com.loja.mholanda.imposto;

import java.math.BigDecimal;

import br.com.loja.mholanda.orcamento.Orcamento;

public class ICMS implements ImpostoInterface {
	
	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

}
