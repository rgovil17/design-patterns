package Behavioral.Visitor;

import Behavioral.Visitor.impl.shape.Circle;
import Behavioral.Visitor.impl.shape.Rectangle;
import Behavioral.Visitor.impl.visitor.AreaCalculatorVisitor;
import Behavioral.Visitor.impl.visitor.SvgExporterVisitor;
import Behavioral.Visitor.interfaces.Shape;
import Behavioral.Visitor.interfaces.ShapeVisitor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = List.of(
                new Circle(5),
                new Rectangle(10, 4),
                new Circle(2.5)
        );

        System.out.println("\n==== CALCULATING AREA ====");
        ShapeVisitor areaCalculator = new AreaCalculatorVisitor();
        for (Shape shape : shapes) {
            shape.accept(areaCalculator);
        }

        System.out.println("\n==== EXPORTING TO SVG ====");
        ShapeVisitor svgExporter = new SvgExporterVisitor();
        for (Shape shape : shapes) {
            shape.accept(svgExporter);
        }
    }
}
