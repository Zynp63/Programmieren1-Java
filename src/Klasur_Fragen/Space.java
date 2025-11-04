package Klasur_Fragen;

import java.util.Scanner;

public class Space {
    int reihe = 5;
    int spalte = 8;
    char[][] spielfeld = new char[reihe][spalte];

    public void init() {
        // Erste Reihe: Aliens
        for (int i = 0; i < spalte; i++) {
            spielfeld[0][i] = 'o';
        }

        // Mittlere Reihen: Leerzeichen
        for (int i = 1; i < reihe - 1; i++) {
            for (int j = 0; j < spalte; j++) {
                spielfeld[i][j] = ' ';
            }
        }

        // Untere Reihe: zufällige Position für 'V'
        for (int j = 0; j < spalte; j++) {
            spielfeld[reihe - 1][j] = ' ';
        }
        int zufall = (int) (Math.random() * spalte);
        spielfeld[reihe - 1][zufall] = 'V';
    }

    public void bewege(char richtung) {
        int vPos = -1;
        for (int i = 0; i < spalte; i++) {
            if (spielfeld[reihe - 1][i] == 'V') {
                vPos = i;
                break;
            }
        }

        if (richtung == 'a' && vPos > 0) {
            spielfeld[reihe - 1][vPos] = ' ';
            spielfeld[reihe - 1][vPos - 1] = 'V';
        } else if (richtung == 'd' && vPos < spalte - 1) {
            spielfeld[reihe - 1][vPos] = ' ';
            spielfeld[reihe - 1][vPos + 1] = 'V';
        }
    }

    public String toString() {
        String out = "";
        for (int i = 0; i < reihe; i++) {
            for (int j = 0; j < spalte; j++) {
                out += spielfeld[i][j] + " ";
            }
            out += "\n";
        }
        return out;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Space spiel = new Space();
        spiel.init();
        System.out.println(spiel);

        while (true) {
            System.out.print("Bewegung (a=links, d=rechts, x=Ende): ");
            char eingabe = scan.nextLine().charAt(0);
            if (eingabe == 'x') break;
            spiel.bewege(eingabe);
            System.out.println(spiel);
        }

        System.out.println("Spiel beendet!");
    }
}