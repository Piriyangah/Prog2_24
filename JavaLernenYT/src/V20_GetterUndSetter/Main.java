package V20_GetterUndSetter;

public class Main {
    public static void main(String[] args) {
        String[] lieblingsongs = {"YMCA", "LoveTonigth"};
        Jeff jeff = new Jeff(19,lieblingsongs,"I <3 u");

        //Getter aufrufen und lässt auf die Attribute ausgeben
        jeff.getAlter();
        jeff.getLieblingssongs();
        jeff.getGeheimnis();

        int jeffsAlter = jeff.getAlter();

        if(jeffsAlter >= 18){
            System.out.println("volljährig");
        }
        else{
            System.out.println("Unter 18");
        }

        jeff.setAlter(20); //Setter: neue zuweisung
        System.out.println(jeff.getAlter()); //Getter: ausgabe

    }
}
