package pack;

import java.util.*;

public class AR6_7 {
	
	static int contadorPalabra(String frase, String palabra) {
		int contador;
		for(int i = 0; i < frase.length(); i++) {
			
		}

		return contador;
	}

	public static void main(String[] args) {
		/*
		 * Diseñar un programa que solicite al usuario una frase y una palabra. A continuación buscará cuántas
		 * veces aparece la palabra en la frase.
		 */

		Scanner sc = new Scanner(System.in);
		String frase;
		String palabra;
		int veces = 0, pos;
		System.out.println("Introduce una frase");
		frase = sc.nextLine();
		System.out.println("Introduce una palabra que esté en la frase");
		palabra = sc.next();
		pos = frase.indexOf(palabra);
		while (pos != -1) {
			veces++;
			pos = frase.indexOf(palabra, pos + 1);
		}
		if (veces == 0) {
			System.out.println("La palabra " + palabra + " no se encuentra en la frase");
		} else {
			System.out.println("La palabra " + palabra + " está " + veces + " veces");
		}
	}
}