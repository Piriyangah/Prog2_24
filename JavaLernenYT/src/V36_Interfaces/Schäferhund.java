package V36_Interfaces;

public class Schäferhund implements HundInterface{
    @Override
    public void belle() {
        System.out.println("Whuu Whuu");
    }

    @Override
    public void fressen() {
        System.out.println("Mumpf Mumpf");
    }
}
