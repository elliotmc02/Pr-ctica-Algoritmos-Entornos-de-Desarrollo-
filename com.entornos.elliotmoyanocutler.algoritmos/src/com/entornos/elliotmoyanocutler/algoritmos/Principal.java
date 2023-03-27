package com.entornos.elliotmoyanocutler.algoritmos;

import java.util.Random;
public class Principal {

	public static void main(String[] args) {
		
		int numeros[] = new int[5];
		
		for (int i = 0; i < numeros.length; i++) {
			Random nAleatorio = new Random();
			numeros[i] = nAleatorio.nextInt(20)+1;
		}
		int resultadoFibonacci[] = new int[numeros.length];
		for (int i = 0; i < numeros.length; i++) {
			resultadoFibonacci[i] = algoritmos.fibonacci(numeros[i]);
		}
		double resultadoFactorial[] = new double[numeros.length];
		for (int i = 0; i < numeros.length; i++) {
			resultadoFactorial[i] = algoritmos.factorial(numeros[i]);
		}
		boolean resultadoPrimos[] = new boolean[numeros.length];
		for (int i = 0; i < numeros.length; i++) {
			resultadoPrimos[i] = algoritmos.primo(numeros[i]);
		}
	}

}
