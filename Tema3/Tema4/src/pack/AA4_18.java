package pack;

public class AA4_18 {
	
	static void generaAleatorio(int n, int max, int min) {
		for (int i = n; i > 0; i--) {
			int random = (int) (Math.random() * (max - min) + min);
			System.out.println(random);
		}
	}
	
	public static void main(String[] args) {
		/*
		 *  Crea una función que muestre por consola una serie de números aleatorios enteros. Los
		 *  parámetros de la función serán: la cantidad de números aleatorios que se mostrarán y los
		 *  valores mínimos y máximos que estos pueden tomar.
		 */

		generaAleatorio(4, 10, 2);
		
	}

}
