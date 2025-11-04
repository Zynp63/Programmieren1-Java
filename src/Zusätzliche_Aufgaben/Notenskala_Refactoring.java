package Zusätzliche_Aufgaben;

import java.util.Scanner;

public class Notenskala_Refactoring {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie ihre Punktzahl ein:");
        double zahl = scan.nextDouble();

        if(zahl < 0 || zahl > 90){
            System.out.println("Das ist kein gültige Zahl!");
            return;
        }
        if (((double) zahl != (int) zahl) && (((double) zahl - (int) zahl) != 0.5)){
            System.out.println("Achtung! Die Punktzahl entweder ganzzahlig sein muss oder auf 0,5 enden. Danke!") ;
            return;
        }

        if(zahl >= 45 && zahl < 49.5){
            System.out.println("Si haben die Note 4,0 erreicht");
        }else if(zahl >= 49.5 && zahl < 54){
            System.out.println("Si haben die Note 3,7 erreicht");
        }else if(zahl >= 54.0 && zahl < 58.5){
            System.out.println("Si haben die Note 3,3 erreicht");
        }else if(zahl >= 58.5 && zahl < 63){
            System.out.println("Si haben die Note 3,0 erreicht");
        }else if(zahl >= 63 && zahl < 67.5){
            System.out.println("Si haben die Note 2,7 erreicht");
        }else if(zahl >= 67.5 && zahl < 72){
            System.out.println("Si haben die Note 2,3 erreicht");
        }else if(zahl >= 72 && zahl < 76.5){
            System.out.println("Si haben die Note 2,0 erreicht");
        }else if(zahl >= 76.5 && zahl < 81){
            System.out.println("Si haben die Note 1,7 erreicht");
        }else if(zahl >= 81 && zahl < 85.5){
            System.out.println("Si haben die Note 1,3 erreicht");
        }else if(zahl >= 85.5){
            System.out.println("Si haben die Note 1,0 erreicht");
        }else {
        System.out.println("Leider nicht bestanden (unter 45 Punkten).");
    }
    }

}
