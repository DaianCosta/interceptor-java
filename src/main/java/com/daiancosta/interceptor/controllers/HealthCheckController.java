package com.daiancosta.interceptor.controllers;

import com.daiancosta.interceptor.annotation.AllowAnnonymous;
import com.daiancosta.interceptor.enums.ValidationType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health-check")
public class HealthCheckController {

    @AllowAnnonymous(validationType = ValidationType.ANNONYMOUS)
    @RequestMapping("/")
    public String getHealthCheck(){
        return "200 ok";
    }

    @RequestMapping("/test")
    public String getHealthCheckTest(){
        return "200 ok";
    }

}