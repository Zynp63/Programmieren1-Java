package de.thws.prog1.lektion7;

import java.util.Scanner;

public class arithmetischeMittel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie uns Bitte 5 Werten ein:");
        double[] werten = new double[5];
        double summe = 0;
        for (int i = 0; i < werten.length; i++) {
            //double zahl = scan.nextDouble();
            //werten[i] = zahl;
            //summe += zahl;
            System.out.print((i + 1) +".Werte ");
            werten[i] = scan.nextDouble();
            summe += werten[i];

        }
        System.out.println(summe / werten.length); 

        double min = werten[0];
        double max = werten[0];

        for (int i = 1; i < werten.length; i++) {
            if (werten[i] < min)
                min = werten[i];

            if (werten[i] > max)
                max = werten[i];

        }
        System.out.println(min);
        System.out.println(max);
    }

}