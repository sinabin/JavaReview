package review.solid;

import review.solid.DependencyInversionPrinciple.OldWeatherTracker;
import review.solid.InterfaceSegregationPrinciple.*;
import review.solid.OpenClosedPrinciple.*;
import review.solid.SingleResponsibilityPrinciple.Book;
import review.solid.SingleResponsibilityPrinciple.Customer;
import review.solid.SingleResponsibilityPrinciple.NewCustomer;
import review.solid.SingleResponsibilityPrinciple.RentService;

import javax.print.Doc;

public class Main {
    public static void main(String[] args) {

        /**
         * @1.단일책임원칙(SingleResponsibilityPrinciple)
         * 단일책임원칙이란 하나의 클래스는 하나의 책임만을 가져야 한다는 원칙이다.
         */
        // 1.1 단일 책임원칙(SRP)에 위배되는 Customer Class
        Customer customer = new Customer("LeeSiWoo", "sinabinvr94@gmail.com", 28);
        Book book1 = new Book("어린왕자");
        customer.reserveBook(book1);
        customer.rentBook(book1, customer);
        customer.returnBook(book1);
        System.out.println();

        // 1.2. 단일책임원칙(SPR)을 준수하도록 수정
        NewCustomer newCustomer = new NewCustomer("LeeSiWoo", "sinabinvr94@gmail.com", 28);
        Book book2 = new Book("거인의 꿈");
        RentService rentService = new RentService();
        rentService.rentBook(book2, newCustomer);
        System.out.println();

        /**
         * @2.개방-폐쇠원칙(OpenClosedPrinciple)
         * 개방-폐쇠 원칙이란 객체를 다룸에 있어서 객체의 확장성에 대해서는 개방적이여야하고 수정에 있어서는 폐쇠적이여야 한다는 원칙
         */

        // 2.1 개방 폐쇠원칙(OCP)에 위배되는 도형클래스들과 각 도형클래스들의 넓이를 계산하는 클래스
        Circle circle = new Circle(2.0);
        Rectangle rectangle = new Rectangle(2.5, 3.5);
        ShapeCalculator calculator = new ShapeCalculator();

        double circle_area = calculator.calculateCircle(circle);
        double rectangle_area = calculator.calculateRectangle(rectangle);

        System.out.println("원의 넓이(OCP위배) : " + circle_area);
        System.out.println("사각형의 넓이(OCP위배) : " + rectangle_area);
        System.out.println();
        // 여기서 만약 삼각형이라는 도형이 추가가 된다면 ShapeCalculator 클래스에 삼각형의 넓이를 구해주는 메소드가 추가되어야한다.
        // 따라서 삼각형이라는 도형이 추가가 되더라도 ShapeCalculator 클래스에 수정이 일어나지 않도록 하려면 다음과 같이 설계되어야 한다.
        NewCircle newCircle = new NewCircle(2.1);
        NewRectangle newRectangle = new NewRectangle(2.8, 3.1);
        NewShapeCalculator newShapeCalculator = new NewShapeCalculator();
        double new_circle_area =  newShapeCalculator.AreaCalculator(newCircle);
        double new_rectangle_area = newShapeCalculator.AreaCalculator(newRectangle);
        System.out.println("원의 넓이(OCP준수) : " + new_circle_area);
        System.out.println("사각형의 넓이(OCP준수) : " + new_rectangle_area);
        System.out.println();
        /**
         * @3.리스코프원칙(LoscpovSubstitutionPrinciple)
         * 리스코프원칙이란  부모 클래스의 인스턴스를 사용하는 위치에 자식 클래스의 인스턴스를 대신 사용하더라도
         * 코드가 개발자의 본래 의도대로 작동해야한다는 의미이다.
         *
         * 위 개방폐쇠의 예제코드에서 보았던것처럼 Shape라는 추상클래스를 선언하여 NewCircle과 NewRectangle 클래스는 각각 이를 상속받아
         * 각 도형의 넓이를 계산하는 메소드를 필수로 구현하도록 설계하여 본래의 의도대로 동작하도록 한 것이다.
         */

        // 위 2.1 예제코드를 다시 살펴보면
        // NewShapeCalculator 클래스의 AreaCalculator 메소드는 Shpae라는 추상클래스를 파라미터로 받고있다.
        // 이때 NewRectangle 클래스와 NewCircle 클래스는 리스코프원칙을 준수(Shpae)를 상속받아 본래 의도대로 동작하도록
        // (즉 도형의 넓이를 계산하는 메소드를 필수로 구현하도록)설계 되어있어서 서브타입(자식객체)이 인스턴스로 전달되어도 문제가 없다.

        /**
         * @4.인터페이스분리원칙(InterfaceSegregationPrinciple)
         * 인터페이스분리원칙이란 자신이 사용하지 않는 메소드에 대해서는 의존성을 갖추어서는 안된다는 원칙이다.
         *
         * 즉 인터페이스는 자신이 필요로 하는 메소드만 포함하여 불필요한 의존성을 제거하도록 한다.
         */

        // 4.1 인터페이스 분리원칙에 위배되는 OldPrinter 인터페이스를 상속받은 Old한 기계들
        Document document = new Document("0001", "Java-인터페이스분리원칙", "인터페이스 분리원칙이란.......(중략)");
        OldSimplePrinter oldSimplePrinter = new OldSimplePrinter();
        OldAdvancedPrinter oldAdvancedPrinter = new OldAdvancedPrinter();
        oldSimplePrinter.print(document);
        try {
            oldSimplePrinter.fax(document);
        } catch (UnsupportedOperationException e) {
            System.out.println("OldSimplePrinter에서는 제공하지 않는 기능입니다.");
        }
        oldAdvancedPrinter.print(document);

        // 4.2 기존의 OldPrinter 인터페이스를 Printer, Fax, Scanner로 분리
        System.out.println("######################인터페이스 분리후################################");
        SimplePrinter simplePrinter = new SimplePrinter();
        simplePrinter.print(document);

        AdvancedPrinter advancedPrinter = new AdvancedPrinter();
        advancedPrinter.print(document);
        advancedPrinter.fax(document);
        advancedPrinter.scan(document);
        System.out.println();

        /**
         * @5.의존역전의원칙(DependencyInversionPrinciple)
         * 1. 의존역전의 원칙이란 상위 수준의 모듈은 하위 수준의 모듈에 의존해서는 안되며, 상위 모듈이던 하위 모듈이던
         *    둘다 추상화된 것에 의존해야한다는 것을 의미한다.
         * 2. 추상화는 세부 사항에 의존해서는 안되며 세부사항(구체적인 구현)은 추상화에 의존해야한다.
         *
         *
         * 즉 한마디로 말하자면, 변화하기 쉬운것에 의존하지말라!
         */

    }
}