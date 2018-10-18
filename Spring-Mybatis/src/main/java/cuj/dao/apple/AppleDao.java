package cuj.dao.apple;

import cuj.dao.MyBatisDao;
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

    public int insertApple(AppleDo appleDo)
    {
        HashMap<String, Object> params = new HashMap<>(3);
        params.put("name", appleDo.getName());
        params.put("color", appleDo.getColor());
        return myBatisDao.insert(namespace, ".insertApple", params);
    }
}
