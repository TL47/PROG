package pack;

import java.util.*;

public class metodologiaUsoClaseArrays {
	
	static Scanner sc = new Scanner(System.in);
	
	static int menu() {
		int opcion;
		do {
			System.out.println("Selecciones una opción");
			System.out.println();
			System.out.println("1. Inserción (al final)");
			System.out.println("2. Búsqueda secuencial");
			System.out.println("3. Listado");
			System.out.println("4. Listado ordenado (sin modificar el original)");
			System.out.println("5. Búsqueda binaria de un elemento");
			System.out.println("6. Eliminación de un elemento (usando búsqueda secuencial)");
			System.out.println("7. Eliminación en orden de un elemento (usando búsqueda binaria)");
			System.out.println("8. Salir");
			opcion = sc.nextInt();
		} while (opcion < 1 || opcion > 8);
		return opcion;
	}
	
	static int[] insertar(int t[]) {
		int valor;
		System.out.println("Introduzca un valor: ");
		valor = sc.nextInt();
		t = Arrays.copyOf(t, t.length + 1);
		t[t.length - 1] = valor;
		
		return t;
	}
	
	static int busquedaSec(int t[], int clave) {
		int pos = -1;
		boolean esta = false;
		for(int i = 0; i < t.length && !esta; i++) {
			if(t[i] == clave) {
				esta = true;
				pos = i;
			}
		}
		
		return pos;
	}
	
	static void listado(int t[]) {
		int pos = 0;
	    for (int valor : t) {
	        System.out.println("El valor es: " + valor + " está en la posición: " + pos);
	        pos++;
	    }
	}
	
	static void listadoOrdenado(int t[]) {
		int h[] = {};
		h = Arrays.copyOf(t, t.length);
		Arrays.sort(h);
		listado(h);
	}
	
	static int busquedaBinaria(int t[], int valor) {
		int h[] = {};
		h = Arrays.copyOf(t, t.length);
		Arrays.sort(h);
		System.out.println("El valor: " + valor + " se encuentra en la posición: " + Arrays.binarySearch(h, valor));
		
		return Arrays.binarySearch(h, valor);
	}
	
	static int[] eliminarSec(int t[], int clave) {
		int pos = busquedaSec(t, clave);
		if (pos == -1) {
			System.out.println("El valor que desea eliminar no se ha encontrado");
		} else {
			for (int i = pos; i < t.length - 1; i++) {
				t[i] = t[i + 1];
			}
		}
		
		t = Arrays.copyOf(t, t.length - 1);
		listado(t);
		return t;
	}
	
	static int[] eliminarOrd(int t[], int valor) {
		int pos = busquedaBinaria(t, valor);
		if (pos < 0) {
			System.out.println("El valor no se ha encontrado");
		} else {
			t = eliminarSec(t, valor);
		}
		
		return t;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int t[] = {};
		int opcion, resultado, clave = 0, n = 0;
		do {
			opcion = menu();
			switch (opcion) {
				case 1 -> {
					t = insertar(t);
					System.out.println();
				}
				case 2 -> {
					System.out.println("Introduce un valor: ");
					clave = sc.nextInt();
					resultado = busquedaSec(t, clave);
					if (clave != -1) {
						System.out.println("Elemento encontrado en la posición: " + resultado);
					} else {
						System.out.println("Elemento no encontrado.");
					}
					System.out.println();
				}
				case 3 -> {
					listado(t);
					System.out.println();
				}
				case 4 -> {
					listadoOrdenado(t);
					System.out.println();
				}
				case 5 -> {
					System.out.println("Introduce un valor: ");
					int valor = sc.nextInt();
					busquedaBinaria(t, valor);
					System.out.println();
				}
				case 6 -> {
					t = eliminarSec(t, clave);
					System.out.println();
				}
				case 7 -> {
					System.out.println("Introduzca el valor que desea eliminar: ");
					int valor = sc.nextInt();
					t = eliminarOrd(t, valor);
					System.out.println();
				}
			}
			
		} while (opcion != 8);
		System.out.println("El programa a finalizado");
		
	}

}
