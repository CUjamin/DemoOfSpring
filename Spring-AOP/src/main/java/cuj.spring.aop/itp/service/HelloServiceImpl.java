package cuj.spring.aop.itp.service;

import org.thymeleaf.util.StringUtils;

/**
 * @Auther: cujamin
 * @Date: 2019/2/15 16:07
 * @Description:
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(String name) {
        if(StringUtils.isEmpty(name)){
            throw new RuntimeException("parameter is null");
        }
        System.out.println("HelloServiceImpl hello "+name);
    }

    @Override
    public void sayHello2(String name) {
        System.out.println("HelloServiceImpl hello 22222222222222222"+name);
    }

    public void sayHello3(String name) {
        System.out.println("HelloServiceImpl hello 33333333333333333333333333"+name);
    }

}
