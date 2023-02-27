package review.solid.SingleResponsibilityPrinciple;


/**
 * @Explain : 단일책임원칙에 위배되는 Customer Class
 *            해당 클래스는 고객의 정보를 저장하는 멤버변수와 도서의 대여, 반납, 예약을  수행하고 있어 해당 클래스는
 *            고객정보 저장과 도서 대출서비스라는 2가지 역할에 대한 책임을 지고 있다.
 *            따라서 고객 클래스는 단순히 고객정보만 저장하고 도서 대출 서비스라는 새로운 클래스를 만들어줘서 역할을 분리할 필요가 있다.
 */

public class Customer {

    private String name;
    private String email;
    private int age;

    public Customer(){

    }

    public Customer(String name, String email, Integer age){
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void rentBook(Book book, Customer customer){
        System.out.println(customer.getName()+"님께서 "+ book.getTitle() + "책을 대여하셨습니다.");
        System.out.println("대출일은 " + book.getRentDate()+"이고 반납일은 대출일로부터 " + String.valueOf(book.getRETURN_DATE()) +"일까지 입니다.");
    }

    public void returnBook(Book book){
        System.out.println(book.getTitle() + "책을 반납하셨습니다.");
    }

    public void reserveBook(Book book){
        System.out.println(book.getTitle() + "책을 예약하셨습니다.");
    }
}
