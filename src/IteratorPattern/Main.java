package IteratorPattern;

import IteratorPattern.impl.EmployeeIterable;
import IteratorPattern.interfaces.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John Doe", 10000));
        employees.add(new Employee("Catherine Knight", 25000));
        employees.add(new Employee("George Best", 17000));

        EmployeeIterable empIterable = new EmployeeIterable(employees);
        Iterator<Employee> empIterator = empIterable.createIterator();

        while (empIterator.hasNext()) {
            System.out.println(empIterator.current());
            empIterator.next();
        }
    }
}
