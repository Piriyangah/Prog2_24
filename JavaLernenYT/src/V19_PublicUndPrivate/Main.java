package V19_PublicUndPrivate;

public class Main {
    public static void main(String[] args) {
        String[] lieblingsongs = {"YMCA", "LoveTonigth"};
        Jeff jeff = new Jeff(19,lieblingsongs,"I <3 u");

        // System.out.println(jeff.geheimnis); - geheimnis ist rot, weil Main keinen Zugriff mehr hat, wegen private
        // jeff.denke(); - Methode privat gestellt, also nicht greifbar
    }
}
