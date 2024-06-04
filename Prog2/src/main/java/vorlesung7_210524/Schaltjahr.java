package vorlesung7_210524;

public class Schaltjahr {
    public static boolean istNormaljahr(int jahr) {
        if(jahr%400==0 || jahr%4==0 && jahr%100!=0) {
            return false;
        }
        else {
            return true;
        }
    }
}
