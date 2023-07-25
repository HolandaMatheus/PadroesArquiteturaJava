package br.com.loja.mholanda.imposto;

import java.math.BigDecimal;

import br.com.loja.mholanda.orcamento.Orcamento;

public interface ImpostoInterface {
	
	BigDecimal calcular(Orcamento orcamento);

}
