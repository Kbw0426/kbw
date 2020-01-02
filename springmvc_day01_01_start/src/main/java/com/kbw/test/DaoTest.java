package com.kbw.test;

import com.kbw.dao.AccountDao;
import com.kbw.entity.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class DaoTest {

    @Test
    public void testRun1() throws Exception {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        AccountDao accountDao = session.getMapper(AccountDao.class);
        List<Account> accounts = accountDao.findAll();
        for (Account account : accounts) {
            System.out.println(account);
        }
        //释放资源
        session.close();
        in.close();

    }

    @Test
    public void testRun2() throws Exception {
        Account account = new Account();
        account.setName("柯博文");
        account.setMoney(999999d);
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        AccountDao accountDao = session.getMapper(AccountDao.class);
        accountDao.saveAccount(account);

        //提交事务
        session.commit();
        System.out.println("添加成功");


        //释放资源
        session.close();
        in.close();

    }

}
