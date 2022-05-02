package com.github.ledandre.feecalculator;

public class CalculaImpostos {

	public double calculaImposto(double salario) {
		int taxa = verificaFaixaSalario(salario);
		return new Imposto(taxa, salario).getValorImposto();
	}

	private int verificaFaixaSalario(double salario) {
		if (salario < 1000) {
			return 5;
		} else if (salario >= 1000 && salario < 2000) {
			return 10;
		}

		return 15;
	}
}
