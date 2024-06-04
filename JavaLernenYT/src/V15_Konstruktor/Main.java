package V15_Konstruktor;

public class Main {
    public static void main(String[] args) {
        //Neues Objekt erstellen:
        Hund laprador = new Hund(4,"Laprador","Schwarz",true );

        /* NICHT GUT; ZUVIEL CODE; LIEBER SO WIE OBEN unter Konstruktor
        laprador.alter = 4;
        laprador.art = "Laprador";
        laprador.fellfarbe = "Schwarz";
        laprador.kannPfoteGeben = true;
         */

        laprador.testmethode(true,"WauWau"); //Reihenfolge 1. 2. 3. 4. 5. in Klasse Hund
        System.out.println("Der Lapador ist " + laprador.alter + " Jahre alt");


        Hund dackel = new Hund(1,"Dackel","Braun",false );
        Hund mops = new Hund(10,"Mops","Weiß",false );

        //Array erstellen
        Hund[] hunde = {laprador,dackel,mops};

        //alle arten ausgeben (Attributen spezifisch)
        System.out.println("Welche Arten von Hunde gibt es?");
        for (int i = 0; i < hunde.length; i++) {
            System.out.println(hunde[i].art);
        }

        //alle wo boolean true ist ausgeben
        System.out.println("Wie viele Hunde können Pfoten geben?");
        int counter = 0;
        for (int i = 0; i < hunde.length; i++) {
            if(hunde[i].kannPfoteGeben){
                counter++;
            }
        }System.out.println(counter);





    }
}
