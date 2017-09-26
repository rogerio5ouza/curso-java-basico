package com.loiane.cursojava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		//Operadores Aritméticos
		
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado = resultado * 2;
		System.out.println(resultado);
		
		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado % 7;
		System.out.println(resultado);
		
		String primeiroNome = "Esta é ";
		String segundoNome = "uma String concatenada.";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);
		
		//Operadores de Incremento e Decremento
		
		resultado = resultado + 1;
		System.out.println(resultado);
		
		resultado++;
		System.out.println(resultado);
		
		System.out.println(resultado++);
		//Mesma coisa que
		//System.out.println(resultado);
		//resultado = resultado + 1;
		//resultado += 1;
		
		System.out.println(++resultado);
		//Mesma coisa que
		//resultado += 1;
		//System.out.println(resultado);
		
		resultado--;
		System.out.println(resultado);
		
		
		System.out.println(resultado--);
		System.out.println(--resultado);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
