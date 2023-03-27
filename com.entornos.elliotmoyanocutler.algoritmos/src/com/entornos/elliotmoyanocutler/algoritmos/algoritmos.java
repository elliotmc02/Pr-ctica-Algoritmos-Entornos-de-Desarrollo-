package com.entornos.elliotmoyanocutler.algoritmos;

public abstract class algoritmos {

	public int fibonacci(int numero) {
		if (numero < 2)
			return numero;
		return fibonacci(numero - 1) + fibonacci(numero - 2);
	}
}
