//package cuj.service;
//
//import cuj.dao.AppleDao;
//import cuj.dao.apple.AppleDao;
//import cuj.dao.user.UserDo;
//import cuj.mapper.user.UserMapper;
//import cuj.domain.Apple;
//import cuj.domain.user.UserDo;
//import org.apache.log4j.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
///**
// * Created by cujamin on 2018/8/29.
// */
//@Service
//public class InfoServiceImpl implements InfoService {
//
//    private static Logger logger = Logger.getLogger(InfoServiceImpl.class);
//
//
//    @Autowired
//    private AppleDao appleDao;
//
//    @Autowired
//    private UserMapper userDao;
//
//    @Override
//    public List<UserDo> getUser() {
//        return userDao.getUser();
//    }
//
//    @Override
//    public UserDo getUserByName(String Name) {
//        return null;
//    }
//
//    @Override
//    public Apple getApple() {
//        return null;
//    }
//
//    @Override
//    public Apple getAppleByName(String name) {
//        return null;
//    }
//
//    @Override
//    public int insertApple(Apple apple) {
//        int result = appleDao.insertApple(apple);
//        try
//        {
//             result = appleDao.insertApple(apple);
//        }catch (Exception e)
//        {
//            logger.info("ERROR:"+e.getMessage());
//            logger.error("ERROR:"+e.getMessage());
//            e.printStackTrace();
//        }finally {
//            return result;
//        }
//    }
//}
