package com.entornos.elliotmoyanocutler.algoritmos;

public abstract class algoritmos {

	public int fibonacci(int numero) {
		if (numero < 2)
			return numero;
		return fibonacci(numero - 1) + fibonacci(numero - 2);
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
