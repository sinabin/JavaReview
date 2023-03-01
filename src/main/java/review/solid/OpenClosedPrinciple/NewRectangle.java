package review.solid.OpenClosedPrinciple;


/**
 * @Explain : 클래스의 확장성을 위해 추상클래스 Shape를 상속받는다.
 */
public class NewRectangle extends Shape {

    private double width;
    private double height;

    public NewRectangle (double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width*height;
    }

}
