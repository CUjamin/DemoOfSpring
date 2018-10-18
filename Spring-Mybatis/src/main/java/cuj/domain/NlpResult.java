package cuj.domain;


import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by himgod on 2018/9/7.
 */
public class NlpResult {

    /**
     * 流程是否结束
     */
    @JSONField(name = "isOver")
    boolean isOver;


    /**
     * 返回的音频文件
     */
    String audio;

    /**
     * （下一步流程中对应的）输出信息
     */
    String output;

    @JSONField(name = "isOver")
    String isNew;

    public boolean getIsOver() {
        return isOver;
    }

    public void setIsOver(boolean over) {
        isOver = over;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getIsNew() {
        return isNew;
    }

    public void setIsNew(String isNew) {
        this.isNew = isNew;
    }

    @Override
    public String toString() {
        return "NlpResult{" +
                "isOver=" + isOver +
                ", audio='" + audio + '\'' +
                ", output='" + output + '\'' +
                ", isNew='" + isNew + '\'' +
                '}';
    }
}
