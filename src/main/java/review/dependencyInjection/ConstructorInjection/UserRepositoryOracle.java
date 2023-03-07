package review.dependencyInjection.ConstructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryOracle implements UserRepository{

    private final UserDTO userDTO;

    @Autowired
    public UserRepositoryOracle(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    @Override
    public void saveUser() {
        System.out.println(userDTO.getUser_id() +"의 정보가 Oracle에 저장되었습니다.");
    }
}
