package uebung6_140524;
/*
Klausurhinweise:
Iterator lesen können und wissen das es ihn gibt. Müssen nicht aktiv nutzen müssen, geht auch stattdessen For-schleifen
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeManager {
        private final List<Employee> employees;

        public EmployeeManager(){
            this.employees = new ArrayList<Employee>();
        }

        public void addEmployee(int id, String name, int eintrittsjahr){
            Employee newEmployee = new Employee(id, name, eintrittsjahr);
            this.employees.add(newEmployee);
        }

        public void printAllEmployees(){
            System.out.println(employees);
        }

        public void findEmployeeById(int id) {

        }
        public void removeEmployee(int id) {
            /* sollte gehen, macht aber probleme:
            Iterator<Employee> iterator = this.employees.iterator();
            while(iterator.hasNext()){
                Employee vergleichEmployee = iterator.next();
                if(vergleichEmployee.getId() == id){
                    this.employees.remove(vergleichEmployee);
                }
            }*/

            Employee e = null;
            for (Employee vergleichsEmployee : employees){
                if(vergleichsEmployee.getId() == id){
                    e = vergleichsEmployee;
                }
            }
            employees.remove(e);
        }
}
