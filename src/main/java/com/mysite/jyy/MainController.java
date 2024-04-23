package com.mysite.jyy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/sbb")
    @ResponseBody
    public String index() {
        return "안녕하세요. 기술노트with 알렉에 오신 것을 환영합니다.";
    }
}