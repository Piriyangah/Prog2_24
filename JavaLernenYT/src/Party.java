import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        int guests;
        guests = 11; // Zielanzahl an Gäste

        //überschreiben von Variablen
        guests = guests - 1;  // Absage: guests = 11 - 1; ODER guests-=1; ODER guests--;
        System.out.println("Anzahl der Gäste die kommen " + guests);

        guests = guests + 3; // Zusagen: guests = 10 + 3; ODER guests+=3;
        System.out.println("Anzahl der Gäste die kommen " + guests);


        //Video 7
        Scanner scan = new Scanner(System.in);
        int guests2;
        System.out.println("Anzahl der angemeldeten Gäste");
        guests2 = scan.nextInt();
        boolean weiter = true;
        while (weiter){
            System.out.println("Gast anmelden(1), abmelden(2), Programm beenden(3) ");
            int value = scan.nextInt();

            if (value==1){
                System.out.println("Wieviele Gäste willst du hinzufügen?");
                int anzhal = scan.nextInt();
                guests2 += anzhal;
               // guests2++;
            }
            if (value==2){
                System.out.println("Wieviele Gäste willst du entfernen?");
                int anzahl = scan.nextInt();
                guests2 -= anzahl;
                //guests2--;
            }
            if (value==3){
                break; //ODER weiter = false;
            }
        }
        System.out.println("Anzahl der Gäste " + guests2);

        //Video 8
        System.out.println("Anzahl der angemeldeten Gäste: ");
        guests = scan.nextInt();

        while (true){
            System.out.println("+X Gäste anmelden, 0 Programm beenden, -X Gäste entfernen");
            int value = scan.nextInt();
            if(value == 0){
                break;
            }
            if(value>1){
                for (int i = 0; i < value; i++) {
                    System.out.println("Gäste angemeldet");
                    guests++;
                }
            }
            if(value<0){
                for (int i = 0; i > value; i--) {
                    System.out.println("Gäste abgemeldet");
                    guests--;
                }
            }
        }
        System.out.println(guests + " Gäste sind angemeldet");
    }
}
