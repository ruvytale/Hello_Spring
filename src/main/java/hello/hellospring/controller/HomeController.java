package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("home")
    public String h() {return "home";}

    @GetMapping("login")
    public String login() { return "login/loginMain"; }

    @GetMapping("board")
    public String board() { return "board/boardList"; }

}
