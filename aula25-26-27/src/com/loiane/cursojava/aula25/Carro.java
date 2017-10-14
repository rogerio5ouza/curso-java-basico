package com.loiane.cursojava.aula25;

public class Carro {
	// atributos
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	// m�todo sem retorno
	void exibirAutonomia() {

		System.out.println("A autonomia do carro �: " + capCombustivel * consumoCombustivel + " Km");
	}

	// m�todo com retorno
	double obterAutonomia() {
		System.out.println("M�todo obter autonomia foi chamado.");

		return capCombustivel * consumoCombustivel;
	}

	// m�todo com par�metro
	double calcularCombustivel(double km) {

		double qtdCombustivel = km / consumoCombustivel;

		return qtdCombustivel;
	}

}
