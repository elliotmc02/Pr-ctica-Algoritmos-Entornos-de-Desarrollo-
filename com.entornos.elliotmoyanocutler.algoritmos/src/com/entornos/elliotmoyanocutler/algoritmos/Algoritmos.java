package com.entornos.elliotmoyanocutler.algoritmos;
/**
 * Clase que representa un algoritmo. Tiene metodos para calcular el fibonacci, factorial
 * y si el numero es primo o no
 * @author Elliot
 * @version 1.0
 */
public abstract class algoritmos {

	/**
	 * Metodo para calcular fibonacci, recibe un numero y devuelve el
	 * fibonacci de dicho numero
	 * @param numero el numero introducido
	 * @return el fibonacci de dicho numero
	 */
	public static int fibonacci(long numero) {
		int siguiente = 1, actual = 0, temporal = 0;
		for (int i = 1; i <= numero; i++) {
			temporal = actual;
			actual = siguiente;
			siguiente = siguiente + temporal;
		}
		return actual;
	}
	/**
	 * Metodo para calcular factorial, recibe un numero y devuelve el
	 * factorial de dicho numero
	 * @param numero el numero introducido
	 * @return el factorial de dicho numero
	 */
	public static double factorial(long numero) {
		double res = 1;
		for (int i = 1; i <= numero; i++) {
			res = res * i;
		}
		return res;
	}
	/**
	 * Metodo para saber si es primo o no, recibe un numero y devuelve
	 * si es primo o no
	 * @param numero el numero introducido
	 * @return true si es primo o false si no es primo
	 */
	public static boolean primo(int numero) {
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
