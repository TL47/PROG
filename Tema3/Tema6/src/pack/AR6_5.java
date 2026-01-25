package pack;

import java.util.*;

public class AR6_5 {
	
	static String invertida(String cadena) {
		String nueva = "";
		for (int i = 0; i < cadena.length(); i++) {
			nueva = cadena.charAt(i) + nueva;
		}
		return nueva;
	}

	public static void main(String[] args) {
		/*
		 * Diseñar una función a la que se le pase una cadena de caracteres y la devuelva invertida.
		 * Un ejemplo, la cadena << Hola mundo >> quedaría << odnum aloH >>.
		 */

		Scanner sc = new Scanner (System.in);
		String antes;
		System.out.println("Introduce una frase: ");
		antes = sc.nextLine();
		String despues = invertida(antes);
		System.out.println(despues);
		
		
	}

}
