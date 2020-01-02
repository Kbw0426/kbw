package com.kbw.service.impl;

import com.kbw.dao.AccountDao;
import com.kbw.entity.Account;
import com.kbw.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {


    @Autowired
    private AccountDao accountDao;
    @Override
    public List<Account> findAll() {
        System.out.println("业务层   查询所有！！！");


       return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {

    }


}
