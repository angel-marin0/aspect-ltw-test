package org.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogbackAspect {


    @Before(value = "execution(* com.itextpdf.text.Document.*(..))")
    public void getInfo(JoinPoint joinPoint) {
        System.out.println(12341234);
    }

}
