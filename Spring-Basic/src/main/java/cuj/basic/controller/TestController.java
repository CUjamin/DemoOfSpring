package cuj.basic.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cujamin on 2018/5/17.
 */
@RestController
@RequestMapping(value = "/test")
@Log4j
public class TestController {

    @Autowired
    private Environment env;


    //    http://127.0.0.1:8082/test/getenvironment?para=#{para}
    /**
     * 参数需要写成  server.port  格式
     * @param para
     * @return
     */
    @ApiOperation(value="测试", notes="测试Environment")
    @RequestMapping(value = "/getenvironment",method = RequestMethod.GET)
    @HystrixCommand
    public String getEnvironment(
            @RequestParam(value = "para",defaultValue = "para")String para)
    {
        String para2 = env.getProperty("para2");

        String result = env.getProperty(para);
        if(null==result)result = para+":null";
        else result = para+":"+result;

        return result;
    }

}
