package de.test;

import java.util.Scanner;

public class DoWhileClass {
    public static void main(String[] args) {
        gibAus();
        counter();
        counterDoWhile();
        guessNumber();


    }

    public static void gibAus(){
        int i = 0;
        while(i < 10) {
            System.out.println(i);
            i++;
        }
    }

    public static void counter(){
        int i = 100;
        // zähle bis 40 in Zehnerschritten
        while(i > 40){
            i -=10;
            System.out.println(i);
        }
    }


    // do-while
    public static void counterDoWhile(){
        int i = 100;
        do{
            i = i -10;
            System.out.println(i);
        } while(i > 40);

    }

    public static void guessNumber(){
       int number = ((int) (Math.random()*5+1));
        int guess = 0;
        do{
            System.out.println("Gib Zahl zwischen 1 und 5 ");
             guess  = new Scanner(System.in).nextInt();
            if(number == guess){
                System.out.println("Treffer");
            } else if (number > guess) {
                System.out.println("Meine Zahl größer");
            } else {
                System.out.println("Meine Zahl ist kleiner");
            }

        } while (number !=guess);

    }

}
