package com.hendisantika.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by IntelliJ IDEA.
 * Project : SpringAOP-AspectJ
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 09/01/18
 * Time: 22.21
 * To change this template use File | Settings | File Templates.
 */

@Aspect
public class CustomerAspect {

    @Before("execution(* com.hendisantika.springaop.service.CustomerService.getCustomerById(..))")
    public void getCustomerByIdAdvice() {
        System.out.println("Execute advice on getCustomerByIdAdvice()");
    }

    @Before("execution(* com.hendisantika.springaop.service.CustomerService.set*(..))")
    public void getAllSetAdvices(JoinPoint joinPoint) {
        System.out.println("Excute advice on Service set Method: " + joinPoint.getSignature().getName());
    }
}
