package review.dependencyInjection;

import review.dependencyInjection.ConstructorInjection.UserDTO;
import review.dependencyInjection.ConstructorInjection.UserRepositoryMariaDB;
import review.dependencyInjection.ConstructorInjection.UserRepositoryOracle;
import review.dependencyInjection.ConstructorInjection.UserService;

public class Main {
    public static void main(String[] args) {
        UserDTO userDTO = new UserDTO("sinabin","이시우");
        UserRepositoryMariaDB userRepositoryMariaDB = new UserRepositoryMariaDB(userDTO);
        UserRepositoryOracle userRepositoryOracle = new UserRepositoryOracle(userDTO);

        // UserService는 추상화된 UserRepository를 의존하고 있으므로 의존 역전의 원칙을 준수하고 있다.
        // 따라서 UserService는 구체적인 UserRepository를 의존하고 있지않기 때문에
        // UserRepository가 MariaDB로 바뀌던 Oracle로 바뀌던 UserService가 수정될 필요가없으며
        // 그저 UserSerivce에 주입되는 구현 객체만 바꿔주면된다.
        // 이때 UserService에 구현 객체를 주입하는 방식이 지금과 같은 경우에는 생성자 주입방식인 것이다.

        UserService userService1 = new UserService(userRepositoryMariaDB); //UserService가 생성될 때 userRepository의 구현 객체를 주입해주고 있다.
        UserService userService2 = new UserService(userRepositoryOracle);
        userService1.saveUser();
        userService2.saveUser();
    }
}
