package com.kj.fmsc.dao;
import com.kj.fmsc.entity.User;

public interface UserDAO {
    int insertUser(User user);
    int countByUserName(String userName);
}
