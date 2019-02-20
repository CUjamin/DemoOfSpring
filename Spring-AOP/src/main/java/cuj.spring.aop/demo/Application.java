package cuj.spring.aop.demo;

import cuj.spring.aop.demo.aspect.UserServiceAspect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Auther: cujamin
 * @Date: 2019/2/18 17:22
 * @Description:
 */
@SpringBootApplication
@EnableSwagger2
public class Application {

    @Bean(name = "userServiceAspect")
    public UserServiceAspect initMyAspect(){
        return new UserServiceAspect();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
