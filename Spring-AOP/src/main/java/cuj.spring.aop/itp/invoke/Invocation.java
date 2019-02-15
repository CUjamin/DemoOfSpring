package cuj.spring.aop.itp.invoke;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Auther: cujamin
 * @Date: 2019/2/15 15:54
 * @Description:
 */
public class Invocation {
    public Object[] params;
    private Method method;
    private Object target;

    public Invocation( Object target,Method method, Object[] params) {
        this.target = target;
        this.method = method;
        this.params = params;
    }

    //反射方法

    /**
     *
     * @return
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    public Object proceed() throws InvocationTargetException,IllegalAccessException{
        return method.invoke(target,params);
    }
}
