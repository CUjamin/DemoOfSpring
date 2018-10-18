package cuj.util;

import cuj.dao.user.UserDo;
import cuj.service.UserVo;

/**
 * Created by cujamin on 2018/10/13.
 */
public class UserUtil {
    public static UserDo vo2do(UserVo userVo)throws Exception{
        UserDo userDo = new UserDo();
        userDo.setName(userVo.getName());
        userDo.setAge(userVo.getAge());
        userDo.setFid(userVo.getFid());
        userDo.setId(userVo.getId());
        return userDo;
    }
    public static UserVo do2vo(UserDo userDo)throws Exception{
        UserVo userVo= new UserVo();
        userVo.setName(userDo.getName());
        userVo.setAge(userDo.getAge());
        userVo.setFid(userDo.getFid());
        userVo.setId(userDo.getId());
        return userVo;
    }
}
