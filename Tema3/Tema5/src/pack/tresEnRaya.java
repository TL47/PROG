package pack;

import java.util.*;

public class tresEnRaya {
    
    static void mostrar(char t[][]) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                System.out.print("[" + t[i][j] + "]");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    static boolean comprobarWin(char t[][], char jugador) {
        for (int i = 0; i < 3; i++) {
            if (t[i][0] == jugador && t[i][1] == jugador && t[i][2] == jugador)
                return true;
        }
        
        for (int j = 0; j < 3; j++) {
            if (t[0][j] == jugador && t[1][j] == jugador && t[2][j] == jugador)
                return true;
        }
        
        if (t[0][0] == jugador && t[1][1] == jugador && t[2][2] == jugador)
            return true;

        if (t[0][2] == jugador && t[1][1] == jugador && t[2][0] == jugador)
            return true;

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char t[][] = new char [3][3];
        int contador = 0;
        int posFilaX = 0, posColX = 0;
        int posFilaC = 0, posColC = 0;
        boolean win = false;

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                t[i][j] = '-';
            }
        }

        System.out.println("Que empiece el juego");
        mostrar(t);

        do {
            do {
                System.out.println("¿En qué posición desea colocar la x?");
                posFilaX = sc.nextInt();
                posColX = sc.nextInt();
            } while (posFilaX < 0 || posFilaX > 2 || posColX < 0 || posColX > 2 || t[posFilaX][posColX] != '-');
            
            t[posFilaX][posColX] = 'x';
            contador++;
                
            if (comprobarWin(t, 'x')) {
                win = true;
                System.out.println("¡Has ganado!");
            }
            mostrar(t);
            
            if (win == false && contador < 9) {
                do {
                    posFilaC = (int) (Math.random() * 3);
                    posColC = (int) (Math.random() * 3);
                } while (t[posFilaC][posColC] != '-');
                
                t[posFilaC][posColC] = 'o';
                contador++;
                
                if (comprobarWin(t, 'o')) {
                    win = true;
                    System.out.println("La máquina te ha ganado...");
                }
                mostrar(t);
            }
        } while (contador < 9 && !win);
        
        if (!win && contador >= 9) {
            System.out.println("Empate");
        }
    }
}
