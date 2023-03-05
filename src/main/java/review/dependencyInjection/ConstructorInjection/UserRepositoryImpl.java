package review.dependencyInjection.ConstructorInjection;

public class UserRepositoryImpl implements UserRepository{
    @Override
    public UserDTO save(UserDTO userDTO) {
        System.out.println("유저정보가 저장되었습니다.");
        return userDTO;
    }
}
