package cuj.spring.aop.demo.service;

import cuj.spring.aop.demo.controller.UserVo;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;

/**
 * @Auther: cujamin
 * @Date: 2019/2/18 17:02
 * @Description:
 */
@Service
@Log4j
public class UserServiceImpl implements UserService {
    @Override
    public void printUser(UserVo user) {
        if(null==user){
            log.info("user is null");
            throw new RuntimeException("user is null");
        }else {
            log.info("user:"+user);
        }
    }
}
