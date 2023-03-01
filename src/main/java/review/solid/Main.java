package review.solid;

import review.solid.OpenClosedPrinciple.*;
import review.solid.SingleResponsibilityPrinciple.Book;
import review.solid.SingleResponsibilityPrinciple.Customer;
import review.solid.SingleResponsibilityPrinciple.NewCustomer;
import review.solid.SingleResponsibilityPrinciple.RentService;

public class Main {
    public static void main(String[] args) {

        /**
         * @1.단일책임원칙(SRP)
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
         * @2.개방-폐쇠원칙(OCP)
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

    }
}