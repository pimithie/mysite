package com.xiaqi.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author xiaqi
 * @date 2019/8/14
 */
@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* com.xiaqi.service.impl.*.*(..))")
    public void pointCut() {}

    @Before("pointCut()")
    public void beforeExecute(JoinPoint joinPoint) {
        System.out.println("method signature ==========>"+joinPoint.getSignature());
        System.out.println("method invoke args===========>"+ Arrays.toString(joinPoint.getArgs()));
    }

    @AfterReturning(value = "pointCut()",returning = "result")
    public void afterExecute(Object result) {
        System.out.println("method return==============>"+result);
    }

}
