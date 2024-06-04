package V32_Vererbung;
// durch "extends Lebewesen" erbt die Pflanze die eigenschaften von Lebewesen
// auskommentierte sachen sind in Lebewesen (Superklasse) drin
public class Pflanze extends  Lebewesen {
  //  int alter;
  //  double größe;
    boolean hatNadeln;

 //   public void fortPflanzen(){
 //       System.out.println("Fortpflanzen ...");
 //   }

 //   public void wachsen(){
 //       this.größe++;
 //   }

    public void gebeFrüchte(){
        System.out.println("Früchte ...");
    }
}
