package com.github.ledandre.feecalculator;

public class Imposto {

	double porcentagem;
	double salario;

	public Imposto(int porcentagem, double salario) {
		this.porcentagem = porcentagem;
		this.salario = salario;
	}

	public double getValorImposto() {
		return (salario * porcentagem) / 100.00;
	}
}
