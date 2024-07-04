package uebung11_020724;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Zeile verdoppeln mit strg + D
        Student s1 = new Student("Ite", 2345, 2.3);
        Student s2 = new Student("Ita", 2346, 3.3);
        Student s3 = new Student("Ito", 2347, 2.7);

        // Listen erstelle mit List und ArrayList und beides muss importiert werden
        List<Student> studentList = new ArrayList<Student>(); //Arraylist oder Linklist benutzen
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        System.out.println(studentList);        // Liste ausgeben
        studentList.sort(Student::compareTo);   // sortieren von der Liste; falls es andersherum kommt, die 1 und -1 in Student tauschen

        System.out.println(studentList);
    }
}
