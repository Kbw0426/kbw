package com.kbw.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@RequestMapping("/ajax")
@Controller
public class AjaxController {

    @RequestMapping("/a")
    public void ajax( String moblie,HttpServletRequest request, HttpServletResponse response) throws IOException {


        System.out.println(moblie);
        PrintWriter out = response.getWriter();
        if ("17613675576".equals(moblie)){
            out.write("true");
        }else {
            out.write("false");
        }

    }
}
