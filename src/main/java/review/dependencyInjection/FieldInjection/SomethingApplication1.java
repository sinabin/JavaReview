package review.dependencyInjection.FieldInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SomethingApplication1 {
    // Field Injection시 아래와 같이 필드 선언과 동시에 객체를 생성하여 생성자 주입과 유사한 동작을 하도록 함.
    @Autowired private SMSService smsService = new SMSService();
    public void sendSMS(){
        smsService.sendSMS();
    }

}
