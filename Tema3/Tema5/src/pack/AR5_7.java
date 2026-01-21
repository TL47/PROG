package pack;

import java.util.Arrays;
import java.util.Scanner;

public class AR5_7 {
	
	static int [] sinRepetidos(int t[]) {
		int h[] = new int [0];				
		
		for (int valor: t) {
			if () {
				h = Arrays.copyOf(h, h.length + 1);
				h[h.length - 1] = valor;
			}
		}
		
		return h;
	}

	public static void main(String[] args) {
		/*
		 * Implementar la función: int [] sinRepetidos (int t[]), que construye y devuelve una
		 * tabla de la longitud apropiada, con los elementos de t, donde se han eliminado los datos repetidos.
		 */
		
		int indicador = 0;
		int t[] = {1, 4, 2, 4, 6, 3, 8};
		//indicador = buscar(t, indicador);
		t = sinRepetidos(t);

	}

}
