package cuj.basic.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnoIoCTest {
	private static ApplicationContext ctx;
	public static void main(String[] args) 
	{     
  
		ctx =new ClassPathXmlApplicationContext("beans.Xml");
		Boss boss = (Boss) ctx.getBean("boss");     
//        System.out.println(boss);   
		Meeting mt=(Meeting) ctx.getBean("meeting");
		mt.start(boss);
		String url1="http://domain/customer_input";
        
	}     
}
