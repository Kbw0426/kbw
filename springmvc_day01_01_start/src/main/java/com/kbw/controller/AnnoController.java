package com.kbw.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/anno")
public class AnnoController {

    /**
     * 获取CookieValue的值
     *
     * @param cookieValue
     * @return
     */
    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String cookieValue) {
        System.out.println("执行了。。。");
        System.out.println(cookieValue);
        return "success";
    }
}
