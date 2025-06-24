package Behavioral.IteratorPattern.impl;

import Behavioral.IteratorPattern.Employee;
import Behavioral.IteratorPattern.interfaces.IterableCollection;
import Behavioral.IteratorPattern.interfaces.Iterator;

import java.util.List;

public class EmployeeCollection implements IterableCollection<Employee> {
    private List<Employee> employees;

    public EmployeeCollection(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public Iterator<Employee> createIterator() {
        return new EmployeeIterator(this.employees);
    }
}
