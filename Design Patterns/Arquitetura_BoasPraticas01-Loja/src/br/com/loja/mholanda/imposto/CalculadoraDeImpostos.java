package br.com.loja.mholanda.imposto;

import java.math.BigDecimal;

import br.com.loja.mholanda.orcamento.Orcamento;

public class CalculadoraDeImpostos {

	//Calculo de imposto
	public BigDecimal calcular (Orcamento orcamento, ImpostoInterface tipoImposto) {
		
		return tipoImposto.calcular(orcamento);
		
	}

}
