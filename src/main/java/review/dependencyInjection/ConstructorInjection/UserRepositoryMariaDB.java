package review.dependencyInjection.ConstructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryMariaDB implements UserRepository{
    private final UserDTO userDTO;

    @Autowired
    public UserRepositoryMariaDB(UserDTO userDTO){
        this.userDTO = userDTO;
    }

    @Override
    public void saveUser() {
        System.out.println(userDTO.getUser_id()+ "의 정보가 MariaDB에 저장되었습니다.");
    }
}
