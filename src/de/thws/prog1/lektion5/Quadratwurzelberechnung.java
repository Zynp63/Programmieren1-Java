package de.thws.prog1.lektion5;

import java.util.Scanner;

public class Quadratwurzelberechnung {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Zahl eingeben: ");
        double zahl = scan.nextDouble();
        double n = (zahl / 2.0);
        int verfahren = 0;
        double ergebnis = 0;

        do{
            ergebnis = (1.0 / 2) * (n + (zahl / n));
            n = ergebnis;
            verfahren++;

        }while(verfahren < 10);
            System.out.println(ergebnis);

    }
}
