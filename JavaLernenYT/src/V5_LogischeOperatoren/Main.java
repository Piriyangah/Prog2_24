package V5_LogischeOperatoren;

public class Main {
    public static void main(String[] args) {
        System.out.format("%n%nVideo 5 - LOGISCHE OPERATOREN %n");
        double temperatur = 25.5;
        if(temperatur > 20){
            System.out.println("Angenehm");
        }
        else {System.out.println("Unangenehm");}
        //negieren der Ausage -> vertausch die Ausagem von if und else
        if(!(temperatur > 20)){
            System.out.println("Unangenehm");
        }
        else {System.out.println("Angenehm");}

        // UND-OPERATOR (&&): mehrere Teil-Bedingungen prüfen
        if(temperatur > 20 && temperatur <35){
            System.out.println("Angenehm");
        }
        else {System.out.println("Unangenehm");}

        // ODER-OPERATOR (||): wechselt if-else von UND
        if(temperatur > 20 || temperatur <35){
            System.out.println("Unangenehm");
        }
        else {System.out.println("Angenehm");}

        //EXCLUSIVE-ODER-OPERATOR: nur eins kann stimmen. Bsp. Jan oder Tim kann gewinnen, es geht nicht das beide verlieren oder gewinnen
        boolean jan_gewonnen = true;
        boolean tim_gewonnen = false;
        if (jan_gewonnen ^ tim_gewonnen){
            System.out.println("Richtiges Ergebenis");
        }
        else{
            System.out.println("Da stimmt was nicht...");
        }
    }
}
