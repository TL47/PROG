package pack;

public class AR5_4 {
	
	static int maximo(int t[]) {
		int max = t[0];
		
		for (int i : t) {
			if (i > max) {
				max = i;
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		/*
		 * Diseñar la función: int maximo (int t []). que devuelva el máximo valor contenido en
		 * la tabla t.
		 */
		
		int t[] = {4, 6, 2, 8, 1, 4};
		int resultado;
		resultado = maximo(t);
		System.out.println(resultado);
	}

}
