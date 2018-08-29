package cuj.dao;

import cuj.domain.Apple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

/**
 * Created by cujamin on 2018/8/29.
 */
@Repository
public class AppleDao {

    private static final String namespace = "cuj.mappers.appleMapper";

    @Autowired
    private MyBatisDao myBatisDao;

    public int insertApple(Apple apple)
    {
        HashMap<String, Object> params = new HashMap<>(3);
        params.put("name", apple.getName());
        params.put("color", apple.getColor());
        return myBatisDao.insert(namespace, ".insertApple", params);
    }
}
