package cuj.spring.aop.demo;

/**
 * @Auther: cujamin
 * @Date: 2018/10/18 18:41
 * @Description:
 */
public class HelloWorldImpl1 implements HelloWorld
{
    public void printHelloWorld()
    {
        System.out.println("Enter HelloWorldImpl1.printHelloWorld()");
    }

    public void doPrint()
    {
        System.out.println("Enter HelloWorldImpl1.doPrint()");
        return ;
    }
}