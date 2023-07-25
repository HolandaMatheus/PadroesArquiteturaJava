package br.com.loja.mholanda;

import java.math.BigDecimal;

import br.com.loja.mholanda.imposto.CalculadoraDeImpostos;
import br.com.loja.mholanda.imposto.ISS;
import br.com.loja.mholanda.orcamento.Orcamento;

public class TestesImpostos {

	public static void main(String[] args) {


		Orcamento orcamento = new Orcamento(new BigDecimal("100"));
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		
		System.out.println(calculadora.calcular(orcamento, new ISS()));
		
		
	}

}
