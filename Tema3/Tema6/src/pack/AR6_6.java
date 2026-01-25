package pack;

import java.util.*;

public class AR6_6 {
	
	static boolean esVocal(char c) {
		boolean resultado;
		String vocales = "aeiouáéíóú";
		c = Character.toLowerCase(c);
		if (vocales.indexOf(c) == -1) {
			resultado = false;
		} else {
			resultado = true;
		}
		return resultado;
	}

	public static void main(String[] args) {
		/*
		 * Escribir un programa que pida el nombre completo al usuario y lo muestre sin vocales (mayúsculas, minúsculas y acentuadas).
		 * Por ejemplo, "Álvaro Pérez" se mostará << lvr Prz >>.
		 */
		
		Scanner sc = new Scanner(System.in);
		String nombre, sinVocales = "";
		char c;
		System.out.println("Introduce tu nombre completo (nombre + apellido): ");
		nombre = sc.nextLine();
		for (int i = 0; i < nombre.length(); i++) {
			c = nombre.charAt(i);
			if (!esVocal(c)) {
				sinVocales = sinVocales + c;
			}
		}
		System.out.println(sinVocales);
	}
}
