package com.daiancosta.interceptor.services;

import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class AppStartupRunner {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(AppStartupRunner.class);

    public static int counter;

    @PostConstruct
    public void init() {
        logger.info("AppStartupRunner");
    }
}
