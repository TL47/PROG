package pack;

public class AR5_12 {

	public static void main(String[] args) {
		/*
		 * Crear una tabla bidimensional de longitud 5 x 5 y rellenarla de la siguiente forma: el elemento
		 * de la posición [n][m] debe contener el valor 10 x n + m. Después se debe mostrar su contenido.
		 */
		
		int t[][] = new int [5][5];
		
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t.length; j++) {
				System.out.println(t[i][j] = 10 * i + j);
			}
		}

	}

}
