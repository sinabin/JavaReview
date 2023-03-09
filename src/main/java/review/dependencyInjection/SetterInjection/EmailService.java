package review.dependencyInjection.SetterInjection;

import org.springframework.stereotype.Service;

public class EmailService {

    public void sendEmail(){
        System.out.println("이메일을 보냅니다.");
    }
}
