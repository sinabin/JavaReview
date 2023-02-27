package review.solid.SingleResponsibilityPrinciple;

public class RentService {

    public void rentBook(Book book, NewCustomer newcustomer){
        System.out.println(newcustomer.getName()+"님께서 "+ book.getTitle() + "책을 대여하셨습니다.");
        System.out.println("대출일은 " + book.getRentDate()+"이고 반납일은 대출일로부터 " + String.valueOf(book.getRETURN_DATE()) +"일까지 입니다.");
    }

    public void returnBook(Book book){
        System.out.println(book.getTitle() + "책을 반납하셨습니다.");
    }

    public void reserveBook(Book book){
        System.out.println(book.getTitle() + "책을 예약하셨습니다.");
    }

}
