package com.hendisantika.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * Project : SpringAOP-AspectJ
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 09/01/18
 * Time: 22.23
 * To change this template use File | Settings | File Templates.
 */

@Aspect
public class CustomerAspectJoinPoint {

    @Before("execution(* com.hendisantika.springaop.service.CustomerAdvanceService.*(..)) && args(firstName, id)")
    public void logStringArguments(String firstName, long id) {
        System.out.println("Passed Arguments: [" + "firstName = " + firstName + "; id = " + id + "]");
    }

    @Before("execution(* com.hendisantika.springaop.service.CustomerAdvanceService.setCustomerFirstName(..))")
    public void logAdvice(JoinPoint joinPoint) {
        System.out.println("Before running Advice on " + joinPoint.toString());
        System.out.println("Display Passed Arguments: " + Arrays.toString(joinPoint.getArgs()));
    }

    @Around("execution(* com.hendisantika.springaop.service.CustomerAdvanceService.findAllCustomers())")
    public Object logAround(ProceedingJoinPoint joinPoint) {
        System.out.println("This is LogAdvice BEFORE excuting Method");

        Object returnObj = null;

        try {
            returnObj = joinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }

        System.out.println("This is LogAdvice AFTER excuting Method");

        return returnObj;
    }
}
