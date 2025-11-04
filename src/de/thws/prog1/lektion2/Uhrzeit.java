package de.thws.prog1.lektion2;

import java.time.LocalTime;

public class Uhrzeit {
    public static void main(String[] args){
        int stunden = 15;
        int minuten = 13;
        int sekunden = 0;

        double sekundenSeitMitternacht = 13.0 * 60 + 15 * 3600;
        System.out.println("Sekunden seit Mitternacht:" +sekundenSeitMitternacht);

        double verbleibendenSekunden = 24 * 3600 - sekundenSeitMitternacht;
        System.out.println(verbleibendenSekunden);

        double prozentSchonVeregangen = sekundenSeitMitternacht * 100/(24 * 3600);
        System.out.println(prozentSchonVeregangen);

        LocalTime time= LocalTime.now();
        int stundenJetz = time.getHour();
        int minutenJetz = time.getMinute();
        int sekundenJetz = time.getSecond();

        System.out.println(stundenJetz);
        System.out.println(minutenJetz);
        System.out.println(sekundenJetz);

    }
}
