package CreationalPatterns.FactoryPattern;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shapeCircle = shapeFactory.getShape("circle");
        shapeCircle.draw();
        Shape shapeRectangle = shapeFactory.getShape("RECTANGLE");
        shapeRectangle.draw();
        Shape shapeSquare = shapeFactory.getShape("SQUARE");
        shapeSquare.draw();
    }

}