package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

// Spring 첫 시작 API 사용법 튜토리얼
@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data", "hello!!");
        return "hello/hello";
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model){
        model.addAttribute("name", name);

        return "hello/hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody
    public String helloString(@RequestParam("name") String name){
        return "hello " + name;
    }


//    이방식은 JSON 처리를 위한 API이다.
    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return  hello;
    }

    static class Hello{
        private  String name;

        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name;
        }
    }

//    @GetMapping("/items")
//    public String getItems(Model model) {
//        List<String> items = Arrays.asList("item1", "item2", "item3");
//        model.addAttribute("items", items);
//        return "items";
//    }

}
