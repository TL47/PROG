package pack;

import java.util.*;

public class AR6_9 {

	public static void main(String[] args) {
		/*
		 * Introducri por teclado una frase palabra a palabra, y mostrar la frase completa separando
		 * las palabras introducidas con espacion en blanco. Terminar de leer la frase cuadno alguna
		 * de las palabras introducidas sea la cadena "fin" escrita con cualquier combinación de
		 * mayúsculas y minúsculas. La cadena "fin" no aparecerá en la frase final.
		 */

		Scanner sc = new Scanner(System.in);
		String frase = "", palabra;
		System.out.println("Introduce una palabra: ");
		palabra = sc.next();
		while (!palabra.toLowerCase().equals("fin")) {
			frase = frase + " " + palabra;
			System.out.println("Introduce una palabra: ");
			palabra = sc.next();
		}
		System.out.println(frase);
	}
}
