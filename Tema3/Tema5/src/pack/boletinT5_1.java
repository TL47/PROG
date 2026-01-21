package pack;

public class boletinT5_1 {
	
	static boolean sonIguales(int t[][], int h[][]) {
		boolean comprobacion = true;
		if (t.length == h.length) {
			for (int i = 0; i < t.length && comprobacion == true; i++) {
				for (int j = 0; j < h.length && comprobacion == true; j++) {
					if(t[i][j] != h[i][j]) {
						comprobacion = false;
					}
				}
			}
		} else {
			comprobacion = false;
		}
		return comprobacion;
	}

	public static void main(String[] args) {
		/*
		 * Crear una función que devuelva si dos matrices son iguales. Dos matrices son
		 * iguales si tienen las mismas dimensiones y los elementos que ocupan la misma
		 * posición son iguales.
		 */

		int t[][] = {{1,2},{3,4}};
		int h[][] = {{1,2},{3,4}};
		
		boolean comprobacion;
		comprobacion = sonIguales(t, h);
		System.out.println(comprobacion);
		
	}

}
