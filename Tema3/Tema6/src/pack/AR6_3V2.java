package pack;

import java.util.*;

public class AR6_3V2 {

	public static void main(String[] args) {
		/*
		 * Diseñar el juego «Acierta la contraseña. La mecánica del juego es la siguiente: el primer
		 * jugador introduce la contraseña; a continuación, el segundo jugador debe teclear palabras
		 * hasta que la acierte. Realizar dos versiones; en la primera se facilita el juego indicando
		 * si la palabra introducida es mayor o menor alfabéticamente que la contraseña. En la se
		 * gunda, el programa mostrará la longitud de la contraseña y una cadena con los caracteres
		 * acertados en sus lugares respectivos y asteriscos en los no acertados.
		 */

		Scanner sc = new Scanner(System.in);
		String passw, palabra;
		boolean iguales = false;
		System.out.println("Jugador 1.- Introduce la contraseña: ");
		passw = sc.nextLine();
		do {
			System.out.println("Jugador 2.- Introduce tu intento: ");
			palabra = sc.nextLine();
			int comparacion = passw.compareTo(palabra);
			if (comparacion == 0) {
				System.out.println("Has acertado la palabra");
				iguales = true;
			} else {
				if (comparacion > 0) {
					System.out.println("La contraseña es mayor que: " + palabra);
				} else {
					System.out.println("La contraseña es menor que: " + palabra);
				}
			}
		} while (!iguales);
		
	}

}