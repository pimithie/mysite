package com.xiaqi.aspect;

import com.xiaqi.annotation.EnableLogging;
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

    @Pointcut("@annotation(enableLogging)")
    public void pointCut(EnableLogging enableLogging) {}

    @Before("pointCut(enableLogging)")
    public void beforeExecute(JoinPoint joinPoint,EnableLogging enableLogging) {
        System.out.println("method signature ==========>"+joinPoint.getSignature());
        System.out.println("method invoke args===========>"+ Arrays.toString(joinPoint.getArgs()));
    }

    @AfterReturning(value = "pointCut(enableLogging)",returning = "result")
    public void afterExecute(Object result,EnableLogging enableLogging) {
        System.out.println("method return==============>"+result);
    }

}
