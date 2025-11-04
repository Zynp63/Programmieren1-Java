package de.thws.prog1.lektion4;

import java.util.Scanner;

public class FreierFall {
    public static void main(String[]args) throws InterruptedException{
        Scanner scan = new Scanner(System.in);
        System.out.print("Bitte Falldauer in Sekunden eingeben:");
        int t = scan.nextInt();

        double g = 9.80665;
        for(int i = 1; i <= t ; i+= 5){
            double ergebnis = 1.0/2 * g * i * i;
            System.out.println("Zeit: " + i +" Sekunden: Zurückgelegte Strecke: " + ergebnis);
            Thread.sleep(400);
        }
    }
}
