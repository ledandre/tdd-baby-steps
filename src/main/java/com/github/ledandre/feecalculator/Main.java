package com.github.ledandre.feecalculator;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class Main implements QuarkusApplication {

	@Override
	public int run(String... args) throws Exception {
		System.out.println("=== Calculadora de impostos ===");
		System.out.println("Salário do funcionário: " + args[0]);
		return 0;
	}
}
