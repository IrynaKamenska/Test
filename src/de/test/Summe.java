package de.test;

import java.util.Scanner;

public class Summe {
    public static void main(String[] args) {
        checkValue(0, 0);
        int summe = summe();
        System.out.println(summe);
        System.out.println(sumAsString(1, 2));

    }

    public static String sumAsString(int val1, int val2) {
        String sum = String.valueOf(val1 + val2);
        // return ("Summe:" + (val1 + val2));
        return sum;
    }

    /*
    Schreibe eine weitere Methode, die zwei int Parameter entgegennimmt
    und prüft, ob einer der int Werte größer als 100 ist.
     */
    public static boolean checkValue(int val1, int val2) {
        if (val1 > 100) {
            System.out.println("Zahl 1 größer als 100: " + val1);
        } else if (val2 > 100) {
            System.out.println("Zahl 2 größer als 100: " + val2);
        } else {
            System.out.println("Keine der Value größer als 100 ");
            return false;
        }
        return false;
    }

    /*
    Schreibe eine Methode, die über den Java Scanner zwei int Werte
    entgegennimmt und in der Konsole die Summer beider Werte ausgibt
     */
    public static int summe() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zahl 1: ");
        int num1 = sc.nextInt();
        System.out.println("Zahl 2: ");
        int num2 = sc.nextInt();
        System.out.println("Summe ist: ");
        int sum = num1 + num2;
        return sum;
    }


}