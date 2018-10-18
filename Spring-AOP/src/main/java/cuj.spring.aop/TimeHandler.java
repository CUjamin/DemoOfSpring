package cuj.spring.aop;

/**
 * @Auther: cujamin
 * @Date: 2018/10/18 18:42
 * @Description:
 */
public class TimeHandler {
    public void printTime()
    {
        System.out.println(" 切点 CurrentTime = " + System.currentTimeMillis());
    }
}
