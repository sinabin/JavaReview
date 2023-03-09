package review.dependencyInjection.FieldInjection;

import org.springframework.stereotype.Service;

@Service
public class SMSService {

    public SMSService(){

    }

    public void sendSMS(){
        System.out.println("문자메시지를 발송합니다.");
    }
}
