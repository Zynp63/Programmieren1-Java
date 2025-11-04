package de.thws.prog1.lektion5;

import java.util.Scanner;

public class Potenz {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie Bitte ein Wert für Basis ein:");
        double b =scan.nextDouble();
        System.out.println("Geben Sie Bitte ein Wert für Exponent ein:");
        int n = scan.nextInt();

        System.out.println(po(b, n));

    }
    public static double po(double b, int n){    //bu methodu kullnamadan da direkt hepsini buray yazabilirsin.
        double ergebnis = 1.0;
        if(n > 0){
            for(int i = 0; i < n; i++){
                 ergebnis *= b;
            }
            return ergebnis;
        }else if(n == 0){
            return ergebnis;
        }else{
            for(int i = 0 ; i < n ; i++){
                ergebnis *= 1.0 / b ;
            }
            return ergebnis;
        }
    }
}
