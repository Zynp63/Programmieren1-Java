package Zusätzliche_Aufgaben;

import java.util.Scanner;

public class Notenskala {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte geben sie ihre Noten ein:");
        double zahl = scan.nextDouble();

        if(zahl< 0 || zahl > 90){
           System.out.println("Das ist gültig!");
        }
    }
}
