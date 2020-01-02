package com.kbw.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.kbw.entity.User;
import com.kbw.service.LoginService;
import com.mysql.cj.util.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;


@RequestMapping("/ssm")
@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public String login( String account, String password, Model model,
                        HttpSession session){

        System.out.println(account);
        User user = loginService.findUserByAccount(account, password);
        if (user!= null){
            //将用户添加到session
            session.setAttribute("USER_SESSION",user);
            return "redirect:/success.jsp";
        }
        model.addAttribute("msg","账户或密码错误，请重新登录！");
          return "login";

//        System.out.println(account);
//        if (account!=null&&"123456".equals(password)){
//            //登录成功，防止表单重复提交，可以重定向
//            return "success";
//        }else {
//            //登陆失败
//            return "login";
//        }


    }

    @RequestMapping("ajax")
    @ResponseBody
    public String ajax(String account ,String password){

        User user = loginService.findUserByAccount(account, password);
        return user==null?"false":"true";
    }

    @GetMapping("judge")
    @ResponseBody
    public boolean judge(){
        return false;
    }

    @GetMapping("judge2")
    @ResponseBody
    public String judge2(){
        return "false";
    }

    @PostMapping("/register")
    public String register(String account,String password){
        loginService.insertAccount(account,password);
        return "redirect:/login.jsp";

    }
}
