package Klasur_Fragen;

import java.util.Scanner;

public class SpaceInvaders {
    public char[][] spielfeld = new char[5][8];

    private void init() {
        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                if (i == 0) {
                    spielfeld[i][j] = 'o';
                } else {
                    spielfeld[i][j] = ' ';
                }
            }
        }

        int pos = (int) (Math.random() * 8);
        spielfeld[4][pos] = 'V';
    }

    private void bewege(char richtung) {
        int spielerPos = -1;

        // geminin (V) mevcut konumunu bul
        for (int j = 0; j < spielfeld[4].length; j++) {
            if (spielfeld[4][j] == 'V') {
                spielerPos = j;
                break;
            }
        }

        if (spielerPos == -1) return;

        if (richtung == 'a' && spielerPos > 0) {
            spielfeld[4][spielerPos] = ' ';
            spielfeld[4][spielerPos - 1] = 'V';
        }
        else if (richtung == 'd' && spielerPos < spielfeld[4].length - 1) {
            spielfeld[4][spielerPos] = ' ';
            spielfeld[4][spielerPos + 1] = 'V';
        }
    }
    @Override
    public String toString() {
        String out = "";
        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                out += spielfeld[i][j];
            }
            out += "\n";
        }
        return out;
    }

    public static void main(String[] args) {
        SpaceInvaders s = new SpaceInvaders();
        s.init();

        Scanner scan = new Scanner(System.in);

        System.out.println(s);
        System.out.println("Hey, gib mir einen Buchstaben ('a' = links, 'd' = rechts, 'x' = beenden):");

        char eingabe = scan.next().charAt(0);

        while (eingabe != 'x') {
            s.bewege(eingabe);
            System.out.println(s);
            eingabe = scan.next().charAt(0);
        }

        System.out.println("Spiel beendet.");
        scan.close();
    }
}
