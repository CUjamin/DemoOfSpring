package cuj;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Created by cujamin on 2017/1/13.
 */

@SpringBootApplication
public class Application {
    private static Logger logger = Logger.getLogger(Application.class);
    public static void main(String[]args)
    {
        ApplicationContext context = SpringApplication.run(Application.class,args);
        String[] beans =  context.getBeanDefinitionNames();
        String[] serviceBeans = context.getBeanNamesForAnnotation(Service.class);
        String[] repositoryBeans = context.getBeanNamesForAnnotation(Repository.class);
        String[] controllerBeans = context.getBeanNamesForAnnotation(Controller.class);
        logger.info("bean数量："+beans.length+"##########################################################");
        for(String bean:beans){
            logger.info(bean);
        }
        logger.info("serviceBeans数量："+serviceBeans.length+"##########################################################");
        for(String bean:serviceBeans){
            logger.info(bean);
        }
        logger.info("repositoryBeans数量："+repositoryBeans.length+"##########################################################");
        for(String bean:repositoryBeans){
            logger.info(bean);
        }
        logger.info("controllerBeans数量："+controllerBeans.length+"##########################################################");
        for(String bean:controllerBeans){
            logger.info(bean);
        }
    }
}
