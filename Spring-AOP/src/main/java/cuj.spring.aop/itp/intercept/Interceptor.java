package cuj.spring.aop.itp.intercept;


import cuj.spring.aop.itp.invoke.Invocation;

import java.lang.reflect.InvocationTargetException;

/**
 * @Auther: cujamin
 * @Date: 2019/2/15 15:51
 * @Description:
 */
public interface Interceptor {
    //事前方法
    public boolean berfore();
    //事后方法
    public void after();

    /**
     *
     * @param invocation                    回调参数，使用proceed方法，回调原事件
     * @return
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     * @throws Throwable
     */
    public Object around(Invocation invocation)
            throws InvocationTargetException,IllegalAccessException,Throwable;

    public void afterReturning();

    public void afterThrowing();

    boolean userAroud();

}
