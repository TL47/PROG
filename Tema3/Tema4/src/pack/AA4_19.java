package pack;

public class AA4_19 {
	
	static void generaAleatorio(int n, int max, int min) {
		for (int i = n; i > 0; i--) {
			int random = (int) (Math.random() * (max - min) + min);
			System.out.println(random);
		}
	}
	
	static void generaAleatorio(int n) {
		for (int i = n; i > 0; i--) {
			double random = (Math.random());
			System.out.println(random);
		}
	}
	

	
	public static void main(String[] args) {
		/*
		 *  Sobrecarga la función realizada en la Actividad de aplicación 4.18 para que el único parámetro sea
		 *  la cantidad de números aleatorios que se muestra por consola. Los números aleatorios serán
		 *  reales y estarán comprendidos entre 0 y 1.
		 */

		generaAleatorio(4);
		generaAleatorio(4, 10, 2);
		
	}

}
