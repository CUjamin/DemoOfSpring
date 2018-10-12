package cuj.service;

import cuj.dao.apple.AppleDao;
import cuj.dao.apple.AppleDo;
import cuj.dao.user.UserDao;
import cuj.dao.user.UserDo;
import cuj.util.AppleUtil;
import cuj.util.UserUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by cujamin on 2018/8/29.
 */
@Service
public class InfoServiceImpl implements InfoService {

    private static Logger logger = Logger.getLogger(InfoServiceImpl.class);


    @Autowired
    private AppleDao appleDao;

    @Autowired
    private UserDao userDao;

    @Override
    public UserVo getUser(String name)throws Exception {
        UserDo userDo = userDao.getUserDo(name);
        return UserUtil.do2vo(userDo);
    }

    @Override
    public UserVo getUserByName(String Name) throws Exception{
        return null;
    }

    @Override
    public AppleVo getApple() throws Exception{
        return null;
    }

    @Override
    public AppleVo getAppleByName(String name) throws Exception{
        return null;
    }

    @Override
    public int insertApple(AppleVo appleVo) throws Exception{

        AppleDo appleDo= AppleUtil.vo2do(appleVo);
        int result = appleDao.insertApple(appleDo);
        try
        {
             result = appleDao.insertApple(appleDo);
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
