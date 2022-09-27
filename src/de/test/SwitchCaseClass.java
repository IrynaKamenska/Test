package de.test;
enum Day {
    MONTAG, DIENSTAG, MITTWOCH, DONNERSTAG, FREITAG, SAMSTAG, SONNTAG;
}


public class SwitchCaseClass {
    public static void main(String[] args) {
        checkAllowedAmount(10, "grau");
        checkDay();

    }
    /*
    Wenn die Anzahl über 30 liegt, gib den String “Zu viele Personen zurück”
    Wenn die Anzahl unter 30 liegt, gib den String “Maximale Personenzahl nicht überschritten” zurück
    Alarmstufe „rot“: keine Personen erlaubt
    Alarmstufe „gelb“: max 30 Personen erlaubt
    Alarmstufe „grün“: max 60 Personen erlaubt
     */
    public static void checkAllowedAmount(int amount, String level) {
     int count = 0;
        switch (level) {
            case "rot":
               count =0;
                System.out.println("Keine Personen erlaubt");
                break;

            case "gelb":
                count = 30;
                System.out.println("max 30 Personen erlaubt");
                break;

            case "grün":
                count = 60;
                System.out.println("max 60 Personen erlaubt");
                break;

            default:
                System.out.println("Unbekannte Alarmstufe");
                return;
        }

        if (amount > count) {
            System.out.println("Zu viele Personen");
        } else {
            System.out.println("Maximale Personenzahl nich überschritten");
        }

    }
    

    public static void checkDay(){
        Day day = Day.DIENSTAG;
        switch (day){
            case MONTAG, DIENSTAG,MITTWOCH, DONNERSTAG, FREITAG:
                System.out.println("Arbeitstag");;
            break;
            case SAMSTAG, SONNTAG:
                System.out.println("Wochenende");
            break;

            default:
                throw new IllegalStateException("Unexpected value: " + day);
        };
    }




}
