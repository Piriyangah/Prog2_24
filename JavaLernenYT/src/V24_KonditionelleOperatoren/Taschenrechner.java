package V24_KonditionelleOperatoren;
// aus Video 16 - Rückgabewerte
public class Taschenrechner {
    // + , - , * , /

    public int addieren(int zahl1, int zahl2){
        return zahl1+zahl2;
    }

    public int subtrahieren(int zahl1, int zahl2){
        return zahl1-zahl2;
    }

    public int mal(int zahl1, int zahl2){
        return zahl1*zahl2;
    }

    public int geteilt(int zahl1, int zahl2){
        return zahl1/zahl2;
    }

    public int[] zusammenfassen(int zahl1, int zahl2, int zahl3){
        int[] intArray = {zahl1,zahl2,zahl3};
        return intArray;
    }

    public static int max(int a, int b){
        return a > b ? a : b; // wenn a größer b dann gib a aus, sonst b
    }

    public static int abs(int i){
        return i > 0 ? i : -i; // wenn i größer als 0 und somit positiv, dann gib diese aus, sonst -(-i) wird zu psotitiv und wird ausgegeben
    }
}
