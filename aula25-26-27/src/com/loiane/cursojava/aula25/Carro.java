package com.loiane.cursojava.aula25;

public class Carro {
	// atributos
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	// método sem retorno
	void exibirAutonomia() {

		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " Km");
	}

	// método com retorno
	double obterAutonomia() {
		System.out.println("Método obter autonomia foi chamado.");

		return capCombustivel * consumoCombustivel;
	}

	// método com parâmetro
	double calcularCombustivel(double km) {

		double qtdCombustivel = km / consumoCombustivel;

		return qtdCombustivel;
	}

}
