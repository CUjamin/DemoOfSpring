package cuj.spring.aop.demo.aspect;

import lombok.extern.log4j.Log4j;
import org.aspectj.lang.annotation.*;


/**
 * @Auther: cujamin
 * @Date: 2019/2/18 17:05
 * @Description:
 */
@Aspect
@Log4j
public class UserServiceAspect {

    @Pointcut("execution(* cuj.spring.aop.demo.service.UserServiceImpl.printUser(..))")
    public void pointcut(){

    }
    @Before("pointcut()")
    public void before(){
        log.info("before...");
    }
    @After("pointcut()")
    public void after(){
        log.info("after...");
    }
    @AfterReturning("pointcut()")
    public void afterReturning(){
        log.info("afterReturning...");
    }
    @AfterThrowing("pointcut()")
    public void afterThrowing(){
        log.info("afterThrowing...");
    }
}
