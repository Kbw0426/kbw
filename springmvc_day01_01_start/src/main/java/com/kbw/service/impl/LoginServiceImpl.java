package com.kbw.service.impl;

import com.kbw.dao.LoginDao;
import com.kbw.entity.User;
import com.kbw.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDao loginDao;
    @Override
    public User findUserByAccount(String account,String password) {

        User user = loginDao.findUserByAccount(account,password);

        return user;
    }

    @Override
    public void insertAccount(String account, String password) {
        loginDao.insertAccount(account,password);
    }
}
