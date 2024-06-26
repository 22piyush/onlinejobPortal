package com.example.demo.controller;

import com.example.demo.entity.Users;
import com.example.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/job")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/loginOrSignUp")
    public Users loginOrSignUp(@RequestBody Users users){

        return  userService.loginAndSignUp(users);
    }

}
