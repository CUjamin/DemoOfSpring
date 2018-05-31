package cuj.thymeleaf.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by cujamin on 2018/5/19.
 */
@Controller
@RequestMapping("/v1/thymeleaf")
public class ThymeleafController {

    private static final Logger log = Logger.getLogger(ThymeleafController.class);

    @RequestMapping(value ="/index_string", method = RequestMethod.GET)
    @ResponseBody
    public String getIndexString(){
        log.info("index_string");
        return "应该改回String";
    }

    @RequestMapping("/index")
    public String getIndex()
    {
        log.info("index");
        return "index";
    }
    @RequestMapping("/picture")
    public String getPicture()
    {
        log.info("priture");
        return "picture";
    }

    @RequestMapping("/index_out")
    public String getIndexout(
            @RequestParam(value = "name",defaultValue = "name")String name,
            @RequestParam(value = "para",defaultValue = "para")String para,
            Model model)
    {
        log.info("index_out");
        model.addAttribute("para",para);
        model.addAttribute("name",name);
        return "index_out";
    }

    @RequestMapping("/info_more")
    public String getInfoMore(
            @RequestParam(value = "name",defaultValue = "name")String name,
            @RequestParam(value = "para",defaultValue = "para")String para,
            Model model)
    {
        log.info("info_more");
        model.addAttribute("para",para);
        model.addAttribute("name",name);
        return "info_more";
    }

    @RequestMapping("/new_file")
    public String getNewFile()
    {
        log.info("new_file");
        return "new_file";
    }
}
