package com.ohgiraffers.chap03viewresolve;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping
public class HelloWorldController {
    @RequestMapping(value="/helloSpring", method= RequestMethod.POST)

    public String helloSpingPost(HelloSpring spring, Model model){

        /*

         * 파라미터로 들어온 spring객체에 폼에서 전송된 데이터가 담겨있다.

         */

        String id = spring.getId();

        model.addAttribute("message", id);

        return "input";



    }
}
