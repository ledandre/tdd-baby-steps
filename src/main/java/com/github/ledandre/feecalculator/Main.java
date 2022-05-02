package com.github.ledandre.feecalculator;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class Main implements QuarkusApplication {

	@Override
	public int run(String... args) throws Exception {
		final double salario = Double.parseDouble(args[0]);
		CalculaImpostos calculaImpostos = new CalculaImpostos();
		System.out.println("=== Calculadora de impostos ===");
		System.out.println("Salário do funcionário: " + salario);
		System.out.println("Valor do imposto: " + calculaImpostos.calculaImposto(salario));
		return 0;
	}
}
