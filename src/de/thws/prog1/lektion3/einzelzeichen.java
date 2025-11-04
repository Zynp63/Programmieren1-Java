package de.thws.prog1.lektion3;

import java.util.Scanner;

public class einzelzeichen {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie Bitte ein Zeichen ein:");
        char zeichen =scan.nextLine().charAt(0);

        if(zeichen >= 'A' && zeichen <= 'Z') {
            System.out.println("Großbuchstabe");
        }
        if((zeichen >= '0' && zeichen <= '9')){

        }
    }
}
