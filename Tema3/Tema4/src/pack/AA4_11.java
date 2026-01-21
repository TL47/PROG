package pack;

import java.util.*;

public class AA4_11 {
	
	/* static void esfera(double r) {
		double superficie, volumen;
		superficie = 4 * Math.PI * Math.pow(r, 2);
		volumen = (4 * Math.PI / 3) * Math.pow(r, 3);
		System.out.println("Superficie: " + superficie + " Volumen: " + volumen);
	}*/
	
	static double superficie_esfera(double r) {
		return(4 * Math.PI * Math.pow(r, 2));
	}
	
	static double volumen_esfera(double r) {
		return(4 * Math.PI * Math.pow(r, 2));
	}

	public static void main(String[] args) {
		/*
		 * Diseña una función que calcule y muestre la superficie y el volumen de una esfera.
		 */
		
		Scanner sc = new Scanner(System.in);
		double radio;
		System.out.println("Introduce el radio de la esfera");
		radio = sc.nextDouble();
		//esfera(radio);
		double superficie, volumen;
		superficie = superficie_esfera(radio);
		System.out.println("La superficie de la esfera es: " + superficie);
		volumen = volumen_esfera(radio);
		System.out.println("El volumen de la esfera es: " + volumen);
		
	}

}
