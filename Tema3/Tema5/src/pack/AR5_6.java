package pack;

public class AR5_6 {
	
	static int aciertos(int prim[], int win[]) {
		int acierto = 0;
		for (int i = 0; i < 6; i++) {
			if (prim[i] == win[i]) {
				acierto++;
			}
		}
		
		return acierto;
	}

	public static void main(String[] args) {
		/*
		 * Definir una función que tome como parámetros dos tablas, la primera con los 6 números
		 * de una apuesta de la primitiva, y la segunda (ordenada) con los 6 números de la combinación ganadora.
		 * La función devolverá el número de aciertos.
		 */
		
		int prim[] = {4, 7, 8, 6, 4, 1};
		int win[] = {4, 4, 1, 6, 4, 3};
		int acierto;
		acierto = aciertos(prim, win);
		System.out.println(acierto);
	}

}
