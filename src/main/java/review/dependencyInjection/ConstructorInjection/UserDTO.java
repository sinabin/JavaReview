package review.dependencyInjection.ConstructorInjection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Data // Getter, Setter, EqulasAndHashCode, ToString 자동생성
@NoArgsConstructor // 기본생성자 생성
@AllArgsConstructor// 모든 필드를 파라미터로 받는 생성자 생성
public class UserDTO {

    @NotNull(message = "user_id cannot be null")
    @NotBlank(message = "user_id cannot be blank")
    private String user_id;

    @NotNull(message = "user_name cannot be null")
    @NotBlank(message = "user_name cannot be blank")
    private String user_name;

}
