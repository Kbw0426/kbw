package com.kbw.service;

import com.kbw.entity.User;

public interface LoginService {
    User findUserByAccount(String account,String password);
    void insertAccount(String account,String password);
}
