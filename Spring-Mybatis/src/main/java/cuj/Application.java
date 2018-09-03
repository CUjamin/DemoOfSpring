package cuj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by cujamin on 2017/1/13.
 */

//@SpringBootApplication
//public class Application {
//    private static Logger logger = Logger.getLogger(Application.class);
//    public static void main(String[]args)
//    {
//        ApplicationContext context = SpringApplication.run(Application.class,args);
//        String[] beans =  context.getBeanDefinitionNames();
//        String[] serviceBeans = context.getBeanNamesForAnnotation(Service.class);
//        String[] repositoryBeans = context.getBeanNamesForAnnotation(Repository.class);
//        String[] controllerBeans = context.getBeanNamesForAnnotation(Controller.class);
//        logger.info("bean数量："+beans.length+"##########################################################");
//        for(String bean:beans){
//            logger.info(bean);
//        }
//        logger.info("serviceBeans数量："+serviceBeans.length+"##########################################################");
//        for(String bean:serviceBeans){
//            logger.info(bean);
//        }
//        logger.info("repositoryBeans数量："+repositoryBeans.length+"##########################################################");
//        for(String bean:repositoryBeans){
//            logger.info(bean);
//        }
//        logger.info("controllerBeans数量："+controllerBeans.length+"##########################################################");
//        for(String bean:controllerBeans){
//            logger.info(bean);
//        }
//    }
//}
@SpringBootApplication
@EnableSwagger2
@MapperScan("cuj.dao")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
