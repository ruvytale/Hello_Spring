package hello.hellospring.vo;


import lombok.Data;

import java.util.UUID;

@Data
public class MemberPostVo {
    private UUID uuid;
    private String id;
    private String pw;
    private String nickNmae;


}
