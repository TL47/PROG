package pack;

import java.util.*;

public class Boletin1_2 {
	
	static int suma() {
		int suma = 0, i = 0, num, total = 0, media = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Introduce un valor: ");
			num = sc.nextInt();
			suma += num;
			i++;
		} while(suma <= 10000);
		
		if (suma > 10000) {
			total = suma - num;
			i--;
		}
		media = total/i;
		System.out.println("Acumulado: " + total + " Contador: " + i);
		return media;
	}

	public static void main(String[] args) {
		/*
		 * Realiza una función que permita ir introduciendo una serie indeterminada de números mientras
		 * su suma no supere el valor 10000. Cuando esto último ocurra, se debe mostrar el total acumulado,
		 * el contador de los números introducidos y devolver la media, para mostrarla desde el main.
		 */
		
		System.out.println("La media es de: " + suma());

	}

}
