package cuj.controller;

import cuj.domain.Apple;
import cuj.domain.User;

/**
 * Created by cujamin on 2017/1/13.
 */
public interface DBController {
    String getUserByName(String Name);
    String getAppleByName(String name);
}
