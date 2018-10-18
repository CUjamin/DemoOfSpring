package cuj.mapper.user;

import cuj.domain.user.UserDo;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

/**
 * Created by cujamin on 2018/9/3.
 */

public interface UserMapper {
    @SelectProvider(type=UserSqlProvider.class,method = "getUser")
    @Results({
            @Result(property = "name",column = "name"),
            @Result(property = "age",column = "age"),
            @Result(property = "fid",column = "fid"),
    })
    public List<UserDo> getUser();
}
