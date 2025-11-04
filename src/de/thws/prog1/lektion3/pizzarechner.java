package de.thws.prog1.lektion3;

public class pizzarechner {
    public static void main(String[] args){
        int r1 = 13;
        int r2 = 14;
        double preis1 = 16.0;
        double preis2 = 15.0;

        if((r1 / preis1) > (r2 / preis2)){
            System.out.println("Pizza1 hat bessere Größen-/Preisverhältnis!");
        }else{
            System.out.println("Pizza2 hat bessere Größen-/Preisverhältnis!");
        }
    }
}


