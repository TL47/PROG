package pack;

import java.util.*;

public class AA4_15 {
	
	static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2) {
		int diferencia;
		minuto1 += hora1*60;
		minuto2 += hora2*60;
		if (hora1 > hora2) {
			diferencia = minuto1 - minuto2;
		} else {
			diferencia = minuto2 - minuto1;
		}
		return (diferencia);
	}

	public static void main(String[] args) {
		/*
		 * Diseña una función a la que se le pasan las horas y minutos de dos instantes de tiempo,
		 * con el siguiente prototipo: static int diferenciaMin(int horal, int minutol, int hora2,
		 * int minuto2) La función devolverá la cantidad de minutos que existen de diferencia entre los
		 * dos instantes utilizados.
		 */
		
		Scanner sc = new Scanner(System.in);
		int h1 = 0, h2 = 0, m1 = 0, m2 = 0;
		System.out.println("Introduce una hora: ");
		h1 = sc.nextInt();
		System.out.println("Introduce minutos: ");
		m1 = sc.nextInt();
		System.out.println("Introduce otra hora: ");
		h2 = sc.nextInt();
		System.out.println("Introduce otros minutos: ");
		m2 = sc.nextInt();
		int resultado = diferenciaMin(h1, m1, h2, m2);			
		System.out.println("La diferencia de minutos es " + resultado);		

	}

}
