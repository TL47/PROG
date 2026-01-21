package pack;

import java.util.*;

public class Boletin1_3 {
	
	static void negativo() {
		int n, i = 0, j = 0, nPar = 0, nImpar = 0, media = 0, mayor = 0;
		boolean par = false, impar = false;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Introduce un número, para salir introduce un número negativo: ");
			n = sc.nextInt();
			if (n % 2 == 0) {
				nPar += n;
				if (nPar > mayor) {
					mayor = nPar;
				}
			} else {
				nImpar += n;
				j++;
			}
			i++;
		} while(n >= 0);
		if (n % 2 != 0) {
			nImpar -= n;
			j--;
		}
		media = nImpar / j;
		System.out.println("El total de números introducidos es: " + (i - 1));
		System.out.println("La media de los impares es: " + media);
		System.out.println("El mayor de los pares es: " + mayor);
	}

	public static void main(String[] args) {
		/*
		 * Realiza una función que vaya pidiendo números hasta que se introduzca un número negativo y nos
		 * diga cuántos números se han introducido, la media de los impares y el mayor de los pares. El
		 * número negativo sólo se utiliza para indicar el final de la introducción de datos pero no se incluye
		 * en el cómputo. 
		 */
		
		negativo();

	}

}
