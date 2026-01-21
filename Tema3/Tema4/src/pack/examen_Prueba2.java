/*package pack;

import java.util.*;

public class examen_Prueba2 {
	
	static void figurasEnU(int n) {
		if (n >= 3) {
			for (int i = n; i <= 1; i--) {
				for (int j = n; j > i; j--) {
					System.out.println(" ");
				}
				for (int k = 1; k <= n - 1; k++) {
					if((n - 1) == 0) {
						System.out.println("*");
					} else {
						System.out.println(" ");
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("No es valido n");
		}
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número");
		int n = sc.nextInt();
		figurasEnU(n);

	}

}*/