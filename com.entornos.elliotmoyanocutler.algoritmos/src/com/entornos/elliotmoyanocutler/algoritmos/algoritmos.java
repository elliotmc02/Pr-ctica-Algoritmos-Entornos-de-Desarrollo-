package com.entornos.elliotmoyanocutler.algoritmos;

public abstract class algoritmos {

	public int fibonacci(int numero) {
		int siguiente = 1, actual = 0, temporal = 0;
		for (int i = 1; i <= numero; i++) {
			temporal = actual;
			actual = siguiente;
			siguiente = siguiente + temporal;
		}
		return actual;
	}

	public double factorial(int numero) {
		double res = 1;
		for (int i = 1; i <= numero; i++) {
			res = res * i;
		}
		return res;
	}

	public boolean primo(int numero) {
		int contador = 2;
		boolean primo = true;
		while ((primo) && (contador != numero)) {
			if (numero % contador == 0) {
				primo = false;
			}
			contador++;
		}
		return primo;
	}
}
