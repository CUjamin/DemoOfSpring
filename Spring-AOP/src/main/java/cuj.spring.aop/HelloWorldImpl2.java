package cuj.spring.aop;

/**
 * @Auther: cujamin
 * @Date: 2018/10/18 18:42
 * @Description:
 */
public class HelloWorldImpl2 implements HelloWorld
{
    public void printHelloWorld()
    {
        System.out.println("Enter HelloWorldImpl2.printHelloWorld()");
    }

    public void doPrint()
    {
        System.out.println("Enter HelloWorldImpl2.doPrint()");
        return ;
    }
}
