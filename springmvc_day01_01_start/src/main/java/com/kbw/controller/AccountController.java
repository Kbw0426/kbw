package com.kbw.controller;


import com.kbw.entity.Account;
import com.kbw.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        System.out.println("表现层   查询所有查询成功！！！");
        List<Account> list = accountService.findAll();
        model.addAttribute("list", list);

        return "list";
    }
}
