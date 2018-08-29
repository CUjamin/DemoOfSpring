package cuj.config.mybatis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by cujamin on 2018/8/29.
 */
@Component
public class DBConfig {
    @Value("${mybatis.url}")
    private String url;

    @Value("${mybatis.username}")
    private String username;

    @Value("${mybatis.password}")
    private String password;

    @Value("${mybatis.maxActive}")
    private int maxActive;

    @Value("${mybatis.driver}")
    private String driver;

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getMaxActive() {
        return maxActive;
    }

    public String getDriver() {
        return driver;
    }
}
