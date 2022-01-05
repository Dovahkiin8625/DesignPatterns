package CreationalPatterns.AbstractFactoryPattern;

import CreationalPatterns.FactoryPattern.Circle;
import CreationalPatterns.FactoryPattern.Rectangle;
import CreationalPatterns.FactoryPattern.Shape;
import CreationalPatterns.FactoryPattern.Square;

public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){
        return null;
    }
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
}
