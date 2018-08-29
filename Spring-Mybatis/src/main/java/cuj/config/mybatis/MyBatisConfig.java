package cuj.config.mybatis;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

/**
 * Created by cujamin on 2017/1/13.
 */
@Configuration
public class MyBatisConfig implements ApplicationContextAware {
    //这个接口可以用于获取spring上下文中定义的所有bean

    @Autowired
    private DBConfig dBConfig;

    private ApplicationContext context;
    /**
     * mybatis:
     url: jdbc:mysql://localhost:3306/mybatis
     username: root
     password: root
     maxActive: 500
     driver: com.mysql.jdbc.Driver
     */

    @Bean(name = "primaryDS") @Qualifier("primaryDS")
    @Primary
    public DruidDataSource primaryDS() {
        final String url = dBConfig.getUrl();
        final String username = dBConfig.getUsername();
        final String password = dBConfig.getPassword();
        final int maxActive = dBConfig.getMaxActive();
        System.out.println("username: " + username + ", password: " + password);
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(dBConfig.getDriver());
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setMaxActive(maxActive);
        return dataSource;
    }

    @Bean(name = "primaryFactory")
    @Qualifier("primaryFactory")
    public SqlSessionFactory sqlSessionFactoryPrimary() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(primaryDS());//使用之前的datasource

        String resourcePath = "classpath*:mappers/**.xml";
        if(!"".equals(dBConfig.getUsername())){
            resourcePath = "classpath*:mappers/" +  "/**.xml";
        }
        System.out.println("resourcePath: " + resourcePath);
        factoryBean.setMapperLocations(context.getResources(resourcePath));//配置了mapper的地址
        return factoryBean.getObject();//一个sqlsessionfactory就可以操作mapper里面定义的操作了
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    @Bean(name = "freelinkConfigTransactionManager")
    public DataSourceTransactionManager transactionManagerFreelinkConfig() {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(primaryDS());
        return transactionManager;//配置事物管理器
    }
}
