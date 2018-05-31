package cuj.thymeleaf.util;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by cujamin on 2018/5/20.
 */
public class HttpUtilsTest {
    @Test
    public void SMS() throws Exception {
        System.out.println(HttpUtils.SMS("", "http://127.0.0.1:8089/v1/thymeleaf/new_file"));
    }

}