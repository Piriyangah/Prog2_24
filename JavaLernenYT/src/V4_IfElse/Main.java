package V4_IfElse;

public class Main {
    public static void main(String[] args) {
        System.out.format("%n Video 4 - IF-ELSE %n");
        /*
        if(Bedingung){ //Bedingung kann Wahr oder Falsch sein}
        else{}
        */

        // Integer Bsp:
        int number4 = 5;
        if(number4 == 5){
            System.out.println("Number ist gleich 5");
        } else {
            System.out.println("Number ungleich 5");
        }

        //ist gleich wie
        if(number4 != 5){
            System.out.println("Number ungleich 5");
        } else {
            System.out.println("Number ist gleich 5");
        }

        //Boolean Bsp:
        boolean bool1 = true;
        if(bool1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        //Boolean + Int Bsp:
        int number5 = 6;
        boolean erheohen = (number5 <= 5); //boolean erheohen = true;
        if(erheohen){
            number5 += 3;
            System.out.println("hier wurde 3 dazu addiert: " + number5);
        }
        else{
            System.out.println("hier wurde nichts dazu addiert: " + number5);
        }

        //AUFGABE: Der Nutzer gibt seinen Alter an. Wenn über 18 -> Volljährig ausgeben und wenn nicht dann Minderjährig
        int alter;
        alter = 18;
        if(alter >= 18){
            System.out.println("Volljährig");
        }
        else{
            System.out.println("Minderjährig");
        }

    }
}
