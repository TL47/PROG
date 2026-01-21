package pack;

public class AP5_4 {
	
	static int buscar(int t[], int clave) {
		int pos = -1;
		boolean esta = false;
		for (int i = 0; i < t.length && esta == false; i++) {
			if (t[i] == clave) {
				pos = i;
				esta = true;
			}
		}
		
		return pos;
	}

	public static void main(String[] args) {
		/*
		 * Escribe la función: int buscar(int t[], int clave), que busca de forma secuencial
		 * en la tabla t el valor clave. En caso de encontrarlo, devuelve en qué posición lo encuentra;
		 * y en caso contrario, devolverá -1.
		 */
		
		int t[] = {7, 9, 8, 4, 6, 2, 3, 6};
		int clave = 4;
		int resultado;
		resultado = buscar(t, clave);
		System.out.println(resultado);

	}

}
