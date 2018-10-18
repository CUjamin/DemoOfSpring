package cuj.controller;

import cuj.domain.Apple;
import cuj.domain.NlpResponse;
import cuj.domain.NlpResult;
import cuj.service.InfoService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by cujamin on 2017/1/13.
 */
@RestController
public class DBControllerImpl implements DBController{
    private static final Logger log  = Logger.getLogger(DBControllerImpl.class);

    @Autowired
    private InfoService infoService;

    @RequestMapping(value = "/s/users/get" , method = RequestMethod.GET)
    public String getUsers()
    {
        log.info("getUser is ok");
        return infoService.getUser().toString();
    }

    @RequestMapping(value = "/s/user/get" , method = RequestMethod.GET)
    public String getUserByName(@RequestParam("name")String name)
    {
        log.info("getUser is ok");
        return infoService.getUser().toString();
    }
    @RequestMapping(value = "/s/apple/get" , method = RequestMethod.GET)
    public String getAppleByName(@RequestParam("name")String name)
    {
        log.info("getApple is ok");
        return infoService.getApple().toString();
    }
    @GetMapping(value="/s/apple/add")
    public String addApple()
    {
        Apple apple = new Apple();
        apple.setId(100);
        apple.setColor("GREEN");
        apple.setName("hahaha");
        int result = infoService.insertApple(apple);
        return "成功："+result;
    }


    @RequestMapping(value = "/s/isover" , method = RequestMethod.GET)
    public NlpResponse getIsOver()
    {
        NlpResponse nlpResponse = new NlpResponse();
        NlpResult nlpResult = new NlpResult();
        nlpResult.setIsOver(true);
        nlpResult.setAudio("1234567.wav");
        nlpResponse.setResult(nlpResult);
        return nlpResponse;
    }
}
