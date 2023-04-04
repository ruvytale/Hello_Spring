package hello.hellospring.dto;


import hello.hellospring.domain.Member;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateLoginForm {

    private String id;
    private String pw;
    private String pwCheck;
    private String nickName;

    public CreateLoginForm(String id, String pw, String pwCheck, String nickName) {
        this.id = id;
        this.pw = pw;
        this.pwCheck = pwCheck;
        this.nickName = nickName;
    }
}
