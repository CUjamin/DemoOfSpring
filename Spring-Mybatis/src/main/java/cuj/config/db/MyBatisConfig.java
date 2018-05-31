package cuj.config.db;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

/**
 * Created by cujamin on 2017/1/13.
 */
public class MyBatisConfig implements ApplicationContextAware {
    @Autowired
    private Environment environment;
    private ApplicationContext applicationContext;

    private static final String DB_URL = "db.url";
    private static final String DB_USERNAME = "db.username";
    private static final String DB_PASSWORD = "db.password";
    private static final String DB_MAX_ACTIVE = "db.maxActive";

    private static final String DB_URL6 = "db.url6";
    private static final String DB_USERNAME6 = "db.username6";
    private static final String DB_PASSWORD6 = "db.password6";
    private static final String DB_MAX_ACTIVE6 = "db.maxActive6";

    @Bean

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
    {
        this.applicationContext = applicationContext;
    }
}
