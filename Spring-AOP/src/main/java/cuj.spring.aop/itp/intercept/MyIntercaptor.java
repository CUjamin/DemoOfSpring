package cuj.spring.aop.itp.intercept;


import cuj.spring.aop.itp.invoke.Invocation;

import java.lang.reflect.InvocationTargetException;

/**
 * @Auther: cujamin
 * @Date: 2019/2/15 15:57
 * @Description:
 */
public class MyIntercaptor implements Interceptor {

    @Override
    public boolean berfore() {
        System.out.println("MyIntercaptor before...");
        return false;
    }

    @Override
    public void after() {
        System.out.println("MyIntercaptor after...");
    }

    @Override
    public Object around(Invocation invocation) throws InvocationTargetException, IllegalAccessException ,Throwable{
        System.out.println("MyIntercaptor around before...");
        Object object = invocation.proceed();
        System.out.println("MyIntercaptor around after...");
        return object;
    }

    @Override
    public void afterReturning() {
        System.out.println("MyIntercaptor afterReturning...");
    }

    @Override
    public void afterThrowing() {
        System.out.println("MyIntercaptor afterThrowing...");
    }

    @Override
    public boolean userAroud() {
        return true;
    }
}
