package review.solid.OpenClosedPrinciple;

/**
 * @Explain : NewShapeCalculator 클래스의 AreaCalculator 메소드는 Shape이라는
 *            추상클래스 데이터 타입을 파라메터 받기 때문에 삼각형이라는 클래스가 추가되더라도
 *            NewShapeCalculator 클래스는 수정이 필요없어서 이전 설계보다 확장성이 높다.
 *            즉 NewShapeCalculator 클래스는 이전의 ShapeCalculator 클래스에 비해서 각 도형클래스들과의 결합도가 낮아졌다.
 */
public class NewShapeCalculator {
    public double AreaCalculator(Shape shape){
        return shape.getArea();
    }
}
