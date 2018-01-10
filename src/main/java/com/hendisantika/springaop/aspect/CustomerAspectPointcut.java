package com.hendisantika.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by IntelliJ IDEA.
 * Project : SpringAOP-AspectJ
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 09/01/18
 * Time: 22.24
 * To change this template use File | Settings | File Templates.
 */
@Aspect
public class CustomerAspectPointcut {

    @Before("findCustomerByLastNamePointCut()")
    public void loggingAdvice() {
        System.out.println("Execute logAdvice on findCustomerByLastName()");
    }

    @Pointcut("execution(* com.hendisantika.springaop.service.CustomerAnotherService.findCustomerByLastName(..))")
    public void findCustomerByLastNamePointCut() {
    }

    @Before("allMethodsPointcut()")
    public void allServiceMethodsAdvice(JoinPoint joinPoint) {
        System.out.println("Execute logAdvice for AnotherService Method with joinPoint: " + joinPoint.getSignature().getName());
    }

    @Pointcut("within(com.hendisantika.springaop.service.CustomerAnotherService)")
    public void allMethodsPointcut() {
    }
}
