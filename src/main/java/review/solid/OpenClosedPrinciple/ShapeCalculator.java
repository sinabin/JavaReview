package review.solid.OpenClosedPrinciple;

public class ShapeCalculator {
    public double calculateCircle (Circle circle){
        return circle.getArea();
    }

    public double calculateRectangle(Rectangle rectangle){
        return rectangle.getArea();
    }
}
