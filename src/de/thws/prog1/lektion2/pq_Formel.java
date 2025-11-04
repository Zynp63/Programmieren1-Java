package de.thws.prog1.lektion2;

public class pq_Formel {
    public static void main(String[] args){
        double p = 10;
        double q = 16;

        double wurzel = (p/2) * (p/2) - q;

        if(wurzel < 0){
            System.out.println("Fehler! Wurzel kann nicht negatif sein.");
        }else{
            double x1 = -p/2 + Math.sqrt(wurzel);
            double x2 =-p/2 - Math.sqrt(wurzel);

            System.out.println(x1 +" und " + x2);
        }
    }
}
