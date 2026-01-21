package pack;

import java.util.*;

public class AR5_2 {

	public static void main(String[] args) {
		/*
		 * Diseñar un programa que solicite al usuario que introduzca por teclado 5 números decimales.
		 * A continuación, mostrar los números en el mismo orden que se han introducido.
		 */

		double n[] = new double [5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduzca un número: ");
			n[i] = sc.nextDouble();
		}

		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}
				
	}

}
