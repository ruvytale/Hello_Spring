package hello.hellospring.controller.member;

import hello.hellospring.dto.CreateLoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login/")
public class LoginController {

    @GetMapping("members/login")
    public String login(){
        return "login";
    }

    @RequestMapping("members/login-error")
    public String loginError(Model model){
        model.addAttribute("loginError", true);
        return "login";
    }

    @PostMapping("regMember/create")
    public String createMember(CreateLoginForm clfDTO){
        String id = clfDTO.getId();
        String pw = clfDTO.getPw();;
        String pwcheck = clfDTO.getPwCheck();;
        String nickName = clfDTO.getNickName();;

        System.out.println(id);


        return id + pw + nickName;
    }

    @GetMapping("regMember")
    public String Regst(){
        return "login/regMember.html";
    }
}
