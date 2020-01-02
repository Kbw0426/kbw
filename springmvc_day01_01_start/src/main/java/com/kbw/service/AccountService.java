package com.kbw.service;

import com.kbw.entity.Account;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AccountService {
    List<Account> findAll();

    void saveAccount(Account account);
}
