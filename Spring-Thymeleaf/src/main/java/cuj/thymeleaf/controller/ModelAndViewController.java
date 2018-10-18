//package cuj.thymeleaf.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
///**
// * @Auther: cujamin
// * @Date: 2018/10/18 18:26
// * @Description:
// */
//@Controller
//@RequestMapping("/v1/modelandview")
//public class ModelAndViewController {
//    @RequestMapping(value ="/index_string", method = RequestMethod.GET)
//    @ResponseBody
//    public ModelAndView getIndexString(){
//        ModelAndView mav = new ModelAndView();
//        mav.setViewName("welcome");
//        mav.addObject("msg", "hello kitty");
//
//        // List
//        List<String> list = new ArrayList<String>();
//        list.add("java");
//        list.add("c++");
//        list.add("oracle");
//        mav.addObject("bookList", list);
//
//        // Map
//        Map<String, String> map = new HashMap<String, String>();
//        map.put("zhangsan", "北京");
//        map.put("lisi", "上海");
//        map.put("wangwu", "深圳");
//        mav.addObject("map", map);
//
//        return mav;
//    }
//}
