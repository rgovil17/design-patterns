package Behavioral.Visitor.interfaces;

public interface Shape {
    void accept(ShapeVisitor visitor);
}
