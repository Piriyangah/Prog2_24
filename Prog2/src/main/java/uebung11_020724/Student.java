package uebung11_020724;

public class Student implements Comparable<Student>{
    public String name;
    public int matrNr;
    public double note;

    public Student(String name, int matrNr, double note) {
        this.name = name;
        this.matrNr = matrNr;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public int getMatrNr() {
        return matrNr;
    }

    public double getNote() {
        return note;
    }

    @Override
    public int compareTo(Student o) {
        /*
        -1 less
        0 equal
        1 greater
         */
        if (this.note < o.note){
            return -1;              // von 1 zu -1, weil von klein zu groß zeigen sollte
        }
        if (this.note > o.note){
            return 1;               // von -1 zu 1, weil von klein zu groß zeigen sollte
        }
        //return 0; wenn 2 Studenten die gleiche Note haben, soll es es nach Name sortiert werden
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", matrNr=" + matrNr +
                ", note=" + note +
                '}';
    }
}
