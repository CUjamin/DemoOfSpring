package cuj.mapper.user;

import org.apache.ibatis.jdbc.SQL;

/**
 * Created by cujamin on 2018/9/3.
 */
public class UserSqlProvider {

    public static String getUser(){
        return new SQL() {
            {
                SELECT("name,age,fid,apple_id");
                FROM("users");
            }
        }.toString();
    }
}
