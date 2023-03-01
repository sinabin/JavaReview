package review.solid.OpenClosedPrinciple;

/**
 * @Explain : 개방 폐쇠 원칙에 위배되는 Circle Class이다.
 *
 *            물론 현재 클래스에서는 circle에 대한 정보(멤버변수)만 가져야 한다는 관점에서 본다면
 *            넓이를 계산해주는 역할도 해주고 있기 때문에 개방 폐쇠 원칙 뿐만아니라 단일 책임원칙에도 위배된다고 볼 수 있다.
 *            하지만 circle에 대해서 넓이까지 구해주는 것까지를 하나의 책임이라고 본다면 단일 책임에 원칙에 위배되지 않는다고도 볼 수 있다.
 *
 *            이렇듯 단일원칙챔이라는 것은 개발자가 클래스를 설계할 때 해당 클래스의 책임을 어디까지 볼 것인지가 중요하다.
 *            그래서 역할에 대한 변경이 일어났을 때 정말로 Circle 클래스만 수정이 일어나도 괜찮은 걸까? 고민해봐야한다.
 */

public class Circle {
    private double radious;

    public Circle(){
    }
    public Circle (double radious){
        this.radious = radious;
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    public double getArea(){
        return 3.141592*radious*radious;
    }




}
