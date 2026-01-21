package pack;

public class AA4_12 {
	
	static double funcion_distancia(double x1, double y1, double x2, double y2) {
		return(Math.sqrt(Math.pow((x1 -x2), 2) + Math.pow((y1 - y2), 2)));
	}

	public static void main(String[] args) {
		/*
		 *  Implementa la función:
		 *  static double distancia (double xl, double y1, double x2, double y2)
		 *  que calcula y devuelve la distancia euclídea que separa los puntos (x1, y1) y (x2, y2). La
		 *  fórmula para calcular esta distancia es:
		 */

		double distancia = funcion_distancia(7.3, 4.2, 6.7, 4.7);
		System.out.println("La distancia es: " + distancia);

	}

}
