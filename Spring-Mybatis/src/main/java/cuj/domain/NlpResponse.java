package cuj.domain;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by himgod on 2018/9/7.
 */
public class NlpResponse {
    /**
     * 0 means succ, 非0 表示失败
     */
    @JSONField(name = "code")
    int code;

    @JSONField(name = "msg")
    String msg;

    /**
     * nlp结果对象可扩展
     */
    NlpResult result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public NlpResult getResult() {
        return result;
    }

    public void setResult(NlpResult result) {
        this.result = result;
    }



    @Override
    public String toString() {
        return "NlpResponse{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", result=" + result +
                '}';
    }
}
