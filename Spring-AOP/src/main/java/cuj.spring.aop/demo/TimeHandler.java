package cuj.spring.aop.demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @Auther: cujamin
 * @Date: 2018/10/18 18:42
 * @Description:
 */
@Aspect
public class TimeHandler {
    @Pointcut("execution(* cuj.spring.aop.demo.HelloWorld.doPrint(..))")
    public void printTime()
    {
        System.out.println(" 切点 CurrentTime = " + System.currentTimeMillis());
    }
}
