package pack;

import java.util.*;

public class AA4_14 {
	
	static int segundos(int d, int h, int m) {
		h += d*24;
		m += h*60;
		int s = 0;
		s += m*60;
		return (s);
	}

	public static void main(String[] args) {
		/*
		 *  Escribe una función a la que se pase como parámetros de entrada una cantidad de días,
		 *  horas y minutos. La función calculará y devolverá el número de segundos que existen en
		 *  los datos de entrada. 
		 */
		
		Scanner sc = new Scanner(System.in);
		int dia, hora, min;
			System.out.println("Introduce unos días: ");
			dia = sc.nextInt();
		do {
			System.out.println("Introduce una hora: ");
			hora = sc.nextInt();
		} while (hora >= 24);
		do {
			System.out.println("Introduce minutos: ");
			min = sc.nextInt();
		} while (min >= 60);		
			
			System.out.println("La distancia es: " + segundos(dia, hora, min));
		
		
		
		

	}

}
