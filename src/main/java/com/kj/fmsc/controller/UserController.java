package com.kj.fmsc.controller;

import com.kj.fmsc.entity.User;
import com.kj.fmsc.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/register")
    @ResponseBody
    public ResponseEntity<String> register(User user) {
        User registeredUser = userService.userRegister(user);
        if (registeredUser != null) {
            return ResponseEntity.ok("User created successfully");
        } else {
            return ResponseEntity.status(409).body("User already exists");
        }
    }

}
