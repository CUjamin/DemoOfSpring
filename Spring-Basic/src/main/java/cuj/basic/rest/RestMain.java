//package cuj.basic.rest;
//
//import com.alibaba.fastjson.JSON;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @Auther: cujamin
// * @Date: 2018/10/31 10:10
// * @Description:
// */
//public class RestMain {
//
//    public static void main(String[] args) {
//        RestTemplate restTemplate = new RestTemplate();
//        List<Data> dataList = new ArrayList<Data>();
//        dataList.add(new Data());
//        String url = "http://123.56.27.192:8282/crm8.1/action/worklist/user?data={json}";
//        String json = JSON.toJSONString(dataList);
//        System.out.println("url:"+url);
//        String response = restTemplate.postForObject(url,null,String.class,json);
//        System.out.println("response:"+response);
//    }
//}
////"agentId":"ayers","agentName":"张彪123","agentGroupId":"100011","agentGroupName":","agentPhone":"18618618611"
//class Data{
//    String agentId="ayers";
//    String agentName="张彪123";
//    String agentGroupId="100011";
//    String agentGroupName="测试用户组";
//    String agentPhone="18618618611";
//
//    public String getAgentId() {
//        return agentId;
//    }
//
//    public void setAgentId(String agentId) {
//        this.agentId = agentId;
//    }
//
//    public String getAgentName() {
//        return agentName;
//    }
//
//    public void setAgentName(String agentName) {
//        this.agentName = agentName;
//    }
//
//    public String getAgentGroupId() {
//        return agentGroupId;
//    }
//
//    public void setAgentGroupId(String agentGroupId) {
//        this.agentGroupId = agentGroupId;
//    }
//
//    public String getAgentGroupName() {
//        return agentGroupName;
//    }
//
//    public void setAgentGroupName(String agentGroupName) {
//        this.agentGroupName = agentGroupName;
//    }
//
//    public String getAgentPhone() {
//        return agentPhone;
//    }
//
//    public void setAgentPhone(String agentPhone) {
//        this.agentPhone = agentPhone;
//    }
//}
