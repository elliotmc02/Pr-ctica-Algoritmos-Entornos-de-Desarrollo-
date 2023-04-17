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

}
