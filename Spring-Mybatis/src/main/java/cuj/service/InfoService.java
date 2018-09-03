package cuj.service;

import cuj.domain.Apple;
import cuj.domain.user.UserDo;

import java.util.List;

/**
 * Created by cujamin on 2017/1/13.
 */
public interface InfoService {
    List<UserDo> getUser();
    UserDo getUserByName(String Name);
    Apple getApple();
    Apple getAppleByName(String name);
    int insertApple(Apple apple);
}
