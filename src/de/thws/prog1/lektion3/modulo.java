package de.thws.prog1.lektion3;

import java.util.Scanner;

public class modulo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie Bitte eine ganze Zahl ein:");
        int zahl = scan.nextInt();

        if(zahl % 7 == 0){
            System.out.println(zahl +" ist durch 7 teilbar.");
        }else{
            System.out.println(zahl +" ist nicht durch 7 teilbar.");
        }
        scan.close();
    }
}
