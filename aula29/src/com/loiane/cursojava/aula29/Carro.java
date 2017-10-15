package com.loiane.cursojava.aula29;

public class Carro {

	// atributos
		String marca;
		String modelo;
		int numPassageiros;
		double capCombustivel;
		double consumoCombustivel;
		
		// Construtor
		 Carro() {
			System.out.println("Classe Carro foi instanciada");
			numPassageiros = 4;
		}
		// Construtor
		Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_){
			marca = marca_;
			modelo = modelo_;
			numPassageiros = numPassageiros_;
			capCombustivel = capCombustivel_;
			consumoCombustivel = consumoCombustivel_;
		}

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
