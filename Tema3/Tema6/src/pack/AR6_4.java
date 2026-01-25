package pack;

import java.util.*;

public class AR6_4 {

	public static void main(String[] args) {
		/*
		 * Diseñar una aplicación que pida al usuario que introduzca una frase por teclado e indique cuántos espacios en blanco tiene.
		 */

		Scanner sc = new Scanner (System.in);
		int espacios = 0;
		char c;
		System.out.println("Introduce una frase: ");
		String frase = sc.nextLine();
		for (int i = 0; i < frase.length(); i++) {
			c = frase.charAt(i);
			if (Character.isSpaceChar(c)) {
				espacios ++;
			}
		}
		System.out.println("La cantidad de espacios que hay en la frase " + frase + " son: " + espacios);
	}

}
