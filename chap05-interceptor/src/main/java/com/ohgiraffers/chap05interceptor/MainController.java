package com.ohgiraffers.chap05interceptor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController("/*")
public class MainController {

    @RequestMapping("/")
    public String defaultLocation(){
        return "main";
    }

    @RequestMapping("/main")
    public void main(){

    }
}
