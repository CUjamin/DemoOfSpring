package cuj.controller;

import cuj.service.InfoService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cujamin on 2017/1/13.
 */
@RestController
public class DBControllerImpl implements DBController{
    private static final Logger log  = Logger.getLogger(DBControllerImpl.class);

    @Autowired
    private InfoService infoService;

    @RequestMapping(value = "/s/user" , method = RequestMethod.GET)
    public String getUserByName(@RequestParam("name")String name)
    {
        log.info("getUser is ok");
        return infoService.getUser().toString();
    }
    @RequestMapping(value = "/s/apple" , method = RequestMethod.GET)
    public String getAppleByName(@RequestParam("name")String name)
    {
        log.info("getApple is ok");
        return infoService.getApple().toString();
    }
}
