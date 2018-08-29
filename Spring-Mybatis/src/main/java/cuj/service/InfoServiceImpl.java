package cuj.service;

import cuj.Application;
import cuj.dao.AppleDao;
import cuj.domain.Apple;
import cuj.domain.User;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by cujamin on 2018/8/29.
 */
@Service
public class InfoServiceImpl implements InfoService {

    private static Logger logger = Logger.getLogger(InfoServiceImpl.class);


    @Autowired
    private AppleDao appleDao;

    @Override
    public User getUser() {
        return null;
    }

    @Override
    public User getUserByName(String Name) {
        return null;
    }

    @Override
    public Apple getApple() {
        return null;
    }

    @Override
    public Apple getAppleByName(String name) {
        return null;
    }

    @Override
    public int insertApple(Apple apple) {
        int result = appleDao.insertApple(apple);
        try
        {
             result = appleDao.insertApple(apple);
        }catch (Exception e)
        {
            logger.info("ERROR:"+e.getMessage());
            logger.error("ERROR:"+e.getMessage());
            e.printStackTrace();
        }finally {
            return result;
        }
    }
}
