package hello.hellospring.controller.member;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.JpaMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class RestMemberController {

    @Autowired
    private JpaMemberRepository memberRepository;


    @GetMapping("/Members")
    public List<Member> getMemberList() {
        return memberRepository.findAll();
    }



}
