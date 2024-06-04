package V32_Vererbung;

public class Lebewesen {
    int alter;
    double größe;

    public void fortPflanzen(){
        System.out.println("Fortpflanzen ...");
    }
    public void wachsen(){
        this.größe++;
    }
}
