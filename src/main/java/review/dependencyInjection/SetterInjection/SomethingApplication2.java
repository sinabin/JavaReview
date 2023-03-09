package review.dependencyInjection.SetterInjection;

public class SomethingApplication2 {

    private EmailService emailService;

    /**
     * @Explain : 대표적인 객체주입 방법 3가지 중 두번째 -> SetteInjection
     *            의존 객체를 SetterMethod로 주입받기 때문에 객체의 불변성과 안정성을 보장할 수 없음
     *            필요한 객체만 주입받으려할 때 주로 사용하지만 거의 사용하지 않는게 요즘 추세
     */
    public void setEmailService(EmailService emailService){
        this.emailService = emailService;
    }

    public void sendMail(){
        emailService.sendEmail();
    }
}
