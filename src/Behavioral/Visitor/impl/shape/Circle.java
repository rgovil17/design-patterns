package Behavioral.Visitor.impl.shape;

import Behavioral.Visitor.interfaces.Shape;
import Behavioral.Visitor.interfaces.ShapeVisitor;

public class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visitCircle(this);
    }
}
