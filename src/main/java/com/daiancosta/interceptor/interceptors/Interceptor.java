package com.daiancosta.interceptor.interceptors;


import com.daiancosta.interceptor.annotation.AllowAnnonymous;
import com.daiancosta.interceptor.models.ParameterUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class Interceptor implements HandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(Interceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        final AllowAnnonymous allowAnnonymous = ((HandlerMethod)handler).getMethod().getAnnotation((AllowAnnonymous.class));

        if(allowAnnonymous == null){
            return true;
        }
        

        final String validationType = allowAnnonymous.validationType().getValue();

        if (!ParameterUser.getInstance().getArray().contains(validationType)){
            response.setStatus(401);
            response.addHeader("Interceptor", "Authorization não enviado");
            logger.info("Authorization não enviado.");
            logger.info("Validação NOK.");
            return false;
        }else{
            return true;
        }

    }
}
