package com.daiancosta.interceptor.services;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(UserService.class);

    public UserService(){
        logger.info("UserService");
    }
}
