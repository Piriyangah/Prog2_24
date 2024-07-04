package aufgabe8_interfaces;

import java.util.Objects;

public class Student implements Listener{
    private String name;
    private Publisher publisher;

    public Student(String name){
        this.name = name;
    }

    @Override
    public void update() {
        String msg = publisher.getUpdate(this);
        System.out.println(this.name + " received " + msg);
    }

    @Override
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
        boolean register = this.publisher.register(this);
        if(register){
            System.out.println(this.name + " registered!");
        }
    }

    @Override
    public void removePublisher(Publisher publisher) {
        this.publisher = publisher;
        boolean unregister = this.publisher.unregister(this);
        if(unregister){
            System.out.println(this.name + " deregistered!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(publisher, student.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, publisher);
    }
}
