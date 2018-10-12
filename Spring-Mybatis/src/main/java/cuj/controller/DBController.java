package cuj.controller;

import cuj.service.AppleVo;
import cuj.service.InfoService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by cujamin on 2017/1/13.
 */
@RestController
public class DBController {
    private static final Logger log  = Logger.getLogger(DBController.class);

    @Autowired
    private InfoService infoService;

    @RequestMapping(value = "/s/users/get" , method = RequestMethod.GET)
    public String getUsers()
    {
        log.info("getUser is ok");
        String response="";
        try{
            response = infoService.getUser("").toString();
        }catch (Exception e){
            response=""+e;
        }
        return response;
    }

    @RequestMapping(value = "/s/user/get" , method = RequestMethod.GET)
    public String getUserByName(@RequestParam("name")String name)
    {
        log.info("getUser is ok");
        String response="";
        try{
            response = infoService.getUser(name).toString();
        }catch (Exception e){
            response=""+e;
        }
        return response;
    }

    @RequestMapping(value = "/s/apple/get" , method = RequestMethod.GET)
    public String getAppleByName(@RequestParam("name")String name)
    {
        log.info("getApple is ok");
        String response="";
        try{
            response = infoService.getApple().toString();
        }catch (Exception e){
            response=""+e;
        }
        return response;
    }
    @GetMapping(value="/s/apple/add")
    public String addApple()
    {
        AppleVo appleVo = new AppleVo();
        appleVo.setId(100);
        appleVo.setColor("GREEN");
        appleVo.setName("hahaha");
        String response="";
        try{
            int result = infoService.insertApple(appleVo);
            response="success";
        }catch (Exception e){
            response=""+e;
        }
        return response;
    }
}
