package Behavioral.Visitor.impl.shape;

import Behavioral.Visitor.interfaces.Shape;
import Behavioral.Visitor.interfaces.ShapeVisitor;

public class Rectangle implements Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visitRectangle(this);
    }
}
