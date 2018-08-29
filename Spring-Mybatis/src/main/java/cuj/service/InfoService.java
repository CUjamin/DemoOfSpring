package cuj.service;

import cuj.domain.Apple;
import cuj.domain.User;

/**
 * Created by cujamin on 2017/1/13.
 */
public interface InfoService {
    User getUser();
    User getUserByName(String Name);
    Apple getApple();
    Apple getAppleByName(String name);
    int insertApple(Apple apple);
}
