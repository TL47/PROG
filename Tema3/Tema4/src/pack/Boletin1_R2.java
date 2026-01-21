package pack;

import java.util.*;

public class Boletin1_R2 {
	
	static void multiplicacion(int num1, int num2) {
		if (num2 == 1) {
			System.out.println("El total es: " + num1);
		} else {
			num1 += num1;
			num2--;
			multiplicacion(num1, num2);
		}
		
	}

	public static void main(String[] args) {
		/*
		 * Resolver mediante el uso de funciones recursivas:
		 * Leer dos números enteros positivos y mostrar el resultado de su multiplicación sin usar el operador *.
		 */
		
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer número entero positivo: ");
		n1 = sc.nextInt();
		System.out.println("Introduce el segundo valor entero positvo: ");
		n2 = sc.nextInt();
		multiplicacion(n1, n2);
	}

}
