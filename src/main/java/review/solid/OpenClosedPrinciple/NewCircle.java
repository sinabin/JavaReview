package review.solid.OpenClosedPrinciple;

/**
 * @Explain : 클래스의 확장성을 위해 추상클래스 Shape를 상속받는다.
 */
public class NewCircle extends Shape{

    private double radious;

    public NewCircle(){
    }
    public NewCircle (double radious){
        this.radious = radious;
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    @Override
    public double getArea() {
        return 3.141592*radious*radious;
    }

}
