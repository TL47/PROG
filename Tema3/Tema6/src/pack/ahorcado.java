package pack;

import java.util.*;

public class ahorcado {
	
	static void juego(char[] palJuego) {
		for (int i = 0; i < palJuego.length; i++) {
			palJuego[i] = '-';
		}
	}
	
	static boolean compara(char[] palOculta, char[] palJuego, char letra, int totalFallos) {
		boolean acierto = false;
		for (int i = 0; i < palOculta.length; i++) {
			if (letra == palOculta[i]) {
				acierto = true;
				palJuego[i] = letra;
			}
		}
		if (acierto) {
			System.out.println("Has adivinado una letra");
		} else {
			totalFallos++;
			if (totalFallos < 6) {
				dibujarAhorcado(totalFallos);
				System.out.println("La letra no se encuentra en la palabra, llevas " + totalFallos + " fallos. Si llega a 6 has perdido");
			} else {
				dibujarAhorcado(totalFallos);
				System.out.println("Lo siento te has quedado sin intentos");
			}
		}
		return acierto;
	}
	
	static void dibujarAhorcado(int fallos) {
        System.out.println(" -------");
        System.out.println(" |     |");
        
        if (fallos >= 1) {
            System.out.println(" O     |");
        } else {
            System.out.println("       |");
        }
        
        if (fallos >= 2) {
            System.out.print("/");
            if (fallos >= 3) {
                System.out.println("|\\    |");
            } else {
                System.out.println("      |");
            }
        } else {
            System.out.println("       |");
        }
        
        if (fallos >= 4) {
            System.out.println(" |     |");
        } else {
            System.out.println("       |");
        }
        
        if (fallos >= 5) {
            System.out.print("/");
            if (fallos >= 6) {
                System.out.println(" \\    |");
            } else {
                System.out.println("      |");
            }
        } else {
            System.out.println("       |");
        }
        
        System.out.println("       |");
        System.out.println("_______|___");
        System.out.println();
    }




	public static void main(String[] args) {
		// Juego del ahorcado
		
		Scanner sc = new Scanner(System.in);
		char[] palOculta = {'p','e','l','o','t','a'};
		char[] palJuego = new char [6];
		char letra;
		boolean win = false;
		int totalFallos = 0;
		juego(palJuego);
		System.out.println("Adivina la palabra oculta.");
		do {
			System.out.println("Introduce una letra");
			letra = sc.next().charAt(0);
			boolean acierto = compara(palOculta, palJuego, letra, totalFallos);
			if (!acierto) {
				totalFallos++;
			}
			System.out.println(Arrays.toString(palJuego));
			if (Arrays.equals(palOculta, palJuego)) {
				win = true;
			}
			System.out.println();
		} while (!win && totalFallos < 6);
		
	}

}
