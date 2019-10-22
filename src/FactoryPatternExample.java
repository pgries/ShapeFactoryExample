// Based on code from https://www.tutorialspoint.com/design_pattern/factory_pattern.htm

interface Shape {
    void draw();
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("This is the Rectangle draw() method.");
    }
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("This is the Square draw() method.");
    }
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("This is the Circle draw() method.");
    }
}

class ShapeFactory {

    public Shape createShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}

public class FactoryPatternExample {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.createShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.createShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.createShape("SQUARE");
        shape3.draw();
    }
}
