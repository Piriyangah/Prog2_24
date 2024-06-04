package uebung6_140524;

public class Employee {
    private final int Id;
    private String name;
    private final int eintrittsjahr;


    public Employee(int id, String name, int eintrittsjahr) {
        this.Id = id;
        this.name = name;
        this.eintrittsjahr = eintrittsjahr;
    }

    public int getId() {
        return Id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", eintrittsjahr=" + eintrittsjahr +
                '}';
    }
}
