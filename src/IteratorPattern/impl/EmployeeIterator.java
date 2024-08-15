package IteratorPattern.impl;

import IteratorPattern.Employee;
import IteratorPattern.interfaces.Iterator;

import java.util.List;

public class EmployeeIterator implements Iterator<Employee> {
    private int position;
    private List<Employee> employees;

    public EmployeeIterator(List<Employee> employees) {
        this.employees = employees;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return this.position < this.employees.size();
    }

    @Override
    public void next() {
        this.position++;
    }

    @Override
    public Employee current() {
        return this.employees.get(this.position);
    }
}
