package pack;

import java.util.Arrays;

public class AR5_5 {
	
	static int [] rellenaPares(int longitud, int fin) {
		
		int pares[] = new int [longitud];
		int i = 0;
		while (i < pares.length) {
			int random = (int) (Math.random() * fin + 1);
			if (random % 2 == 0) {
				pares[i] = random;
				i++;
			}
		}
				
		Arrays.sort(pares);
		return pares;
	}

	public static void main(String[] args) {
		/*
		 * Escribir la función int [] rellenaPares (int longitud, int fin), que crea y devuelve
		 * una tabla ordenada de la longitud especificada, que se encuentra rellena con números pares
		 * aleatorios comprendidos en el rango desde 2 hasta fin (inclusive).
		 */

		int t[];
		int longitud = 4, fin = 20;
		t = rellenaPares(longitud, fin);
		System.out.println(Arrays.toString(t));
	}

}
