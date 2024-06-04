package V19_PublicUndPrivate;

/*
 * Sichbarkeit: - bestimmen, welche Attribute für anderen Klassen sichtbar sein sollen und welche nicht
 *              - public: Öffentlich - zB Main() oder Jeff-KLasse und Main-Klasse
 *              - private: Privat - Attribute und Methoden festlegen, dass sie nur innerhalb einer Klasse sichtbar sein sollen
 *                                - Für anderen Klasse unsichtbar
 *              - andere Sichtbarkeiten: protected und package private: wenig wird es angewendet
 */

public class Jeff {
    int alter;
    private String[] lieblingssongs;
    private String geheimnis; //es soll ein geheimnnis sein, welche nur Jeff (Klasse) wissen darf

    public Jeff(int alter, String[] lieblingssongs, String geheimnis){
        this.alter = alter;
        this.lieblingssongs = lieblingssongs;
        this.geheimnis = geheimnis;
    }

    private void denke(){
        System.out.println("Denkeeee .... ");
    }

}
