package IteratorPattern.interfaces;

public interface IterableCollection<T> {
    public Iterator<T> createIterator();
}
