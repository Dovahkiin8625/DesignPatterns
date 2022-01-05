package CreationalPatterns.AbstractFactoryPattern;
import CreationalPatterns.FactoryPattern.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
