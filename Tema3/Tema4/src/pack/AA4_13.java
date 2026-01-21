package pack;

import java.util.Scanner;

public class AA4_13 {
	
	static void muestraPares(int n) {
		int par = 2;
		for (int i = 1; i <= n; i++) {
			par += 2;
			System.out.println(par);
		}
	}
	
	public static void main(String[] args) {
		/*
		 *  Crea la función muestraPares (int n) que muestre por consola los primeros n
		 *  números
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int num = sc.nextInt();
		muestraPares(num);
		
	}

}
