package V22_BreakAndContinue;
/*
 * Labels:
 * continue:
 *
 */
public class Main_continue {
    public static void main(String[] args) {
        //continue = überspringt den durchlauf in der es sich befindet
        //bsp: summieren vin Werten die alle größer als 100 sind
        int[] number = {124, 62, 521, 13, 512, 95, 745};
        int sum = 0;

        for (int i : number) {
            if(i <= 100){
                continue;
            }
            System.out.println(i+" wurde hinzugefügt");
            sum += i;
        }
        //weiter bsp für continue
        for (int i = 0; i < 12; i++) {
            if(i==5){
                System.out.println();
                continue; //da wo 5 sein sollte wurde übersprungen und stattdessen eine zeilenumbruch gemacht
            }
            System.out.println(i);
        }
        //weiter bsp für continue
        String[] strings = new String[5];
        strings[0] = "Du";
        strings[2] = "Bist";
        strings[4] = "Hamma";
        /*
         * Konsole:
         * Du
         * null
         * Bist
         * null
         * Hamma
         */

        for (String string : strings) {
            if(string == null){ //wenn null dann überspringe
                continue;
            }
            System.out.print(string + " ");
        }
    }
}
