package com.kbw.test;

import com.kbw.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceTest {

    @Test
    public void testRun1() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = (AccountService) ctx.getBean("accountService");
        accountService.findAll();

    }
}
