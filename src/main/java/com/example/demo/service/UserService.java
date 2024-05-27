package com.example.demo.service;

import com.example.demo.entity.Users;
import com.example.demo.repo.UsersRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserService {

    @Autowired
    private static UsersRepo usersRepo;

    public static void loginAndSignup(Users users){
        users = usersRepo.findById(users.getUserId())
                .orElseGet(() -> {
                    log.info("User is not present with user id {}, creating new user", users.getUserId());
                    return usersRepo.save(users);
                });

    }

    public Users loginAndSignUp(Users users) {
    }
}


