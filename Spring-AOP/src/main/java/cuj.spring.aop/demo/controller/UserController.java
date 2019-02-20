package cuj.spring.aop.demo.controller;

import cuj.spring.aop.demo.service.UserService;
import io.swagger.annotations.ApiParam;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: cujamin
 * @Date: 2019/2/18 17:16
 * @Description:
 */
@RestController
@RequestMapping(value = "/v1")
@Log4j
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET,value = "/user")
    public Response getUser(
            @ApiParam(value = "" , required = true)@RequestParam String id,
            @ApiParam(value = "" , required = true)@RequestParam String username,
            @ApiParam(value = "" ,required = true)@RequestParam String notename){
        Response response = new Response();

        UserVo userVo = new UserVo();
        userVo.setId(id);
        userVo.setName(username);
        userVo.setNote(notename);
        userService.printUser(userVo);

        log.info("getUser:"+response);
        return response;
    }
}
