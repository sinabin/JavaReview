package review.solid;

import review.solid.SingleResponsibilityPrinciple.Book;
import review.solid.SingleResponsibilityPrinciple.Customer;
import review.solid.SingleResponsibilityPrinciple.NewCustomer;
import review.solid.SingleResponsibilityPrinciple.RentService;

public class Main {
    public static void main(String[] args) {

        // 1. 단일 책임원칙(SPR)에 위배되는 Customer Class
        Customer customer = new Customer("LeeSiWoo","sinabinvr94@gmail.com",28);
        Book book1 = new Book("어린왕자");
        customer.reserveBook(book1);
        customer.rentBook(book1, customer);
        customer.returnBook(book1);
        System.out.println();

        // 2. 단일책임원칙(SPR)을 준수하도록 수정
        NewCustomer newCustomer = new NewCustomer("LeeSiWoo", "sinabinvr94@gmail.com", 28);
        Book book2 = new Book("거인의 꿈");
        RentService rentService = new RentService();
        rentService.rentBook(book2, newCustomer);

    }
}