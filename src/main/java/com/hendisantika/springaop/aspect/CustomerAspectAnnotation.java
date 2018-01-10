package com.hendisantika.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by IntelliJ IDEA.
 * Project : SpringAOP-AspectJ
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 09/01/18
 * Time: 22.22
 * To change this template use File | Settings | File Templates.
 */

@Aspect
public class CustomerAspectAnnotation {
    @Before("@annotation(com.hendisantika.springaop.aspect.Loggable)")
    public void myAnnotationAdvice() {
        System.out.println("Execute Advice before Annotation @Loggable");
    }
}
