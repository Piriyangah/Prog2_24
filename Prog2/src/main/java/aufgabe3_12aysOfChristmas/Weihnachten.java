package aufgabe3_12aysOfChristmas;

import java.util.Scanner;

public class Weihnachten {
    String[] songtext = new String[12];
    String[] day = new String[12];

    public Weihnachten(){
        songtext[0] = String.format("A partridge in a pear tree ");
        songtext[1] = String.format("Two turtle doves,  ");
        songtext[2] = String.format("Three French hens, ");
        songtext[3] = String.format("Four calling birds,  ");
        songtext[4] = String.format("Five golden rings,  ");
        songtext[5] = String.format("Six geese a-laying, ");
        songtext[6] = String.format("Seven swans a-swimming, ");
        songtext[7] = String.format("Eight maids a-milking, ");
        songtext[8] = String.format("Nine ladies dancing, ");
        songtext[9] = String.format("Ten lords a-leaping, ");
        songtext[10] = String.format("Eleven pipers piping, ");
        songtext[11] = String.format("Twelve drummers drumming, ");

        day[0] = "First";
        day[1] = "Second";
        day[2] = "Third";
        day[3] = "Fourth";
        day[4] = "Fifth";
        day[5] = "Sixth";
        day[6] = "Seventh";
        day[7] = "Eighth";
        day[8] = "Ninth";
        day[9] = "Tenth";
        day[10] = "Eleventh";
        day[11] = "Twelfth";
    }

    public void verse() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte gib die Tag Nummer ein (1-12): ");
        int tagNr = scan.nextInt()-1;

        if (tagNr == 1) {
            System.out.println("On the First day of Christmas, My true love gave to me:");
            System.out.println(songtext[0]);
        } else {
            System.out.println("On the " + day[tagNr] + " day of Christmas,\n" +
                    "My true love gave to me:");
            for (int i = tagNr; i >= 1; i--) {
                System.out.println(songtext[i]);
            }
            System.out.println("And a partridge in a pear tree. ");
        }
    }
}