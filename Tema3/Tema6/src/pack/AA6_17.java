package pack;

import java.util.*;

public class AA6_17 {

	public static void main(String[] args) {
		/*
		 * Construir un programa que convierta una palabra en secuencias de n letras. Por ejemplo,
		 * la palabra destornillador», dividida en secuencias de 4 letras, se mostrará de la siguiente forma:
		 * dest
		 * orni
		 * 1lad
		 * Or
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una palabra a dividir: ");
		String palabra = sc.nextLine();
		System.out.println("En cuántas secciones desea  dividir la palabra: ");
		int secciones = sc.nextInt();
		int contador = 0;
		for (int i = 0; i < palabra.length(); i += secciones) {
			if (i != 0) {
				String cadena = palabra.substring(contador, i);
				contador = i;
				System.out.println(cadena);
			}
		}
		System.out.println(palabra.substring(contador));
	}

}
