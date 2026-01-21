package pack;

import java.util.*;

public class AA5_11 {
	
	static int [] buscarTodos(int t[], int clave) {
		Scanner sc = new Scanner(System.in);
		int h[] = new int [t.length];
		int j = 0;
		System.out.println("Introduce una clave: ");
		clave = sc.nextInt();
		for (int i = 0; i < t.length; i++) {
			if (clave == t[i]) {
				h[j] = i;
				j++;
			} else {
				h[j] = -1;
				j++;
			}
		}
		
		return h;
	}

	public static void main(String[] args) {
		
		/*
		 *  Realiza la función: int [] buscarTodos (int t[], int clave), que crea y devuelve una
		 *  tabla con todos los indices de los elementos donde se encuentra la clave de búsqueda. En
		 *  el caso de que clave no se encuentre en la tabla t, la función devolverá una tabla vacía.
		 */
			
		int t[] = {1,2,3,4,2};
		int clave = 0;
		t = buscarTodos(t, clave);
		for (int i = 0; i < t.length; i++) {
			if (t[i] != -1) {
				System.out.println(t[i]);
			}
		}
	}
}
