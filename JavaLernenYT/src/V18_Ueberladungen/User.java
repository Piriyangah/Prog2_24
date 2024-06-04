package V18_Ueberladungen;

public class User {
    String name;
    int age;
    String number;
    double shoesize;

    public User(String name, int age, String number, double shoesize){
        this.name = name;
        this.age = age;
        this.number = number;
        this.shoesize = shoesize;
    }

    //Überladene Konstuktor mit weniger übergebene Parameterwerte
    public User(String name, int age){
        this.name = name;
        this.age = age;
        this.number = "";   //bzw. korrekter: this.number = null;
        this.shoesize = 0;  //bzw. korrekter: this.shoesize = null;
    }


}
