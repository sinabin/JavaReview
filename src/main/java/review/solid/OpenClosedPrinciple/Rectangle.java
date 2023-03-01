package review.solid.OpenClosedPrinciple;

/**
 * @Explain : 개방 폐쇠 원칙에 위배되는 Rectangle Class
 *            현재 Circle, Rectangle 클래스는 저마다 도형의 넓이를 구해주는 메소드를 따로 구현하고 있다.
 *            따라서 Circle, Rectangle 클래스외의 다른 도형 클래스가 추가된다면
 *            추가 될때마다 ShapeCalculator 클래스에 새로운 메소드가 추가해주어야하기 때문에
 *            코드의 확장성이 떨어진다고 볼 수 있고 이는 곧 유지보수성이 좋지 못하다고 할 수 있다.
 */
public class Rectangle {
    private double width;
    private double height;

    public Rectangle (double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return width*height;
    }

}
