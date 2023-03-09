package review.dependencyInjection.ConstructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Explain : 대표적인 객체주입 방법 3가지 중 첫번째 -> 생성자 주입(Construnctor Injection)
 *            의존 객체를 생성자 파리미터를 통해 주입받기 때문에 객체 생성 시점에 의존 객체가 모두 주입되어
 *            객체의 불변성과 안정성을 보장할 수있다.
 *            의존 객체가 필수적일 떄 사용한다.
 */

@Service // UserSerivce를 IoC컨테이너에 의해 관리되도록 Bean 등록
public class UserService {
    private final UserRepository userRepository;

    // UserService에 UserRepository 추상화된 멤버변수를 주입 -> Solid 원칙중 의존 역전 원칙 따름.
    public UserService(UserRepository userRepository){ // 생성자로 의존하는 Bean을 주입받으면 @Autowired 어노테이션을 사용하지 않아도 됨.
        this.userRepository = userRepository;
    }

    public void saveUser(){
        userRepository.saveUser();
    }
}
