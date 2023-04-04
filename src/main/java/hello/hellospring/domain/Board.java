package hello.hellospring.domain;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class Board {
    @NonNull
    private Long id;
    @NonNull
    private String title;
    @NonNull
    private String subject;
    @NonNull
    private String reg_date; // String으로할지 Date 클래스로 할지...고민
    @NonNull
    private String author;
    @NonNull
    private Long views;

    private String content;

}
