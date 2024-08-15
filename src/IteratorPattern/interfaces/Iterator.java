package IteratorPattern.interfaces;

public interface Iterator<T> {
    public boolean hasNext();
    public void next();
    public T current();
}
