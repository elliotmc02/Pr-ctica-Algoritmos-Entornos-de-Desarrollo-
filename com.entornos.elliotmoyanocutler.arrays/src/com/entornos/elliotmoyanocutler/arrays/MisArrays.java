package com.entornos.elliotmoyanocutler.arrays;

/**
 * Clase que representa un algoritmo. Tiene metodos para sacar la media, la
 * mediana, el maximo numero del array, y el minimo
 * 
 * @author Elliot
 * @version 1.0
 */
public abstract class MisArrays {

	/**
	 * Metodo para calcular la media, recibe un array de numeros enteros y devuelve
	 * la media del array
	 * 
	 * @param array[] el array introducido
	 * @return la media del array
	 */

	public static double media(int array[]) {
		double media = 0;
		for (int nums : array) {
			media += nums;
		}
		return media / array.length;
	}

	/**
	 * Metodo para calcular la mediana, recibe un array de numeros enteros y
	 * devuelve la mediana del array
	 * 
	 * @param array[] el array introducido
	 * @return la mediana del array
	 */
	public static double mediana(int[] array) {
		double mediana;
		if (array.length % 2 == 0) {
			mediana = (array[(array.length / 2) - 1] + array[(array.length / 2)]) / 2;
		} else {
			mediana = array[array.length / 2];
		}
		return mediana;
	}

	/**
	 * Metodo para calcular el maximo numero del array, recibe un array de numeros
	 * enteros y devuelve el maximo
	 * 
	 * @param array[] el array introducido
	 * @return el maximo
	 */

	public static int maximo(int[] array) {
		int maximo = Integer.MIN_VALUE;
		for (int nums : array) {
			if (nums > maximo) {
				maximo = nums;
			}
		}
		return maximo;
	}

	/**
	 * Metodo para calcular el minimo numero del array, recibe un array de numeros
	 * enteros y devuelve el minimo
	 * 
	 * @param array[] el array introducido
	 * @return el minimo
	 */

	public static int minimo(int[] array) {
		int minimo = Integer.MAX_VALUE;
		for (int nums : array) {
			if (nums < minimo) {
				minimo = nums;
			}
		}
		return minimo;
	}
}
