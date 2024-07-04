package uebung10_250624;

public class RomanNumbers {
    public String convertToRomanNr(int dezimalzahl) {
//        Schritt 1:
//        return "testing";

//        Schritt 2: Einfach schreiben
//        if(dezimalzahl ==2 ){
//            return "II";
//        }
//        if(dezimalzahl ==3){
//            return "III";
//        }
//        else return "I";

//        Schritt 3: der vorherigen überlegen schöner zu schreiben + weiter schreiben mit er einfachsten Methode

//        String result = "";
//        if(dezimalzahl ==5){
//            return "V";
//        }
//        if(dezimalzahl ==10){
//            return "X";
//        }
//        if(dezimalzahl ==20){
//            return "XX";
//        }
//        for (int i = 0; i < dezimalzahl; i++) {
//            result +="I";
//        }
//        return result;

        //Schritt 4: die Xe schauen

        String result = "";
        if(dezimalzahl ==5){
            return "V";
        }
        if(dezimalzahl >=10){
            int zehner = dezimalzahl /10;
            for (int i = 0; i > zehner; i--) {
                result += "X";
                dezimalzahl -= 10;

            }
            for (int i = 0; i < dezimalzahl; i++) {
                result +="I";
            }
        }

        return result;
    }

}
