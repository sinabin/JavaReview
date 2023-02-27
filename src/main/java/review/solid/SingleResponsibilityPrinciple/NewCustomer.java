package review.solid.SingleResponsibilityPrinciple;

/**
 * @Explain : 단일책임원칙(SPR)에 알맞게 변경되어 단순히 고객정보만 저장하는 NewCustomer 클래스이다.
 */
public class NewCustomer {
    private String name;
    private String email;
    private int age;

    public NewCustomer(){

    }

    public NewCustomer(String name, String email, int age ){
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "NewCustomer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
