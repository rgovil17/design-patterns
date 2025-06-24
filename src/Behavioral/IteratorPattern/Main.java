package Behavioral.IteratorPattern;

import Behavioral.IteratorPattern.impl.EmployeeCollection;
import Behavioral.IteratorPattern.interfaces.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John Doe", 10000));
        employees.add(new Employee("Catherine Knight", 25000));
        employees.add(new Employee("George Best", 17000));

        EmployeeCollection empCollection = new EmployeeCollection(employees);
        Iterator<Employee> empIterator = empCollection.createIterator();

        while (empIterator.hasNext()) {
            System.out.println(empIterator.next());
        }
    }
}
