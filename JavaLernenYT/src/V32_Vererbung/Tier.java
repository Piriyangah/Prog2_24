package V32_Vererbung;
// durch "extends Lebewesen" erbt die Tier die eigenschaften von Lebewesen
public class Tier extends Lebewesen{
//    int alter;
//    double größe;
    String geräusch;
    boolean kannFliegen;

//    public void fortPflanzen(){
//        System.out.println("Fortpflanzen ...");
//    }

//    public void wachsen(){
//        this.größe++;
//    }

    public void macheGeräusch(){
        System.out.println(geräusch);
    }

}
