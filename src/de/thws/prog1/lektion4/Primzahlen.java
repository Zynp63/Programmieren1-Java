package de.thws.prog1.lektion4;

import java.util.Scanner;

public class Primzahlen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bitte zu untersuchende Zahl eingeben:");
        int zahl = scan.nextInt();
        if(zahl<0) {
            System.out.println("Es gibt Fehler! Der Zahl darf nicht kleiner als null sein!");
            return;
        }

       // System.out.println(isPrimzahl(zahl));
        if(isPrimzahl(zahl)){
            System.out.println(zahl+ " ist eine Primzahl!");
        }else{
            System.out.println(zahl + " ist keine Primzahl!");
        }
    }

    public static boolean isPrimzahl(int zahl) {
        for (int i = 2; i < zahl; i++) {
            if (zahl % i == 0) {
                return false;
            }
        }
        return true;
    }
}
      /*  boolean istPrim = true;

        if(zahl <= 1){
            istPrim = false;
        }else{
            for(int i = 2; i < zahl ; i++ ){
                if (zahl % i == 0){
                    istPrim = false;
                    break;
                }
        }
            if(istPrim){
                System.out.println(zahl + " ist eine Primzahl!");

            }else{
                System.out.println(zahl +" ist keine Primzahl!");
            }
            scan.close();
        }

    }
}*/








/*  yada böyle bir seyde yapabilrim boolean yerine String olarak
* public static String isPrimzahl(int zahl) {
    for (int i = 2; i < zahl; i++) {
        if (zahl % i == 0) {
            return zahl + " ist keine Primzahl!";
        }
    }
    return zahl + " ist eine Primzahl!";
} */
