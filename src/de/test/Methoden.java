package de.test;

import java.util.Locale;
import java.util.Scanner;

public class Methoden {
    public static void main(String[] args) {
        System.out.println(checkLength("hjhjgj"));
        System.out.println(checkWordInString("fghdfancjkjkj"));
        //  System.out.println(checkLengthWithScanner());
        System.out.println(checkString("fhfjfancykjfgkjfdlghfdjhgjdgh"));


        String s = "ein Lange Stringkette";
        System.out.println(s.length());
        System.out.println(s.charAt(5));
        System.out.println(s.substring(10));
        System.out.println(s.substring(3, 10));
        System.out.println(s.toLowerCase(Locale.ROOT));
        System.out.println(s.toUpperCase(Locale.ROOT));
        System.out.println(s.endsWith("kette"));
        System.out.println(s.replaceAll("ein", "Die"));

        String str = String.join("", "A", ",", "von", "Z");
        System.out.println(str);
        System.out.println(str.replace('A', 'B'));

    }


    public static boolean checkLength(String str) {
        return (str.length() > 20);
    }


    public static boolean checkWordInString(String str) {
       // return (str.contains("fancy"));
        return (str.contains("fancy"))? true : false;
    }

    public static boolean checkLengthWithScanner() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int length = str.length();
        return (str.length() > 20);
    }

    public static boolean checkString(String str) {
//        boolean b1 = checkLength(str);
//        boolean b2 = checkWordInString(str);
//        return b1 && b2;
        return checkLength(str) && checkWordInString(str);

    }


}
