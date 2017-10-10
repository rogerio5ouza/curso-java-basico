package com.loiane.cursojava.aula21;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {
		
		//Sem for each
		int[] notas = new int[10];

		Random random = new Random();

		for (int i = 0; i < notas.length; i++) {
			notas[i] = random.nextInt(10);
		}

		for (int i = 0; i < notas.length; i++) {
			int nota = notas[i];
			System.out.println(nota);
		}

		// Usando for each

		System.out.println("Usando o for each");

		for (int nota : notas) {
			System.out.println(nota);
		}

	}

}
