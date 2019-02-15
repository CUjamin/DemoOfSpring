package cuj.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
//import org.springframework.cloud.netflix.hystrix.EnableHystrix;
//import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by cujamin on 2017/8/29.
 */

//@SpringBootApplication
//@EnableCircuitBreaker
//@EnableHystrix
//@EnableHystrixDashboard
//@EnableSwagger2
//public class Application {
//    public static void main(String[] args) throws Exception {
//        SpringApplication.run(Application.class, args);
//    }
//}

@SpringBootApplication
@EnableSwagger2
//@EnableScheduling
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}

