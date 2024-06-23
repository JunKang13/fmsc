package com.kj.fmsc.service.impl;

import com.kj.fmsc.entity.User;
import com.kj.fmsc.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import com.kj.fmsc.dao.UserDAO;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDAO userDAO;

    /**
     * 用户注册
     * @param user user information
     * @return user with userId if success, null if failed
     */
    public User userRegister(User user) {
        if (userDAO.countByUserName(user.getUserName()) > 0){
            return null;
        }
        int result = userDAO.insertUser(user);
        if (result > 0) {
            return user;
        } else {
            return null;
        }
    }
}
