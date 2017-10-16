package com.loiane.cursojava.aula30;

public class Carro {
	
	// atributos
			String marca;
			String modelo;
			int numPassageiros;
			double capCombustivel;
			double consumoCombustivel;
									
			public Carro(String marca, String modelo, int numPassageiros, double capCombustivel,
					double consumoCombustivel) {
				
				this.marca = marca;
				this.modelo = modelo;
				this.numPassageiros = numPassageiros;
				this.capCombustivel = capCombustivel;
				this.consumoCombustivel = consumoCombustivel;
			}

			public Carro() {}

			public Carro(String marca, String modelo, int numPassageiros) {
			
				this.marca = marca;
				this.modelo = modelo;
				this.numPassageiros = numPassageiros;
				System.out.println("Chamando o construtor com 3 par�metros");
			}
			
			public Carro(String marca, String modelo) {
				
				this(marca, modelo, 10);
				System.out.println("Chamando o construtor com 2 par�metros");
			}
		

			// m�todo sem retorno
			void exibirAutonomia() {

				System.out.println("A autonomia do carro �: " + this.capCombustivel * this.consumoCombustivel + " Km");
			}

			// m�todo com retorno
			double obterAutonomia() {
				System.out.println("M�todo obter autonomia foi chamado.");

				return this.capCombustivel * this.consumoCombustivel;
			}

			// m�todo com par�metro
			double calcularCombustivel(double km) {

				double qtdCombustivel = km / this.consumoCombustivel;

				return qtdCombustivel;
			}

}
