package com.example.demo.service;

import com.example.demo.repo.usersRepo;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;
import java.util.UUID;

@Slf4j
public class userService {

    @Autowired
    private usersRepo userRepo;
    public void loginAndSignup(User users){




       if(isUserPresent(users.getUserId())){

           log.info("User is present with user id {}" ,users.getUserId() );
           return usersRepo.findById(users.getUserId()).get();

       }else{

           log.info("User is not present with user id " +users.getUserId() );

       }

    }


    private  boolean isUserPresent(UUID userId) {
       User users = usersRepo.findById(userId).get();

       return Objects.isNull(users) ? false:true;

    }
}


