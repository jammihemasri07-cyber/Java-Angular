package com.library.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component //we need this stereotype annotation to create a bean for this automatically and manage by context.
/*
* @Aspect marks a class as "this is a container of cross-cutting logic (advice),
* not a regular business-logic class." It's a label that tells both Spring and
*  the AspectJ tooling: "look inside this class for @Before, @After, @Around methods
*  treat them specially, not as normal methods to just call directly."
* */

public class LoggingAspect{

    @Around("execution(*com.library.service.*.*(..))")
    /*
    * @Around — means "run my code both before and after the target method.
    * " (There are other types too: @Before, @After, but @Around is the most powerful
    * since it wraps the whole thing.)
    * */
    public Object LoggingExecTime(ProceedingJoinPoint joinPoint) throws Throwable{

        /*
        * ProceedingJoinPoint joinPoint
        * this parameter represents the actual method call that got intercepted
        * */
        long startTime=System.currentTimeMillis();
        Object result=joinPoint.proceed();
        long EndTime=System.currentTimeMillis();
        System.out.println(joinPoint.getSignature()+" executed in:"+(EndTime-startTime)+"ms");

        return result;

    }
}
