package IteratorPattern.impl;

import IteratorPattern.Employee;
import IteratorPattern.interfaces.Iterable;
import IteratorPattern.interfaces.Iterator;

import java.util.List;

public class EmployeeIterable implements Iterable<Employee> {
    private List<Employee> employees;

    public EmployeeIterable(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public Iterator<Employee> createIterator() {
        return new EmployeeIterator(this.employees);
    }
}
