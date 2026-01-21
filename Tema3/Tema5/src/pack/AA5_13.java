package pack;

public class AA5_13 {
	
	static int[] desordenar(int t[]) {
		int h[] = new int [t.length];
		for (int i = 0; i < t.length; i++) {
			h[i] = t[i];
		}
		
		for (int i = 0; i < 20; i++) {
			int indice1 = (int) (Math.random() * h.length);
			int indice2 = (int) (Math.random() * h.length);
		
			int temp = h[indice1];
			h[indice1] = h[indice2];
			h[indice2] = temp;
		}
		
		return h;
	}

	public static void main(String[] args) {
		/* 
		 *  Mоodifica la Actividad de aplicación 5.12 para que la función no modifique la tabla que se
		 *  pasa como parámetro y, en su lugar, cree y devuelva una copia de la tabla donde se han
		 *  desordenado los valores de los elementos.
		 */

		
		int t[] = {1,2,3,4};
		int h[];		
		h = desordenar(t);
						
		for (int i = 0; i < h.length; i++) {
			System.out.println(h[i]);
		}
		
	}

}
