package pack;

public class boletinT5_2 {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que muestre por pantalla una matriz de 9 filas por 9 columnas
		 * relleno con números aleatorios entre 500 y 900. A continuación, el programa debe
		 * mostrar los números de la diagonal que va desde la esquina inferior izquierda a la
		 * esquina superior derecha, así como el máximo, el mínimo y la media de los números
		 * que hay en esa diagonal.
		 */

		int t[][] = new int [9][9];
		int max = 500, min = 900, media = 0, contador = 0;
	    for (int i = 0; i < t.length; i++) {
	        for (int j = 0; j < t.length; j++) {
	        	int n = (int) (Math.random() * (900 - 500) + 500);
	        	t[i][j] = n;
	        	System.out.print("[" + t[i][j] + "]");
	            } System.out.println();
	        } System.out.println();
	        
	        for (int i = 0; i < t.length; i++) {
	        	System.out.print("[" + t[t.length - 1 - i][i] + "]");
	        	contador++;
	        	if (t[t.length - 1 - i][i] > max) {
	        		max = t[t.length - 1 - i][i];
	        	}
	        	if (t[t.length - 1 - i][i] < min) {
	        		min = t[t.length - 1 - i][i];	
	        	}
	        	media += t[t.length - 1 - i][i] / contador;
	        } System.out.println();
	        
	        System.out.println("El máximo es: " + max + " el mínimo es: " + min + " la media es: " + media);	        
	    }
}
