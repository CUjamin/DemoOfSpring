package cuj.util;


import cuj.dao.apple.AppleDo;
import cuj.service.AppleVo;

/**
 * Created by cujamin on 2018/10/13.
 */
public class AppleUtil {
    public static AppleDo vo2do(AppleVo appleVo)throws Exception{
        AppleDo appleDo = new AppleDo();
        appleDo.setColor(appleVo.getColor());
        appleDo.setName(appleVo.getName());
        appleDo.setId(appleVo.getId());
        return appleDo;
    }
    public static AppleVo do2vo(AppleDo appleDo)throws Exception{
        AppleVo appleVo= new AppleVo();
        appleVo.setName(appleDo.getName());
        appleVo.setId(appleDo.getId());
        appleVo.setColor(appleDo.getColor());
        return appleVo;
    }
}
