package com.kbw.dao;

import com.kbw.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginDao {

    @Select("select * from user where account=#{account} and password=#{password}")
    User findUserByAccount(@Param("account") String account,
                           @Param("password") String password);
    @Insert("insert into user(account,password) values(#{account},#{password})")
    void insertAccount(@Param("account") String account,
                       @Param("password") String password);
}
