package de.thws.prog1.lektion2;

public class KreisUndKugel {
    public static void main (String[] args){
        int r = 4;
        double kreisflaeche = Math.PI * r * r;
        double kreisumfang = 2 * Math.PI * r;

        double volumen = 4.0/3 * Math.PI * r * r * r;

        System.out.println("Volumen:" +volumen);
        System.out.println("Kreisfläche:" +kreisflaeche);
        System.out.println("Kreisumfang:" +kreisumfang);

    }

}
