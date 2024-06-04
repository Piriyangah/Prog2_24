package V20_GetterUndSetter;

/*
 * Getter/Setter: - vor die Klasse die Getter als Bodyguards stellen
 * Getter - ist eine Methode, deren einzige Zweck es ist, den Wert eines Attributes zurückzugeben
 *        - um eine Variable ausgeben zu könne
 *        - public Rückgabetyp GetAttributname(){this.attribut = attribut}
 * Setter - Variablen neu zuweisen können
 *        - Rückgabe ist immer void
 */

public class Jeff {
    private int alter;
    private String[] lieblingssongs;
    private String geheimnis;

    public Jeff(int alter, String[] lieblingssongs, String geheimnis){
        this.alter = alter;
        this.lieblingssongs = lieblingssongs;
        this.geheimnis = geheimnis;
    }

    private void denke(){
        System.out.println("Denkeeee .... ");
    }

    //Getter
    public int getAlter() {
        return alter;
    }
    public String[] getLieblingssongs() {
        return lieblingssongs;
    }
    public String getGeheimnis() {
        return "Das sag ich dir nicht"; // man kann auch auch in Getter sichstellen, eine ausgabe zugeben
    }

    //Setter
    public void setAlter(int alter) {
        this.alter = alter;
    }
    public void setLieblingssongs(String[] lieblingssongs) {
        this.lieblingssongs = lieblingssongs;
    }
    public void setGeheimnis(String geheimnis) {
        this.geheimnis = geheimnis;
    }
}
