package cuj.basic.swagger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

import static springfox.documentation.builders.PathSelectors.regex;

/**
 * Created by cujamin on 2018/4/28.
 * https://127.0.0.1:8082/swagger-ui.html
 *
 *
 */
@EnableSwagger2
@Configuration
public class SwaggerConfig {


    @Autowired
    private Environment env;

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("NLP接口")
                .genericModelSubstitutes(DeferredResult.class)
                .useDefaultResponseMessages(false)
                .securitySchemes(apiKeys())
                .forCodeGeneration(false)
                .pathMapping("/")
                .select()
                .apis(RequestHandlerSelectors.basePackage("cuj.basic.controller"))
                .paths(regex("/book/.*"))
                .build()
                .apiInfo(apiInfo());
    }

    private List<ApiKey> apiKeys() {
        List<ApiKey> apiKeys = new ArrayList<ApiKey>();
        //api key的名称，key字段以及传输方式(header or query)
        ApiKey apiKey = new ApiKey("mykey", "api_key", "header");
        apiKeys.add(apiKey);
        return apiKeys;
    }
    private ApiInfo apiInfo() {

        String url = env.getProperty("swagger-url");
        return new ApiInfoBuilder()
                .title("接口列表 v1.0.0") // 任意，请稍微规范点
                .description("接口测试") // 任意，请稍微规范点
                .termsOfServiceUrl(String.format("%s/swagger-ui.html", url)) // 将“url”换成自己的ip:port
                .version("1.0.0")
                .build();
    }
}
