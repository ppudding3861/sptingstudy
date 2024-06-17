package com.ohgiraffers.chap03viewresolve;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {


    @RequestMapping(value = {"/"})
    public String main() {
        return "main1";
    }

    /** RequestToviewNameTranslator
     * springㅇㅔ서 반환 타입이 void인 경우 요청 url을 기반으로 뷰를 해석하려고 하는데
     * 이때 RequestToviewNameTranslator를 사용하여 url을 뷰의 이름으로 변환한다.
     * **/
    @RequestMapping(value = "/main1")
    public void mainPage(){

    }
}
