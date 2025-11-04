package de.thws.prog1.lektion5;

public class Reihenwert_Berechnung {  // Bu soruyu bir daha bak daha tam cözmedin bak yani
    public static void main(String[] args){

        double sum = 0;
        for(int k = 1; k <= 5 ; k++){
            double ergebnis =(1.0 / (k * k));
            if(ergebnis < 0.00001){
               break;
            }
            sum += ergebnis;
            System.out.println(sum);
        }
        System.out.println(6 * sum);
    }
}
/*
public class Reihenwert_Berechnung  {
    public static void main(String[] args) {
        System.out.println("a) Die ersten fünf Glieder der Reihe:");
        for (int k = 1; k <= 5; k++) {
            double folge = 6.0 / Math.pow(k, 2);
            System.out.println("a_" + k + " = " + folge);
        }
        System.out.println("\nb) Reihe berechnen und Ergebnis bei jedem Schleifendurchlauf ausgeben:");
        double summe = 0;
        double summand;
        int k = 1;

        do {
            summand = 6.0 / Math.pow(k, 2);
            summe += summand;
            System.out.println("Schleifendurchlauf " + k + ": Reihenwert = " + summe);
            k++;

        } while (summand > 1.0e-5);  // Değişiklik miktarı 1E-5'ten(zani bunu yerine direkt (Math.pow(10,-5)) te yazabilirim) küçük olduğu sürece devam et

        //System.out.println("Ergebnis: " + summe);  // Sonucu ekrana yazdır
    }
}
*/