package V36_Interfaces;

public class Dackel implements HundInterface{
    private int beine = 4;
    int alter;
    private String name;
    int gewicht;

    public Dackel(int alter, String name, int gewicht) {
        this.alter = alter;
        this.name = name;
        this.gewicht = gewicht;
    }

    @Override
    public void belle() {
        System.out.println("Wau Wau");
    }

    @Override
    public void fressen() {
        System.out.println("Maaaampf");
    }
}
