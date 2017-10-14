package com.loiane.cursojava.aula25;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);

		// chamada do m�todo sem retorno
		van.exibirAutonomia();
		
		// chamada do m�todo com retorno
		double autonomia = van.obterAutonomia();
		System.out.println("A autonomia do carro �: " + autonomia);
		System.out.println("A autonomia do carro �: " + van.obterAutonomia());
		
		//chamada do m�todo com passagem de argumentos
		double qtdCombustivel10 = van.calcularCombustivel(10);
		double qtdCombustivel15 = van.calcularCombustivel(15);
		
		System.out.println("qtdCombustivel10 " + qtdCombustivel10);
		System.out.println("qtdCombustivel15 " + qtdCombustivel15);
		
	}

}
